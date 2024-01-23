import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class133 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public int anInt4158;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	private int anInt4162;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	private int anInt4163;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	private int anInt4164;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	private int anInt4165;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	private int anInt4166;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	private int anInt4160 = 2;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
	private int[] anIntArray374 = new int[2];

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	private int[] anIntArray375 = new int[2];

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class133() {
		this.anIntArray374[0] = 0;
		this.anIntArray374[1] = 65535;
		this.anIntArray375[0] = 0;
		this.anIntArray375[1] = 65535;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	public int method3310(@OriginalArg(0) int arg0) {
		if (this.anInt4166 >= this.anInt4163) {
			this.anInt4164 = this.anIntArray375[this.anInt4162++] << 15;
			if (this.anInt4162 >= this.anInt4160) {
				this.anInt4162 = this.anInt4160 - 1;
			}
			this.anInt4163 = (int) ((double) this.anIntArray374[this.anInt4162] / 65536.0D * (double) arg0);
			if (this.anInt4163 > this.anInt4166) {
				this.anInt4165 = ((this.anIntArray375[this.anInt4162] << 15) - this.anInt4164) / (this.anInt4163 - this.anInt4166);
			}
		}
		this.anInt4164 += this.anInt4165;
		this.anInt4166++;
		return this.anInt4164 - this.anInt4165 >> 15;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!cg;)V")
	public void method3311(@OriginalArg(0) Class1_Sub11 arg0) {
		this.anInt4159 = arg0.method2690();
		this.anInt4161 = arg0.method2643();
		this.anInt4158 = arg0.method2643();
		this.method3313(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public void method3312() {
		this.anInt4163 = 0;
		this.anInt4162 = 0;
		this.anInt4165 = 0;
		this.anInt4164 = 0;
		this.anInt4166 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!cg;)V")
	public void method3313(@OriginalArg(0) Class1_Sub11 arg0) {
		this.anInt4160 = arg0.method2690();
		this.anIntArray374 = new int[this.anInt4160];
		this.anIntArray375 = new int[this.anInt4160];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4160; local16++) {
			this.anIntArray374[local16] = arg0.method2691();
			this.anIntArray375[local16] = arg0.method2691();
		}
	}
}
