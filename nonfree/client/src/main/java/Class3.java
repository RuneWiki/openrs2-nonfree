import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt58;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	private int anInt65;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[B")
	private final byte[] aByteArray2 = new byte[4];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!le;")
	private final Class50 aClass50_1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "J")
	private final long aLong6;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!tc;Ljava/net/URL;)V")
	public Class3(@OriginalArg(0) Class74 arg0, @OriginalArg(1) URL arg1) {
		this.aClass50_1 = arg0.method1819(arg1);
		this.anInt53 = 0;
		this.aLong6 = Static26.method596() + 30000L;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)[B")
	public byte[] method40() throws IOException {
		if (Static26.method596() > this.aLong6) {
			throw new IOException("fdt");
		}
		if (this.anInt53 == 0) {
			if (this.aClass50_1.anInt1485 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass50_1.anInt1485 == 1) {
				this.anInt53 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass50_1.anObject4;
			}
		}
		@Pc(58) int local58;
		if (this.anInt53 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt58 + local58 > 4) {
					local58 = 4 - this.anInt58;
				}
				this.anInt58 += this.aDataInputStream1.read(this.aByteArray2, this.anInt58, local58);
				if (this.anInt58 == 4) {
					@Pc(101) int local101 = (new Class1_Sub5(this.aByteArray2)).method663();
					this.anInt53 = 2;
					this.aByteArray1 = new byte[local101];
				}
			}
		}
		if (this.anInt53 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.aByteArray1.length < this.anInt65 + local58) {
					local58 = this.aByteArray1.length - this.anInt65;
				}
				this.anInt65 += this.aDataInputStream1.read(this.aByteArray1, this.anInt65, local58);
				if (this.anInt65 == this.aByteArray1.length) {
					return this.aByteArray1;
				}
			}
		}
		return null;
	}
}
