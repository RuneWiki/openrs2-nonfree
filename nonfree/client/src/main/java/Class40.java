import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class40 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	private int anInt1948;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	private int anInt1949;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[B")
	private final byte[] aByteArray51 = new byte[4];

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!af;")
	private final Class7 aClass7_4;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "J")
	private final long aLong66;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!u;Ljava/net/URL;)V")
	public Class40(@OriginalArg(0) Class74 arg0, @OriginalArg(1) URL arg1) {
		this.aClass7_4 = arg0.method2125(arg1);
		this.anInt1950 = 0;
		this.aLong66 = Static102.method1996() + 30000L;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)[B")
	public byte[] method1253() throws IOException {
		if (Static102.method1996() > this.aLong66) {
			throw new IOException("fdt");
		}
		if (this.anInt1950 == 0) {
			if (this.aClass7_4.anInt148 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass7_4.anInt148 == 1) {
				this.anInt1950 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass7_4.anObject1;
			}
		}
		@Pc(64) int local64;
		if (this.anInt1950 == 1) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (local64 + this.anInt1949 > 4) {
					local64 = 4 - this.anInt1949;
				}
				this.anInt1949 += this.aDataInputStream1.read(this.aByteArray51, this.anInt1949, local64);
				if (this.anInt1949 == 4) {
					@Pc(109) int local109 = (new Class3_Sub12(this.aByteArray51)).method1920();
					this.anInt1950 = 2;
					this.aByteArray50 = new byte[local109];
				}
			}
		}
		if (this.anInt1950 == 2) {
			local64 = this.aDataInputStream1.available();
			if (local64 > 0) {
				if (this.aByteArray50.length < local64 + this.anInt1948) {
					local64 = this.aByteArray50.length - this.anInt1948;
				}
				this.anInt1948 += this.aDataInputStream1.read(this.aByteArray50, this.anInt1948, local64);
				if (this.aByteArray50.length == this.anInt1948) {
					return this.aByteArray50;
				}
			}
		}
		return null;
	}
}
