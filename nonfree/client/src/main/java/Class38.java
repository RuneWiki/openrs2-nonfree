import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class38 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt1662;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt1663;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "[B")
	private final byte[] aByteArray49 = new byte[4];

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!jc;")
	private final Class34 aClass34_4;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	private int anInt1668;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "J")
	private final long aLong48;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!w;Ljava/net/URL;)V")
	public Class38(@OriginalArg(0) Class79 arg0, @OriginalArg(1) URL arg1) {
		this.aClass34_4 = arg0.method2094(arg1);
		this.anInt1668 = 0;
		this.aLong48 = Static124.method2079() + 30000L;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)[B")
	public byte[] method1145() throws IOException {
		if (Static124.method2079() > this.aLong48) {
			throw new IOException("fdt");
		}
		if (this.anInt1668 == 0) {
			if (this.aClass34_4.anInt1567 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass34_4.anInt1567 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass34_4.anObject2;
				this.anInt1668 = 1;
			}
		}
		@Pc(58) int local58;
		if (this.anInt1668 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt1663 + local58 > 4) {
					local58 = 4 - this.anInt1663;
				}
				this.anInt1663 += this.aDataInputStream1.read(this.aByteArray49, this.anInt1663, local58);
				if (this.anInt1663 == 4) {
					@Pc(104) int local104 = (new Class1_Sub18(this.aByteArray49)).method2185();
					this.anInt1668 = 2;
					this.aByteArray48 = new byte[local104];
				}
			}
		}
		if (this.anInt1668 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.aByteArray48.length < this.anInt1662 + local58) {
					local58 = this.aByteArray48.length - this.anInt1662;
				}
				this.anInt1662 += this.aDataInputStream1.read(this.aByteArray48, this.anInt1662, local58);
				if (this.anInt1662 == this.aByteArray48.length) {
					return this.aByteArray48;
				}
			}
		}
		return null;
	}
}
