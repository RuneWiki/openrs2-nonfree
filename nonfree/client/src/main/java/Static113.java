import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	public static int anInt2235;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lclient!iga;")
	public static Class6_Sub24 method2131() {
		if (Static627.aClass340_57 == null || Static678.aClass167_1 == null) {
			return null;
		}
		for (@Pc(28) Class6_Sub24 local28 = (Class6_Sub24) Static678.aClass167_1.method4236(); local28 != null; local28 = (Class6_Sub24) Static678.aClass167_1.method4236()) {
			@Pc(36) Class361 local36 = Static627.aClass190_5.method4695(local28.anInt4787);
			if (local36 != null && local36.aBoolean724 && local36.method8534(Static627.anInterface10_2)) {
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!im;")
	public static RuntimeException_Sub1 method2132(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString52 = local9.aString52 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
