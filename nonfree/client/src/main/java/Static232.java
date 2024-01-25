import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!qg;")
	public static final Class246 aClass246_4 = new Class246();

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "J")
	public static long aLong129 = 0L;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
	public static int anInt4926 = 0;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method4121() {
		return Static228.aBoolean342 || Static495.aClass3_Sub11_4 == null ? "" : Static495.aClass3_Sub11_4.aString16;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	public static void method4125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub10_Sub16 local14 = Static362.method5701(arg1, 14);
		local14.method6211();
		local14.anInt7557 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!qf;)Lclient!qf;")
	public static Class245 method4126(@OriginalArg(1) Class245 arg0) {
		if (arg0.anInt7238 != -1) {
			return Static46.method1005(arg0.anInt7238);
		}
		@Pc(25) int local25 = arg0.anInt7256 >>> 16;
		@Pc(30) Class213 local30 = new Class213(Static156.aClass267_14);
		for (@Pc(35) Class3_Sub29 local35 = (Class3_Sub29) local30.method5504(); local35 != null; local35 = (Class3_Sub29) local30.method5505()) {
			if (local25 == local35.anInt5522) {
				return Static46.method1005((int) local35.aLong285);
			}
		}
		return null;
	}
}
