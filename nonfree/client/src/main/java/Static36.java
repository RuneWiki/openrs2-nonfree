import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	public static int[] anIntArray101;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	public static int anInt1199 = 0;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "F")
	public static float aFloat5 = 1024.0F;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_9 = new Class87(64);

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "[Lclient!qg;")
	public static final Class1_Sub4_Sub19[] aClass1_Sub4_Sub19Array1 = new Class1_Sub4_Sub19[14];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILjava/lang/String;Lclient!wo;)Lclient!v;")
	public static Class207 method871(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class216 arg2) {
		@Pc(10) int local10 = arg2.method5660(arg1);
		if (local10 == -1) {
			return new Class207(0);
		}
		@Pc(29) int[] local29 = arg2.method5664(local10);
		@Pc(35) Class207 local35 = new Class207(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt6318 > local37) {
				@Pc(53) Class1_Sub8 local53 = new Class1_Sub8(arg2.method5648(local10, local29[local39++]));
				@Pc(57) int local57 = local53.method4545();
				@Pc(61) int local61 = local53.method4556();
				@Pc(65) int local65 = local53.method4532();
				if (!arg0 && local65 == 1) {
					local35.anInt6318--;
				} else {
					local35.anIntArray511[local37] = local57;
					local35.anIntArray510[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIBIII)V")
	public static void method874(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0) {
			Static271.method4752();
		}
		if (Static197.aFrame2 != null && (arg1 != 3 || arg4 != Static252.anInt5211 || arg3 != Static327.anInt6283)) {
			Static197.method3801(Static15.aClass143_1, Static197.aFrame2);
			Static197.aFrame2 = null;
		}
		if (arg1 == 3 && Static197.aFrame2 == null) {
			Static197.aFrame2 = Static352.method5609(0, Static15.aClass143_1, arg4, arg3);
			if (Static197.aFrame2 != null) {
				Static252.anInt5211 = arg4;
				Static327.anInt6283 = arg3;
				Static348.method5579(Static15.aClass143_1);
			}
		}
		if (arg1 == 3 && Static197.aFrame2 == null) {
			method874(true, Static168.anInt3612, arg2, -1, -1);
			return;
		}
		@Pc(73) Container local73;
		@Pc(95) Insets local95;
		if (Static197.aFrame2 != null) {
			Static357.anInt4330 = arg3;
			local73 = Static197.aFrame2;
			Static170.anInt3645 = arg4;
		} else if (Static84.aFrame1 == null) {
			local73 = Static15.aClass143_1.anApplet1;
			Static170.anInt3645 = local73.getSize().width;
			Static357.anInt4330 = local73.getSize().height;
		} else {
			local95 = Static84.aFrame1.getInsets();
			Static170.anInt3645 = Static84.aFrame1.getSize().width - local95.right - local95.left;
			@Pc(113) int local113 = local95.bottom + local95.top;
			Static357.anInt4330 = Static84.aFrame1.getSize().height - local113;
			local73 = Static84.aFrame1;
		}
		@Pc(160) int local160;
		if (arg1 == 1) {
			Static98.anInt2364 = (Static170.anInt3645 - 765) / 2;
			Static271.anInt5530 = 503;
			Static194.anInt4145 = 765;
			Static195.anInt4173 = 0;
		} else if (Static257.anInt5344 < 96 && Static306.anInt6046 == 0) {
			local160 = Static170.anInt3645 <= 1024 ? Static170.anInt3645 : 1024;
			@Pc(169) int local169 = Static357.anInt4330 > 768 ? 768 : Static357.anInt4330;
			Static194.anInt4145 = local160;
			Static98.anInt2364 = (Static170.anInt3645 - local160) / 2;
			Static195.anInt4173 = 0;
			Static271.anInt5530 = local169;
		} else {
			Static271.anInt5530 = Static357.anInt4330;
			Static195.anInt4173 = 0;
			Static194.anInt4145 = Static170.anInt3645;
			Static98.anInt2364 = 0;
		}
		if (Static63.anInt5669 != 0) {
			@Pc(195) boolean local195;
			if (Static194.anInt4145 < 1024 && Static271.anInt5530 < 768) {
				local195 = true;
			} else {
				local195 = false;
			}
		}
		if (arg0) {
			Static259.method2702(Static306.anInt6046);
		} else {
			Static349.aCanvas5.setSize(Static194.anInt4145, Static271.anInt5530);
			if (Static208.aClass32_11 != null) {
				Static208.aClass32_11.method2228();
			}
			if (Static84.aFrame1 == local73) {
				local95 = Static84.aFrame1.getInsets();
				Static349.aCanvas5.setLocation(Static98.anInt2364 + local95.left, local95.top - -Static195.anInt4173);
			} else {
				Static349.aCanvas5.setLocation(Static98.anInt2364, Static195.anInt4173);
			}
		}
		if (arg1 < 2) {
			Static21.aBoolean83 = false;
		} else {
			Static21.aBoolean83 = true;
		}
		if (Static89.anInt2231 != -1) {
			Static267.method4700(true);
		}
		if (Static7.aClass148_1 != null && (Static295.anInt5811 == 30 || Static295.anInt5811 == 25)) {
			Static64.method1564();
		}
		for (local160 = 0; local160 < 100; local160++) {
			Static223.aBooleanArray28[local160] = true;
		}
		Static262.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	public static void method875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(7) int local7 = arg0 << 3;
		Static75.aFloat13 = local7;
		if (Static147.anInt3204 == 2) {
			Static18.anInt555 = local7;
			Static121.anInt2762 = 0;
			Static179.anInt3884 = local3;
		}
		aFloat5 = local3;
		Static218.method4139();
		Static329.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)I")
	public static int method877() {
		@Pc(5) Class87 local5 = Static307.aClass87_54;
		synchronized (Static307.aClass87_54) {
			return Static307.aClass87_54.method2480();
		}
	}
}
