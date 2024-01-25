import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!rg;")
	public static Class310 aClass310_119;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!da;")
	public static Class68 aClass68_11;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt10111;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public static int anInt10112;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!rg;")
	public static Class310 aClass310_120;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public static int anInt10114;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_257 = new Class160(10, -2);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
	public static String method8647(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(15) String local15 = arg1[arg0];
			return local15 == null ? "null" : local15.toString();
		} else {
			@Pc(29) int local29 = arg0 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg0; local33 < local29; local33++) {
				@Pc(38) String local38 = arg1[local33];
				if (local38 == null) {
					local31 += 4;
				} else {
					local31 += local38.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local31);
			for (@Pc(67) int local67 = arg0; local67 < local29; local67++) {
				@Pc(72) String local72 = arg1[local67];
				if (local72 == null) {
					local65.append("null");
				} else {
					local65.append(local72);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ha;ZIIZ)Lclient!oj;")
	public static Class272 method8648(@OriginalArg(0) Class144 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == -1) {
			return null;
		}
		if (Static421.anIntArray369 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static421.anIntArray369.length; local14++) {
				if (arg2 == Static421.anIntArray369[local14]) {
					return Static564.aClass272Array1[local14];
				}
			}
		}
		@Pc(63) Class272 local63 = (Class272) Static391.aClass317_36.method7882((long) ((arg3 ? 1 : 0) | arg2 << 1));
		if (local63 != null) {
			if (arg1 && local63.aClass350_8 == null) {
				@Pc(79) Class350 local79 = Static63.method1038(arg2, Static588.aClass310_115);
				if (local79 == null) {
					return null;
				}
				local63.aClass350_8 = local79;
			}
			return local63;
		}
		@Pc(93) Class266[] local93 = Static697.method6468(Static33.aClass310_9, arg2);
		if (local93 == null) {
			return null;
		}
		@Pc(103) Class350 local103 = Static63.method1038(arg2, Static588.aClass310_115);
		if (local103 == null) {
			return null;
		}
		if (arg1) {
			local63 = new Class272(arg0.method6958(local103, local93, arg3), local103);
		} else {
			local63 = new Class272(arg0.method6958(local103, local93, arg3));
		}
		Static391.aClass317_36.method7875((long) ((arg3 ? 1 : 0) | arg2 << 1), local63);
		return local63;
	}
}
