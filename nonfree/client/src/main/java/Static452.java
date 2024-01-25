import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!cl;")
	public static Class31_Sub2_Sub1_Sub1 aClass31_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt7261;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_59 = new Class134(8);

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public static int anInt7259 = 0;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	public static int anInt7260 = 0;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_215 = new Class107(65, 14);

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_216 = new Class107(87, -1);

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
	public static boolean aBoolean500 = false;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public static int anInt7262 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V")
	public static void method5930(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static190.anInt3416;
		@Pc(15) int local15 = Static2.anInt63;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (Static3.anInt108 != local7) {
			local23 = local7 - Static3.anInt108;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local23 > local31) {
				local31 = local23;
			}
			Static3.anInt108 += local31;
		}
		if (!Static38.aClass135_Sub1_1.aBoolean362) {
			Static201.aFloat56 += (float) arg0 * Static316.aFloat76 / 40.0F * 8.0F;
			Static142.aFloat89 += (float) arg0 * Static245.aFloat66 / 40.0F * 8.0F;
		}
		if (Static299.anInt698 != local15) {
			local23 = local15 - Static299.anInt698;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static299.anInt698 += local31;
		}
		Static363.method2948();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public static int method5932(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;II)V")
	public static void method5933(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(5) int local5 = 99; local5 > 0; local5--) {
			Static142.anIntArray514[local5] = Static142.anIntArray514[local5 - 1];
			Static55.anIntArray631[local5] = Static55.anIntArray631[local5 - 1];
			Static130.aStringArray19[local5] = Static130.aStringArray19[local5 - 1];
			Static120.aStringArray17[local5] = Static120.aStringArray17[local5 - 1];
			Static429.aStringArray43[local5] = Static429.aStringArray43[local5 - 1];
			Static79.aStringArray12[local5] = Static79.aStringArray12[local5 - 1];
			Static202.anIntArray323[local5] = Static202.anIntArray323[local5 - 1];
		}
		Static142.anIntArray514[0] = arg3;
		Static130.aStringArray19[0] = arg1;
		Static55.anIntArray631[0] = arg6;
		Static120.aStringArray17[0] = arg0;
		Static429.aStringArray43[0] = arg2;
		Static161.anInt3015++;
		Static343.anInt6982 = Static319.anInt4221;
		Static202.anIntArray323[0] = arg5;
		Static79.aStringArray12[0] = arg4;
	}
}
