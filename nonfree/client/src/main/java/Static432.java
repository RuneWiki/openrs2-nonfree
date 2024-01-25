import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_130 = new Class186(8, 3);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5871(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(21) int local21 = 0;
		@Pc(27) int local27 = arg0 ? 32768 : 0;
		@Pc(37) int local37 = local27 + (arg0 ? Static327.aClass129_2.anInt3245 : Static327.aClass129_2.anInt3251);
		for (@Pc(39) int local39 = local27; local39 < local37; local39++) {
			@Pc(46) Class6_Sub1_Sub6 local46 = Static327.aClass129_2.method2908(local39);
			if (local46.aBoolean132 && local46.method1435().toLowerCase().indexOf(local16) != -1) {
				if (local21 >= 50) {
					Static251.anInt4261 = -1;
					Static73.aShortArray27 = null;
					return;
				}
				if (local21 >= local19.length) {
					@Pc(79) short[] local79 = new short[local19.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local21; local81++) {
						local79[local81] = local19[local81];
					}
					local19 = local79;
				}
				local19[local21++] = (short) local39;
			}
		}
		Static28.anInt442 = 0;
		Static251.anInt4261 = local21;
		Static73.aShortArray27 = local19;
		@Pc(118) String[] local118 = new String[Static251.anInt4261];
		for (@Pc(120) int local120 = 0; local120 < Static251.anInt4261; local120++) {
			local118[local120] = Static327.aClass129_2.method2908(local19[local120]).method1435();
		}
		Static152.method5504(Static73.aShortArray27, local118);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(CI)Z")
	public static boolean method5872(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Lclient!qi;")
	public static Class207 method5874(@OriginalArg(1) int arg0) {
		@Pc(8) Class207[] local8 = Static57.method1075();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class207 local16 = local8[local10];
			if (local16.anInt5542 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
