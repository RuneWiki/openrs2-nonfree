import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method5595() {
		Static311.aClass102_43.method2271();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public static int method5597() {
		return 6;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V")
	public static void method5599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class199 local14 = new Class199(16);
		for (@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) Static425.aClass199_179.method4392(); local19 != null; local19 = (Class1_Sub2) Static425.aClass199_179.method4393()) {
			local19.method5915();
			@Pc(30) int local30 = (int) (local19.aLong230 >> 28);
			@Pc(40) int local40 = (int) (local19.aLong230 >> 14 & 0x3FFFL) - arg0;
			@Pc(49) int local49 = (int) (local19.aLong230 & 0x3FFFL) - arg1;
			if (local49 >= 0 && local40 >= 0 && Static296.anInt5187 > local49 && Static206.anInt3607 > local40) {
				local14.method4383((long) (local49 | local40 << 14 | local30 << 28), local19);
			}
		}
		Static425.aClass199_179 = local14;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public static void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1_Sub5_Sub11 local10 = Static188.method2688(arg1, 8);
		local10.method2661();
		local10.anInt3213 = arg3;
		local10.anInt3209 = arg0;
		local10.anInt3212 = arg2;
	}
}
