import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_89 = new Class130(25, -1);

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_83 = new Class200(13, 10);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!sb;")
	public static RuntimeException_Sub1 method5226(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString99 = local9.aString99 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Z)V")
	public static void method5228(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class3_Sub14 local6 = Static91.method2068();
		local6.aClass3_Sub3_Sub2_2.method4220(Static624.aClass136_9.anInt4034);
		local6.aClass3_Sub3_Sub2_2.method4201(0);
		@Pc(21) int local21 = local6.aClass3_Sub3_Sub2_2.anInt4736;
		local6.aClass3_Sub3_Sub2_2.method4201(630);
		@Pc(30) int[] local30 = Static584.method8243(local6);
		@Pc(34) int local34 = local6.aClass3_Sub3_Sub2_2.anInt4736;
		local6.aClass3_Sub3_Sub2_2.method4241(arg0);
		local6.aClass3_Sub3_Sub2_2.method4201(Static58.anInt1583);
		local6.aClass3_Sub3_Sub2_2.method4241(arg2);
		local6.aClass3_Sub3_Sub2_2.method4251(Static151.aLong77);
		local6.aClass3_Sub3_Sub2_2.method4220(Static325.anInt6083);
		local6.aClass3_Sub3_Sub2_2.method4220(Static212.aClass222_2.anInt6790);
		Static21.method970(local6.aClass3_Sub3_Sub2_2);
		@Pc(71) String local71 = Static279.aString58;
		local6.aClass3_Sub3_Sub2_2.method4220(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass3_Sub3_Sub2_2.method4241(local71);
		}
		local6.aClass3_Sub3_Sub2_2.method4220(arg1);
		local6.aClass3_Sub3_Sub2_2.method4220(arg3 ? 1 : 0);
		local6.aClass3_Sub3_Sub2_2.anInt4736 += 7;
		local6.aClass3_Sub3_Sub2_2.method4200(local30, local6.aClass3_Sub3_Sub2_2.anInt4736, local34);
		local6.aClass3_Sub3_Sub2_2.method4208(local6.aClass3_Sub3_Sub2_2.anInt4736 - local21);
		Static562.method8096(local6);
		Static562.anInt9393 = 0;
		Static78.anInt1910 = -3;
		Static583.anInt9562 = 0;
		Static40.anInt1258 = 1;
		if (arg1 < 13) {
			Static141.aBoolean184 = true;
			Static456.method6999();
		}
	}
}
