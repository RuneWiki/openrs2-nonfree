import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!hd;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "Lclient!ik;")
	public static Class70 aClass70_9 = new Class70(32);

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	public static int anInt3450 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!in;Z)V")
	public static void method2779(@OriginalArg(0) Class71 arg0) {
		if (Static207.anInt4872 == arg0.anInt2724) {
			Static272.aBooleanArray50[arg0.anInt2667] = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ao;Lclient!ik;)Lclient!tk;")
	public static Class1_Sub32 method2780(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(27) long local27 = (long) (arg0.anInt257 + (arg0.anInt264 + 1 << 16)) + ((long) arg0.anInt266 << 32) + ((long) arg0.anInt255 << 56);
		@Pc(39) Class1_Sub32 local39 = (Class1_Sub32) arg1.method2075(local27);
		if (local39 == null) {
			local39 = new Class1_Sub32(arg0.anInt264, (float) arg0.anInt257, true, false, arg0.anInt266);
			arg1.method2084(local27, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!in;BI)Ljava/lang/String;")
	public static String method2781(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1) {
		if (!Static36.method769(arg0).method1366(arg1) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray33 == null || arg0.aStringArray33.length <= arg1 || arg0.aStringArray33[arg1] == null || arg0.aStringArray33[arg1].trim().length() == 0) {
			return Static178.aBoolean303 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray33[arg1];
		}
	}
}
