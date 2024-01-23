import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public static int anInt1457;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
	public static int[] anIntArray137 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString55 = "wave2:";

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lclient!w;")
	public static Class181 method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass181_1;
	}
}
