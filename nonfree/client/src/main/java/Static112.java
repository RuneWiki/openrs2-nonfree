import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array5;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_85 = new Class56(63, 6);

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "F")
	public static float aFloat24 = 1.0F;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!pc;)[Lclient!tm;")
	public static Class241[] method1661(@OriginalArg(1) Class196 arg0) {
		if (!arg0.method3904()) {
			return new Class241[0];
		}
		@Pc(16) Class45 local16 = arg0.method3894();
		while (local16.anInt1129 == 0) {
			Static435.method5777(10L);
		}
		if (local16.anInt1129 == 2) {
			return new Class241[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject5;
		@Pc(44) Class241[] local44 = new Class241[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(52) Class241 local52 = new Class241();
			local44[local46] = local52;
			local52.anInt6346 = local38[local46 << 2];
			local52.anInt6344 = local38[(local46 << 2) + 1];
			local52.anInt6345 = local38[(local46 << 2) + 2];
			local52.anInt6343 = local38[(local46 << 2) + 3];
		}
		return local44;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1664(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		while (local21 > local18 && Static117.method1691(arg0.charAt(local18))) {
			local18++;
		}
		while (local21 > local18 && Static117.method1691(arg0.charAt(local21 - 1))) {
			local21--;
		}
		@Pc(56) int local56 = local21 - local18;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local56);
		for (@Pc(73) int local73 = local18; local73 < local21; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static285.method3721(local79)) {
				@Pc(87) char local87 = Static224.method3028(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}
}
