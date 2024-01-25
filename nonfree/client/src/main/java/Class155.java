import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class155 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!lg;")
	private Class60 aClass60_21;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	private int anInt5119;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	private int anInt5124;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	private int anInt5121 = -1;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Z")
	private boolean aBoolean430 = true;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	private final int anInt5114;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	private final int anInt5112;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[Lclient!jf;")
	private final Class102[] aClass102Array1;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	private final int anInt5115;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	private final int anInt5116;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[Lclient!jf;")
	private final Class102[] aClass102Array2;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!jf;")
	private final Class102 aClass102_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Lclient!jf;IIII)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) Class102[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5114 = arg3;
		this.anInt5112 = arg0;
		this.aClass102Array1 = arg1;
		this.anInt5115 = arg5;
		this.anInt5116 = arg4;
		if (arg1 == null) {
			this.aClass102_1 = null;
			this.aClass102Array2 = null;
		} else {
			this.aClass102Array2 = new Class102[arg1.length];
			this.aClass102_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	public void method4226() {
		if (this.aClass102Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass102Array1.length; local6++) {
				this.aClass102Array1[local6].method2784();
			}
		}
		this.aClass60_21 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!vm;I)Z")
	public boolean method4227(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5121 != arg1) {
			this.anInt5121 = arg1;
			@Pc(20) int local20 = Static338.method4468(arg1);
			if (arg1 < local20) {
				local20 = Static90.method1611(arg1);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 != this.anInt5124) {
				this.anInt5124 = local20;
				this.aClass60_21 = null;
			}
			if (this.aClass102Array1 != null) {
				this.anInt5119 = 0;
				@Pc(57) int[] local57 = new int[this.aClass102Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass102Array1.length; local59++) {
					@Pc(66) Class102 local66 = this.aClass102Array1[local59];
					if (local66.method2786(this.anInt5114, this.anInt5116, this.anInt5115, this.anInt5121)) {
						local57[this.anInt5119] = local66.anInt3175;
						this.aClass102Array2[this.anInt5119++] = local66;
					}
				}
				Static81.method1448(local57, 0, this.anInt5119 - 1, this.aClass102Array2);
			}
			this.aBoolean430 = true;
		}
		@Pc(123) boolean local123 = false;
		if (this.aBoolean430) {
			this.aBoolean430 = false;
			for (@Pc(134) int local134 = this.anInt5119 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass102Array2[local134].method2781(arg0, this.aClass102_1);
				this.aBoolean430 |= !local145;
				local123 |= local145;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!vm;IBIIIIII)V")
	public void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = arg6 + arg3 & 0x3FFF;
		if (this.anInt5112 == -1) {
			arg1.method4436(arg0, arg7, arg5, arg4, arg8, 0);
		} else {
			@Pc(28) Class135 local28 = Static202.anInterface1_4.method5634(this.anInt5112);
			if (this.aClass60_21 == null && Static202.anInterface1_4.method5637(this.anInt5112)) {
				@Pc(64) int[] local64 = local28.aBoolean362 ? Static202.anInterface1_4.method5633(false, this.anInt5124, this.anInt5124, 0.7F, this.anInt5112) : Static202.anInterface1_4.method5636(0.7F, this.anInt5112, this.anInt5124, this.anInt5124);
				this.aClass60_21 = arg1.method4537(local64, this.anInt5124, this.anInt5124, this.anInt5124);
			}
			if (!local28.aBoolean362) {
				arg1.method4436(arg0, arg7, arg5, arg4, arg8, 0);
			}
			if (this.aClass60_21 != null) {
				@Pc(97) int local97 = local28.aBoolean362 ? 0 : 1;
				@Pc(103) int local103 = arg2 * arg4 / -4096;
				@Pc(117) int local117;
				for (local117 = (arg5 - arg4) / 2 + local17 * arg4 / 4096; local117 > arg4; local117 -= arg4) {
				}
				while (local103 > arg4) {
					local103 -= arg4;
				}
				while (local117 < 0) {
					local117 += arg4;
				}
				while (local103 < 0) {
					local103 += arg4;
				}
				for (@Pc(163) int local163 = local117 - arg4; local163 < arg5; local163 += arg4) {
					for (@Pc(170) int local170 = local103 - arg4; local170 < arg4; local170 += arg4) {
						this.aClass60_21.method5692(arg0 + local163, arg7 + local170, arg4, arg4, 0, 0, local97);
					}
				}
			}
		}
		for (@Pc(219) int local219 = this.anInt5119 - 1; local219 >= 0; local219--) {
			this.aClass102Array2[local219].method2783(arg1, arg0, arg7, arg5, arg4, arg2, local17);
		}
	}
}
