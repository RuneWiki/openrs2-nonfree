import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!no", name = "N", descriptor = "Z")
	public static boolean aBoolean439;

	@OriginalMember(owner = "client!no", name = "S", descriptor = "D")
	public static double aDouble33;

	@OriginalMember(owner = "client!no", name = "P", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_213 = new Class288(98, 6);

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)V")
	public static void method5146() {
		if (Static602.method8118(Static324.anInt5145) || Static155.method2317(Static324.anInt5145)) {
			Static543.method7499(Static250.anInt4000 >> 12, 5000, Static644.anInt10376 >> 12);
		} else {
			@Pc(27) int local27 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] >> 3;
			@Pc(34) int local34 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] >> 3;
			if (local27 >= 0 && local27 < Static228.anInt3704 >> 3 && local34 >= 0 && Static162.anInt2911 >> 3 > local34) {
				Static543.method7499(local27, 5000, local34);
			} else {
				Static543.method7499(Static228.anInt3704 >> 4, 0, Static162.anInt2911 >> 4);
			}
		}
		Static530.method7341();
		Static560.method7663();
		Static559.method7653();
		Static17.method251();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZI)Lclient!daa;")
	public static Class2_Sub8 method5147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub8) Static407.aClass118_46.method2595(local12);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)Z")
	public static boolean method5150(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
