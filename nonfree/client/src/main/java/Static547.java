import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_132 = new Class289(51, 6);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)I")
	public static int method7772(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(25) double local25 = local17 + (local10 - local17) * Math.random();
		return (int) (Math.pow(2.0D, local25) + 0.5D);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method7777(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static560.anInt1380 = 2;
		Static595.anInt9707 = arg2;
		Static539.method7683(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILjava/lang/String;)Lclient!wo;")
	public static Class31 method7790(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class31 local8;
		try {
			local8 = (Class31) Class.forName("Class31_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class31_Sub2();
		}
		local8.anInt10371 = arg0;
		local8.aString142 = arg1;
		return local8;
	}
}
