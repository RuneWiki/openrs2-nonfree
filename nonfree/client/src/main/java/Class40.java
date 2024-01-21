import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class40 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	private int anInt1531;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private int anInt1532;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "[B")
	private final byte[] aByteArray21 = new byte[4];

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!da;")
	private final Class16 aClass16_4;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	private int anInt1533;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "J")
	private final long aLong71;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ke;Ljava/net/URL;)V")
	public Class40(@OriginalArg(0) Class45 arg0, @OriginalArg(1) URL arg1) {
		this.aClass16_4 = arg0.method1484(arg1);
		this.anInt1533 = 0;
		this.aLong71 = Static108.method1828() + 30000L;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)[B")
	public byte[] method1214() throws IOException {
		if (this.aLong71 < Static108.method1828()) {
			throw new IOException("fdt");
		}
		if (this.anInt1533 == 0) {
			if (this.aClass16_4.anInt749 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass16_4.anInt749 == 1) {
				this.anInt1533 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass16_4.anObject1;
			}
		}
		@Pc(53) int local53;
		if (this.anInt1533 == 1) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (this.anInt1532 + local53 > 4) {
					local53 = 4 - this.anInt1532;
				}
				this.anInt1532 += this.aDataInputStream1.read(this.aByteArray21, this.anInt1532, local53);
				if (this.anInt1532 == 4) {
					@Pc(98) int local98 = (new Class2_Sub13(this.aByteArray21)).method2946();
					this.aByteArray22 = new byte[local98];
					this.anInt1533 = 2;
				}
			}
		}
		if (this.anInt1533 == 2) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (this.anInt1531 + local53 > this.aByteArray22.length) {
					local53 = this.aByteArray22.length - this.anInt1531;
				}
				this.anInt1531 += this.aDataInputStream1.read(this.aByteArray22, this.anInt1531, local53);
				if (this.aByteArray22.length == this.anInt1531) {
					return this.aByteArray22;
				}
			}
		}
		return null;
	}
}
