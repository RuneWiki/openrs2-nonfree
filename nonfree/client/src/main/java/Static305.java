import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_265 = new Class12(5, 6);

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_266 = new Class12(93, -1);

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public static int anInt5156 = 0;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public static int anInt5157 = 0;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I")
	public static int method4198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static134.anIntArray179[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4200(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local16 < local19 && Static9.method179(arg0.charAt(local16))) {
			local16++;
		}
		while (local16 < local19 && Static9.method179(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local16;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local54);
		for (@Pc(69) int local69 = local16; local69 < local19; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static432.method5811(local75)) {
				@Pc(83) char local83 = Static385.method5366(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}
}
