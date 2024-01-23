import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	public static int anInt3813;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "J")
	public static long aLong135;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lclient!wb;")
	public static Class2_Sub3_Sub4 aClass2_Sub3_Sub4_2;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "Lclient!sh;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12 = new int[2][][];

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
	public static int anInt3819 = 0;

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString127 = "Select";

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[1000];

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
	public static int[] anIntArray374 = new int[2];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public static void method3140(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static169.aBoolean248) {
			Static169.aBoolean248 = arg0;
			Static222.method3675();
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)I")
	public static int method3142(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Class2_Sub10 local17 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local17 == null) {
			return Static7.method118(arg0).anInt5766;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local17.anIntArray105.length; local29++) {
			if (local17.anIntArray105[local29] == -1) {
				local27++;
			}
		}
		return local27 + Static7.method118(arg0).anInt5766 - local17.anIntArray105.length;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!tn;")
	public static Class172 method3143(@OriginalArg(1) int arg0) {
		@Pc(6) Class172 local6 = (Class172) Static157.aClass157_29.method4031((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static215.aClass42_67.method1256(1, arg0);
		local6 = new Class172();
		if (local27 != null) {
			local6.method4325(new Class2_Sub16(local27), arg0);
		}
		Static157.aClass157_29.method4026((long) arg0, local6);
		return local6;
	}
}
