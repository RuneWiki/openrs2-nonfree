import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class116 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	private int anInt2719;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	private int anInt2720;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "Lclient!qda;")
	private Class59 aClass59_5;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	private int anInt2722 = -1;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	private final int anInt2726;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	private final int anInt2727;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
	private final int anInt2728;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	private final int anInt2717;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "[Lclient!th;")
	private final Class336[] aClass336Array2;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[Lclient!th;")
	private final Class336[] aClass336Array1;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!th;")
	private final Class336 aClass336_1;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[Lclient!th;IIII)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) Class336[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2726 = arg0;
		this.anInt2727 = arg5;
		this.anInt2728 = arg4;
		this.anInt2717 = arg3;
		this.aClass336Array2 = arg1;
		if (arg1 == null) {
			this.aClass336Array1 = null;
			this.aClass336_1 = null;
		} else {
			this.aClass336Array1 = new Class336[arg1.length];
			this.aClass336_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method2422(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1) {
		if (arg0 != this.anInt2722) {
			this.anInt2722 = arg0;
			@Pc(10) int local10 = Static630.method8378(arg0);
			if (local10 > 512) {
				local10 = 512;
			}
			if (local10 <= 0) {
				local10 = 1;
			}
			if (local10 != this.anInt2719) {
				this.aClass59_5 = null;
				this.anInt2719 = local10;
			}
			if (this.aClass336Array2 != null) {
				this.anInt2720 = 0;
				@Pc(49) int[] local49 = new int[this.aClass336Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass336Array2.length; local51++) {
					@Pc(57) Class336 local57 = this.aClass336Array2[local51];
					if (local57.method7784(this.anInt2717, this.anInt2728, this.anInt2727, this.anInt2722)) {
						local49[this.anInt2720] = local57.anInt9296;
						this.aClass336Array1[this.anInt2720++] = local57;
					}
				}
				Static628.method8367(this.aClass336Array1, this.anInt2720 - 1, local49, 0);
			}
			this.aBoolean189 = true;
		}
		@Pc(118) boolean local118 = false;
		if (this.aBoolean189) {
			this.aBoolean189 = false;
			for (@Pc(129) int local129 = this.anInt2720 - 1; local129 >= 0; local129--) {
				@Pc(139) boolean local139 = this.aClass336Array1[local129].method7780(arg1, this.aClass336_1);
				this.aBoolean189 |= !local139;
				local118 |= local139;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public void method2423() {
		if (this.aClass336Array2 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass336Array2.length; local4++) {
				this.aClass336Array2[local4].method7785();
			}
		}
		this.aClass59_5 = null;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIIIIILclient!ha;I)V")
	public void method2425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class143 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg5 & 0x3FFF;
		if (this.anInt2726 == -1 || this.anInt2719 == 0) {
			arg7.aa(arg0, arg1, arg2, arg6, arg3, 0);
		} else {
			@Pc(35) Class331 local35 = Static400.anInterface3_9.method8501(this.anInt2726);
			if (this.aClass59_5 == null && Static400.anInterface3_9.method8500(this.anInt2726)) {
				@Pc(74) int[] local74 = local35.anInt9140 == 2 ? Static400.anInterface3_9.method8497(this.anInt2726, this.anInt2719, 0.7F, this.anInt2719) : Static400.anInterface3_9.method8499(this.anInt2726, this.anInt2719, false, 0.7F, this.anInt2719);
				this.aClass59_5 = arg7.method6241(this.anInt2719, this.anInt2719, this.anInt2719, local74);
			}
			if (local35.anInt9140 == 2) {
				arg7.aa(arg0, arg1, arg2, arg6, arg3, 0);
			}
			if (this.aClass59_5 != null) {
				@Pc(114) int local114 = local35.anInt9140 == 2 ? 1 : 0;
				@Pc(120) int local120 = arg8 * arg6 / -4096;
				@Pc(134) int local134;
				for (local134 = (arg2 - arg6) / 2 + arg6 * local9 / 4096; local134 > arg6; local134 -= arg6) {
				}
				while (arg6 < local120) {
					local120 -= arg6;
				}
				while (local134 < 0) {
					local134 += arg6;
				}
				while (local120 < 0) {
					local120 += arg6;
				}
				for (@Pc(183) int local183 = local134 - arg6; local183 < arg2; local183 += arg6) {
					for (@Pc(189) int local189 = local120 - arg6; local189 < arg6; local189 += arg6) {
						this.aClass59_5.method8058(arg0 + local183, local189 - -arg1, arg6, arg6, 1, 0, local114);
					}
				}
			}
		}
		for (@Pc(237) int local237 = this.anInt2720 - 1; local237 >= 0; local237--) {
			this.aClass336Array1[local237].method7787(arg7, arg0, arg1, arg2, arg6, arg8, local9);
		}
	}
}
