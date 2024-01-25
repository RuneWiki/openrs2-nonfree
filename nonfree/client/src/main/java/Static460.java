import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public static int anInt8490;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array12;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public static int anInt8492 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([SB)[S")
	public static short[] method7135(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static589.method5378(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class5_Sub3 local7 = new Class5_Sub3();
		local7.anInt4931 = arg5;
		local7.anInt4939 = Static508.anInt8998 + arg6;
		local7.anInt4936 = arg3;
		local7.anInt4937 = arg0;
		local7.anInt4932 = arg4;
		local7.aString57 = arg2;
		local7.anInt4938 = arg1;
		Static58.aClass267_2.method6538(local7);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
	public static void method7137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub4_Sub6 local13 = Static68.method1408(1, arg0);
		local13.method3826();
		local13.anInt4403 = arg1;
	}
}
