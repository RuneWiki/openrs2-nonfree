import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!kp;")
	public static final Class165 aClass165_1 = new Class165();

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
	public static int anInt1479 = -1;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!wca;")
	public static Class310 aClass310_4 = null;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
	public static int method1455(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!cd;B)V")
	public static void method1457(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static115.anInt2326 == arg0.anInt5033 || arg0.anInt5051 == -1 || arg0.anInt5094 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class4 local30 = Static396.aClass157_2.method3745(arg0.anInt5051);
			if (local30.aBoolean9 || local30.anIntArray12[arg0.anInt5080] < arg0.anInt5037 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt5033 - arg0.anInt5068;
			@Pc(64) int local64 = Static115.anInt2326 - arg0.anInt5068;
			@Pc(75) int local75 = arg0.anInt5043 * 128 + arg0.method4394() * 64;
			@Pc(87) int local87 = arg0.anInt5056 * 128 + arg0.method4394() * 64;
			@Pc(99) int local99 = arg0.anInt5046 * 128 + arg0.method4394() * 64;
			@Pc(110) int local110 = arg0.anInt5064 * 128 + arg0.method4394() * 64;
			arg0.anInt7660 = ((local58 - local64) * local75 + local64 * local99) / local58;
			arg0.anInt7659 = (local87 * (local58 - local64) + local64 * local110) / local58;
		}
		arg0.anInt5104 = 0;
		if (arg0.anInt5093 == 0) {
			arg0.method4383(8192, false);
		}
		if (arg0.anInt5093 == 1) {
			arg0.method4383(12288, false);
		}
		if (arg0.anInt5093 == 2) {
			arg0.method4383(0, false);
		}
		if (arg0.anInt5093 == 3) {
			arg0.method4383(4096, false);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIILjava/lang/String;)V")
	public static void method1459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class310 local8 = Static519.method7538(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray27 != null) {
			@Pc(18) Class2_Sub28 local18 = new Class2_Sub28();
			local18.anObjectArray2 = local8.anObjectArray27;
			local18.aClass310_8 = local8;
			local18.aString94 = arg3;
			local18.anInt3739 = arg0;
			Static258.method4037(local18);
		}
		if (Static271.anInt8654 != 9 || !Static67.method1257(local8).method6277(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static93.method1721(Static202.aClass243_45);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 2) {
			Static93.method1721(Static481.aClass243_84);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 3) {
			Static93.method1721(Static42.aClass243_8);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 4) {
			Static93.method1721(Static376.aClass243_69);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 5) {
			Static93.method1721(Static151.aClass243_35);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 6) {
			Static93.method1721(Static521.aClass243_91);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 7) {
			Static93.method1721(Static339.aClass243_65);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 8) {
			Static93.method1721(Static306.aClass243_60);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 9) {
			Static93.method1721(Static528.aClass243_92);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
		if (arg0 == 10) {
			Static93.method1721(Static73.aClass243_17);
			Static463.method7001(arg2, local8.anInt9224, arg1);
		}
	}
}
