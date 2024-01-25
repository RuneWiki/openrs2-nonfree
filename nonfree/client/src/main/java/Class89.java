import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class89 {

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!xa;")
	private Class4 aClass4_6;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	private int anInt2092;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	private int anInt2095;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	private int anInt2091 = -1;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "[Lclient!el;")
	private final Class86[] aClass86Array1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	private final int anInt2082;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	private final int anInt2089;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	private final int anInt2090;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
	private final int anInt2094;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "[Lclient!el;")
	private final Class86[] aClass86Array2;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!el;")
	private final Class86 aClass86_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I[Lclient!el;IIII)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) Class86[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86Array1 = arg1;
		this.anInt2082 = arg5;
		this.anInt2089 = arg3;
		this.anInt2090 = arg0;
		this.anInt2094 = arg4;
		if (arg1 == null) {
			this.aClass86Array2 = null;
			this.aClass86_1 = null;
		} else {
			this.aClass86Array2 = new Class86[arg1.length];
			this.aClass86_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method1811() {
		if (this.aClass86Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass86Array1.length; local10++) {
				this.aClass86Array1[local10].method1791();
			}
		}
		this.aClass4_6 = null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLclient!oa;)Z")
	public boolean method1813(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		if (this.anInt2091 != arg0) {
			this.anInt2091 = arg0;
			@Pc(17) int local17 = Static21.method292(arg0);
			if (local17 > 512) {
				local17 = 512;
			}
			if (local17 <= 0) {
				local17 = 1;
			}
			if (this.anInt2095 != local17) {
				this.aClass4_6 = null;
				this.anInt2095 = local17;
			}
			if (this.aClass86Array1 != null) {
				this.anInt2092 = 0;
				@Pc(47) int[] local47 = new int[this.aClass86Array1.length];
				for (@Pc(49) int local49 = 0; local49 < this.aClass86Array1.length; local49++) {
					@Pc(56) Class86 local56 = this.aClass86Array1[local49];
					if (local56.method1793(this.anInt2089, this.anInt2094, this.anInt2082, this.anInt2091)) {
						local47[this.anInt2092] = local56.anInt2067;
						this.aClass86Array2[this.anInt2092++] = local56;
					}
				}
				Static406.method5928(this.aClass86Array2, local47, this.anInt2092 - 1, 0);
			}
			this.aBoolean137 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean137) {
			this.aBoolean137 = false;
			for (@Pc(124) int local124 = this.anInt2092 - 1; local124 >= 0; local124--) {
				@Pc(135) boolean local135 = this.aClass86Array2[local124].method1792(arg1, this.aClass86_1);
				this.aBoolean137 |= !local135;
				local113 |= local135;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILclient!oa;IIIIII)V")
	public void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg6 + arg5 & 0x3FFF;
		if (this.anInt2090 == -1) {
			arg3.C(arg2, arg8, arg1, arg4, arg0, 0);
		} else {
			@Pc(21) Class76 local21 = Static155.anInterface7_4.method5209(this.anInt2090);
			if (this.aClass4_6 == null && Static155.anInterface7_4.method5207(this.anInt2090)) {
				@Pc(59) int[] local59 = local21.aBoolean113 ? Static155.anInterface7_4.method5206(this.anInt2095, 0.7F, this.anInt2095, this.anInt2090) : Static155.anInterface7_4.method5208(false, 0.7F, this.anInt2095, this.anInt2095, this.anInt2090);
				this.aClass4_6 = arg3.method7110(local59, this.anInt2095, this.anInt2095, this.anInt2095);
			}
			if (local21.aBoolean113) {
				arg3.C(arg2, arg8, arg1, arg4, arg0, 0);
			}
			if (this.aClass4_6 != null) {
				@Pc(92) int local92 = local21.aBoolean113 ? 1 : 0;
				@Pc(98) int local98 = arg7 * arg4 / -4096;
				@Pc(111) int local111;
				for (local111 = arg4 * local11 / 4096 + (arg1 - arg4) / 2; local111 > arg4; local111 -= arg4) {
				}
				while (arg4 < local98) {
					local98 -= arg4;
				}
				while (local111 < 0) {
					local111 += arg4;
				}
				while (local98 < 0) {
					local98 += arg4;
				}
				for (@Pc(158) int local158 = local111 - arg4; local158 < arg1; local158 += arg4) {
					for (@Pc(165) int local165 = local98 - arg4; local165 < arg4; local165 += arg4) {
						this.aClass4_6.KA(local158 + arg2, local165 - -arg8, arg4, arg4, 1, 0, local92);
					}
				}
			}
		}
		for (@Pc(219) int local219 = this.anInt2092 - 1; local219 >= 0; local219--) {
			this.aClass86Array2[local219].method1795(arg3, arg2, arg8, arg1, arg4, arg7, local11);
		}
	}
}
