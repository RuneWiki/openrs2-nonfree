import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "Lclient!tv;")
	public static Class341 aClass341_4;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	public static int anInt8281;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Lclient!fb;")
	public static final Class99 aClass99_7 = new Class99();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lclient!wea;II)V")
	public static void method7248(@OriginalArg(0) Class28_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class28_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10726;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10726 < local27 + (local29 & 0x1)) {
				@Pc(44) Class28_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7248(arg0, arg1, local10 - 1);
		method7248(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
	public static void method7251() {
		for (@Pc(6) Class28_Sub10 local6 = (Class28_Sub10) Static124.aClass371_1.method8913(); local6 != null; local6 = (Class28_Sub10) Static124.aClass371_1.method8913()) {
			Static330.method5021(local6);
		}
		@Pc(34) int local34;
		@Pc(33) int local33;
		if (Static24.aClass3_Sub22_4.lb.method7116() == 1) {
			local33 = 3;
			local34 = 0;
		} else {
			local33 = Static34.anInt808;
			local34 = Static34.anInt808;
		}
		Static79.method1510();
		for (@Pc(43) int local43 = local34; local43 <= local33; local43++) {
			Static79.method1513();
			Static79.method1521(local43);
			Static79.method1515(local43);
		}
		Static79.method1520();
		Static79.method1524();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
	public static boolean method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static295.method4573(arg0, arg1)) {
			return Static311.method4740(arg0, arg1) | (arg0 & 0x9000) != 0 | Static70.method5710(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static154.method2816(arg0, arg1) | (arg0 & 0x2000) != 0 | Static81.method1583(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!wp;Lclient!pu;Lclient!wc;III)V")
	public static void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class28_Sub1_Sub1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class3_Sub8 local12 = new Class3_Sub8();
		local12.anInt964 = arg0 << 9;
		local12.anInt955 = arg1 << 9;
		local12.anInt960 = arg6;
		if (arg3 != null) {
			local12.aClass277_1 = arg3;
			@Pc(33) int local33 = arg3.anInt7764;
			@Pc(36) int local36 = arg3.anInt7765;
			if (arg5 == 1 || arg5 == 3) {
				local33 = arg3.anInt7765;
				local36 = arg3.anInt7764;
			}
			local12.anInt959 = arg3.anInt7767 << 9;
			local12.anInt963 = arg3.anInt7749;
			local12.anInt947 = arg1 + local36 << 9;
			local12.anInt953 = arg3.anInt7731 << 9;
			local12.anInt946 = arg3.anInt7740;
			local12.anInt956 = arg3.anInt7746;
			local12.anInt945 = arg3.anInt7747;
			local12.aBoolean69 = arg3.aBoolean589;
			local12.anInt954 = arg3.anInt7748;
			local12.anInt950 = arg0 + local33 << 9;
			local12.anIntArray80 = arg3.anIntArray661;
			local12.anInt949 = arg3.anInt7741;
			local12.aBoolean68 = arg3.aBoolean578;
			if (arg3.anIntArray660 != null) {
				local12.aBoolean70 = true;
				local12.method1055();
			}
			if (local12.anIntArray80 != null) {
				local12.anInt948 = (int) (Math.random() * (double) (local12.anInt949 - local12.anInt963)) + local12.anInt963;
			}
			Static134.aClass338_72.method8171(local12);
		} else if (arg2 != null) {
			local12.aClass28_Sub1_Sub1_Sub1_Sub2_2 = arg2;
			@Pc(156) Class300 local156 = arg2.aClass300_1;
			if (local156.anIntArray696 != null) {
				local12.aBoolean70 = true;
				local156 = local156.method7258(Static131.aClass66_1);
			}
			if (local156 != null) {
				local12.anInt947 = arg1 + local156.anInt8313 << 9;
				local12.anInt950 = local156.anInt8313 + arg0 << 9;
				local12.anInt945 = Static576.method8133(arg2);
				local12.anInt953 = local156.anInt8327 << 9;
				local12.anInt959 = local156.anInt8315 << 9;
				local12.anInt956 = local156.anInt8325;
				local12.anInt946 = local156.anInt8303;
				local12.anInt954 = local156.anInt8305;
				local12.aBoolean68 = local156.aBoolean633;
			}
			Static120.aClass338_66.method8171(local12);
		} else if (arg4 != null) {
			local12.aClass28_Sub1_Sub1_Sub1_Sub1_1 = arg4;
			local12.anInt950 = arg4.method9314() + arg0 << 9;
			local12.anInt947 = arg4.method9314() + arg1 << 9;
			local12.anInt945 = Static296.method4575(arg4);
			local12.anInt959 = arg4.anInt10522 << 9;
			local12.aBoolean68 = arg4.aBoolean794;
			local12.anInt954 = 256;
			local12.anInt946 = arg4.anInt10531;
			local12.anInt956 = 256;
			local12.anInt953 = 0;
			Static533.aClass83_35.method2377((long) arg4.anInt10762, local12);
		}
	}
}
