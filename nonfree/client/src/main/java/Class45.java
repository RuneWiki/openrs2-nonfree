import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class45 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	private int anInt1574;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[B")
	private final byte[] aByteArray27 = new byte[4];

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!n;")
	private final Class51 aClass51_2;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	private int anInt1582;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "J")
	private final long aLong51;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!oc;Ljava/net/URL;)V")
	public Class45(@OriginalArg(0) Class55 arg0, @OriginalArg(1) URL arg1) {
		this.aClass51_2 = arg0.method1542(arg1);
		this.anInt1582 = 0;
		this.aLong51 = Static52.method906() + 30000L;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)[B")
	public byte[] method1204() throws IOException {
		if (this.aLong51 < Static52.method906()) {
			throw new IOException("fdt");
		}
		if (this.anInt1582 == 0) {
			if (this.aClass51_2.anInt1880 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass51_2.anInt1880 == 1) {
				this.anInt1582 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass51_2.anObject2;
			}
		}
		@Pc(54) int local54;
		if (this.anInt1582 == 1) {
			local54 = this.aDataInputStream1.available();
			if (local54 > 0) {
				if (local54 + this.anInt1574 > 4) {
					local54 = 4 - this.anInt1574;
				}
				this.anInt1574 += this.aDataInputStream1.read(this.aByteArray27, this.anInt1574, local54);
				if (this.anInt1574 == 4) {
					@Pc(92) int local92 = (new Class1_Sub20(this.aByteArray27)).method2094();
					this.anInt1582 = 2;
					this.aByteArray28 = new byte[local92];
				}
			}
		}
		if (this.anInt1582 == 2) {
			local54 = this.aDataInputStream1.available();
			if (local54 > 0) {
				if (local54 + this.anInt1573 > this.aByteArray28.length) {
					local54 = this.aByteArray28.length - this.anInt1573;
				}
				this.anInt1573 += this.aDataInputStream1.read(this.aByteArray28, this.anInt1573, local54);
				if (this.aByteArray28.length == this.anInt1573) {
					return this.aByteArray28;
				}
			}
		}
		return null;
	}
}
