import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public static int anInt4771;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!je;")
	public static Class2_Sub8_Sub5 aClass2_Sub8_Sub5_5;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public static int anInt4775;

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
	public static int anInt4776;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString163 = "Discard";

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public static int anInt4779 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public static void method3830() {
		@Pc(8) Class2_Sub31 local8;
		for (local8 = (Class2_Sub31) Static275.aClass44_23.method1352(); local8 != null; local8 = (Class2_Sub31) Static275.aClass44_23.method1360()) {
			if (local8.aBoolean393) {
				local8.method4640();
			}
		}
		for (local8 = (Class2_Sub31) Static195.aClass44_29.method1352(); local8 != null; local8 = (Class2_Sub31) Static195.aClass44_29.method1360()) {
			if (local8.aBoolean393) {
				local8.method4640();
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZILclient!ek;)V")
	public static void method3831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class42 arg2) {
		Static9.anInt3025 = arg1;
		Static88.aBoolean137 = false;
		Static130.anInt2976 = 10000;
		Static205.anInt4269 = arg0;
		Static154.anInt3461 = 0;
		Static95.aClass42_23 = arg2;
		Static73.anInt1821 = 1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3833(@OriginalArg(1) String arg0) {
		return Static287.method4460(arg0);
	}
}
