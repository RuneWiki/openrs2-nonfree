import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public static int anInt4566;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method3778() {
		if (!Static644.aBoolean742) {
			Static644.aBoolean742 = true;
			Static456.aFloat185 += (12.0F - Static456.aFloat185) / 2.0F;
			Static137.aBoolean207 = true;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(JIZLjava/lang/String;ZIZIJIBLjava/lang/String;I)V")
	public static void method3780(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11) {
		if (!Static505.aBoolean629 && Static313.anInt9044 < 500) {
			@Pc(23) int local23 = arg5 == -1 ? Static416.anInt7542 : arg5;
			@Pc(39) Class14_Sub3_Sub11 local39 = new Class14_Sub3_Sub11(arg10, arg3, local23, arg11, arg1, arg0, arg7, arg9, arg2, arg4, arg8, arg6);
			Static667.method9240(local39);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	public static void method3781() {
		Static388.aClass264_44.method6360();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3782(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(37) int local37 = arg0.indexOf(" ", "directlogin ".length());
			if (local37 >= 0) {
				@Pc(45) int local45 = arg0.length();
				arg0 = arg0.substring(0, local37) + " ";
				for (@Pc(61) int local61 = local37 + 1; local61 < local45; local61++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
