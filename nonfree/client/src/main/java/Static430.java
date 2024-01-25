import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!rt", name = "Cb", descriptor = "Lclient!mu;")
	public static Class196 aClass196_7;

	@OriginalMember(owner = "client!rt", name = "Fb", descriptor = "I")
	public static int anInt9213;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_45 = new Class267(32);

	@OriginalMember(owner = "client!rt", name = "Bb", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_167 = new Class133(32, 14);

	@OriginalMember(owner = "client!rt", name = "Eb", descriptor = "Lclient!us;")
	public static final Class107 aClass107_3 = Static147.method2514();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!e;Lclient!kea;B)V")
	public static void method7550(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class161 arg1) {
		Static254.aClass161_56 = arg1;
		Static488.anInterface4_13 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7558(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static41.anInt1004; local18++) {
			if (arg0.equalsIgnoreCase(Static147.aStringArray21[local18])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static516.aStringArray48[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "(II)V")
	public static void method7596(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub10_Sub16 local12 = Static362.method5701(arg0, 1);
		local12.method6212();
	}
}
