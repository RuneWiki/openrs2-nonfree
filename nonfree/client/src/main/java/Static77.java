import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_17 = new Class142("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public static int anInt1084 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B[S)[S")
	public static short[] method952(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static471.method3068(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	public static void method953(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static427.method5426(arg0, 11);
		local16.method385();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([[[Lclient!rb;B)V")
	public static void method954(@OriginalArg(0) Class216[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class216[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class216 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass11_Sub2_2 instanceof Interface7) {
							((Interface7) local27.aClass11_Sub2_2).method4900();
						}
						if (local27.aClass11_Sub4_2 instanceof Interface7) {
							((Interface7) local27.aClass11_Sub4_2).method4900();
						}
						if (local27.aClass11_Sub4_1 instanceof Interface7) {
							((Interface7) local27.aClass11_Sub4_1).method4900();
						}
						if (local27.aClass11_Sub3_3 instanceof Interface7) {
							((Interface7) local27.aClass11_Sub3_3).method4900();
						}
						if (local27.aClass11_Sub3_2 instanceof Interface7) {
							((Interface7) local27.aClass11_Sub3_2).method4900();
						}
						for (@Pc(77) Class259 local77 = local27.aClass259_1; local77 != null; local77 = local77.aClass259_4) {
							@Pc(82) Class11_Sub1 local82 = local77.aClass11_Sub1_2;
							if (local82 instanceof Interface7) {
								((Interface7) local82).method4900();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!tj;ZILclient!tj;BZ)I")
	public static int method955(@OriginalArg(0) int arg0, @OriginalArg(1) Class239_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class239_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static148.method1860(arg5, arg1, arg3, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static148.method1860(arg2, arg1, arg0, arg4);
			return arg2 ? -local32 : local32;
		}
	}
}
