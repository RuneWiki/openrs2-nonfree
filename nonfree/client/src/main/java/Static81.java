import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public static int anInt1917;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!od;")
	private static Class60 aClass60_797 = Static41.method597("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_798 = aClass60_797;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!cb;")
	public static Class12 aClass12_16 = new Class12(64);

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_799 = Static41.method597("hitmarks");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!cb;")
	public static Class12 aClass12_17 = new Class12(30);

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_800 = Static41.method597("::");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_12 = null;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_801 = Static41.method597("<col=ffb000>");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public static int anInt1918 = -1;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_802 = Static41.method597(":assist:");

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1 = new Class2[50];

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
	public static int[] anIntArray223 = new int[128];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method1287(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static118.method1894(arg0)) {
			return;
		}
		@Pc(27) Class4_Sub14[] local27 = Static82.aClass4_Sub14ArrayArray1[arg0];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Class4_Sub14 local35 = local27[local29];
			if (local35.anObjectArray25 != null) {
				@Pc(42) Class4_Sub21 local42 = new Class4_Sub21();
				local42.aClass4_Sub14_14 = local35;
				local42.anObjectArray28 = local35.anObjectArray25;
				Static28.method1353(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBZ)Lclient!od;")
	public static Class60 method1288(@OriginalArg(0) int arg0) {
		return Static102.method1692(arg0, true);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1289() {
		aClass60_799 = null;
		aClass60_802 = null;
		aClass12_16 = null;
		aClass60_800 = null;
		anIntArray223 = null;
		aClass60_798 = null;
		aClass60_797 = null;
		aClass4_Sub14_12 = null;
		aClass2Array1 = null;
		aClass12_17 = null;
		aClass60_801 = null;
	}
}
