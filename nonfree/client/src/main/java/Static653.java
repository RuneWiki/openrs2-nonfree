import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!af;")
	public static final Class10 aClass10_63 = new Class10(30);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method8879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19;
		if (Static506.method7223(arg3)) {
			local19 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = 0;
			if (Static594.aBoolean693) {
				local40 = Static223.anInt3799;
				local42 = Static228.anInt3894;
				local36 = Static644.anInt10400;
				local19 = Static393.anInt6584;
				local38 = Static673.anInt10778;
				Static228.anInt3894 = 1;
			}
			if (Static202.aClass321ArrayArray2[arg3] == null) {
				Static515.method7287(-1, ~arg0 > -1, arg5, arg6, Static109.aClass321ArrayArray1[arg3], arg0, arg1, arg4, arg2, arg7);
			} else {
				Static515.method7287(-1, arg0 < 0, arg5, arg6, Static202.aClass321ArrayArray2[arg3], arg0, arg1, arg4, arg2, arg7);
			}
			if (Static594.aBoolean693) {
				if (arg0 >= 0 && Static228.anInt3894 == 2) {
					Static629.method8681(Static673.anInt10778, Static644.anInt10400, Static223.anInt3799, Static393.anInt6584);
				}
				Static644.anInt10400 = local36;
				Static673.anInt10778 = local38;
				Static228.anInt3894 = local42;
				Static393.anInt6584 = local19;
				Static223.anInt3799 = local40;
			}
		} else if (arg0 == -1) {
			for (local19 = 0; local19 < 100; local19++) {
				Static224.aBooleanArray12[local19] = true;
			}
		} else {
			Static224.aBooleanArray12[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method8880() {
		if (!Static341.method8996()) {
			return;
		}
		if (Static241.aStringArray30 == null) {
			Static531.method7382();
		}
		Static366.aBoolean413 = true;
		Static5.anInt161 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[Lclient!ff;")
	public static Class105[] method8881() {
		return new Class105[] { Static367.aClass105_1, Static367.aClass105_2, Static367.aClass105_3, Static367.aClass105_4, Static367.aClass105_5, Static367.aClass105_6, Static367.aClass105_7, Static367.aClass105_8, Static367.aClass105_9, Static367.aClass105_10, Static367.aClass105_11, Static367.aClass105_12 };
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/lang/String;Z)V")
	public static void method8882(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		Static271.method7757();
		Static435.method6424();
		Static210.method3098();
		Static524.method7851(arg1, arg2, arg0);
		Static2.method8468();
		Static306.method4401(Static546.aClass132_13);
		Static84.method1470(Static546.aClass132_13);
		Static373.method5338(Static546.aClass132_13, Static624.aClass8_139);
		Static172.method2461();
		Static424.method6292(Static418.aClass9Array125);
		Static509.method7248();
		Static180.method8370();
		if (Static556.anInt9319 == 3) {
			Static143.method2106(4);
		} else if (Static556.anInt9319 == 7) {
			Static143.method2106(8);
		} else if (Static556.anInt9319 == 10) {
			Static143.method2106(11);
		} else if (Static556.anInt9319 == 1 || Static556.anInt9319 == 2) {
			method8883();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public static void method8883() {
		if (Static642.anInterface5Array1 == null) {
			return;
		}
		@Pc(13) Interface5[] local13 = Static642.anInterface5Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Interface5 local21 = local13[local15];
			local21.method7070();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)Z")
	public static boolean method8885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
