import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
	private int anInt3922;

	@OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
	private int anInt3926;

	@OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
	private int anInt3934;

	@OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
	private int anInt3935;

	@OriginalMember(owner = "client!wf", name = "kb", descriptor = "I")
	private int anInt3938;

	@OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
	private int anInt3942;

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	private int anInt3923;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
	private int anInt3928;

	@OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
	private int anInt3933;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3923 = arg0.method1375();
		} else if (arg1 == 1) {
			this.anInt3933 = (arg0.method1342() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3928 = (arg0.method1342() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZII)V")
	private void method2778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(23) int local23 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(30) int local30 = local16 >= arg0 ? local16 : arg0;
		@Pc(41) int local41 = arg0 >= local23 ? local23 : arg0;
		@Pc(46) int local46 = local30 - local41;
		this.anInt3935 = (local30 + local41) / 2;
		if (local46 <= 0) {
			return;
		}
		@Pc(63) int local63 = (local30 - arg0 << 12) / local46;
		@Pc(72) int local72 = (local30 - arg1 << 12) / local46;
		if (this.anInt3935 > 0 && this.anInt3935 < 4096) {
			this.anInt3922 = (local46 << 12) / (this.anInt3935 > 2048 ? 8192 - (this.anInt3935 * 2) : this.anInt3935 * 2);
		}
		@Pc(113) int local113 = (local30 - arg2 << 12) / local46;
		if (arg1 == local30) {
			this.anInt3934 = local41 == arg2 ? local63 + 20480 : -local113 + 4096;
		} else if (arg2 == local30) {
			this.anInt3934 = arg0 == local41 ? local72 + 4096 : -local63 + 12288;
		} else {
			this.anInt3934 = arg1 == local41 ? local113 + 12288 : -local72 + 20480;
		}
		this.anInt3934 /= 6;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(26) int[][] local26 = this.method2785(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static86.anInt1942; local52++) {
				this.method2778(local38[local52], local30[local52], local34[local52]);
				this.anInt3935 += this.anInt3928;
				this.anInt3922 += this.anInt3933;
				for (this.anInt3934 += this.anInt3923; this.anInt3934 < 0; this.anInt3934 += 4096) {
				}
				while (this.anInt3934 > 4096) {
					this.anInt3934 -= 4096;
				}
				if (this.anInt3922 < 0) {
					this.anInt3922 = 0;
				}
				if (this.anInt3935 < 0) {
					this.anInt3935 = 0;
				}
				if (this.anInt3935 > 4096) {
					this.anInt3935 = 4096;
				}
				if (this.anInt3922 > 4096) {
					this.anInt3922 = 4096;
				}
				this.method2779(this.anInt3922, this.anInt3934, this.anInt3935);
				local42[local52] = this.anInt3942;
				local50[local52] = this.anInt3926;
				local46[local52] = this.anInt3938;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
	private void method2779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg2 <= 2048 ? arg2 * (arg0 + 4096) >> 12 : arg2 + arg0 - (arg2 * arg0 >> 12);
		if (local33 <= 0) {
			this.anInt3942 = this.anInt3926 = this.anInt3938 = arg2;
			return;
		}
		@Pc(49) int local49 = arg1 * 6;
		@Pc(57) int local57 = arg2 + arg2 - local33;
		@Pc(66) int local66 = (local33 - local57 << 12) / local33;
		@Pc(72) int local72 = local49 >> 12;
		@Pc(78) int local78 = local66 * local33 >> 12;
		@Pc(84) int local84 = local49 - (local72 << 12);
		@Pc(90) int local90 = local84 * local78 >> 12;
		@Pc(95) int local95 = local57 + local90;
		@Pc(100) int local100 = local33 - local90;
		if (local72 == 0) {
			this.anInt3938 = local57;
			this.anInt3942 = local33;
			this.anInt3926 = local95;
		} else if (local72 == 1) {
			this.anInt3942 = local100;
			this.anInt3938 = local57;
			this.anInt3926 = local33;
		} else if (local72 == 2) {
			this.anInt3942 = local57;
			this.anInt3926 = local33;
			this.anInt3938 = local95;
		} else if (local72 == 3) {
			this.anInt3942 = local57;
			this.anInt3938 = local33;
			this.anInt3926 = local100;
		} else if (local72 == 4) {
			this.anInt3942 = local95;
			this.anInt3926 = local57;
			this.anInt3938 = local33;
		} else if (local72 == 5) {
			this.anInt3938 = local100;
			this.anInt3926 = local57;
			this.anInt3942 = local33;
		}
	}
}
