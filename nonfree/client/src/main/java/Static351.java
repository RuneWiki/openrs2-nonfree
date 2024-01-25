import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public static int anInt6038;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_94 = new Class171(25, 8);

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "J")
	public static long aLong166 = -1L;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!td;II)V")
	public static void method5103(@OriginalArg(1) Class3_Sub5_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static582.aClass302_69.aClass3_241) {
			return;
		}
		@Pc(20) int local20 = arg0.anInt9212;
		@Pc(23) int local23 = arg0.anInt9213;
		@Pc(26) int local26 = arg0.anInt9217;
		@Pc(30) int local30 = (int) arg0.aLong259;
		@Pc(33) long local33 = arg0.aLong259;
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(48) Class34_Sub1_Sub1_Sub2_Sub1 local48;
		@Pc(69) Class3_Sub37 local69;
		if (local26 == 21) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static668.anInt10817 = 0;
				Static462.anInt7380 = arg2;
				Static166.anInt3031 = arg1;
				Static221.anInt3832 = 2;
				local69 = Static90.method1509(Static577.aClass240_103, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				local69.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 48) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				local69 = Static90.method1509(Static645.aClass240_111, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7941(local30);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		@Pc(201) Class3_Sub37 local201;
		if (local26 == 1012) {
			Static462.anInt7380 = arg2;
			Static221.anInt3832 = 2;
			Static668.anInt10817 = 0;
			Static166.anInt3031 = arg1;
			local201 = Static90.method1509(Static550.aClass240_96, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local30);
			Static301.method2678(local201);
		}
		if (local26 == 11) {
			Static462.anInt7380 = arg2;
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			local201 = Static90.method1509(Static608.aClass240_107, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7941(local30);
			local201.aClass3_Sub4_Sub1_2.method7936(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7941(Static534.anInt8358 + local20);
			local201.aClass3_Sub4_Sub1_2.method7938(Static413.aClass154_1.method5014(82) ? 1 : 0);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 4) {
			Static462.anInt7380 = arg2;
			Static166.anInt3031 = arg1;
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			local201 = Static90.method1509(Static679.aClass240_118, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7920(Static402.anInt6661 + local23);
			local201.aClass3_Sub4_Sub1_2.method7956(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7909(Static376.anInt5867);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7936(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local201.aClass3_Sub4_Sub1_2.method7920(Static284.anInt4811);
			local201.aClass3_Sub4_Sub1_2.method7920(Static454.anInt7316);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 3) {
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 1;
			Static166.anInt3031 = arg1;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static164.aClass240_29, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7913(Static376.anInt5867);
			local201.aClass3_Sub4_Sub1_2.method7936(Static454.anInt7316);
			local201.aClass3_Sub4_Sub1_2.method7920(Static284.anInt4811);
			local201.aClass3_Sub4_Sub1_2.method7920(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7920(Static534.anInt8358 + local20);
			Static301.method2678(local201);
			Static539.method6916(-4, local20, 1, 1, 0, true, 0, local23);
		}
		if (local26 == 44) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static166.anInt3031 = arg1;
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				Static462.anInt7380 = arg2;
				local69 = Static90.method1509(Static548.aClass240_95, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				local69.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 6) {
			Static221.anInt3832 = 2;
			Static668.anInt10817 = 0;
			Static462.anInt7380 = arg2;
			Static166.anInt3031 = arg1;
			local201 = Static90.method1509(Static375.aClass240_80, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7920(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7936(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7936((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 1003) {
			Static462.anInt7380 = arg2;
			Static166.anInt3031 = arg1;
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			local201 = Static90.method1509(Static617.aClass240_59, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local30);
			Static301.method2678(local201);
		}
		if (local26 == 10) {
			Static668.anInt10817 = 0;
			Static462.anInt7380 = arg2;
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			local201 = Static90.method1509(Static368.aClass240_57, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7909(Static376.anInt5867);
			local201.aClass3_Sub4_Sub1_2.method7956(Static284.anInt4811);
			local201.aClass3_Sub4_Sub1_2.method7941(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9671);
			local201.aClass3_Sub4_Sub1_2.method7920(Static454.anInt7316);
			Static301.method2678(local201);
		}
		if (local26 == 53) {
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			Static668.anInt10817 = 0;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static118.aClass240_106, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local201.aClass3_Sub4_Sub1_2.method7956(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7941(Static402.anInt6661 + local23);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 47) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static166.anInt3031 = arg1;
				Static221.anInt3832 = 2;
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				local69 = Static90.method1509(Static317.aClass240_53, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				local69.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 1006 || local26 == 1007 || local26 == 1010 || local26 == 1011 || local26 == 1001) {
			Static240.method3645(local30, local20, local26);
		}
		@Pc(842) Class3_Sub37 local842;
		@Pc(829) Class34_Sub1_Sub1_Sub2_Sub2 local829;
		@Pc(820) Class3_Sub52 local820;
		if (local26 == 50) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				Static166.anInt3031 = arg1;
				Static462.anInt7380 = arg2;
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static221.anInt3832 = 2;
				Static668.anInt10817 = 0;
				local842 = Static90.method1509(Static592.aClass240_104, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7936(local30);
				local842.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 45) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static462.anInt7380 = arg2;
				Static166.anInt3031 = arg1;
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				local842 = Static90.method1509(Static44.aClass240_18, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7920(local30);
				local842.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 9) {
			if (Static512.anInt8070 > 0 && Static413.aClass154_1.method5014(82) && Static413.aClass154_1.method5014(81)) {
				Static290.method4178(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132, Static534.anInt8358 + local20, local23 + Static402.anInt6661);
			} else {
				Static668.anInt10817 = 0;
				Static462.anInt7380 = arg2;
				Static166.anInt3031 = arg1;
				Static221.anInt3832 = 1;
				local201 = Static90.method1509(Static75.aClass240_22, Static226.aClass144_2);
				local201.aClass3_Sub4_Sub1_2.method7941(Static534.anInt8358 + local20);
				local201.aClass3_Sub4_Sub1_2.method7920(Static402.anInt6661 + local23);
				Static301.method2678(local201);
			}
		}
		@Pc(1040) Class265 local1040;
		if (local26 == 57) {
			local1040 = Static212.method3145(local23, local20);
			if (local1040 != null) {
				Static388.method5437(local1040);
			}
		}
		if (local26 == 59) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				local69 = Static90.method1509(Static27.aClass240_9, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 8) {
			if (Static512.anInt8070 > 0 && Static413.aClass154_1.method5014(82) && Static413.aClass154_1.method5014(81)) {
				Static290.method4178(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132, local20 + Static534.anInt8358, local23 + Static402.anInt6661);
			} else {
				local201 = Static521.method6771(local23, local20, local30);
				if (local30 == 1) {
					local201.aClass3_Sub4_Sub1_2.method7948(-1);
					local201.aClass3_Sub4_Sub1_2.method7948(-1);
					local201.aClass3_Sub4_Sub1_2.method7956((int) Static318.aFloat81);
					local201.aClass3_Sub4_Sub1_2.method7948(57);
					local201.aClass3_Sub4_Sub1_2.method7948(Static234.anInt4142);
					local201.aClass3_Sub4_Sub1_2.method7948(Static30.anInt1549);
					local201.aClass3_Sub4_Sub1_2.method7948(89);
					local201.aClass3_Sub4_Sub1_2.method7956(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614);
					local201.aClass3_Sub4_Sub1_2.method7956(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619);
					local201.aClass3_Sub4_Sub1_2.method7948(63);
				} else {
					Static462.anInt7380 = arg2;
					Static166.anInt3031 = arg1;
					Static668.anInt10817 = 0;
					Static221.anInt3832 = 1;
				}
				Static301.method2678(local201);
				Static539.method6916(-4, local20, 1, 1, 0, true, 0, local23);
			}
		}
		if (local26 == 13) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static668.anInt10817 = 0;
				Static166.anInt3031 = arg1;
				Static462.anInt7380 = arg2;
				Static221.anInt3832 = 2;
				local842 = Static90.method1509(Static319.aClass240_55, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7936(Static284.anInt4811);
				local842.aClass3_Sub4_Sub1_2.method7941(local30);
				local842.aClass3_Sub4_Sub1_2.method7938(Static413.aClass154_1.method5014(82) ? 1 : 0);
				local842.aClass3_Sub4_Sub1_2.method7913(Static376.anInt5867);
				local842.aClass3_Sub4_Sub1_2.method7936(Static454.anInt7316);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 49) {
			Static462.anInt7380 = arg2;
			Static166.anInt3031 = arg1;
			Static221.anInt3832 = 2;
			Static668.anInt10817 = 0;
			local201 = Static90.method1509(Static274.aClass240_47, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7936(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7920(Static284.anInt4811);
			local201.aClass3_Sub4_Sub1_2.method7920(local30);
			local201.aClass3_Sub4_Sub1_2.method7941(Static454.anInt7316);
			local201.aClass3_Sub4_Sub1_2.method7908(Static376.anInt5867);
			local201.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7956(Static534.anInt8358 + local20);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 51) {
			Static668.anInt10817 = 0;
			Static462.anInt7380 = arg2;
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			local201 = Static90.method1509(Static207.aClass240_99, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7936(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7941(Static402.anInt6661 + local23);
			local201.aClass3_Sub4_Sub1_2.method7941(local30);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 1008) {
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			Static668.anInt10817 = 0;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static391.aClass240_63, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7941(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local201.aClass3_Sub4_Sub1_2.method7936(local23 + Static402.anInt6661);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 46) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				Static166.anInt3031 = arg1;
				Static221.anInt3832 = 2;
				local69 = Static90.method1509(Static470.aClass240_79, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				local69.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 23) {
			Static462.anInt7380 = arg2;
			Static166.anInt3031 = arg1;
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			local201 = Static90.method1509(Static547.aClass240_94, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local30);
			local201.aClass3_Sub4_Sub1_2.method7941(Static402.anInt6661 + local23);
			local201.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7936(Static534.anInt8358 + local20);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 2) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				local69 = Static90.method1509(Static29.aClass240_12, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7936(local30);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 1009) {
			Static166.anInt3031 = arg1;
			Static221.anInt3832 = 2;
			Static462.anInt7380 = arg2;
			Static668.anInt10817 = 0;
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(1761) Class261 local1761 = local829.aClass261_1;
				if (local1761.anIntArray364 != null) {
					local1761 = local1761.method5772(Static210.aClass262_1);
				}
				if (local1761 != null) {
					@Pc(1782) Class3_Sub37 local1782 = Static90.method1509(Static68.aClass240_21, Static226.aClass144_2);
					local1782.aClass3_Sub4_Sub1_2.method7956(local1761.anInt6794);
					Static301.method2678(local1782);
				}
			}
		}
		if (local26 == 20) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static462.anInt7380 = arg2;
				Static221.anInt3832 = 2;
				Static668.anInt10817 = 0;
				Static166.anInt3031 = arg1;
				local842 = Static90.method1509(Static267.aClass240_45, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7956(local30);
				local842.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 30) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				Static462.anInt7380 = arg2;
				local69 = Static90.method1509(Static368.aClass240_57, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
				local69.aClass3_Sub4_Sub1_2.method7909(Static376.anInt5867);
				local69.aClass3_Sub4_Sub1_2.method7956(Static284.anInt4811);
				local69.aClass3_Sub4_Sub1_2.method7941(local30);
				local69.aClass3_Sub4_Sub1_2.method7920(Static454.anInt7316);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 16 && Static84.aClass265_4 == null) {
			Static629.method8503(local23, local20);
			Static84.aClass265_4 = Static212.method3145(local23, local20);
			Static218.method3194(Static84.aClass265_4);
		}
		if (local26 == 58) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static166.anInt3031 = arg1;
				Static221.anInt3832 = 2;
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				local842 = Static90.method1509(Static613.aClass240_109, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7936(local30);
				local842.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 18) {
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static12.aClass240_4, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local20 + Static534.anInt8358);
			local201.aClass3_Sub4_Sub1_2.method7956(Static402.anInt6661 + local23);
			local201.aClass3_Sub4_Sub1_2.method7920(local30);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 52) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				Static668.anInt10817 = 0;
				Static462.anInt7380 = arg2;
				local69 = Static90.method1509(Static182.aClass240_34, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7956(local30);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 17) {
			local1040 = Static212.method3145(local23, local20);
			if (local1040 != null) {
				Static252.method3806();
				@Pc(2189) Class3_Sub40 local2189 = Static86.method1383(local1040);
				Static410.method5612(local2189.anInt7828, local1040, local2189.method6484());
				Static36.aString12 = Static316.method4544(local1040);
				if (Static36.aString12 == null) {
					Static36.aString12 = "Null";
				}
				Static225.aString51 = local1040.aString90 + "<col=ffffff>";
			}
			return;
		}
		if (local26 == 60) {
			Static221.anInt3832 = 2;
			Static668.anInt10817 = 0;
			Static166.anInt3031 = arg1;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static427.aClass240_71, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7956(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7941(Static534.anInt8358 + local20);
			local201.aClass3_Sub4_Sub1_2.method7956((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 25) {
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			Static462.anInt7380 = arg2;
			Static668.anInt10817 = 0;
			local201 = Static90.method1509(Static184.aClass240_35, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7920((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local201.aClass3_Sub4_Sub1_2.method7941(local23 + Static402.anInt6661);
			local201.aClass3_Sub4_Sub1_2.method7936(Static534.anInt8358 + local20);
			local201.aClass3_Sub4_Sub1_2.method7955(Static413.aClass154_1.method5014(82) ? 1 : 0);
			Static301.method2678(local201);
			Static335.method4902(local33, local20, local23);
		}
		if (local26 == 22) {
			local820 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local30);
			if (local820 != null) {
				local829 = local820.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				local842 = Static90.method1509(Static42.aClass240_16, Static226.aClass144_2);
				local842.aClass3_Sub4_Sub1_2.method7938(Static413.aClass154_1.method5014(82) ? 1 : 0);
				local842.aClass3_Sub4_Sub1_2.method7920(local30);
				Static301.method2678(local842);
				Static539.method6916(-2, local829.anIntArray529[0], local829.method7866(), local829.method7866(), 0, true, 0, local829.anIntArray528[0]);
			}
		}
		if (local26 == 12) {
			Static668.anInt10817 = 0;
			Static221.anInt3832 = 2;
			Static166.anInt3031 = arg1;
			Static462.anInt7380 = arg2;
			local201 = Static90.method1509(Static660.aClass240_114, Static226.aClass144_2);
			local201.aClass3_Sub4_Sub1_2.method7938(Static413.aClass154_1.method5014(82) ? 1 : 0);
			local201.aClass3_Sub4_Sub1_2.method7941(Static534.anInt8358 + local20);
			local201.aClass3_Sub4_Sub1_2.method7936(local30);
			local201.aClass3_Sub4_Sub1_2.method7956(Static402.anInt6661 + local23);
			Static301.method2678(local201);
			Static303.method4401(local20, local23);
		}
		if (local26 == 19 || local26 == 1002) {
			Static272.method4018(local20, local23, arg0.aString106, local30);
		}
		if (local26 == 15) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static462.anInt7380 = arg2;
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				Static668.anInt10817 = 0;
				local69 = Static90.method1509(Static317.aClass240_54, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7920(local30);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (local26 == 5) {
			local48 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local30];
			if (local48 != null) {
				Static462.anInt7380 = arg2;
				Static668.anInt10817 = 0;
				Static221.anInt3832 = 2;
				Static166.anInt3031 = arg1;
				local69 = Static90.method1509(Static267.aClass240_44, Static226.aClass144_2);
				local69.aClass3_Sub4_Sub1_2.method7904(Static413.aClass154_1.method5014(82) ? 1 : 0);
				local69.aClass3_Sub4_Sub1_2.method7956(local30);
				Static301.method2678(local69);
				Static539.method6916(-2, local48.anIntArray529[0], local48.method7866(), local48.method7866(), 0, true, 0, local48.anIntArray528[0]);
			}
		}
		if (Static47.aBoolean59) {
			Static252.method3806();
		}
		if (Static167.aClass265_5 != null && Static42.anInt883 == 0) {
			Static218.method3194(Static167.aClass265_5);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)I")
	public static int method5104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public static void method5106() {
		for (@Pc(7) int local7 = 0; local7 < Static217.anInt10315; local7++) {
			@Pc(15) Class51 local15 = Static2.aClass51Array1[local7];
			@Pc(17) boolean local17 = false;
			@Pc(141) int local141;
			if (local15.aClass3_Sub12_Sub4_1 == null) {
				local15.anInt1398--;
				if (local15.anInt1398 >= (local15.method1232() ? -1500 : -10)) {
					if (local15.aByte16 == 1 && local15.aClass210_1 == null) {
						local15.aClass210_1 = Static683.method4984(Static201.aClass362_43, local15.anInt1395, 0);
						if (local15.aClass210_1 == null) {
							continue;
						}
						local15.anInt1398 += local15.aClass210_1.method4987();
					} else if (local15.method1232() && (local15.aClass3_Sub54_1 == null || local15.aClass3_Sub39_Sub1_1 == null)) {
						if (local15.aClass3_Sub54_1 == null) {
							local15.aClass3_Sub54_1 = Static670.method8933(Static585.aClass362_139, local15.anInt1395);
						}
						if (local15.aClass3_Sub54_1 == null) {
							continue;
						}
						if (local15.aClass3_Sub39_Sub1_1 == null) {
							local15.aClass3_Sub39_Sub1_1 = local15.aClass3_Sub54_1.method8927(new int[] { 22050 });
							if (local15.aClass3_Sub39_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local15.anInt1398 < 0) {
						@Pc(122) int local122 = 8192;
						if (local15.anInt1397 == 0) {
							local141 = local15.anInt1399 * (local15.aByte16 == 3 ? Static336.aClass3_Sub41_18.aClass14_Sub9_1.method2998() : Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998()) >> 2;
						} else {
							@Pc(135) int local135 = local15.anInt1397 >> 24 & 0x3;
							if (local135 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
								@Pc(150) int local150 = (local15.anInt1397 & 0xFF) << 9;
								@Pc(156) int local156 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() << 8;
								@Pc(163) int local163 = local15.anInt1397 >> 16 & 0xFF;
								@Pc(176) int local176 = (local163 << 9) + local156 + 256 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
								@Pc(183) int local183 = local15.anInt1397 >> 8 & 0xFF;
								@Pc(196) int local196 = (local183 << 9) - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 - (-local156 - 256);
								@Pc(204) int local204 = Math.abs(local176) + Math.abs(local196) - 512;
								if (local150 < local204) {
									local15.anInt1398 = -99999;
									continue;
								}
								if (local204 < 0) {
									local204 = 0;
								}
								local141 = (local150 - local204) * Static336.aClass3_Sub41_18.aClass14_Sub9_2.method2998() * local15.anInt1399 / local150 >> 2;
								if (local15.aClass34_Sub1_4 != null && local15.aClass34_Sub1_4 instanceof Class34_Sub1_Sub1) {
									@Pc(247) Class34_Sub1_Sub1 local247 = (Class34_Sub1_Sub1) local15.aClass34_Sub1_4;
									@Pc(250) short local250 = local247.aShort99;
									@Pc(253) short local253 = local247.aShort98;
								}
								if (local176 != 0 || local196 != 0) {
									@Pc(274) int local274 = -Static40.anInt856 - (int) (Math.atan2((double) local176, (double) local196) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local274 > 8192) {
										local274 = 16384 - local274;
									}
									@Pc(300) int local300;
									if (local204 <= 0) {
										local300 = 8192;
									} else if (local204 < 4096) {
										local300 = (8192 - local204) / 4096 + 8192;
									} else {
										local300 = 16384;
									}
									local122 = (16384 - local300 >> 1) + local274 * local300 / 8192;
								}
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(346) Class3_Sub39_Sub1 local346 = null;
							if (local15.aByte16 == 1) {
								local346 = local15.aClass210_1.method4986().method6312(Static33.aClass217_11);
							} else if (local15.method1232()) {
								local346 = local15.aClass3_Sub39_Sub1_1;
							}
							@Pc(376) Class3_Sub12_Sub4 local376 = local15.aClass3_Sub12_Sub4_1 = Static687.method8546(local346, local15.anInt1393, local141, local122);
							local376.method8528(local15.anInt1400 - 1);
							Static156.aClass3_Sub12_Sub1_1.method1765(local376);
						}
					}
				} else {
					local17 = true;
				}
			} else if (!local15.aClass3_Sub12_Sub4_1.method9036()) {
				local17 = true;
			}
			if (local17) {
				Static217.anInt10315--;
				for (local141 = local7; local141 < Static217.anInt10315; local141++) {
					Static2.aClass51Array1[local141] = Static2.aClass51Array1[local141 + 1];
				}
				local7--;
			}
		}
		if (Static501.aBoolean551 && !Static594.method7826()) {
			if (Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998() != 0 && Static189.anInt3426 != -1) {
				if (Static552.aClass3_Sub12_Sub3_2 == null) {
					Static58.method7696(Static214.aClass362_141, Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998(), Static189.anInt3426);
				} else {
					Static579.method7660(Static552.aClass3_Sub12_Sub3_2, Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998(), Static189.anInt3426, Static214.aClass362_141);
				}
			}
			Static552.aClass3_Sub12_Sub3_2 = null;
			Static501.aBoolean551 = false;
		} else if (Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998() != 0 && Static189.anInt3426 != -1 && !Static594.method7826()) {
			@Pc(450) Class3_Sub37 local450 = Static90.method1509(Static673.aClass240_116, Static226.aClass144_2);
			local450.aClass3_Sub4_Sub1_2.method7909(Static189.anInt3426);
			Static301.method2678(local450);
			Static189.anInt3426 = -1;
		}
	}
}
