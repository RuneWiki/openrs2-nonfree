import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
	public static void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 != null) {
			Static324.method4715(local7.aClass12_Sub2_Sub2_1);
			if (local7.aClass12_Sub2_Sub2_1 != null) {
				local7.aClass12_Sub2_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!lba;")
	public static RuntimeException_Sub1 method2637(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString60 = local9.aString60 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
