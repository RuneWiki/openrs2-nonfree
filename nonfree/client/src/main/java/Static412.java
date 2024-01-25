import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Lclient!st;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "[J")
	public static long[] aLongArray14;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
	public static int anInt6769 = 1;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)V")
	public static void method6060(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub6_Sub12 local17 = Static636.method8647(12, (long) arg0);
		local17.method6245();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!gm;)V")
	public static void method6063(@OriginalArg(1) Class2_Sub23 arg0) {
		arg0.aBoolean739 = false;
		if (arg0.aClass2_Sub4_6 != null) {
			arg0.aClass2_Sub4_6.anInt8531 = 0;
		}
		for (@Pc(27) Class2_Sub23 local27 = arg0.method7676(); local27 != null; local27 = arg0.method7677()) {
			method6063(local27);
		}
	}
}
