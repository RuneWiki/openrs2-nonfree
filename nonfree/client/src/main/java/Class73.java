import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class73 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!vj;")
	private Class58 aClass58_13;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	private int anInt2529;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
	private int anInt2532;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	private int anInt2527 = -1;

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	private final int anInt2523;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "[Lclient!cr;")
	private final Class36[] aClass36Array1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	private final int anInt2517;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	private final int anInt2525;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	private final int anInt2522;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "[Lclient!cr;")
	private final Class36[] aClass36Array2;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Lclient!cr;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I[Lclient!cr;IIII)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) Class36[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2523 = arg0;
		this.aClass36Array1 = arg1;
		this.anInt2517 = arg4;
		this.anInt2525 = arg3;
		this.anInt2522 = arg5;
		if (arg1 == null) {
			this.aClass36_1 = null;
			this.aClass36Array2 = null;
		} else {
			this.aClass36Array2 = new Class36[arg1.length];
			this.aClass36_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!vq;Z)Z")
	public boolean method2224(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		if (this.anInt2527 != arg0) {
			this.anInt2527 = arg0;
			@Pc(20) int local20 = Static28.method5505(arg0);
			if (local20 > arg0) {
				local20 = Static45.method916(arg0);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (this.anInt2529 != local20) {
				this.anInt2529 = local20;
				this.aClass58_13 = null;
			}
			if (this.aClass36Array1 != null) {
				this.anInt2532 = 0;
				@Pc(57) int[] local57 = new int[this.aClass36Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass36Array1.length; local59++) {
					@Pc(66) Class36 local66 = this.aClass36Array1[local59];
					if (local66.method1005(this.anInt2525, this.anInt2517, this.anInt2522, this.anInt2527)) {
						local57[this.anInt2532] = local66.anInt1367;
						this.aClass36Array2[this.anInt2532++] = local66;
					}
				}
				Static244.method4313(local57, 0, this.aClass36Array2, this.anInt2532 - 1);
			}
			this.aBoolean181 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean181) {
			this.aBoolean181 = false;
			for (@Pc(130) int local130 = this.anInt2532 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass36Array2[local130].method1006(arg1, this.aClass36_1);
				local119 |= local141;
				this.aBoolean181 |= !local141;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method2227() {
		if (this.aClass36Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass36Array1.length; local14++) {
				this.aClass36Array1[local14].method1011();
			}
		}
		this.aClass58_13 = null;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIILclient!vq;I)V")
	public void method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class47 arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg5 + arg6 & 0x3FFF;
		if (this.anInt2523 == -1) {
			arg7.method2682(arg4, arg3, arg0, arg1, arg8, 0);
		} else {
			@Pc(23) Class102 local23 = Static146.anInterface3_4.method5441(this.anInt2523);
			if (this.aClass58_13 == null && Static146.anInterface3_4.method5439(this.anInt2523)) {
				@Pc(59) int[] local59 = local23.aBoolean257 ? Static146.anInterface3_4.method5442(this.anInt2529, false, 0.7F, this.anInt2529, this.anInt2523) : Static146.anInterface3_4.method5440(0.7F, this.anInt2523, this.anInt2529, this.anInt2529);
				this.aClass58_13 = arg7.method2679(local59, this.anInt2529, this.anInt2529, this.anInt2529);
			}
			if (!local23.aBoolean257) {
				arg7.method2682(arg4, arg3, arg0, arg1, arg8, 0);
			}
			if (this.aClass58_13 != null) {
				@Pc(92) int local92 = local23.aBoolean257 ? 0 : 1;
				@Pc(98) int local98 = arg2 * arg1 / -4096;
				@Pc(110) int local110;
				for (local110 = arg1 * local12 / 4096 + (arg0 - arg1) / 2; local110 > arg1; local110 -= arg1) {
				}
				while (local110 < 0) {
					local110 += arg1;
				}
				while (local98 > arg1) {
					local98 -= arg1;
				}
				while (local98 < 0) {
					local98 += arg1;
				}
				for (@Pc(159) int local159 = local110 - arg1; local159 < arg0; local159 += arg1) {
					for (@Pc(166) int local166 = local98 - arg1; local166 < arg1; local166 += arg1) {
						this.aClass58_13.method4272(arg4 + local159, local166 - -arg3, arg1, arg1, 0, 0, local92);
					}
				}
			}
		}
		for (@Pc(218) int local218 = this.anInt2532 - 1; local218 >= 0; local218--) {
			this.aClass36Array2[local218].method1004(arg7, arg4, arg3, arg0, arg1, arg2, local12);
		}
	}
}
