import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ji", name = "fb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_736 = Static64.method1101("(R");

	@OriginalMember(owner = "client!ji", name = "ib", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ji", name = "jb", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method1672() {
		if (Static9.anInt179 != -1) {
			Static125.method2776(Static9.anInt179);
		}
		for (@Pc(13) int local13 = 0; local13 < Static127.anInt2862; local13++) {
			if (Static73.aBooleanArray10[local13]) {
				Static22.aBooleanArray8[local13] = true;
			}
			Static74.aBooleanArray11[local13] = Static73.aBooleanArray10[local13];
			Static73.aBooleanArray10[local13] = false;
		}
		Static164.anInt3641 = -1;
		Static66.anInt1481 = Static109.anInt2430;
		Static138.anInt3088 = -1;
		Static5.aClass71_29 = null;
		if (Static9.anInt179 != -1) {
			Static127.anInt2862 = 0;
			Static119.method3321(0, Static9.anInt179, Static185.anInt4016, -1, 0, Static90.anInt4701, 0, 0);
		}
		Static96.method1611();
		Static48.anInt1156 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)I")
	public static int method1673(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZ)V")
	public static void method1674(@OriginalArg(0) boolean arg0) {
		if (Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7 == Static79.anInt1782 && Static32.anInt707 == Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7) {
			Static79.anInt1782 = 0;
		}
		@Pc(25) int local25 = Static118.anInt2542;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(45) Class5_Sub1_Sub1 local45;
			@Pc(43) long local43;
			if (arg0) {
				local43 = 8791798054912L;
				local45 = Static73.aClass5_Sub1_Sub1_1;
			} else {
				local45 = Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local37]];
				local43 = (long) Static79.anIntArray111[local37] << 32;
			}
			if (local45 != null && local45.method2793()) {
				local45.aBoolean85 = false;
				if ((Static6.aBoolean6 && Static118.anInt2542 > 200 || Static118.anInt2542 > 50) && !arg0 && local45.anInt3620 == local45.anInt3618) {
					local45.aBoolean85 = true;
				}
				@Pc(92) int local92 = local45.anInt3598 >> 7;
				@Pc(97) int local97 = local45.anInt3624 >> 7;
				if (local97 >= 0 && local97 < 104 && local92 >= 0 && local92 < 104) {
					if (local45.aClass5_Sub2_1 == null || Static109.anInt2430 < local45.anInt1954 || Static109.anInt2430 >= local45.anInt1952) {
						if ((local45.anInt3624 & 0x7F) == 64 && (local45.anInt3598 & 0x7F) == 64) {
							if (Static10.anInt217 == Static113.anIntArrayArray11[local97][local92]) {
								continue;
							}
							Static113.anIntArrayArray11[local97][local92] = Static10.anInt217;
						}
						local45.anInt3577 = Static26.method2454(Static197.anInt2422, local45.anInt3598, local45.anInt3624);
						Static178.method3022(Static197.anInt2422, local45.anInt3624, local45.anInt3598, local45.anInt3577, 60, local45, local45.anInt3575, local43, local45.aBoolean167);
					} else {
						local45.aBoolean85 = false;
						local45.anInt3577 = Static26.method2454(Static197.anInt2422, local45.anInt3598, local45.anInt3624);
						Static31.method539(Static197.anInt2422, local45.anInt3624, local45.anInt3598, local45.anInt3577, local45, local45.anInt3575, local43, local45.anInt1959, local45.anInt1937, local45.anInt1938, local45.anInt1953);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!ib;)V")
	public static void method1676(@OriginalArg(1) Class5_Sub1_Sub1 arg0) {
		@Pc(13) Class1_Sub18 local13 = (Class1_Sub18) Static92.aClass102_11.method3093(arg0.aClass51_619.method1388());
		if (local13 == null) {
			return;
		}
		if (local13.aClass1_Sub4_Sub4_2 != null) {
			Static111.aClass1_Sub4_Sub3_2.method2304(local13.aClass1_Sub4_Sub4_2);
			local13.aClass1_Sub4_Sub4_2 = null;
		}
		local13.method3758();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!mb;)[Lclient!te;")
	public static Class1_Sub2_Sub1[] method1677(@OriginalArg(2) int arg0, @OriginalArg(3) Class70 arg1) {
		return Static36.method640(arg0, arg1) ? Static137.method2447() : null;
	}
}
