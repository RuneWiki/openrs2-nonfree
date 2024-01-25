import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!pq;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString4 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_4 = new Class198(64);

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
	public static void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class181 local8 = Static214.method3735(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray12 != null) {
			@Pc(18) Class3_Sub41 local18 = new Class3_Sub41();
			local18.aString241 = arg2;
			local18.aClass181_54 = local8;
			local18.anInt6474 = arg3;
			local18.anObjectArray34 = local8.anObjectArray12;
			Static139.method2275(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt5755 > 0) {
			local35 = Static355.method5740(local8);
		}
		if (!local35 || !Static47.method819(local8).method1145(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static291.aClass3_Sub4_Sub2_3.method3682(71);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 2) {
			Static291.aClass3_Sub4_Sub2_3.method3682(183);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 3) {
			Static291.aClass3_Sub4_Sub2_3.method3682(218);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 4) {
			Static291.aClass3_Sub4_Sub2_3.method3682(28);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 5) {
			Static291.aClass3_Sub4_Sub2_3.method3682(231);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 6) {
			Static291.aClass3_Sub4_Sub2_3.method3682(230);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 7) {
			Static291.aClass3_Sub4_Sub2_3.method3682(121);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 8) {
			Static291.aClass3_Sub4_Sub2_3.method3682(158);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 9) {
			Static291.aClass3_Sub4_Sub2_3.method3682(229);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
		if (arg3 == 10) {
			Static291.aClass3_Sub4_Sub2_3.method3682(50);
			Static291.aClass3_Sub4_Sub2_3.method3650(arg1);
			Static291.aClass3_Sub4_Sub2_3.method3660(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	public static int method168(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
