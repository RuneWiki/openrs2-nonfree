import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "Lclient!pc;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_4 = new Class41(6, 2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILclient!wj;Lclient!wj;ZII)I")
	public static int method406(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class141_Sub1 arg1, @OriginalArg(3) Class141_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = Static215.method3632(arg2, arg1, arg0, arg4);
		if (local18 != 0) {
			return arg0 ? -local18 : local18;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static215.method3632(arg2, arg1, arg3, arg5);
			return arg3 ? -local43 : local43;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ms;BZ)V")
	public static void method409(@OriginalArg(0) Class155 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(22) int local22 = arg0.anInt4177 == 0 ? arg0.anInt4170 : arg0.anInt4177;
		@Pc(31) int local31 = arg0.anInt4176 == 0 ? arg0.anInt4214 : arg0.anInt4176;
		Static214.method3624(Static228.aClass155ArrayArray1[arg0.anInt4166 >> 16], arg0.anInt4166, arg1, local22, local31);
		if (arg0.aClass155Array2 != null) {
			Static214.method3624(arg0.aClass155Array2, arg0.anInt4166, arg1, local22, local31);
		}
		@Pc(66) Class2_Sub41 local66 = (Class2_Sub41) Static362.aClass214_32.method5059((long) arg0.anInt4166);
		if (local66 != null) {
			Static137.method2397(local22, arg1, local66.anInt6411, local31);
		}
	}
}
