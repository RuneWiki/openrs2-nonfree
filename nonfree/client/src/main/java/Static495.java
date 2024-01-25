import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!gda;")
	public static Class126 aClass126_12;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Lclient!nu;")
	public static Class74 method297() {
		try {
			return (Class74) Class.forName("dc").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method299(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static303.method8177(-1, arg1, -1, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIIIIII)V")
	public static void method300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class5_Sub50 local7 = null;
		for (@Pc(12) Class5_Sub50 local12 = (Class5_Sub50) Static631.aClass20_71.method378(); local12 != null; local12 = (Class5_Sub50) Static631.aClass20_71.method366()) {
			if (arg3 == local12.anInt8725 && local12.anInt8721 == arg4 && local12.anInt8723 == arg1 && local12.anInt8717 == arg0) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub50();
			local7.anInt8723 = arg1;
			local7.anInt8717 = arg0;
			local7.anInt8721 = arg4;
			local7.anInt8725 = arg3;
			if (arg4 >= 0 && arg1 >= 0 && Static271.anInt4910 > arg4 && arg1 < Static613.anInt9909) {
				Static132.method1957(local7);
			}
			Static631.aClass20_71.method370(local7);
		}
		local7.aBoolean575 = false;
		local7.anInt8727 = arg2;
		local7.anInt8729 = arg5;
		local7.aBoolean576 = true;
		local7.anInt8724 = arg6;
	}
}
