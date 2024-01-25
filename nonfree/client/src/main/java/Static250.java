import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_174 = new Class62(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZJ[II)Ljava/lang/String;")
	public static String method4356(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static364.anInterface5_1 != null) {
			@Pc(17) String local17 = Static364.anInterface5_1.method2687(arg1, arg0, arg2);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIILclient!gn;ILclient!gn;BI)V")
	public static void method4357(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class1_Sub2_Sub1 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class1_Sub2_Sub1 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method4789();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class27 local20 = (Class27) Static253.aClass41_58.method823((long) local7);
		if (local20 == null) {
			@Pc(27) Class128[] local27 = Static399.method3369(Static324.aClass83_116, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static383.aClass48_9.method2527(local27[0]);
			Static253.aClass41_58.method832((long) local7, local20);
		}
		Static119.method2127(arg3.method4792() * 64, arg6 >> 1, arg3.aByte73, arg3.anInt6798, arg1 >> 1, 0, arg3.anInt6800);
		@Pc(73) int local73 = Static128.anIntArray211[0] + arg2 - 18;
		@Pc(81) int local81 = local73 + arg0 / 4 * 18;
		@Pc(91) int local91 = Static128.anIntArray211[1] + arg4 - 16 - 54;
		@Pc(99) int local99 = local91 + arg0 % 4 * 18;
		local20.method5318(local81, local99);
		if (arg3 == arg5) {
			Static383.aClass48_9.method2484(18, local81 - 1, 18, -256, local99 - 1);
		}
		@Pc(121) Class7_Sub2 local121 = Static346.method5536();
		local121.anInt440 = local81 + 16;
		local121.anInt435 = local99;
		local121.anInt439 = local81;
		local121.anInt436 = local99 + 16;
		local121.aClass1_Sub2_Sub1_1 = arg5;
		Static346.aClass199_6.method4898(local121);
	}
}
