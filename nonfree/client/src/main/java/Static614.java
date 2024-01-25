import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	public static int anInt9988;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!fs;")
	public static final Class117 aClass117_10 = new Class117(64);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public static void method8356(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class11_Sub2 local7 = new Class11_Sub2();
		local7.anInt1062 = arg4;
		local7.aString11 = arg0;
		local7.anInt1054 = arg5;
		local7.anInt1057 = Static325.anInt5888 + arg2;
		local7.anInt1056 = arg6;
		local7.anInt1060 = arg1;
		local7.anInt1058 = arg3;
		Static18.aClass143_1.method3529(local7);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLclient!eq;IIIII)V")
	public static void method8357(@OriginalArg(1) Class97 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= 0) {
			Static556.method7705(arg1, arg0, arg3);
			return;
		}
		Static189.aClass2_Sub2_Sub1_1 = null;
		Static192.aClass97_53 = arg0;
		Static158.anInt3597 = 1;
		Static14.anInt259 = 0;
		Static493.aBoolean629 = false;
		Static629.anInt10135 = arg1;
		Static119.anInt2867 = arg3;
		Static43.anInt969 = Static489.aClass2_Sub2_Sub1_4.method179() / arg2;
		if (Static43.anInt969 < 1) {
			Static43.anInt969 = 1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!eq;I)Lclient!ww;")
	public static Class379 method8359(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(21) byte[] local21 = arg1.method2545(0, arg0);
		return local21 == null ? null : new Class379(local21);
	}
}
