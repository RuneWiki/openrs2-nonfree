import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "[B")
	private final byte[] aByteArray4 = new byte[4];

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!cc;")
	private final Class12 aClass12_3;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
	private final long aLong8;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!dc;Ljava/net/URL;)V")
	public Class9(@OriginalArg(0) Class17 arg0, @OriginalArg(1) URL arg1) {
		this.aClass12_3 = arg0.method386(arg1);
		this.anInt187 = 0;
		this.aLong8 = Static44.method861() + 30000L;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)[B")
	public byte[] method155() throws IOException {
		if (this.aLong8 < Static44.method861()) {
			throw new IOException("fdt");
		}
		if (this.anInt187 == 0) {
			if (this.aClass12_3.anInt373 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass12_3.anInt373 == 1) {
				this.anInt187 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass12_3.anObject1;
			}
		}
		@Pc(58) int local58;
		if (this.anInt187 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (local58 + this.anInt183 > 4) {
					local58 = 4 - this.anInt183;
				}
				this.anInt183 += this.aDataInputStream1.read(this.aByteArray4, this.anInt183, local58);
				if (this.anInt183 == 4) {
					@Pc(102) int local102 = (new Class4_Sub11(this.aByteArray4)).method725();
					this.aByteArray3 = new byte[local102];
					this.anInt187 = 2;
				}
			}
		}
		if (this.anInt187 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.aByteArray3.length < this.anInt182 + local58) {
					local58 = this.aByteArray3.length - this.anInt182;
				}
				this.anInt182 += this.aDataInputStream1.read(this.aByteArray3, this.anInt182, local58);
				if (this.aByteArray3.length == this.anInt182) {
					return this.aByteArray3;
				}
			}
		}
		return null;
	}
}
