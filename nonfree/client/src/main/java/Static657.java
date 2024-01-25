import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!td;")
	public static Class333 aClass333_8;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lclient!fb;")
	public static Class12_Sub2_Sub2_Sub1_Sub2 aClass12_Sub2_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_142 = new Class100(83, -1);

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "S")
	public static short aShort118 = 32767;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method9109(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg1.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(75) char local75;
			if (local19 == '\u0000') {
				local75 = arg2.charAt(local15++);
			} else {
				local75 = local19;
			}
			local17 = Static417.method8852(local62);
			local19 = Static417.method8852(local75);
			local62 = Static402.method8590(local62, arg0);
			local75 = Static402.method8590(local75, arg0);
			if (local75 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local75)) {
				local62 = Character.toLowerCase(local62);
				local75 = Character.toLowerCase(local75);
				if (local62 != local75) {
					return Static58.method1207(local62, arg0) - Static58.method1207(local75, arg0);
				}
			}
		}
		@Pc(142) int local142 = Math.min(local8, local11);
		for (@Pc(149) int local149 = 0; local149 < local142; local149++) {
			if (arg0 == 2) {
				local15 = local11 - local149 - 1;
				local13 = local8 - local149 - 1;
			} else {
				local15 = local149;
				local13 = local149;
			}
			@Pc(177) char local177 = arg1.charAt(local13);
			@Pc(181) char local181 = arg2.charAt(local15);
			if (local177 != local181 && Character.toUpperCase(local177) != Character.toUpperCase(local181)) {
				local177 = Character.toLowerCase(local177);
				local181 = Character.toLowerCase(local181);
				if (local177 != local181) {
					return Static58.method1207(local177, arg0) - Static58.method1207(local181, arg0);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(231) int local231 = 0; local231 < local142; local231++) {
			@Pc(237) char local237 = arg1.charAt(local231);
			@Pc(241) char local241 = arg2.charAt(local231);
			if (local241 != local237) {
				return Static58.method1207(local237, arg0) - Static58.method1207(local241, arg0);
			}
		}
		return 0;
	}
}
