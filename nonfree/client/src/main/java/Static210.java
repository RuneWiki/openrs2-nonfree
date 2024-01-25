import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "Lclient!ik;")
	public static Class182 aClass182_56;

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "Lclient!ik;")
	public static Class182 aClass182_57;

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_34 = new Class144(7, 7);

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_5 = new Class78("", 15);

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "I")
	public static final int anInt3464 = 1406;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!we;ILclient!ha;)I")
	public static int method3148(@OriginalArg(0) Class400 arg0, @OriginalArg(2) Class22 arg1) {
		if (arg0.anInt11051 != -1) {
			return arg0.anInt11051;
		}
		if (arg0.anInt11052 != -1) {
			@Pc(20) Class406 local20 = arg1.anInterface4_14.method5761(arg0.anInt11052);
			if (!local20.aBoolean761) {
				return local20.aShort127;
			}
		}
		return arg0.anInt11057;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method3149(@OriginalArg(1) String arg0) {
		@Pc(17) int local17 = arg0.length();
		@Pc(19) long local19 = 0L;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			local19 = (local19 << 5) + (long) arg0.charAt(local21) - local19;
		}
		return local19;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IZ)V")
	public static void method3150(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub7_Sub21 local19 = Static136.method2378((long) arg0, 16);
		local19.method9260();
	}
}
