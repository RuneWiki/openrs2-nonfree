import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class73 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt2537;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	private int anInt2542;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[B")
	private byte[] aByteArray38 = new byte[4];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!ud;")
	private Class116 aClass116_3;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	private int anInt2540;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!pc;Ljava/net/URL;)V")
	public Class73(@OriginalArg(0) Class87 arg0, @OriginalArg(1) URL arg1) {
		this.aClass116_3 = arg0.method2692(arg1);
		this.anInt2540 = 0;
		this.aLong105 = Static179.method2941() + 30000L;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)[B")
	public byte[] method2043() throws IOException {
		if (Static179.method2941() > this.aLong105) {
			throw new IOException("fdt");
		}
		if (this.anInt2540 == 0) {
			if (this.aClass116_3.anInt4156 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass116_3.anInt4156 == 1) {
				this.anInt2540 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass116_3.anObject5;
			}
		}
		@Pc(58) int local58;
		if (this.anInt2540 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (local58 + this.anInt2537 > 4) {
					local58 = 4 - this.anInt2537;
				}
				this.anInt2537 += this.aDataInputStream1.read(this.aByteArray38, this.anInt2537, local58);
				if (this.anInt2537 == 4) {
					@Pc(104) int local104 = (new Class1_Sub17(this.aByteArray38)).method2140();
					this.anInt2540 = 2;
					this.aByteArray37 = new byte[local104];
				}
			}
		}
		if (this.anInt2540 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt2542 + local58 > this.aByteArray37.length) {
					local58 = this.aByteArray37.length - this.anInt2542;
				}
				this.anInt2542 += this.aDataInputStream1.read(this.aByteArray37, this.anInt2542, local58);
				if (this.aByteArray37.length == this.anInt2542) {
					return this.aByteArray37;
				}
			}
		}
		return null;
	}
}
