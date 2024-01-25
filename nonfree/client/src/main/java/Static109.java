import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt1672;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!du;")
	public static final Class62 aClass62_12 = new Class62(1, 3);

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lclient!ib;")
	public static final Class82_Sub1[] aClass82_Sub1Array1 = new Class82_Sub1[30];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZILjava/lang/String;II)V")
	public static void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class111_Sub5 local7 = new Class111_Sub5();
		local7.anInt4564 = arg3;
		local7.aString44 = arg4;
		local7.anInt4558 = arg1;
		local7.anInt4557 = arg0;
		local7.anInt4560 = arg5;
		local7.anInt4561 = Static98.anInt1304 + arg2;
		local7.anInt4563 = arg6;
		Static349.aClass63_7.method1024(local7);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method1377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg2, 8);
		local8.method384();
		local8.anInt381 = arg0;
		local8.anInt384 = arg1;
		local8.anInt387 = arg3;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg0;
			arg0 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg5;
		} else if (local16 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local16 == 2) {
			return 7 + 1 - arg5 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)[Lclient!mg;")
	public static Class156[] method1379() {
		return new Class156[] { Static405.aClass156_4, Static144.aClass156_5, Static50.aClass156_1 };
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BCI)I")
	public static int method1381(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
