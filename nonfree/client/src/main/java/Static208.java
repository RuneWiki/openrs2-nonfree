import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!gd;")
	public static Interface2 anInterface2_8;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Lclient!uo;")
	public static Class32 aClass32_11;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!wo;")
	public static Class216 aClass216_69;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_5 = new Class92(64);

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	public static int anInt4377 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)Lclient!pm;")
	public static Class164 method3948(@OriginalArg(0) int arg0) {
		@Pc(13) Class87 local13 = Static248.aClass87_43;
		@Pc(22) Class164 local22;
		synchronized (Static248.aClass87_43) {
			local22 = (Class164) Static248.aClass87_43.method2482((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(38) byte[] local38 = Static309.aClass216_92.method5648(16, arg0);
		local22 = new Class164();
		if (local38 != null) {
			local22.method4375(new Class1_Sub8(local38));
		}
		@Pc(53) Class87 local53 = Static248.aClass87_43;
		synchronized (Static248.aClass87_43) {
			Static248.aClass87_43.method2481(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub41 local7 = new Class1_Sub41();
		local7.anInt6659 = arg6;
		local7.anInt6654 = arg4;
		local7.anInt6660 = arg3;
		local7.anInt6651 = arg9;
		local7.anInt6657 = arg7;
		local7.anInt6664 = arg0;
		local7.anInt6662 = arg8;
		local7.anInt6652 = arg10;
		local7.anInt6663 = arg5;
		local7.anInt6661 = arg2;
		local7.anInt6653 = arg1;
		local7.anInt6666 = arg11;
		Static327.aClass16_39.method416(local7);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	public static void method3953(@OriginalArg(0) int arg0) {
		if (Static33.anInt1108 == 0) {
			Static37.aClass1_Sub1_Sub1_1.method43(arg0);
		} else {
			Static188.anInt4068 = arg0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	public static void method3954(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub4_Sub9 local12 = Static139.method4227(arg0, 4);
		local12.method1868();
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public static void method3955() {
		Static264.anInt6559 = Static195.aClass63_5.anInt1998 + Static195.aClass63_5.anInt1997 + 2;
		Static176.anInt3800 = Static90.aClass63_3.anInt1997 + Static90.aClass63_3.anInt1998 + 2;
		Static263.aStringArray56 = new String[500];
		for (@Pc(27) int local27 = 0; local27 < Static263.aStringArray56.length; local27++) {
			Static263.aStringArray56[local27] = "";
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZ)V")
	public static void method3956(@OriginalArg(1) boolean arg0) {
		if (Static129.aBoolean270 != arg0) {
			Static129.aBoolean270 = arg0;
			Static252.method4573();
		}
	}
}
