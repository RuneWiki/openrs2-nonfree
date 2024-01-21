import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class92 {

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	private int anInt3786;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "[B")
	private final byte[] aByteArray42 = new byte[4];

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!la;")
	private final Class56 aClass56_17;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "I")
	private int anInt3792;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "J")
	private final long aLong125;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!hf;Ljava/net/URL;)V")
	public Class92(@OriginalArg(0) Class41 arg0, @OriginalArg(1) URL arg1) {
		this.aClass56_17 = arg0.method1052(arg1);
		this.anInt3792 = 0;
		this.aLong125 = Static104.method1634() + 30000L;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)[B")
	public byte[] method2623() throws IOException {
		if (this.aLong125 < Static104.method1634()) {
			throw new IOException("fdt");
		}
		if (this.anInt3792 == 0) {
			if (this.aClass56_17.anInt2418 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass56_17.anInt2418 == 1) {
				this.anInt3792 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass56_17.anObject2;
			}
		}
		@Pc(53) int local53;
		if (this.anInt3792 == 1) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (local53 + this.anInt3789 > 4) {
					local53 = 4 - this.anInt3789;
				}
				this.anInt3789 += this.aDataInputStream1.read(this.aByteArray42, this.anInt3789, local53);
				if (this.anInt3789 == 4) {
					@Pc(97) int local97 = (new Class2_Sub11(this.aByteArray42)).method1577();
					this.aByteArray41 = new byte[local97];
					this.anInt3792 = 2;
				}
			}
		}
		if (this.anInt3792 == 2) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (this.aByteArray41.length < this.anInt3786 + local53) {
					local53 = this.aByteArray41.length - this.anInt3786;
				}
				this.anInt3786 += this.aDataInputStream1.read(this.aByteArray41, this.anInt3786, local53);
				if (this.aByteArray41.length == this.anInt3786) {
					return this.aByteArray41;
				}
			}
		}
		return null;
	}
}
