import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!ta;")
	public static Class4_Sub12_Sub4 aClass4_Sub12_Sub4_1;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "Lclient!v;")
	private static Class76 aClass76_120 = Static134.method2017("flash3:");

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_116 = aClass76_120;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_117 = Static134.method2017(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_118 = Static134.method2017("::errortest");

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Lclient!v;")
	public static Class76 aClass76_119 = aClass76_120;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Lclient!v;")
	private static Class76 aClass76_124 = Static134.method2017("level)2");

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_121 = aClass76_124;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "Lclient!v;")
	private static Class76 aClass76_123 = Static134.method2017(" has logged out)3");

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_122 = aClass76_123;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	public static int anInt244 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILclient!la;Lclient!la;I)Lclient!wb;")
	public static Class4_Sub4_Sub17 method172(@OriginalArg(2) Class17 arg0, @OriginalArg(3) Class17 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method282(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method281(arg2, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(54) byte[] local54 = arg1.method281(local44, 0);
				if (local54 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class4_Sub4_Sub17(arg0, arg1, arg2, false);
		} catch (@Pc(84) Exception local84) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method173() {
		aClass76_117 = null;
		aClass76_124 = null;
		aClass76_122 = null;
		aClass76_121 = null;
		aClass76_116 = null;
		aClass76_119 = null;
		aClass4_Sub12_Sub4_1 = null;
		aClass76_118 = null;
		aClass76_120 = null;
		aClass76_123 = null;
	}
}
