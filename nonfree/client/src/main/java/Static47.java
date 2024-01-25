import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!rf;")
	public static final Class214 aClass214_1 = new Class214();

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_16 = new Class2(13, -1);

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_7 = new Class126(4);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public static void method610() {
		Static268.aClass126_37.method2827();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class26_Sub1 method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub1_1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!gk;Ljava/lang/String;I)I")
	public static int method615(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt4989;
		@Pc(10) byte[] local10 = Static135.method3962(arg1);
		arg0.method3973(local10.length);
		arg0.anInt4989 += Static219.aClass112_1.method2392(0, local10.length, arg0.aByteArray75, local10, arg0.anInt4989);
		return arg0.anInt4989 - local6;
	}
}
