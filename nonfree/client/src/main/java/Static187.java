import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	public static int anInt3943;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[Lclient!rr;")
	public static Class58_Sub1[] aClass58_Sub1Array1;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
	public static final int[] anIntArray302 = new int[3];

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "[Lclient!ul;")
	public static final Class3_Sub7_Sub21[] aClass3_Sub7_Sub21Array5 = new Class3_Sub7_Sub21[14];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3383(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static291.aClass3_Sub4_Sub2_3.method3682(100);
		Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0) + 1);
		Static291.aClass3_Sub4_Sub2_3.method3634(arg1);
		Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3384(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static107.aClass100_45.anInt2828 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(26) int local26 = 0; local26 < Static106.anInt2240; local26++) {
			@Pc(32) Class41 local32 = Static230.method5537(local26);
			if ((!arg0 || local32.aBoolean57) && local32.anInt1228 == -1 && local32.anInt1179 == -1 && local32.anInt1200 == 0 && local32.aString36.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static128.aShortArray69 = null;
					Static154.anInt6364 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(82) short[] local82 = new short[local14.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local16; local84++) {
						local82[local84] = local14[local84];
					}
					local14 = local82;
				}
				local14[local16++] = (short) local26;
			}
		}
		Static76.anInt1471 = 0;
		Static154.anInt6364 = local16;
		Static128.aShortArray69 = local14;
		@Pc(121) String[] local121 = new String[Static154.anInt6364];
		for (@Pc(123) int local123 = 0; local123 < Static154.anInt6364; local123++) {
			local121[local123] = Static230.method5537(local14[local123]).aString36;
		}
		Static314.method5245(local121, Static128.aShortArray69);
		Static107.aClass100_45.method2295();
		Static107.aClass100_45.anInt2828 = 2;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public static void method3385(@OriginalArg(0) int arg0) {
		Static6.anInt6079 = arg0;
	}
}
