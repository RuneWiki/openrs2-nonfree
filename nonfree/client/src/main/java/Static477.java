import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lclient!ra;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_241 = new Class202(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "[S")
	public static final short[] aShortArray110 = new short[] { 11, 25, 45, 46, 47, 51, 48, 5 };

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
	public static int anInt8527 = 0;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
	public static void method7123() {
		if (Static36.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static132.aFrame2 == null) {
			local12 = Static531.aClass283_6.anApplet1;
		} else {
			local12 = Static132.aFrame2;
		}
		Static400.anInt7591 = local12.getSize().width;
		Static116.anInt2331 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static132.aFrame2) {
			local31 = Static132.aFrame2.getInsets();
			Static116.anInt2331 -= local31.bottom + local31.top;
			Static400.anInt7591 -= local31.right + local31.left;
		}
		if (Static181.method3002() == 1) {
			Static276.anInt5006 = 0;
			Static223.anInt3996 = Static185.anInt3395;
			Static343.anInt6345 = (Static400.anInt7591 - Static318.anInt5962) / 2;
			Static461.anInt8348 = Static318.anInt5962;
		} else if (Static78.anInt1651 < 96 && Static266.anInt4923 == 0) {
			@Pc(78) int local78 = Static400.anInt7591 > 1024 ? 1024 : Static400.anInt7591;
			@Pc(85) int local85 = Static116.anInt2331 <= 768 ? Static116.anInt2331 : 768;
			Static461.anInt8348 = local78;
			Static343.anInt6345 = (Static400.anInt7591 - local78) / 2;
			Static276.anInt5006 = 0;
			Static223.anInt3996 = local85;
		} else {
			Static223.anInt3996 = Static116.anInt2331;
			Static343.anInt6345 = 0;
			Static461.anInt8348 = Static400.anInt7591;
			Static276.anInt5006 = 0;
		}
		if (Static414.aClass320_17 != Static455.aClass320_15) {
			@Pc(120) boolean local120;
			if (Static461.anInt8348 < 1024 && Static223.anInt3996 < 768) {
				local120 = true;
			} else {
				local120 = false;
			}
		}
		Static517.aCanvas14.setSize(Static461.anInt8348, Static223.anInt3996);
		if (Static103.aClass39_3 != null) {
			Static103.aClass39_3.method6057(Static517.aCanvas14);
		}
		if (Static132.aFrame2 == local12) {
			local31 = Static132.aFrame2.getInsets();
			Static517.aCanvas14.setLocation(Static343.anInt6345 + local31.left, local31.top - -Static276.anInt5006);
		} else {
			Static517.aCanvas14.setLocation(Static343.anInt6345, Static276.anInt5006);
		}
		if (Static387.anInt7341 != -1) {
			Static191.method6947(true);
		}
		Static58.method1077();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!haa;III)V")
	public static void method7124(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static139.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt6354 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub5Array4[arg0.anInt6354++] = Static410.aClass83Array1[local21 - 1].aClass2_Sub5_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt6354; local21 < 4; local21++) {
			arg0.aClass2_Sub5Array4[local21] = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!dda;ILjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class39 method7126(@OriginalArg(1) Class53 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface12 arg3) {
		if (!Static198.method3200()) {
			throw new RuntimeException("");
		} else if (Static467.method7030("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class39_Sub2_Sub2 local53 = new Class39_Sub2_Sub2(local24, arg2, local34, arg3, arg0, arg1);
			local53.method6176();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7127(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static464.method7004(Static156.method2700(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!fc;)V")
	public static void method7129(@OriginalArg(0) Class83 arg0) {
		if (Static361.anInt6824 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub5 local6 = arg0.aClass2_Sub5_1;
		Static410.aClass83Array1[Static361.anInt6824] = arg0;
		Static230.aBooleanArray22[Static361.anInt6824] = false;
		Static361.anInt6824++;
		@Pc(21) int local21 = arg0.anInt2484;
		if (arg0.aBoolean211) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2484;
		if (arg0.aBoolean212) {
			local29 = Static323.anInt6015 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method1662() + Static392.anInt7455 - local6.method1666() >> Static175.anInt3259;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method1662() + local6.method1666() - Static392.anInt7455 >> Static175.anInt3259;
			if (local73 >= Static315.anInt5693) {
				local73 = Static315.anInt5693 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray59[local41++];
				@Pc(105) int local105 = (local6.method1672() + Static392.anInt7455 - local6.method1666() >> Static175.anInt3259) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static515.anInt3809) {
					local113 = Static515.anInt3809 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static139.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static139.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static361.anInt6824;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static139.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static361.anInt6824 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static139.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static361.anInt6824 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static139.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static361.anInt6824 << 48;
					}
				}
			}
		}
	}
}
