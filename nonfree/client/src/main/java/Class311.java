import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class311 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	public int anInt8304;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	public int anInt8305;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	public int anInt8306;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	private int anInt8308;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
	private int anInt8309;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
	private int anInt8310;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
	private int anInt8311;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	private int anInt8312;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	private int anInt8307 = 2;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
	private int[] anIntArray643 = new int[2];

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
	private int[] anIntArray644 = new int[2];

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class311() {
		this.anIntArray643[0] = 0;
		this.anIntArray643[1] = 65535;
		this.anIntArray644[0] = 0;
		this.anIntArray644[1] = 65535;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!dga;)V")
	public void method6886(@OriginalArg(0) Class6_Sub14 arg0) {
		this.anInt8307 = arg0.method6041();
		this.anIntArray643 = new int[this.anInt8307];
		this.anIntArray644 = new int[this.anInt8307];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8307; local16++) {
			this.anIntArray643[local16] = arg0.method6006();
			this.anIntArray644[local16] = arg0.method6006();
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Lclient!dga;)V")
	public void method6887(@OriginalArg(0) Class6_Sub14 arg0) {
		this.anInt8304 = arg0.method6041();
		this.anInt8306 = arg0.method6027();
		this.anInt8305 = arg0.method6027();
		this.method6886(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()V")
	public void method6888() {
		this.anInt8311 = 0;
		this.anInt8308 = 0;
		this.anInt8310 = 0;
		this.anInt8309 = 0;
		this.anInt8312 = 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	public int method6889(@OriginalArg(0) int arg0) {
		if (this.anInt8312 >= this.anInt8311) {
			this.anInt8309 = this.anIntArray644[this.anInt8308++] << 15;
			if (this.anInt8308 >= this.anInt8307) {
				this.anInt8308 = this.anInt8307 - 1;
			}
			this.anInt8311 = (int) ((double) this.anIntArray643[this.anInt8308] / 65536.0D * (double) arg0);
			if (this.anInt8311 > this.anInt8312) {
				this.anInt8310 = ((this.anIntArray644[this.anInt8308] << 15) - this.anInt8309) / (this.anInt8311 - this.anInt8312);
			}
		}
		this.anInt8309 += this.anInt8310;
		this.anInt8312++;
		return this.anInt8309 - this.anInt8310 >> 15;
	}
}
