import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "J")
	public static long aLong172 = 0L;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_112 = new Class254(76, 2);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)[Lclient!nc;")
	public static Class171[] method4754() {
		return new Class171[] { Static195.aClass171_2, Static251.aClass171_3, Static101.aClass171_1 };
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method4755(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static388.aClass109_94.anInt2631 = 1;
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) short[] local21 = new short[16];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < Static388.aClass193_3.anInt5241; local25++) {
			@Pc(32) Class206 local32 = Static388.aClass193_3.method4249(local25);
			if ((!arg0 || local32.aBoolean510) && local32.anInt6306 == -1 && local32.anInt6295 == -1 && local32.anInt6303 == 0 && local32.aString72.toLowerCase().indexOf(local18) != -1) {
				if (local23 >= 250) {
					Static295.aShortArray83 = null;
					Static255.anInt4373 = -1;
					return;
				}
				if (local21.length <= local23) {
					@Pc(83) short[] local83 = new short[local21.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local23; local85++) {
						local83[local85] = local21[local85];
					}
					local21 = local83;
				}
				local21[local23++] = (short) local25;
			}
		}
		Static255.anInt4373 = local23;
		Static295.aShortArray83 = local21;
		Static54.anInt976 = 0;
		@Pc(123) String[] local123 = new String[Static255.anInt4373];
		for (@Pc(125) int local125 = 0; local125 < Static255.anInt4373; local125++) {
			local123[local125] = Static388.aClass193_3.method4249(local21[local125]).aString72;
		}
		Static449.method5975(Static295.aShortArray83, local123);
		Static388.aClass109_94.method2329();
		Static388.aClass109_94.anInt2631 = 2;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!ak;)Ljava/lang/String;")
	public static String method4757(@OriginalArg(1) Class1_Sub3 arg0) {
		return arg0.aString4 == null || arg0.aString4.length() <= 0 ? arg0.aString3 : arg0.aString3 + Static101.aClass96_37.method1935(Static389.anInt7061) + arg0.aString4;
	}
}
