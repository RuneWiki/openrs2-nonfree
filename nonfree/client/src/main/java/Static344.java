import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!bq;")
	public static Class5_Sub4 aClass5_Sub4_2;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!ra;")
	public static Class170 aClass170_10;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public static int anInt1063;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!we", name = "T", descriptor = "Z")
	private static boolean aBoolean80;

	@OriginalMember(owner = "client!we", name = "U", descriptor = "Z")
	private static boolean aBoolean81;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString62 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	public static int anInt1072 = 0;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public static int anInt1080 = 99;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public static void method944(@OriginalArg(0) boolean arg0) {
		Static335.aClass5_Sub1_Sub1_3.method174(211);
		for (@Pc(23) Class5_Sub40 local23 = (Class5_Sub40) Static265.aClass42_53.method1060(); local23 != null; local23 = (Class5_Sub40) Static265.aClass42_53.method1055()) {
			if (!local23.method5802()) {
				local23 = (Class5_Sub40) Static265.aClass42_53.method1060();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt6229 == 0) {
				Static339.method5623(true, local23, arg0);
			}
		}
		if (Static323.aClass96_20 != null) {
			Static336.method4719(Static323.aClass96_20);
			Static323.aClass96_20 = null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static323.method5433(arg2)) {
			Static35.method853(arg7, arg3, arg6, arg1, arg0, Static348.aClass96ArrayArray1[arg2], -1, arg5, arg4);
		} else if (arg3 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static293.aBooleanArray25[local19] = true;
			}
		} else {
			Static293.aBooleanArray25[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!we", name = "providesignlink", descriptor = "(Lclient!am;)V")
	private static void method950(@OriginalArg(0) Class10 arg0) {
		Static202.aClass10_3 = arg0;
		Static213.aClass10_4 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IZ)I")
	public static int method953(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static284.method4783();
		for (@Pc(20) Class5_Sub35 local20 = arg0 ? (Class5_Sub35) Static352.aClass42_61.method1060() : (Class5_Sub35) Static352.aClass42_61.method1055(); local20 != null; local20 = (Class5_Sub35) Static352.aClass42_61.method1055()) {
			if (local8 > (local20.aLong175 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local20.aLong175 & 0x4000000000000000L) != 0L) {
					@Pc(52) int local52 = (int) local20.aLong218;
					Static69.anIntArray80[local52] = Static2.anIntArray2[local52];
					local20.method5803();
					return local52;
				}
				local20.method5803();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method954(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BILclient!bo;)V")
	public static void method957(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub1_Sub1 arg1) {
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		if (arg1.anInt5329 > Static180.anInt3606) {
			Static324.method5463(arg1);
		} else if (Static180.anInt3606 > arg1.anInt5291) {
			Static40.method890(arg1, false);
			local17 = Static215.anInt4285;
			local15 = Static275.anInt5381;
		} else {
			Static257.method4466(arg1);
		}
		if (arg1.anInt5769 < 128 || arg1.anInt5773 < 128 || Static266.anInt5101 * 128 - 128 <= arg1.anInt5769 || (Static339.anInt6352 - 1) * 128 <= arg1.anInt5773) {
			arg1.anInt5269 = -1;
			arg1.anInt5312 = -1;
			arg1.anInt5329 = 0;
			arg1.anInt5291 = 0;
			arg1.anInt5769 = arg1.anIntArray402[0] * 128 + arg1.method4646() * 64;
			arg1.anInt5773 = arg1.anIntArray401[0] * 128 + arg1.method4646() * 64;
			arg1.method4654();
		}
		if (arg1 == Static85.aClass25_Sub1_Sub1_Sub1_1 && (arg1.anInt5769 < 1536 || arg1.anInt5773 < 1536 || arg1.anInt5769 >= Static266.anInt5101 * 128 - 1536 || arg1.anInt5773 >= Static339.anInt6352 * 128 - 1536)) {
			arg1.anInt5329 = 0;
			arg1.anInt5291 = 0;
			arg1.anInt5269 = -1;
			arg1.anInt5312 = -1;
			arg1.anInt5769 = arg1.anIntArray402[0] * 128 + arg1.method4646() * 64;
			arg1.anInt5773 = arg1.anIntArray401[0] * 128 + arg1.method4646() * 64;
			arg1.method4654();
		}
		@Pc(205) int local205 = Static44.method3564(arg1);
		Static228.method3921(local205, local15, arg1, local17);
		Static336.method4721(arg1);
	}
}
