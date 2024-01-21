import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class37 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	private int anInt1729;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[B")
	private final byte[] aByteArray9 = new byte[4];

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!k;")
	private final Class47 aClass47_1;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	private int anInt1724;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "J")
	private final long aLong61;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!pf;Ljava/net/URL;)V")
	public Class37(@OriginalArg(0) Class68 arg0, @OriginalArg(1) URL arg1) {
		this.aClass47_1 = arg0.method2224(arg1);
		this.anInt1724 = 0;
		this.aLong61 = Static23.method507() + 30000L;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)[B")
	public byte[] method1255() throws IOException {
		if (Static23.method507() > this.aLong61) {
			throw new IOException("fdt");
		}
		if (this.anInt1724 == 0) {
			if (this.aClass47_1.anInt1949 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass47_1.anInt1949 == 1) {
				this.anInt1724 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass47_1.anObject1;
			}
		}
		@Pc(63) int local63;
		if (this.anInt1724 == 1) {
			local63 = this.aDataInputStream1.available();
			if (local63 > 0) {
				if (local63 + this.anInt1728 > 4) {
					local63 = 4 - this.anInt1728;
				}
				this.anInt1728 += this.aDataInputStream1.read(this.aByteArray9, this.anInt1728, local63);
				if (this.anInt1728 == 4) {
					@Pc(103) int local103 = (new Class1_Sub8(this.aByteArray9)).method347();
					this.anInt1724 = 2;
					this.aByteArray8 = new byte[local103];
				}
			}
		}
		if (this.anInt1724 == 2) {
			local63 = this.aDataInputStream1.available();
			if (local63 > 0) {
				if (this.aByteArray8.length < local63 + this.anInt1729) {
					local63 = this.aByteArray8.length - this.anInt1729;
				}
				this.anInt1729 += this.aDataInputStream1.read(this.aByteArray8, this.anInt1729, local63);
				if (this.anInt1729 == this.aByteArray8.length) {
					return this.aByteArray8;
				}
			}
		}
		return null;
	}
}
