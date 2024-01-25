import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Lclient!vr;")
	public static Class353 aClass353_29;

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "F")
	public static float aFloat238;

	@OriginalMember(owner = "client!paa", name = "w", descriptor = "Lclient!sea;")
	public static Class308 aClass308_191;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "Lclient!em;")
	public static final Class83 aClass83_204 = new Class83(80, 8);

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "Lclient!em;")
	public static final Class83 aClass83_205 = new Class83(90, -2);

	@OriginalMember(owner = "client!paa", name = "u", descriptor = "Lclient!in;")
	public static Class160 aClass160_43 = null;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	public static void method7708() {
		Static59.method996(false);
		if (Static585.anInt9650 >= 0 && Static585.anInt9650 != 0) {
			Static358.method7632(Static585.anInt9650);
			Static585.anInt9650 = -1;
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)V")
	public static void method7710() {
		Static313.aClass111_34.method2555();
		Static175.aClass111_15.method2555();
		@Pc(21) int local21;
		for (@Pc(16) Class1_Sub40 local16 = (Class1_Sub40) Static166.aClass111_49.method2547(); local16 != null; local16 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			local21 = local16.anInt7819;
			if (local21 < 1000) {
				local16.method7908();
				if (local21 == 9 || local21 == 59 || local21 == 22 || local21 == 44 || local21 == 21 || local21 == 12 || local21 == 45) {
					Static175.aClass111_15.method2552(local16);
				} else {
					Static313.aClass111_34.method2552(local16);
				}
			}
		}
		Static313.aClass111_34.method2556(Static166.aClass111_49);
		Static175.aClass111_15.method2556(Static166.aClass111_49);
		if (Static22.anInt572 <= 1) {
			Static231.aClass1_Sub40_1 = null;
		} else if (Static240.aBoolean315 && Static326.aClass97_3.method2365(81) && Static22.anInt572 > 2) {
			Static231.aClass1_Sub40_1 = (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285.aClass1_285;
		} else {
			Static231.aClass1_Sub40_1 = (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285;
		}
		local21 = -1;
		@Pc(127) Class1_Sub12 local127 = (Class1_Sub12) Static121.aClass111_9.method2547();
		if (local127 != null) {
			local21 = local127.method6688();
		}
		if (!Static406.aBoolean553) {
			if (local21 == 0 && (Static579.anInt9553 == 1 && Static22.anInt572 > 2 || Static205.method3166())) {
				local21 = 2;
			}
			if (local21 == 2 && Static22.anInt572 > 0 && local127 != null) {
				if (Static488.aClass160_36 == null && Static32.anInt689 == 0) {
					Static55.method953(local127.method6682(), local127.method6689());
				} else {
					Static499.anInt8721 = 2;
				}
			}
			if (local21 == 0 && Static22.anInt572 > 0) {
				Static240.method3545();
			}
			if (Static488.aClass160_36 == null && Static32.anInt689 == 0) {
				Static337.aClass1_Sub40_2 = null;
				Static499.anInt8721 = 0;
				return;
			}
			return;
		}
		@Pc(211) int local211;
		@Pc(215) int local215;
		if (local21 == -1) {
			local211 = Static216.aClass238_1.method5661();
			local215 = Static216.aClass238_1.method5653();
			if (Static405.anInt7239 - 10 > local211 || local211 > Static405.anInt7239 + Static570.anInt9417 + 10 || Static130.anInt2592 - 10 > local215 || Static563.anInt9345 + Static130.anInt2592 + 10 < local215) {
				Static577.method7756();
			}
		}
		if (local21 != 0) {
			return;
		}
		local211 = Static405.anInt7239;
		local215 = Static130.anInt2592;
		@Pc(262) int local262 = Static570.anInt9417;
		@Pc(266) int local266 = local127.method6682();
		@Pc(270) int local270 = local127.method6689();
		@Pc(272) int local272 = -1;
		@Pc(291) int local291;
		for (@Pc(274) int local274 = 0; local274 < Static22.anInt572; local274++) {
			if (Static527.aBoolean672) {
				local291 = (Static22.anInt572 - local274 - 1) * 16 + local215 + 33;
				if (local211 < local266 && local262 + local211 > local266 && local270 > local291 - 13 && local291 + 4 > local270) {
					local272 = local274;
				}
			} else {
				local291 = (Static22.anInt572 - local274 - 1) * 16 + local215 + 31;
				if (local266 > local211 && local266 < local262 + local211 && local291 - 13 < local270 && local270 < local291 + 3) {
					local272 = local274;
				}
			}
		}
		if (local272 != -1) {
			local291 = 0;
			@Pc(384) Class265 local384 = new Class265(Static166.aClass111_49);
			for (@Pc(389) Class1_Sub40 local389 = (Class1_Sub40) local384.method5637(); local389 != null; local389 = (Class1_Sub40) local384.method5636()) {
				if (local272 == local291) {
					Static553.method7513(local270, local266, local389);
				}
				local291++;
			}
		}
		Static577.method7756();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([Lclient!tu;Lclient!tba;Z)Lclient!gda;")
	public static Class112 method7711(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) Class78_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong242 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg0[local36].aLong242);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static125.anIntArray97, 0);
		if (Static125.anIntArray97[0] == 0) {
			if (Static125.anIntArray97[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static125.anIntArray97, 1);
			if (Static125.anIntArray97[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static125.anIntArray97[1]];
				OpenGL.glGetInfoLogARB(local34, Static125.anIntArray97[1], Static125.anIntArray97, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static125.anIntArray97[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg0.length; local108++) {
					OpenGL.glDetachObjectARB(local34, arg0[local108].aLong242);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class112(arg1, local34, arg0);
	}
}
