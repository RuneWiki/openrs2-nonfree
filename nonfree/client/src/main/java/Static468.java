import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "Z")
	public static boolean aBoolean608;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "[[F")
	public static final float[][] aFloatArrayArray15 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "Lclient!wv;")
	public static Class2_Sub51 aClass2_Sub51_2 = null;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
	public static boolean method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static64.anInt1241; local1++) {
			@Pc(6) Class266 local6 = Static250.aClass266Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt8157 == 1) {
				local15 = local6.anInt8151 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt8162 + (local6.anInt8158 * local15 >> 8);
					local37 = local6.anInt8163 + (local6.anInt8153 * local15 >> 8);
					local47 = local6.anInt8149 + (local6.anInt8145 * local15 >> 8);
					local57 = local6.anInt8159 + (local6.anInt8160 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt8157 == 2) {
				local15 = arg0 - local6.anInt8151;
				if (local15 > 0) {
					local27 = local6.anInt8162 + (local6.anInt8158 * local15 >> 8);
					local37 = local6.anInt8163 + (local6.anInt8153 * local15 >> 8);
					local47 = local6.anInt8149 + (local6.anInt8145 * local15 >> 8);
					local57 = local6.anInt8159 + (local6.anInt8160 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt8157 == 3) {
				local15 = local6.anInt8162 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt8151 + (local6.anInt8147 * local15 >> 8);
					local37 = local6.anInt8154 + (local6.anInt8148 * local15 >> 8);
					local47 = local6.anInt8149 + (local6.anInt8145 * local15 >> 8);
					local57 = local6.anInt8159 + (local6.anInt8160 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt8157 == 4) {
				local15 = arg2 - local6.anInt8162;
				if (local15 > 0) {
					local27 = local6.anInt8151 + (local6.anInt8147 * local15 >> 8);
					local37 = local6.anInt8154 + (local6.anInt8148 * local15 >> 8);
					local47 = local6.anInt8149 + (local6.anInt8145 * local15 >> 8);
					local57 = local6.anInt8159 + (local6.anInt8160 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt8157 == 5) {
				local15 = arg1 - local6.anInt8149;
				if (local15 > 0) {
					local27 = local6.anInt8151 + (local6.anInt8147 * local15 >> 8);
					local37 = local6.anInt8154 + (local6.anInt8148 * local15 >> 8);
					local47 = local6.anInt8162 + (local6.anInt8158 * local15 >> 8);
					local57 = local6.anInt8163 + (local6.anInt8153 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V")
	public static void method7051(@OriginalArg(0) int arg0) {
		if (Static86.anInt1765 == 1) {
			Static397.anInt7572 = arg0;
		} else if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
			Static420.anInt7814 = arg0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ft;I)V")
	public static void method7052(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.aBoolean617 = false;
		if (arg0.aClass2_Sub31_5 != null) {
			arg0.aClass2_Sub31_5.anInt5383 = 0;
		}
		for (@Pc(22) Class2_Sub12 local22 = arg0.method7195(); local22 != null; local22 = arg0.method7196()) {
			method7052(local22);
		}
	}
}
