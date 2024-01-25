import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method2607(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg2); local14 != -1; local14 = arg0.indexOf(arg2, arg1.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg1 + arg0.substring(local14 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V")
	public static void method2611() {
		for (@Pc(6) Class4_Sub44 local6 = (Class4_Sub44) Static177.aClass258_26.method5538(); local6 != null; local6 = (Class4_Sub44) Static177.aClass258_26.method5528()) {
			if (local6.aBoolean487) {
				local6.method5665();
			}
		}
		for (@Pc(35) Class4_Sub44 local35 = (Class4_Sub44) Static208.aClass258_31.method5538(); local35 != null; local35 = (Class4_Sub44) Static208.aClass258_31.method5528()) {
			if (local35.aBoolean487) {
				local35.method5665();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	public static void method2616(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 3);
		local8.method2761();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ[B)[B")
	public static byte[] method2617(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static457.method1215(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
