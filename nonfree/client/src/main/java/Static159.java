import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!s;")
	public static final Class217 aClass217_71 = new Class217(15, 2);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
	public static boolean method2687() {
		if (Static414.aBoolean454) {
			try {
				if ((Boolean) Static464.method2259(Static171.aClass159_1.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!da;BLjava/lang/String;I)Lclient!hh;")
	public static Class105 method2688(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static135.anIntArray667, 0);
		if (Static135.anIntArray667[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class105(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public static void method2689() {
		@Pc(18) int local18 = (int) ((double) Static2.anInt7 * 34.46D);
		local18 <<= 0x0;
		if (Static412.aClass50_8.method5860()) {
			local18 += 128;
		}
		Static412.aClass50_8.d(50, local18);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!gh;)Lclient!gh;")
	public static Class89 method2690(@OriginalArg(1) Class89 arg0) {
		if (arg0.anInt2694 != -1) {
			return Static40.method557(arg0.anInt2694);
		}
		@Pc(20) int local20 = arg0.anInt2677 >>> 16;
		@Pc(25) Class16 local25 = new Class16(Static114.aClass167_12);
		for (@Pc(30) Class10_Sub21 local30 = (Class10_Sub21) local25.method255(); local30 != null; local30 = (Class10_Sub21) local25.method256()) {
			if (local30.anInt3646 == local20) {
				return Static40.method557((int) local30.aLong264);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ke;III)V")
	public static void method2691(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static226.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt352 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass10_Sub4Array2[arg0.anInt352++] = Static25.aClass225Array1[local21 - 1].aClass10_Sub4_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt352; local21 < 4; local21++) {
			arg0.aClass10_Sub4Array2[local21] = null;
		}
	}
}
