import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString58 = "";

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_24 = new Class66(8);

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!qda;")
	public static final Class300 aClass300_2 = new Class300(128);

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_113 = new Class151(67, -2);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4560(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = arg0.charAt(local20) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII)Lclient!bt;")
	public static Class34 method4562(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class343 local5 = null;
		if (Static15.aClass252_2 != null) {
			local5 = new Class343(arg2, Static15.aClass252_2, Static73.aClass252Array1[arg2], 1000000);
		}
		Static558.aClass89_Sub1Array2[arg2] = Static560.aClass183_1.method4104(local5, Static403.aClass343_7, arg2);
		Static558.aClass89_Sub1Array2[arg2].method2241();
		return new Class34(Static558.aClass89_Sub1Array2[arg2], arg0, arg1);
	}
}
