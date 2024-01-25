import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(JIIZIIILjava/lang/String;IZLjava/lang/String;)V")
	public static void method5938(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		if (!Static49.aBoolean36 && Static339.anInt6583 < 500) {
			@Pc(16) int local16 = arg4 == -1 ? Static180.anInt3622 : arg4;
			@Pc(30) Class4_Sub39 local30 = new Class4_Sub39(arg6, arg9, local16, arg1, arg3, arg0, arg7, arg5, arg8, arg2);
			Static40.aClass244_4.method5960(local30);
			Static339.anInt6583++;
		}
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V")
	public static void method5939() {
		for (@Pc(25) Class4_Sub5_Sub18 local25 = (Class4_Sub5_Sub18) Static584.aClass244_62.method5963(); local25 != null; local25 = (Class4_Sub5_Sub18) Static584.aClass244_62.method5965()) {
			@Pc(30) Class1_Sub4_Sub2_Sub5 local30 = local25.aClass1_Sub4_Sub2_Sub5_1;
			if (local30.aBoolean700) {
				local25.method8379();
				local30.method8137();
			} else if (local30.anInt9954 <= Static106.anInt2418) {
				local30.method8141(Static356.anInt6930);
				if (local30.aBoolean700) {
					local25.method8379();
				} else {
					Static101.method2202(local30, true);
				}
			}
		}
	}
}
