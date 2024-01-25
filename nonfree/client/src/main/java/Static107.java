import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "Lclient!vn;")
	public static Class352 aClass352_2;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lclient!qt;")
	public static Class277 aClass277_2;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "[S")
	public static short[] aShortArray219 = new short[256];

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_209 = new Class272(74, 3);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5736(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg1 ? Static459.aClass290_1.anInt7526 : Static459.aClass290_1.anInt7520);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class3_Sub3_Sub17 local39 = Static459.aClass290_1.method6377(local32);
			if (local39.aBoolean701 && local39.method7463().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static586.anInt9337 = -1;
					Static251.aShortArray108 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static251.aShortArray108 = local11;
		Static71.anInt1939 = 0;
		Static586.anInt9337 = local13;
		@Pc(107) String[] local107 = new String[Static586.anInt9337];
		for (@Pc(109) int local109 = 0; local109 < Static586.anInt9337; local109++) {
			local107[local109] = Static459.aClass290_1.method6377(local11[local109]).method7463();
		}
		Static59.method4459(local107, Static251.aShortArray108);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Z")
	public static boolean method5738(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	public static void method5739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static87.method1968(arg0)) {
			Static326.method5065(Static59.aClass203ArrayArray3[arg0], arg1);
		}
	}
}
