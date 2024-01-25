import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	public static int anInt6031;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Lclient!mg;")
	public static Class160 aClass160_69;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public static void method4853(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg0, 2);
		local8.method4545();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method4855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static430.anInt7123 && Static181.anInt3543 >= arg1) {
			@Pc(11) int local11 = Static327.method4554(arg3, Static184.anInt3600, Static8.anInt223);
			@Pc(17) int local17 = Static327.method4554(arg0, Static184.anInt3600, Static8.anInt223);
			Static207.method3272(arg2, local11, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!si;I)Lclient!vl;")
	public static Class2_Sub2 method4856(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.method5495();
		@Pc(13) int local13 = arg0.method5495();
		@Pc(17) Class2_Sub2 local17 = Static302.method4325(local13);
		local17.anInt7416 = arg0.method5495();
		@Pc(26) int local26 = arg0.method5495();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5495();
			local17.method5838(arg0, local34);
		}
		local17.method5845();
		return local17;
	}
}
