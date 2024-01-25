import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!la;")
	public static Class196 aClass196_77;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!su;")
	public static Class314 aClass314_2;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public static int anInt7186 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_104 = new Class200(92, 0);

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt7191 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method6189(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub4_Sub12 local16 = Static556.method8018(10, arg0);
		local16.method3607();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(2, arg0);
		local8.method3608();
		local8.aString51 = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
	public static boolean method6191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)Z")
	public static boolean method6193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static306.method4861(arg0, arg1) || Static603.method8432(arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([II[J)V")
	public static void method6195(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static367.method5979(arg1, arg0, arg1.length - 1, 0);
	}
}
