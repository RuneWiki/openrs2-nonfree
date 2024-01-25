import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!id;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "Lclient!he;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	public static int anInt407;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!uv;I)V")
	public static void method379(@OriginalArg(0) Class344 arg0) {
		if (arg0.anInt9604 != Static329.anInt6248) {
			return;
		}
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5 == null) {
			arg0.anInt9549 = 0;
			arg0.anInt9603 = 0;
			return;
		}
		arg0.anInt9609 = 150;
		arg0.anInt9614 = (int) (Math.sin((double) Static304.anInt8391 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9549 = Static54.anInt1032;
		arg0.anInt9611 = 5;
		arg0.anInt9603 = Static470.method6941(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5);
		arg0.anInt9601 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10211;
		arg0.anInt9630 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10224;
		arg0.anInt9556 = 0;
		arg0.anInt9582 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10195;
		@Pc(79) Class267 local79 = arg0.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(arg0.anInt9601);
		if (local79 != null) {
			Static491.method7210(local79, arg0.anInt9582);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V")
	public static void method380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(5, arg1);
		local8.method1474();
		local8.anInt1728 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(II)Z")
	public static boolean method383(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
