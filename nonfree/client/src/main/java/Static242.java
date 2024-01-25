import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "[I")
	public static final int[] anIntArray291 = new int[500];

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_118 = new Class12(27, 0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Z")
	public static boolean method3485(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method3486(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!za;ZIILclient!sr;)V")
	public static void method3488(@OriginalArg(0) Class34 arg0, @OriginalArg(4) Class227 arg1) {
		Static103.aClass227_8.method4981();
		if (Static104.aBoolean226) {
			return;
		}
		for (@Pc(16) Class1_Sub36 local16 = (Class1_Sub36) arg1.method4967(); local16 != null; local16 = (Class1_Sub36) arg1.method4973()) {
			@Pc(24) Class205 local24 = Static167.aClass178_2.method3963(local16.anInt5632);
			if (Static264.method3746(local24)) {
				@Pc(36) boolean local36 = Static448.method5875(local24, arg0, local16);
				if (local36) {
					Static401.method5223(local16, arg0, local24);
				}
			}
		}
	}
}
