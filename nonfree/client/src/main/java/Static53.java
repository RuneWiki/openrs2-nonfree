import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[I")
	public static int[] anIntArray141 = new int[2000];

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Lclient!od;")
	private static Class60 aClass60_518 = Static41.method597("To play on this world move to a free area first");

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_515 = aClass60_518;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "Lclient!od;")
	public static Class60 aClass60_516 = Static41.method597("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "Lclient!od;")
	public static Class60 aClass60_517 = Static41.method597("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!c;)Z")
	public static boolean method865(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(8) byte[] local8 = arg1.method1768(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static45.method629(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method866() {
		Static75.anIntArray125 = null;
		Static29.anIntArray91 = null;
		Static125.anIntArray341 = null;
		Static113.anIntArray132 = null;
		Static56.aByteArrayArray7 = null;
		Static2.anIntArray1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lclient!sa;")
	public static Class4_Sub14 method867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub14 local14 = Static61.method991(arg0);
		if (arg1 == -1) {
			return local14;
		} else if (local14 == null || local14.aClass4_Sub14Array3 == null || arg1 >= local14.aClass4_Sub14Array3.length) {
			return null;
		} else {
			return local14.aClass4_Sub14Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method868() {
		anIntArray141 = null;
		aClass60_516 = null;
		aByteArrayArrayArray3 = null;
		aClass60_515 = null;
		aClass60_517 = null;
		anIntArray146 = null;
		aClass60_518 = null;
	}
}
