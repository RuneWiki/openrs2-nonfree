import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_98 = new Class98(57, 3);

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Lclient!es;")
	public static Class15_Sub3 method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_Sub3_2 == null ? null : local7.aClass15_Sub3_2;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IC)Z")
	public static boolean method5374(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static524.method7200(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static192.aCharArray2;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static432.aCharArray7;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (local54 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!e;ZLjava/awt/Canvas;)Lclient!oa;")
	public static Class90 method5376(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Canvas arg2) {
		return arg1 ? new Class90_Sub2_Sub2(arg2, arg0) : new Class90_Sub2_Sub1(arg2, arg0);
	}
}
