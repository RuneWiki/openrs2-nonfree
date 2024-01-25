import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString139;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!vk;")
	public static Class375 aClass375_10;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_359 = new Class179(72, 1);

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "F")
	public static float aFloat198 = 0.25F;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI)V")
	public static void method8646(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub2 local9 = arg0 ? Static303.aClass6_Sub2_3 : Static34.aClass6_Sub2_1;
		if (local9 == null || arg1 < 0 || local9.anInt373 <= arg1) {
			return;
		}
		@Pc(27) Class157 local27 = local9.aClass157Array1[arg1];
		if (local27.aByte77 != -1) {
			return;
		}
		@Pc(35) String local35 = local27.aString50;
		@Pc(40) Class6_Sub26 local40 = Static268.method3981(Static377.aClass15_2, Static394.aClass289_97);
		local40.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(local35) + 3);
		local40.aClass6_Sub23_Sub1_2.method8366(arg0 ? 1 : 0);
		local40.aClass6_Sub23_Sub1_2.method8347(arg1);
		local40.aClass6_Sub23_Sub1_2.method8398(local35);
		Static670.method9077(local40);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method8655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static352.method5121(arg0, arg1) | (arg0 & 0x70000) != 0 || Static293.method4213(arg1, arg0);
	}
}
