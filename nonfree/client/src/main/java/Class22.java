import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class22 {

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	private int anInt583;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[B")
	private final byte[] aByteArray8 = new byte[4];

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!fc;")
	private final Class24 aClass24_4;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "J")
	private final long aLong26;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!cf;Ljava/net/URL;)V")
	public Class22(@OriginalArg(0) Class14 arg0, @OriginalArg(1) URL arg1) {
		this.aClass24_4 = arg0.method187(arg1);
		this.anInt577 = 0;
		this.aLong26 = Static42.method793() + 30000L;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)[B")
	public byte[] method377() throws IOException {
		if (Static42.method793() > this.aLong26) {
			throw new IOException("fdt");
		}
		if (this.anInt577 == 0) {
			if (this.aClass24_4.anInt814 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass24_4.anInt814 == 1) {
				this.anInt577 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass24_4.anObject10;
			}
		}
		@Pc(63) int local63;
		if (this.anInt577 == 1) {
			local63 = this.aDataInputStream1.available();
			if (local63 > 0) {
				if (local63 + this.anInt583 > 4) {
					local63 = 4 - this.anInt583;
				}
				this.anInt583 += this.aDataInputStream1.read(this.aByteArray8, this.anInt583, local63);
				if (this.anInt583 == 4) {
					@Pc(106) int local106 = (new Class4_Sub10(this.aByteArray8)).method549();
					this.aByteArray7 = new byte[local106];
					this.anInt577 = 2;
				}
			}
		}
		if (this.anInt577 == 2) {
			local63 = this.aDataInputStream1.available();
			if (local63 > 0) {
				if (local63 + this.anInt590 > this.aByteArray7.length) {
					local63 = this.aByteArray7.length - this.anInt590;
				}
				this.anInt590 += this.aDataInputStream1.read(this.aByteArray7, this.anInt590, local63);
				if (this.aByteArray7.length == this.anInt590) {
					return this.aByteArray7;
				}
			}
		}
		return null;
	}
}
