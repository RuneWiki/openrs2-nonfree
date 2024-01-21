import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class89 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	private int anInt3857;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "[B")
	private final byte[] aByteArray51 = new byte[4];

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "Lclient!qe;")
	private final Class82 aClass82_5;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private int anInt3854;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "J")
	private final long aLong124;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!vi;Ljava/net/URL;)V")
	public Class89(@OriginalArg(0) Class99 arg0, @OriginalArg(1) URL arg1) {
		this.aClass82_5 = arg0.method3418(arg1);
		this.anInt3854 = 0;
		this.aLong124 = Static24.method503() + 30000L;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)[B")
	public byte[] method2985() throws IOException {
		if (Static24.method503() > this.aLong124) {
			throw new IOException("fdt");
		}
		if (this.anInt3854 == 0) {
			if (this.aClass82_5.anInt3421 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass82_5.anInt3421 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass82_5.anObject2;
				this.anInt3854 = 1;
			}
		}
		@Pc(59) int local59;
		if (this.anInt3854 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (local59 + this.anInt3857 > 4) {
					local59 = 4 - this.anInt3857;
				}
				this.anInt3857 += this.aDataInputStream1.read(this.aByteArray51, this.anInt3857, local59);
				if (this.anInt3857 == 4) {
					@Pc(105) int local105 = (new Class1_Sub7(this.aByteArray51)).method2793();
					this.anInt3854 = 2;
					this.aByteArray50 = new byte[local105];
				}
			}
		}
		if (this.anInt3854 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray50.length < local59 + this.anInt3855) {
					local59 = this.aByteArray50.length - this.anInt3855;
				}
				this.anInt3855 += this.aDataInputStream1.read(this.aByteArray50, this.anInt3855, local59);
				if (this.aByteArray50.length == this.anInt3855) {
					return this.aByteArray50;
				}
			}
		}
		return null;
	}
}
