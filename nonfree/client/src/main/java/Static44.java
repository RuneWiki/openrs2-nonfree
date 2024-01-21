import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!j", name = "N", descriptor = "I")
	public static int anInt1232 = 0;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "Lclient!va;")
	private static Class61 aClass61_517 = Static88.method1421("yellow:");

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Lclient!va;")
	public static Class61 aClass61_513 = aClass61_517;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "Lclient!va;")
	public static Class61 aClass61_514 = Static88.method1421("(U1");

	@OriginalMember(owner = "client!j", name = "W", descriptor = "Lclient!va;")
	public static Class61 aClass61_515 = Static88.method1421("@cr2@");

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "Lclient!va;")
	private static Class61 aClass61_518 = Static88.method1421("purple:");

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Lclient!va;")
	public static Class61 aClass61_516 = aClass61_518;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public static int anInt1242 = 0;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method704() {
		for (@Pc(15) Class10_Sub3 local15 = (Class10_Sub3) Static56.aClass9_6.method72(); local15 != null; local15 = (Class10_Sub3) Static56.aClass9_6.method81()) {
			if (local15.anInt725 == -1) {
				local15.anInt729 = 0;
				Static19.method412(local15);
			} else {
				local15.method1654();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	public static void method706() {
		aClass61_517 = null;
		aClass61_515 = null;
		aClass61_518 = null;
		aClass61_513 = null;
		aClass61_514 = null;
		aClass61_516 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Lclient!va;III)Lclient!va;")
	public static Class61 method707(@OriginalArg(0) Class61[] arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[local9] == null) {
				arg0[local9] = Static50.aClass61_573;
			}
			local7 += arg0[local9].anInt2559;
		}
		@Pc(48) int local48 = 0;
		@Pc(51) byte[] local51 = new byte[local7];
		@Pc(61) Class61 local61;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			local61 = arg0[local53];
			Static110.method560(local61.aByteArray18, 0, local51, local48, local61.anInt2559);
			local48 += local61.anInt2559;
		}
		local61 = new Class61();
		local61.anInt2559 = local7;
		local61.aByteArray18 = local51;
		return local61;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method712(@OriginalArg(0) Class11 arg0) {
		Static79.aClass11_51 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZIZI)Lclient!be;")
	public static Class11_Sub1 method713(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) Class38 local10 = null;
		if (Static58.aClass53_2 != null) {
			local10 = new Class38(arg2, Static58.aClass53_2, Static29.aClass53Array1[arg2], 1000000);
		}
		return new Class11_Sub1(local10, Static95.aClass38_4, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(JI)V")
	public static void method715(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public static void method716() {
		if (!Static71.aBoolean89) {
			return;
		}
		Static67.aClass15_27 = null;
		Static43.anIntArray134 = null;
		Static33.aClass10_Sub1_Sub1_Sub1_22 = null;
		Static25.anIntArray83 = null;
		Static30.aClass10_Sub1_Sub1_Sub2_7 = null;
		Static61.anIntArray184 = null;
		Static67.aClass15_26 = null;
		Static53.aClass15_23 = null;
		Static64.aClass10_Sub1_Sub1_Sub2_19 = null;
		Static50.anIntArray153 = null;
		Static33.aClass15_18 = null;
		Static16.aClass10_Sub1_Sub1_Sub1_7 = null;
		Static57.aClass15_24 = null;
		Static106.anIntArray342 = null;
		Static41.anIntArray129 = null;
		Static5.aClass15_1 = null;
		Static10.aClass15_8 = null;
		Static48.anIntArray144 = null;
		Static39.aClass15_6 = null;
		Static63.anIntArray58 = null;
		Static36.aClass10_Sub1_Sub1_Sub2Array4 = null;
		Static30.aClass15_16 = null;
		Static15.method345();
		Static65.method953(true);
		Static71.aBoolean89 = false;
	}
}
