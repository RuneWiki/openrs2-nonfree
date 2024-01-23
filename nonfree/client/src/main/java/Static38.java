import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!cg;")
	public static Class22 aClass22_16;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "[S")
	public static short[] aShortArray16 = new short[256];

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt738 = 1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method716() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static48.aBooleanArray14[local7] = true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method717() {
		@Pc(5) String local5 = "www";
		if (Static74.anInt1511 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(18) String local18 = "";
		if (Static147.aString99 != null) {
			local18 = "/p=" + Static147.aString99;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static187.anInt3840 + "/a=" + Static212.anInt4120 + local18 + "/";
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILclient!cg;Lclient!cg;I)Lclient!wl;")
	public static Class4_Sub2_Sub23 method718(@OriginalArg(2) Class22 arg0, @OriginalArg(3) Class22 arg1, @OriginalArg(4) int arg2) {
		@Pc(8) boolean local8 = true;
		@Pc(17) int[] local17 = arg0.method654(arg2);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(31) byte[] local31 = arg0.method666(local17[local19], arg2);
			if (local31 == null) {
				local8 = false;
			} else {
				@Pc(53) int local53 = (local31[0] & 0xFF) << 8 | local31[1] & 0xFF;
				@Pc(61) byte[] local61 = arg1.method666(0, local53);
				if (local61 == null) {
					local8 = false;
				}
			}
		}
		if (!local8) {
			return null;
		}
		try {
			return new Class4_Sub2_Sub23(arg0, arg1, arg2, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)I")
	public static int method720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(33) int local33 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local33;
		}
		return arg1;
	}
}
