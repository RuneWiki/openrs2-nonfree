import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_9 = new Class178(11, 0, 1, 2);

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public static int anInt4899 = 64;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_139 = new Class194(88, 1);

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!hj;II[B)Lclient!jfa;")
	public static Class173 method4177(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static143.anIntArray180, 0);
		if (Static143.anIntArray180[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class173(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	public static void method4182() {
		if (Static87.method1479(Static82.anInt1653) || Static311.method5226(Static82.anInt1653)) {
			Static606.method8325(Static419.anInt7345 >> 12, Static522.anInt8849 >> 12, 5000);
		} else {
			@Pc(27) int local27 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] >> 3;
			@Pc(34) int local34 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] >> 3;
			if (local27 >= 0 && Static399.anInt7121 >> 3 > local27 && local34 >= 0 && local34 < Static24.anInt345 >> 3) {
				Static606.method8325(local27, local34, 5000);
			} else {
				Static606.method8325(Static399.anInt7121 >> 4, Static24.anInt345 >> 4, 0);
			}
		}
		Static415.method6436();
		Static554.method7877();
		Static98.method1679();
		Static370.method5897();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)Z")
	public static boolean method4183(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
