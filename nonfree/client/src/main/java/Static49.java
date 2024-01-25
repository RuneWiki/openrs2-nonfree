import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!la;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_18 = new Class146(49, 6);

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_8 = new Class137(8);

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[6][];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method639() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static433.anInt7158 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lclient!is;")
	public static Class128 method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class128 local7 = new Class128();
		local7.anInt3169 = arg1 + 1 + 5;
		local7.anInt3180 = -1;
		local7.anInt3167 = -1;
		local7.anInt3176 = arg0 + 6;
		local7.anIntArrayArray38 = new int[local7.anInt3176][local7.anInt3169];
		local7.method2466();
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZIZ)V")
	public static void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static131.method1881(arg1)) {
			Static291.method3801(arg0, Static412.aClass110ArrayArray2[arg1], arg2, arg3, -1);
		}
	}
}
