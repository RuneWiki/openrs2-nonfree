import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_196 = new Class215(73, 3);

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_197 = new Class215(102, 3);

	@OriginalMember(owner = "client!qu", name = "O", descriptor = "[I")
	public static int[] anIntArray564 = new int[2];

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "([Lclient!at;II)V")
	public static void method7442(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class24 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt480 == 0) {
					if (local13.aClass24Array1 != null) {
						method7442(local13.aClass24Array1, arg1);
					}
					@Pc(37) Class2_Sub48 local37 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13.anInt510);
					if (local37 != null) {
						Static26.method659(local37.anInt10125, arg1);
					}
				}
				@Pc(56) Class2_Sub44 local56;
				if (arg1 == 0 && local13.anObjectArray30 != null) {
					local56 = new Class2_Sub44();
					local56.aClass24_15 = local13;
					local56.anObjectArray32 = local13.anObjectArray30;
					Static284.method5153(local56);
				}
				if (arg1 == 1 && local13.anObjectArray8 != null) {
					if (local13.anInt439 >= 0) {
						@Pc(79) Class24 local79 = Static87.method8101(local13.anInt510);
						if (local79 == null || local79.aClass24Array1 == null || local79.aClass24Array1.length <= local13.anInt439 || local13 != local79.aClass24Array1[local13.anInt439]) {
							continue;
						}
					}
					local56 = new Class2_Sub44();
					local56.aClass24_15 = local13;
					local56.anObjectArray32 = local13.anObjectArray8;
					Static284.method5153(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7443(@OriginalArg(1) String arg0) {
		return Static173.method3639(bc.class, arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)Z")
	public static boolean method7445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static518.method7861(arg0, arg1) | (arg1 & 0x800) != 0 || Static586.method8661(arg1, arg0);
	}
}
