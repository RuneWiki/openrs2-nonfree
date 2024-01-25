import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class129 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private int anInt3791;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	private int anInt3793;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!kh;")
	private Class54 aClass54_11;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	private int anInt3803 = -1;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Z")
	private boolean aBoolean268 = true;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	private final int anInt3795;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	private final int anInt3798;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	private final int anInt3792;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[Lclient!si;")
	private final Class184[] aClass184Array1;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	private final int anInt3802;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[Lclient!si;")
	private final Class184[] aClass184Array2;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!si;")
	private final Class184 aClass184_1;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I[Lclient!si;IIII)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) Class184[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3795 = arg0;
		this.anInt3798 = arg3;
		this.anInt3792 = arg5;
		this.aClass184Array1 = arg1;
		this.anInt3802 = arg4;
		if (arg1 == null) {
			this.aClass184_1 = null;
			this.aClass184Array2 = null;
		} else {
			this.aClass184Array2 = new Class184[arg1.length];
			this.aClass184_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!en;II)Z")
	public boolean method3482(@OriginalArg(0) Class59 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3803 != arg1) {
			this.anInt3803 = arg1;
			@Pc(20) int local20 = Static266.method4535(arg1);
			if (local20 > arg1) {
				local20 = Static7.method234(arg1);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 != this.anInt3793) {
				this.anInt3793 = local20;
				this.aClass54_11 = null;
			}
			if (this.aClass184Array1 != null) {
				this.anInt3791 = 0;
				@Pc(61) int[] local61 = new int[this.aClass184Array1.length];
				for (@Pc(63) int local63 = 0; local63 < this.aClass184Array1.length; local63++) {
					@Pc(70) Class184 local70 = this.aClass184Array1[local63];
					if (local70.method4963(this.anInt3798, this.anInt3802, this.anInt3792, this.anInt3803)) {
						local61[this.anInt3791] = local70.anInt5598;
						this.aClass184Array2[this.anInt3791++] = local70;
					}
				}
				Static133.method5810(this.aClass184Array2, this.anInt3791 - 1, 0, local61);
			}
			this.aBoolean268 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean268) {
			this.aBoolean268 = false;
			for (@Pc(147) int local147 = this.anInt3791 - 1; local147 >= 0; local147--) {
				@Pc(158) boolean local158 = this.aClass184Array2[local147].method4964(arg0, this.aClass184_1);
				local119 |= local158;
				this.aBoolean268 |= !local158;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!en;IIIIIIII)V")
	public void method3484(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg3 + arg6 & 0x3FFF;
		if (this.anInt3795 == -1) {
			arg0.method4877(arg4, arg7, arg1, arg2, arg5, 0);
		} else {
			@Pc(32) Class84 local32 = Static51.anInterface1_1.method2005(this.anInt3795);
			if (this.aClass54_11 == null && Static51.anInterface1_1.method2003(this.anInt3795)) {
				@Pc(68) int[] local68 = local32.aBoolean172 ? Static51.anInterface1_1.method2007(this.anInt3793, this.anInt3795, 0.7F, this.anInt3793, false) : Static51.anInterface1_1.method2006(this.anInt3793, this.anInt3795, 0.7F, this.anInt3793);
				this.aClass54_11 = arg0.method4834(local68, this.anInt3793, this.anInt3793, this.anInt3793);
			}
			if (!local32.aBoolean172) {
				arg0.method4877(arg4, arg7, arg1, arg2, arg5, 0);
			}
			if (this.aClass54_11 != null) {
				@Pc(101) int local101 = local32.aBoolean172 ? 0 : 1;
				@Pc(107) int local107 = arg2 * arg8 / -4096;
				@Pc(120) int local120;
				for (local120 = arg2 * local8 / 4096 + (arg1 - arg2) / 2; local120 > arg2; local120 -= arg2) {
				}
				while (local107 > arg2) {
					local107 -= arg2;
				}
				while (local120 < 0) {
					local120 += arg2;
				}
				while (local107 < 0) {
					local107 += arg2;
				}
				for (@Pc(166) int local166 = local120 - arg2; local166 < arg1; local166 += arg2) {
					for (@Pc(173) int local173 = local107 - arg2; local173 < arg2; local173 += arg2) {
						this.aClass54_11.method5573(local166 + arg4, arg7 + local173, arg2, arg2, 0, 0, local101);
					}
				}
			}
		}
		for (@Pc(213) int local213 = this.anInt3791 - 1; local213 >= 0; local213--) {
			this.aClass184Array2[local213].method4958(arg0, arg4, arg7, arg1, arg2, arg8, local8);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method3487() {
		if (this.aClass184Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass184Array1.length; local14++) {
				this.aClass184Array1[local14].method4957();
			}
		}
		this.aClass54_11 = null;
	}
}
