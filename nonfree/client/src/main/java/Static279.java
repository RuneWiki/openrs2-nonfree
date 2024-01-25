import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
	public static int anInt5476;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_131 = new Class263(55, 6);

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "[Lclient!hd;")
	public static Class103_Sub1[] aClass103_Sub1Array3 = new Class103_Sub1[0];

	@OriginalMember(owner = "client!ns", name = "E", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_79 = new Class177(50, 2);

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_80 = new Class177(17, 3);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class1_Sub40 local7 = null;
		for (@Pc(12) Class1_Sub40 local12 = (Class1_Sub40) Static239.aClass203_37.method4548(); local12 != null; local12 = (Class1_Sub40) Static239.aClass203_37.method4545()) {
			if (local12.anInt6626 == arg6 && arg2 == local12.anInt6621 && arg4 == local12.anInt6627 && arg3 == local12.anInt6623) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub40();
			local7.anInt6623 = arg3;
			local7.anInt6627 = arg4;
			local7.anInt6621 = arg2;
			local7.anInt6626 = arg6;
			if (arg2 >= 0 && arg4 >= 0 && arg2 < Static209.anInt4283 && arg4 < Static211.anInt4295) {
				Static364.method5094(local7);
			}
			Static239.aClass203_37.method4551(local7);
		}
		local7.anInt6629 = 0;
		local7.anInt6624 = arg0;
		local7.anInt6628 = -1;
		local7.anInt6625 = arg5;
		local7.anInt6618 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static105.anInt2417 && arg6 <= Static70.anInt1843 && arg5 >= Static362.anInt6654 && Static164.anInt6595 >= arg0) {
			Static445.method5853(arg5, arg4, arg1, arg6, arg2, arg0, arg3);
		} else {
			Static278.method4108(arg1, arg3, arg2, arg0, arg5, arg6, arg4);
		}
	}
}
