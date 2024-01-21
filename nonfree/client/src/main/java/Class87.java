import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class87 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private int anInt3653;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[B")
	private final byte[] aByteArray41 = new byte[4];

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!td;")
	private final Class84 aClass84_9;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	private int anInt3650;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
	private final long aLong133;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!rh;Ljava/net/URL;)V")
	public Class87(@OriginalArg(0) Class76 arg0, @OriginalArg(1) URL arg1) {
		this.aClass84_9 = arg0.method2560(arg1);
		this.anInt3650 = 0;
		this.aLong133 = Static149.method2559() + 30000L;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)[B")
	public byte[] method2760() throws IOException {
		if (this.aLong133 < Static149.method2559()) {
			throw new IOException("fdt");
		}
		if (this.anInt3650 == 0) {
			if (this.aClass84_9.anInt3578 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass84_9.anInt3578 == 1) {
				this.anInt3650 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass84_9.anObject4;
			}
		}
		@Pc(59) int local59;
		if (this.anInt3650 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.anInt3645 + local59 > 4) {
					local59 = 4 - this.anInt3645;
				}
				this.anInt3645 += this.aDataInputStream1.read(this.aByteArray41, this.anInt3645, local59);
				if (this.anInt3645 == 4) {
					@Pc(100) int local100 = (new Class4_Sub11(this.aByteArray41)).method1263();
					this.aByteArray42 = new byte[local100];
					this.anInt3650 = 2;
				}
			}
		}
		if (this.anInt3650 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray42.length < local59 + this.anInt3653) {
					local59 = this.aByteArray42.length - this.anInt3653;
				}
				this.anInt3653 += this.aDataInputStream1.read(this.aByteArray42, this.anInt3653, local59);
				if (this.aByteArray42.length == this.anInt3653) {
					return this.aByteArray42;
				}
			}
		}
		return null;
	}
}
