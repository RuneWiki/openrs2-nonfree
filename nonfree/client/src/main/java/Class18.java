import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class18 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[B")
	private final byte[] aByteArray12 = new byte[4];

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!g;")
	private final Class26 aClass26_15;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "J")
	private final long aLong18;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!q;Ljava/net/URL;)V")
	public Class18(@OriginalArg(0) Class59 arg0, @OriginalArg(1) URL arg1) {
		this.aClass26_15 = arg0.method1645(arg1);
		this.anInt671 = 0;
		this.aLong18 = Static125.method2075() + 30000L;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[B")
	public byte[] method426() throws IOException {
		if (this.aLong18 < Static125.method2075()) {
			throw new IOException("fdt");
		}
		if (this.anInt671 == 0) {
			if (this.aClass26_15.anInt831 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass26_15.anInt831 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass26_15.anObject2;
				this.anInt671 = 1;
			}
		}
		@Pc(60) int local60;
		if (this.anInt671 == 1) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (this.anInt675 + local60 > 4) {
					local60 = 4 - this.anInt675;
				}
				this.anInt675 += this.aDataInputStream1.read(this.aByteArray12, this.anInt675, local60);
				if (this.anInt675 == 4) {
					@Pc(101) int local101 = (new Class2_Sub9(this.aByteArray12)).method622();
					this.aByteArray11 = new byte[local101];
					this.anInt671 = 2;
				}
			}
		}
		if (this.anInt671 == 2) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (this.aByteArray11.length < this.anInt676 + local60) {
					local60 = this.aByteArray11.length - this.anInt676;
				}
				this.anInt676 += this.aDataInputStream1.read(this.aByteArray11, this.anInt676, local60);
				if (this.anInt676 == this.aByteArray11.length) {
					return this.aByteArray11;
				}
			}
		}
		return null;
	}
}
