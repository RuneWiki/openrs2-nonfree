import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	private int anInt3765;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
	private int anInt3771;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
	private int anInt3773;

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	private int anInt3776;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
	private int anInt3780;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
	private int anInt3766 = 0;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
	private int anInt3781 = 0;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
	private void method2826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) int local36 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (4096 - -arg2) * arg0 >> 12;
		if (local36 <= 0) {
			this.anInt3780 = this.anInt3774 = this.anInt3776 = arg0;
			return;
		}
		@Pc(55) int local55 = arg1 * 6;
		@Pc(63) int local63 = arg0 + arg0 - local36;
		@Pc(72) int local72 = (local36 - local63 << 12) / local36;
		@Pc(76) int local76 = local55 >> 12;
		@Pc(83) int local83 = local55 - (local76 << 12);
		@Pc(91) int local91 = local36 * local72 >> 12;
		@Pc(97) int local97 = local83 * local91 >> 12;
		@Pc(101) int local101 = local97 + local63;
		@Pc(106) int local106 = local36 - local97;
		if (local76 == 0) {
			this.anInt3776 = local63;
			this.anInt3780 = local36;
			this.anInt3774 = local101;
		} else if (local76 == 1) {
			this.anInt3780 = local106;
			this.anInt3776 = local63;
			this.anInt3774 = local36;
		} else if (local76 == 2) {
			this.anInt3774 = local36;
			this.anInt3776 = local101;
			this.anInt3780 = local63;
		} else if (local76 == 3) {
			this.anInt3776 = local36;
			this.anInt3774 = local106;
			this.anInt3780 = local63;
		} else if (local76 == 4) {
			this.anInt3780 = local101;
			this.anInt3774 = local63;
			this.anInt3776 = local36;
		} else if (local76 == 5) {
			this.anInt3780 = local36;
			this.anInt3776 = local106;
			this.anInt3774 = local63;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBII)V")
	private void method2829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg0 : arg2;
		@Pc(19) int local19 = arg2 > arg0 ? arg2 : arg0;
		@Pc(26) int local26 = local12 <= arg1 ? local12 : arg1;
		@Pc(37) int local37 = local19 >= arg1 ? local19 : arg1;
		@Pc(50) int local50 = local37 - local26;
		if (local50 <= 0) {
			this.anInt3771 = 0;
		} else {
			@Pc(69) int local69 = (local37 - arg1 << 12) / local50;
			@Pc(78) int local78 = (local37 - arg0 << 12) / local50;
			@Pc(87) int local87 = (local37 - arg2 << 12) / local50;
			if (arg2 == local37) {
				this.anInt3771 = local26 == arg0 ? local69 + 20480 : -local78 + 4096;
			} else if (arg0 == local37) {
				this.anInt3771 = local26 == arg1 ? local87 + 4096 : -local69 + 12288;
			} else {
				this.anInt3771 = arg2 == local26 ? local78 + 12288 : -local87 + 20480;
			}
			this.anInt3771 /= 6;
		}
		this.anInt3773 = (local37 + local26) / 2;
		if (this.anInt3773 > 0 && this.anInt3773 < 4096) {
			this.anInt3765 = (local50 << 12) / (this.anInt3773 <= 2048 ? this.anInt3773 * 2 : 8192 - (this.anInt3773 * 2));
		} else {
			this.anInt3765 = 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(26) int[][] local26 = this.method3501(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static105.anInt2391; local52++) {
				this.method2829(local34[local52], local42[local52], local30[local52]);
				for (this.anInt3771 += this.anInt3766; this.anInt3771 < 0; this.anInt3771 += 4096) {
				}
				while (this.anInt3771 > 4096) {
					this.anInt3771 -= 4096;
				}
				this.anInt3773 += this.anInt3781;
				if (this.anInt3773 < 0) {
					this.anInt3773 = 0;
				}
				this.anInt3765 += this.anInt3778;
				if (this.anInt3773 > 4096) {
					this.anInt3773 = 4096;
				}
				if (this.anInt3765 < 0) {
					this.anInt3765 = 0;
				}
				if (this.anInt3765 > 4096) {
					this.anInt3765 = 4096;
				}
				this.method2826(this.anInt3773, this.anInt3771, this.anInt3765);
				local38[local52] = this.anInt3780;
				local50[local52] = this.anInt3774;
				local46[local52] = this.anInt3776;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3766 = arg0.method932();
		} else if (arg1 == 1) {
			this.anInt3778 = (arg0.method891() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3781 = (arg0.method891() << 12) / 100;
		}
	}
}
