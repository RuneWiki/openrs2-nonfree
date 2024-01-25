import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!bw;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!si;)Lclient!he;")
	public static Class104_Sub1 method142(@OriginalArg(1) Class2_Sub23 arg0) {
		return new Class104_Sub1(arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5485(), arg0.method5495());
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method143(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 3);
		local13.method4547();
		local13.aString52 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!mg;B)V")
	public static void method144(@OriginalArg(0) Class160 arg0) {
		Static353.anInt5979 = arg0.method3704("titlebg");
		Static367.anInt6303 = arg0.method3704("logo");
	}
}
