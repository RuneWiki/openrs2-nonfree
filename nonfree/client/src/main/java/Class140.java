import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class140 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	private int anInt3753;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Lclient!xa;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
	private int anInt3760 = -1;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
	private boolean aBoolean290 = true;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	private final int anInt3763;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	private final int anInt3758;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private final int anInt3757;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[Lclient!fm;")
	private final Class104[] aClass104Array1;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	private final int anInt3759;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[Lclient!fm;")
	private final Class104[] aClass104Array2;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!fm;")
	private final Class104 aClass104_1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I[Lclient!fm;IIII)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) Class104[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3763 = arg0;
		this.anInt3758 = arg4;
		this.anInt3757 = arg3;
		this.aClass104Array1 = arg1;
		this.anInt3759 = arg5;
		if (arg1 == null) {
			this.aClass104Array2 = null;
			this.aClass104_1 = null;
		} else {
			this.aClass104Array2 = new Class104[arg1.length];
			this.aClass104_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBILclient!oa;III)V")
	public void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg1 + arg2 & 0x3FFF;
		if (this.anInt3763 == -1) {
			arg5.C(arg4, arg3, arg6, arg8, arg7, 0);
		} else {
			@Pc(35) Class178 local35 = Static478.anInterface4_14.method3088(this.anInt3763);
			if (this.aClass37_19 == null && Static478.anInterface4_14.method3090(this.anInt3763)) {
				@Pc(71) int[] local71 = local35.aBoolean494 ? Static478.anInterface4_14.method3089(this.anInt3755, this.anInt3763, this.anInt3755, 0.7F) : Static478.anInterface4_14.method3086(this.anInt3755, false, 0.7F, this.anInt3755, this.anInt3763);
				this.aClass37_19 = arg5.method5324(local71, this.anInt3755, this.anInt3755, this.anInt3755);
			}
			if (local35.aBoolean494) {
				arg5.C(arg4, arg3, arg6, arg8, arg7, 0);
			}
			if (this.aClass37_19 != null) {
				@Pc(104) int local104 = local35.aBoolean494 ? 1 : 0;
				@Pc(110) int local110 = arg0 * arg8 / -4096;
				@Pc(124) int local124;
				for (local124 = (arg6 - arg8) / 2 + arg8 * local15 / 4096; local124 > arg8; local124 -= arg8) {
				}
				while (local124 < 0) {
					local124 += arg8;
				}
				while (arg8 < local110) {
					local110 -= arg8;
				}
				while (local110 < 0) {
					local110 += arg8;
				}
				for (@Pc(170) int local170 = local124 - arg8; local170 < arg6; local170 += arg8) {
					for (@Pc(176) int local176 = local110 - arg8; local176 < arg8; local176 += arg8) {
						this.aClass37_19.KA(local170 + arg4, local176 + arg3, arg8, arg8, 1, 0, local104);
					}
				}
			}
		}
		for (@Pc(210) int local210 = this.anInt3753 - 1; local210 >= 0; local210--) {
			this.aClass104Array2[local210].method2876(arg5, arg4, arg3, arg6, arg8, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!oa;II)Z")
	public boolean method3295(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3760 != arg1) {
			this.anInt3760 = arg1;
			@Pc(14) int local14 = Static332.method5752(arg1);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt3755) {
				this.anInt3755 = local14;
				this.aClass37_19 = null;
			}
			if (this.aClass104Array1 != null) {
				this.anInt3753 = 0;
				@Pc(44) int[] local44 = new int[this.aClass104Array1.length];
				for (@Pc(46) int local46 = 0; local46 < this.aClass104Array1.length; local46++) {
					@Pc(52) Class104 local52 = this.aClass104Array1[local46];
					if (local52.method2878(this.anInt3757, this.anInt3758, this.anInt3759, this.anInt3760)) {
						local44[this.anInt3753] = local52.anInt3278;
						this.aClass104Array2[this.anInt3753++] = local52;
					}
				}
				Static285.method4909(0, this.aClass104Array2, this.anInt3753 - 1, local44);
			}
			this.aBoolean290 = true;
		}
		@Pc(109) boolean local109 = false;
		if (this.aBoolean290) {
			this.aBoolean290 = false;
			for (@Pc(125) int local125 = this.anInt3753 - 1; local125 >= 0; local125--) {
				@Pc(135) boolean local135 = this.aClass104Array2[local125].method2874(arg0, this.aClass104_1);
				local109 |= local135;
				this.aBoolean290 |= !local135;
			}
		}
		return local109;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3297() {
		if (this.aClass104Array1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass104Array1.length; local11++) {
				this.aClass104Array1[local11].method2870();
			}
		}
		this.aClass37_19 = null;
	}
}
