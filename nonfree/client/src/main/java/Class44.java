import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class44 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private int anInt1769;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private int anInt1770;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[B")
	private final byte[] aByteArray19 = new byte[4];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!cd;")
	private final Class15 aClass15_6;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	private int anInt1768;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "J")
	private final long aLong55;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!a;Ljava/net/URL;)V")
	public Class44(@OriginalArg(0) Class1 arg0, @OriginalArg(1) URL arg1) {
		this.aClass15_6 = arg0.method3(arg1);
		this.anInt1768 = 0;
		this.aLong55 = Static68.method1276() + 30000L;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
	public byte[] method1435() throws IOException {
		if (Static68.method1276() > this.aLong55) {
			throw new IOException("fdt");
		}
		if (this.anInt1768 == 0) {
			if (this.aClass15_6.anInt624 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass15_6.anInt624 == 1) {
				this.anInt1768 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass15_6.anObject1;
			}
		}
		@Pc(56) int local56;
		if (this.anInt1768 == 1) {
			local56 = this.aDataInputStream1.available();
			if (local56 > 0) {
				if (this.anInt1770 + local56 > 4) {
					local56 = 4 - this.anInt1770;
				}
				this.anInt1770 += this.aDataInputStream1.read(this.aByteArray19, this.anInt1770, local56);
				if (this.anInt1770 == 4) {
					@Pc(100) int local100 = (new Class2_Sub3(this.aByteArray19)).method248();
					this.anInt1768 = 2;
					this.aByteArray18 = new byte[local100];
				}
			}
		}
		if (this.anInt1768 == 2) {
			local56 = this.aDataInputStream1.available();
			if (local56 > 0) {
				if (this.anInt1769 + local56 > this.aByteArray18.length) {
					local56 = this.aByteArray18.length - this.anInt1769;
				}
				this.anInt1769 += this.aDataInputStream1.read(this.aByteArray18, this.anInt1769, local56);
				if (this.aByteArray18.length == this.anInt1769) {
					return this.aByteArray18;
				}
			}
		}
		return null;
	}
}
