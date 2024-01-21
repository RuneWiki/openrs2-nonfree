import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[[Lclient!gf;")
	public static Class33[][] aClass33ArrayArray1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_376 = Static170.method3101("Fps:");

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt1177 = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1179 = 0;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_377 = Static170.method3101("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt1183 = 0;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!wf;")
	public static Class87 aClass87_5 = new Class87(4096);

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!ea;")
	public static Class23 aClass23_7 = new Class23();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1007() {
		aClass87_5 = null;
		aClass33ArrayArray1 = null;
		aClass28_377 = null;
		aClass23_7 = null;
		aClass28_376 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public static void method1008(@OriginalArg(0) boolean arg0) {
		@Pc(1) int local1 = Static112.anInt2872;
		if (arg0) {
			local1 = 1;
		}
		if (Static21.anInt574 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7 && Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7 == Static41.anInt1106) {
			Static21.anInt574 = 0;
		}
		for (@Pc(21) int local21 = 0; local21 < local1; local21++) {
			@Pc(30) Class3_Sub2_Sub1_Sub2_Sub1 local30;
			@Pc(37) long local37;
			if (arg0) {
				local30 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1;
				local37 = 8791798054912L;
			} else {
				local30 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local21]];
				local37 = (long) Static126.anIntArray557[local21] << 32;
			}
			if (local30 != null && local30.method1436()) {
				local30.aBoolean48 = false;
				if ((Static179.aBoolean202 && Static112.anInt2872 > 50 || Static112.anInt2872 > 200) && !arg0 && local30.anInt1827 == local30.anInt1821) {
					local30.aBoolean48 = true;
				}
				@Pc(80) int local80 = local30.anInt1800 >> 7;
				@Pc(85) int local85 = local30.anInt1792 >> 7;
				if (local80 >= 0 && local80 < 104 && local85 >= 0 && local85 < 104) {
					if (local30.aClass3_Sub2_Sub1_Sub1_1 == null || Static14.anInt481 < local30.anInt879 || local30.anInt889 <= Static14.anInt481) {
						if ((local30.anInt1800 & 0x7F) == 64 && (local30.anInt1792 & 0x7F) == 64) {
							if (Static112.anIntArrayArray24[local80][local85] == Static44.anInt3939) {
								continue;
							}
							Static112.anIntArrayArray24[local80][local85] = Static44.anInt3939;
						}
						local30.anInt1809 = Static33.method848(local30.anInt1800, Static171.anInt4109, local30.anInt1792);
						Static63.method1494(Static171.anInt4109, local30.anInt1800, local30.anInt1792, local30.anInt1809, 60, local30, local30.anInt1795, local37, local30.aBoolean100);
					} else {
						local30.aBoolean48 = false;
						local30.anInt1809 = Static33.method848(local30.anInt1800, Static171.anInt4109, local30.anInt1792);
						Static125.method2488(Static171.anInt4109, local30.anInt1800, local30.anInt1792, local30.anInt1809, local30, local30.anInt1795, local37, local30.anInt875, local30.anInt890, local30.anInt885, local30.anInt874);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method1009(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static43.method1041(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return Static80.method2759(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!eh;Lclient!eh;Lclient!eh;I)V")
	public static void method1010(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2) {
		Static140.aClass28_1190 = arg2;
		Static140.aClass28_1191 = arg1;
		Static140.aClass28_1180 = arg0;
	}
}
