import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
	public static boolean aBoolean5;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt64;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "J")
	public static volatile long aLong1 = 0L;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_2 = new Class44(103, 7);

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
	public static final int[] anIntArray9 = new int[1];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[Lclient!uh;")
	public static Class352[] method56() {
		return new Class352[] { Static270.aClass352_6, Static434.aClass352_9, Static95.aClass352_3, Static552.aClass352_14, Static641.aClass352_15, Static440.aClass352_10, Static118.aClass352_4, Static155.aClass352_5, Static315.aClass352_7, Static348.aClass352_8, Static471.aClass352_12, Static517.aClass352_13, Static80.aClass352_2, Static5.aClass352_11 };
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	public static void method57(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 2);
		local9.method2822();
	}
}
