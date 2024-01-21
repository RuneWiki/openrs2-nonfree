import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class46 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt1811;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[B")
	private final byte[] aByteArray26 = new byte[4];

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!nc;")
	private final Class54 aClass54_7;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "J")
	private final long aLong46;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!kc;Ljava/net/URL;)V")
	public Class46(@OriginalArg(0) Class43 arg0, @OriginalArg(1) URL arg1) {
		this.aClass54_7 = arg0.method1099(arg1);
		this.anInt1812 = 0;
		this.aLong46 = Static38.method694() + 30000L;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[B")
	public byte[] method1205() throws IOException {
		if (this.aLong46 < Static38.method694()) {
			throw new IOException("fdt");
		}
		if (this.anInt1812 == 0) {
			if (this.aClass54_7.anInt2077 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass54_7.anInt2077 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass54_7.anObject2;
				this.anInt1812 = 1;
			}
		}
		@Pc(66) int local66;
		if (this.anInt1812 == 1) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (this.anInt1811 + local66 > 4) {
					local66 = 4 - this.anInt1811;
				}
				this.anInt1811 += this.aDataInputStream1.read(this.aByteArray26, this.anInt1811, local66);
				if (this.anInt1811 == 4) {
					@Pc(107) int local107 = (new Class3_Sub2(this.aByteArray26)).method278();
					this.anInt1812 = 2;
					this.aByteArray25 = new byte[local107];
				}
			}
		}
		if (this.anInt1812 == 2) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (this.anInt1807 + local66 > this.aByteArray25.length) {
					local66 = this.aByteArray25.length - this.anInt1807;
				}
				this.anInt1807 += this.aDataInputStream1.read(this.aByteArray25, this.anInt1807, local66);
				if (this.aByteArray25.length == this.anInt1807) {
					return this.aByteArray25;
				}
			}
		}
		return null;
	}
}
