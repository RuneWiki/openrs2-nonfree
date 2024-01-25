import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class110 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public int anInt3175;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	private int anInt3178;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	private int anInt3181;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	private int anInt3182;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	private int anInt3174 = 2;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	private int[] anIntArray247 = new int[2];

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
	private int[] anIntArray246 = new int[2];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class110() {
		this.anIntArray247[0] = 0;
		this.anIntArray247[1] = 65535;
		this.anIntArray246[0] = 0;
		this.anIntArray246[1] = 65535;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!co;)V")
	public void method2825(@OriginalArg(0) Class5_Sub3 arg0) {
		this.anInt3174 = arg0.method4220();
		this.anIntArray247 = new int[this.anInt3174];
		this.anIntArray246 = new int[this.anInt3174];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3174; local16++) {
			this.anIntArray247[local16] = arg0.method4227();
			this.anIntArray246[local16] = arg0.method4227();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!co;)V")
	public void method2826(@OriginalArg(0) Class5_Sub3 arg0) {
		this.anInt3175 = arg0.method4220();
		this.anInt3177 = arg0.method4230();
		this.anInt3176 = arg0.method4230();
		this.method2825(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()V")
	public void method2827() {
		this.anInt3182 = 0;
		this.anInt3179 = 0;
		this.anInt3178 = 0;
		this.anInt3181 = 0;
		this.anInt3180 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public int method2828(@OriginalArg(0) int arg0) {
		if (this.anInt3180 >= this.anInt3182) {
			this.anInt3181 = this.anIntArray246[this.anInt3179++] << 15;
			if (this.anInt3179 >= this.anInt3174) {
				this.anInt3179 = this.anInt3174 - 1;
			}
			this.anInt3182 = (int) ((double) this.anIntArray247[this.anInt3179] / 65536.0D * (double) arg0);
			if (this.anInt3182 > this.anInt3180) {
				this.anInt3178 = ((this.anIntArray246[this.anInt3179] << 15) - this.anInt3181) / (this.anInt3182 - this.anInt3180);
			}
		}
		this.anInt3181 += this.anInt3178;
		this.anInt3180++;
		return this.anInt3181 - this.anInt3178 >> 15;
	}
}
