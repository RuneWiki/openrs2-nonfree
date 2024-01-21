import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class58 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "[B")
	private final byte[] aByteArray29 = new byte[4];

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!mb;")
	private final Class65 aClass65_5;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	private int anInt2181;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "J")
	private final long aLong129;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!bi;Ljava/net/URL;)V")
	public Class58(@OriginalArg(0) Class12 arg0, @OriginalArg(1) URL arg1) {
		this.aClass65_5 = arg0.method295(arg1);
		this.anInt2181 = 0;
		this.aLong129 = Static188.method2822() + 30000L;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[B")
	public byte[] method1710() throws IOException {
		if (Static188.method2822() > this.aLong129) {
			throw new IOException("fdt");
		}
		if (this.anInt2181 == 0) {
			if (this.aClass65_5.anInt2446 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass65_5.anInt2446 == 1) {
				this.anInt2181 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass65_5.anObject3;
			}
		}
		@Pc(55) int local55;
		if (this.anInt2181 == 1) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (local55 + this.anInt2184 > 4) {
					local55 = 4 - this.anInt2184;
				}
				this.anInt2184 += this.aDataInputStream1.read(this.aByteArray29, this.anInt2184, local55);
				if (this.anInt2184 == 4) {
					@Pc(99) int local99 = (new Class5_Sub6(this.aByteArray29)).method3073();
					this.aByteArray28 = new byte[local99];
					this.anInt2181 = 2;
				}
			}
		}
		if (this.anInt2181 == 2) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (this.aByteArray28.length < local55 + this.anInt2179) {
					local55 = this.aByteArray28.length - this.anInt2179;
				}
				this.anInt2179 += this.aDataInputStream1.read(this.aByteArray28, this.anInt2179, local55);
				if (this.anInt2179 == this.aByteArray28.length) {
					return this.aByteArray28;
				}
			}
		}
		return null;
	}
}
