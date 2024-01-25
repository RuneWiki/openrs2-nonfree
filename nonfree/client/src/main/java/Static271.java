import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!ri;")
	public static Class284 aClass284_81;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "J")
	public static long aLong128;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z")
	public static boolean method4110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lclient!cw;")
	public static Class3_Sub10 method4111() {
		@Pc(6) Class3_Sub10 local6 = Static551.method7561();
		local6.anInt2131 = 0;
		local6.aClass287_31 = null;
		local6.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)I")
	public static int method4112() {
		return 46;
	}
}
