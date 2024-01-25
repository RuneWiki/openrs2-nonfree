import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public static int anInt4246;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_11 = new Class118(15);

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_82 = new Class225(120, -2);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!tt;I)Ljava/lang/String;")
	public static String method3840(@OriginalArg(0) Class2_Sub6_Sub20 arg0) {
		if (arg0.aString108 == null || arg0.aString108.length() == 0) {
			return arg0.aString106 == null || arg0.aString106.length() <= 0 ? arg0.aString107 : arg0.aString107 + Static289.aClass191_31.method4067(Static414.anInt9485) + arg0.aString106;
		} else if (arg0.aString106 == null || arg0.aString106.length() <= 0) {
			return arg0.aString107 + Static289.aClass191_31.method4067(Static414.anInt9485) + arg0.aString108;
		} else {
			return arg0.aString107 + Static289.aClass191_31.method4067(Static414.anInt9485) + arg0.aString106 + Static289.aClass191_31.method4067(Static414.anInt9485) + arg0.aString108;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ha;Lclient!mg;B)I")
	public static int method3841(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class240 arg1) {
		if (arg1.anInt6494 != -1) {
			return arg1.anInt6494;
		}
		if (arg1.anInt6496 != -1) {
			@Pc(30) Class8 local30 = arg0.anInterface3_12.method2857(arg1.anInt6496);
			if (!local30.aBoolean32) {
				return local30.aShort10;
			}
		}
		return arg1.anInt6500;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)I")
	public static int method3844(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub3 local15 = Static549.method7662(-113, false, arg0);
		if (local15 == null) {
			return Static130.aClass141_1.method2993(arg0).anInt7206;
		}
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 0; local36 < local15.anIntArray28.length; local36++) {
			if (local15.anIntArray28[local36] == -1) {
				local34++;
			}
		}
		return local34 + Static130.aClass141_1.method2993(arg0).anInt7206 - local15.anIntArray28.length;
	}
}
