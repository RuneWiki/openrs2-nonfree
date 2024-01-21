import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!qf;")
	public static Class66 aClass66_12;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	public static int anInt3649 = 0;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1266 = Static146.method2172("Welcome to RuneScape");

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1267 = aClass77_1266;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1268 = Static146.method2172("");

	@OriginalMember(owner = "client!t", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray11 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method2539() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method2540() {
		aClass77_1266 = null;
		aClass77_1267 = null;
		aShortArrayArray11 = null;
		aClass77_1268 = null;
		aClass66_12 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!sg;)V")
	public static void method2541(@OriginalArg(1) Class77 arg0) {
		if (Static33.aClass2_Sub8Array1 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method2531();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (local14 < Static33.aClass2_Sub8Array1.length && Static33.aClass2_Sub8Array1[local14].aLong134 != local12) {
			local14++;
		}
		if (Static33.aClass2_Sub8Array1.length > local14 && Static33.aClass2_Sub8Array1[local14] != null) {
			Static124.aClass2_Sub18_Sub1_3.method2398(251);
			Static124.aClass2_Sub18_Sub1_3.method2384(Static33.aClass2_Sub8Array1[local14].aLong134);
		}
	}
}
