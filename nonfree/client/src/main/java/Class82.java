import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class82 {

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	private int anInt4008;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
	private int anInt4009;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "[B")
	private final byte[] aByteArray45 = new byte[4];

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!pe;")
	private final Class63 aClass63_8;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "J")
	private final long aLong127;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rf;Ljava/net/URL;)V")
	public Class82(@OriginalArg(0) Class74 arg0, @OriginalArg(1) URL arg1) {
		this.aClass63_8 = arg0.method2485(arg1);
		this.anInt4007 = 0;
		this.aLong127 = Static47.method763() + 30000L;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)[B")
	public byte[] method2826() throws IOException {
		if (this.aLong127 < Static47.method763()) {
			throw new IOException("fdt");
		}
		if (this.anInt4007 == 0) {
			if (this.aClass63_8.anInt3324 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass63_8.anInt3324 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass63_8.anObject3;
				this.anInt4007 = 1;
			}
		}
		@Pc(57) int local57;
		if (this.anInt4007 == 1) {
			local57 = this.aDataInputStream1.available();
			if (local57 > 0) {
				if (this.anInt4008 + local57 > 4) {
					local57 = 4 - this.anInt4008;
				}
				this.anInt4008 += this.aDataInputStream1.read(this.aByteArray45, this.anInt4008, local57);
				if (this.anInt4008 == 4) {
					@Pc(103) int local103 = (new Class1_Sub8(this.aByteArray45)).method868();
					this.anInt4007 = 2;
					this.aByteArray46 = new byte[local103];
				}
			}
		}
		if (this.anInt4007 == 2) {
			local57 = this.aDataInputStream1.available();
			if (local57 > 0) {
				if (this.anInt4009 + local57 > this.aByteArray46.length) {
					local57 = this.aByteArray46.length - this.anInt4009;
				}
				this.anInt4009 += this.aDataInputStream1.read(this.aByteArray46, this.anInt4009, local57);
				if (this.anInt4009 == this.aByteArray46.length) {
					return this.aByteArray46;
				}
			}
		}
		return null;
	}
}
