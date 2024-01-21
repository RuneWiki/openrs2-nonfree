import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class73 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private int anInt3354;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private int anInt3361;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[B")
	private final byte[] aByteArray44 = new byte[4];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!ca;")
	private final Class14 aClass14_8;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private int anInt3359;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "J")
	private final long aLong116;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!qd;Ljava/net/URL;)V")
	public Class73(@OriginalArg(0) Class68 arg0, @OriginalArg(1) URL arg1) {
		this.aClass14_8 = arg0.method2195(arg1);
		this.anInt3359 = 0;
		this.aLong116 = Static150.method2481() + 30000L;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)[B")
	public byte[] method2436() throws IOException {
		if (Static150.method2481() > this.aLong116) {
			throw new IOException("fdt");
		}
		if (this.anInt3359 == 0) {
			if (this.aClass14_8.anInt516 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass14_8.anInt516 == 1) {
				this.anInt3359 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass14_8.anObject1;
			}
		}
		@Pc(62) int local62;
		if (this.anInt3359 == 1) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (local62 + this.anInt3361 > 4) {
					local62 = 4 - this.anInt3361;
				}
				this.anInt3361 += this.aDataInputStream1.read(this.aByteArray44, this.anInt3361, local62);
				if (this.anInt3361 == 4) {
					@Pc(102) int local102 = (new Class3_Sub4(this.aByteArray44)).method213();
					this.aByteArray45 = new byte[local102];
					this.anInt3359 = 2;
				}
			}
		}
		if (this.anInt3359 == 2) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (this.aByteArray45.length < this.anInt3354 + local62) {
					local62 = this.aByteArray45.length - this.anInt3354;
				}
				this.anInt3354 += this.aDataInputStream1.read(this.aByteArray45, this.anInt3354, local62);
				if (this.aByteArray45.length == this.anInt3354) {
					return this.aByteArray45;
				}
			}
		}
		return null;
	}
}
