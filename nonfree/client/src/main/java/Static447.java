import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public static int anInt7217;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_76 = new Class240(73, -1);

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_22 = new Class177(13, 8);

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	public static int anInt7216 = 0;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Z")
	public static final boolean aBoolean514 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJI)Lclient!wga;")
	public static Class3_Sub5_Sub20 method6065(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub5_Sub20 local14 = (Class3_Sub5_Sub20) Static50.aClass333_8.method7489(arg0 | (long) arg1 << 56);
		if (local14 == null) {
			local14 = new Class3_Sub5_Sub20(arg1, arg0);
			Static50.aClass333_8.method7488(local14.aLong313, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public static void method6066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = method6065((long) arg1, 1);
		local9.method8832();
		local9.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6067(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static364.method5248(Static395.method5500(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
