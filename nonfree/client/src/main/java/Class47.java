import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class47 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	private int anInt1669;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[B")
	private final byte[] aByteArray15 = new byte[4];

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!cf;")
	private final Class16 aClass16_4;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	private int anInt1674;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "J")
	private final long aLong78;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!fe;Ljava/net/URL;)V")
	public Class47(@OriginalArg(0) Class29 arg0, @OriginalArg(1) URL arg1) {
		this.aClass16_4 = arg0.method603(arg1);
		this.anInt1674 = 0;
		this.aLong78 = Static23.method431() + 30000L;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[B")
	public byte[] method1154() throws IOException {
		if (Static23.method431() > this.aLong78) {
			throw new IOException("fdt");
		}
		if (this.anInt1674 == 0) {
			if (this.aClass16_4.anInt441 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass16_4.anInt441 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass16_4.anObject2;
				this.anInt1674 = 1;
			}
		}
		@Pc(55) int local55;
		if (this.anInt1674 == 1) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (this.anInt1669 + local55 > 4) {
					local55 = 4 - this.anInt1669;
				}
				this.anInt1669 += this.aDataInputStream1.read(this.aByteArray15, this.anInt1669, local55);
				if (this.anInt1669 == 4) {
					@Pc(95) int local95 = (new Class4_Sub16(this.aByteArray15)).method1486();
					this.anInt1674 = 2;
					this.aByteArray14 = new byte[local95];
				}
			}
		}
		if (this.anInt1674 == 2) {
			local55 = this.aDataInputStream1.available();
			if (local55 > 0) {
				if (this.aByteArray14.length < this.anInt1673 + local55) {
					local55 = this.aByteArray14.length - this.anInt1673;
				}
				this.anInt1673 += this.aDataInputStream1.read(this.aByteArray14, this.anInt1673, local55);
				if (this.anInt1673 == this.aByteArray14.length) {
					return this.aByteArray14;
				}
			}
		}
		return null;
	}
}
