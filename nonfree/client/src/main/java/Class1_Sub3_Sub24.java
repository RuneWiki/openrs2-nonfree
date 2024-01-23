import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
	private int anInt3769;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
	private int anInt3773;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	private int anInt3775;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
	private int anInt3781;

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
	private int anInt3782;

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	private int anInt3771 = 0;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
	private int anInt3774 = 0;

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBII)V")
	private void method2797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg0 > arg2 ? arg0 : arg2;
		@Pc(26) int local26 = arg1 <= local19 ? local19 : arg1;
		@Pc(37) int local37 = arg0 < arg2 ? arg0 : arg2;
		@Pc(44) int local44 = local37 <= arg1 ? local37 : arg1;
		@Pc(49) int local49 = local26 - local44;
		if (local49 > 0) {
			@Pc(60) int local60 = (local26 - arg0 << 12) / local49;
			@Pc(69) int local69 = (local26 - arg2 << 12) / local49;
			@Pc(77) int local77 = (local26 - arg1 << 12) / local49;
			if (arg0 == local26) {
				this.anInt3782 = local44 == arg2 ? local77 + 20480 : 4096 - local69;
			} else if (local26 == arg2) {
				this.anInt3782 = local44 == arg1 ? local60 + 4096 : -local77 + 12288;
			} else {
				this.anInt3782 = local44 == arg0 ? local69 + 12288 : -local60 + 20480;
			}
			this.anInt3782 /= 6;
		} else {
			this.anInt3782 = 0;
		}
		this.anInt3769 = (local26 + local44) / 2;
		if (this.anInt3769 > 0 && this.anInt3769 < 4096) {
			this.anInt3773 = (local49 << 12) / (this.anInt3769 <= 2048 ? this.anInt3769 * 2 : 8192 - (this.anInt3769 * 2));
		} else {
			this.anInt3773 = 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3774 = arg0.method1798();
		} else if (arg1 == 1) {
			this.anInt3778 = (arg0.method1756() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3771 = (arg0.method1756() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
	private void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(34) int local34 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (arg1 + 4096) >> 12;
		if (local34 <= 0) {
			this.anInt3777 = this.anInt3781 = this.anInt3775 = arg2;
			return;
		}
		@Pc(43) int local43 = arg0 * 6;
		@Pc(50) int local50 = arg2 + arg2 - local34;
		@Pc(54) int local54 = local43 >> 12;
		@Pc(65) int local65 = (local34 - local50 << 12) / local34;
		@Pc(71) int local71 = local65 * local34 >> 12;
		@Pc(77) int local77 = local43 - (local54 << 12);
		@Pc(83) int local83 = local71 * local77 >> 12;
		@Pc(87) int local87 = local83 + local50;
		@Pc(91) int local91 = local34 - local83;
		if (local54 == 0) {
			this.anInt3781 = local87;
			this.anInt3775 = local50;
			this.anInt3777 = local34;
			return;
		}
		if (local54 == 1) {
			this.anInt3777 = local91;
			this.anInt3775 = local50;
			this.anInt3781 = local34;
			return;
		}
		if (local54 == 2) {
			this.anInt3775 = local87;
			this.anInt3781 = local34;
			this.anInt3777 = local50;
			return;
		}
		if (local54 == 3) {
			this.anInt3775 = local34;
			this.anInt3777 = local50;
			this.anInt3781 = local91;
			return;
		}
		if (local54 == 4) {
			this.anInt3777 = local87;
			this.anInt3781 = local50;
			this.anInt3775 = local34;
			return;
		}
		if (local54 == 5) {
			this.anInt3777 = local34;
			this.anInt3781 = local50;
			this.anInt3775 = local91;
			return;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[][] local29 = this.method4129(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local29[1];
			@Pc(49) int[] local49 = local29[2];
			@Pc(53) int[] local53 = local11[1];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2934; local55++) {
				this.method2797(local33[local55], local49[local55], local45[local55]);
				for (this.anInt3782 += this.anInt3774; this.anInt3782 < 0; this.anInt3782 += 4096) {
				}
				this.anInt3773 += this.anInt3778;
				this.anInt3769 += this.anInt3771;
				if (this.anInt3769 < 0) {
					this.anInt3769 = 0;
				}
				if (this.anInt3773 < 0) {
					this.anInt3773 = 0;
				}
				while (this.anInt3782 > 4096) {
					this.anInt3782 -= 4096;
				}
				if (this.anInt3769 > 4096) {
					this.anInt3769 = 4096;
				}
				if (this.anInt3773 > 4096) {
					this.anInt3773 = 4096;
				}
				this.method2800(this.anInt3782, this.anInt3773, this.anInt3769);
				local37[local55] = this.anInt3777;
				local53[local55] = this.anInt3781;
				local41[local55] = this.anInt3775;
			}
		}
		return local11;
	}
}
