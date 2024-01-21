import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!tb;")
	public static Class44 aClass44_18;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	public static boolean aBoolean44;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!n;")
	public static Class52 aClass52_17 = new Class52(64);

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_407 = Static33.method650("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!oa;")
	private static Class56 aClass56_409 = Static33.method650("wave:");

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_408 = aClass56_409;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_410 = aClass56_409;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "J")
	public static long aLong21 = 0L;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_411 = Static33.method650("::noclip");

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Lclient!oa;")
	public static Class56 aClass56_412 = Static33.method650(" )2> ");

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Lclient!n;")
	public static Class52 aClass52_18 = new Class52(64);

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array2 = new Class56[500];

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_413 = Static33.method650("@or3@");

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	public static int anInt840 = 127;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
	public static int method575(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(18) int local18 = arg2; local18 < arg1; local18++) {
			local7 = local7 >>> 8 ^ Class3_Sub1_Sub2.anIntArray331[(arg0[local18] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!tb;I)Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2) {
		return Static87.method1606(arg1, arg2, arg0) ? Static122.method1957() : null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method577() {
		aClass52_17 = null;
		aClass56_411 = null;
		aClass56_408 = null;
		aClass56_410 = null;
		aClass56_409 = null;
		aClass56_407 = null;
		aClass56_413 = null;
		aClass52_18 = null;
		aClass56_412 = null;
		aClass44_18 = null;
		aClass56Array2 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
	public static int method578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub18 local12 = (Class3_Sub18) Static56.aClass2_3.method17((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local12.anIntArray300.length; local33++) {
				if (arg0 == local12.anIntArray298[local33]) {
					local31 += local12.anIntArray300[local33];
				}
			}
			return local31;
		}
	}
}
