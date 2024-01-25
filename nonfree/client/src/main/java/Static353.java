import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array15;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
	public static int anInt6872;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!eba;)V")
	public static void method5712(@OriginalArg(1) Class4_Sub14 arg0) {
		Static86.aClass244_11.method5960(arg0);
		arg0.anInt2411 = arg0.aClass4_Sub11_Sub1_3.anInt5831;
		arg0.aClass4_Sub11_Sub1_3.anInt5831 = 0;
		Static575.anInt10052 += arg0.anInt2411;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Lclient!rh;")
	public static Class1_Sub4_Sub5 method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub4_Sub5_2;
	}
}
