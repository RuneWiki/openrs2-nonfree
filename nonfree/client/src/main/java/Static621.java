import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable35 = new Hashtable();

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[50][];

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public static void method8304() {
		if (Static131.anInt2222 == -1) {
			return;
		}
		@Pc(11) int local11 = Static178.aClass111_1.method8703();
		@Pc(15) int local15 = Static178.aClass111_1.method8696();
		@Pc(20) Class5_Sub25 local20 = (Class5_Sub25) Static598.aClass124_96.method2572();
		if (local20 != null) {
			local11 = local20.method3315();
			local15 = local20.method3313();
		}
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (Static305.aBoolean315) {
			local32 = Static304.method4150();
			local34 = Static563.method7702();
		}
		Static284.method3904(local34 + Static316.anInt8165, local32 + local11, local32, local34, local34, Static131.anInt2222, local32, local11, local32 + Static563.anInt9176, local15, local15 + local34);
		if (Static413.aClass394_4 != null) {
			method8305(local32 + local11, local15 - -local34);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BII)V")
	private static void method8305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static407.aFloat125 < Static407.aFloat126) {
			Static407.aFloat125 = (float) ((double) Static407.aFloat125 + (double) Static407.aFloat125 / 30.0D);
			if (Static407.aFloat125 > Static407.aFloat126) {
				Static407.aFloat125 = Static407.aFloat126;
			}
			Static383.method5626();
			Static407.anInt6534 = (int) Static407.aFloat125 >> 1;
			Static407.aByteArrayArrayArray15 = Static570.method7818(Static407.anInt6534);
		} else if (Static407.aFloat126 < Static407.aFloat125) {
			Static407.aFloat125 = (float) ((double) Static407.aFloat125 - (double) Static407.aFloat125 / 30.0D);
			if (Static407.aFloat126 > Static407.aFloat125) {
				Static407.aFloat125 = Static407.aFloat126;
			}
			Static383.method5626();
			Static407.anInt6534 = (int) Static407.aFloat125 >> 1;
			Static407.aByteArrayArrayArray15 = Static570.method7818(Static407.anInt6534);
		}
		if (Static195.anInt3145 != -1 && Static158.anInt2662 != -1) {
			@Pc(83) int local83 = Static195.anInt3145 - Static255.anInt4085;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static158.anInt2662 - Static361.anInt6318;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static255.anInt4085 -= -local83;
			if (local83 == 0 && local100 == 0) {
				Static195.anInt3145 = -1;
				Static158.anInt2662 = -1;
			}
			Static361.anInt6318 -= -local100;
			Static383.method5626();
		}
		if (Static588.anInt9639 > 0) {
			Static452.anInt7898--;
			if (Static452.anInt7898 == 0) {
				Static588.anInt9639--;
				Static452.anInt7898 = 100;
			}
		} else {
			Static143.anInt2376 = -1;
			Static21.anInt152 = -1;
		}
		if (!Static368.aBoolean461 || Static653.aClass124_104 == null) {
			return;
		}
		for (@Pc(170) Class5_Sub45 local170 = (Class5_Sub45) Static653.aClass124_104.method2572(); local170 != null; local170 = (Class5_Sub45) Static653.aClass124_104.method2569()) {
			@Pc(179) Class262 local179 = Static407.aClass218_3.method5163(local170.aClass5_Sub40_1.anInt7515);
			if (local170.method7423(arg0, arg1)) {
				if (local179.aStringArray28 != null) {
					if (local179.aStringArray28[4] != null) {
						Static244.method3492(1011, local179.aString73, true, -1, local179.aStringArray28[4], -1, (long) local170.aClass5_Sub40_1.anInt7515, false, false, local179.anInt7615, 0, (long) local170.aClass5_Sub40_1.anInt7515);
					}
					if (local179.aStringArray28[3] != null) {
						Static244.method3492(1006, local179.aString73, true, -1, local179.aStringArray28[3], -1, (long) local170.aClass5_Sub40_1.anInt7515, false, false, local179.anInt7615, 0, (long) local170.aClass5_Sub40_1.anInt7515);
					}
					if (local179.aStringArray28[2] != null) {
						Static244.method3492(1003, local179.aString73, true, -1, local179.aStringArray28[2], -1, (long) local170.aClass5_Sub40_1.anInt7515, false, false, local179.anInt7615, 0, (long) local170.aClass5_Sub40_1.anInt7515);
					}
					if (local179.aStringArray28[1] != null) {
						Static244.method3492(1008, local179.aString73, true, -1, local179.aStringArray28[1], -1, (long) local170.aClass5_Sub40_1.anInt7515, false, false, local179.anInt7615, 0, (long) local170.aClass5_Sub40_1.anInt7515);
					}
					if (local179.aStringArray28[0] != null) {
						Static244.method3492(1004, local179.aString73, true, -1, local179.aStringArray28[0], -1, (long) local170.aClass5_Sub40_1.anInt7515, false, false, local179.anInt7615, 0, (long) local170.aClass5_Sub40_1.anInt7515);
					}
				}
				if (!local170.aClass5_Sub40_1.aBoolean548) {
					local170.aClass5_Sub40_1.aBoolean548 = true;
					Static497.method7212(Static317.aClass209_5, local170.aClass5_Sub40_1.anInt7515, local179.anInt7615);
				}
				if (local170.aClass5_Sub40_1.aBoolean548) {
					Static497.method7212(Static464.aClass209_10, local170.aClass5_Sub40_1.anInt7515, local179.anInt7615);
				}
			} else if (local170.aClass5_Sub40_1.aBoolean548) {
				local170.aClass5_Sub40_1.aBoolean548 = false;
				Static497.method7212(Static472.aClass209_11, local170.aClass5_Sub40_1.anInt7515, local179.anInt7615);
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(FIFF)I")
	public static int method8306(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
	public static String method8308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) char[] local15 = new char[arg0];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
			@Pc(28) int local28 = arg2[local19 + arg1] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(47) char local47 = Static218.aCharArray3[local28 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local28 = local47;
				}
				local15[local17++] = (char) local28;
			}
		}
		return new String(local15, 0, local17);
	}
}
