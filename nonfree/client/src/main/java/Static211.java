import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public static int anInt4905;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "J")
	public static long aLong107;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
	public static int anInt4899 = 0;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_59 = new Class218(45, 2);

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	public static int anInt4910 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method4159(@OriginalArg(1) int[] arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer();
		@Pc(17) int local17 = Static205.anInt4770;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(28) Class21 local28 = Static552.aClass360_1.method8272(arg0[local19]);
			if (local28.anInt379 != -1) {
				@Pc(40) Class5 local40 = (Class5) Static122.aClass112_14.method3640((long) local28.anInt379);
				if (local40 == null) {
					@Pc(48) Class28 local48 = Static649.method613(Static150.aClass181_34, local28.anInt379, 0);
					if (local48 != null) {
						local40 = Static47.aClass33_3.method6161(local48, true);
						Static122.aClass112_14.method3636((long) local28.anInt379, local40);
					}
				}
				if (local40 != null) {
					Static603.aClass5Array20[local17] = local40;
					local15.append(" <img=").append(local17).append(">");
					local17++;
				}
			}
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4160(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static629.method8529(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static409.anInt6024; local32++) {
			@Pc(38) String local38 = Static573.aStringArray40[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static629.method8529(local38);
			if (local38 != null && local38.equals(local27)) {
				Static409.anInt6024--;
				for (@Pc(62) int local62 = local32; local62 < Static409.anInt6024; local62++) {
					Static573.aStringArray40[local62] = Static573.aStringArray40[local62 + 1];
					Static175.aStringArray16[local62] = Static175.aStringArray16[local62 + 1];
					Static85.anIntArray91[local62] = Static85.anIntArray91[local62 + 1];
					Static193.aStringArray18[local62] = Static193.aStringArray18[local62 + 1];
					Static76.anIntArray74[local62] = Static76.anIntArray74[local62 + 1];
					Static439.aBooleanArray16[local62] = Static439.aBooleanArray16[local62 + 1];
				}
				Static246.anInt5500 = Static244.anInt5487;
				@Pc(127) Class3_Sub26 local127 = Static640.method8636(Static248.aClass344_61, Static403.aClass294_3);
				local127.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0));
				local127.aClass3_Sub15_Sub1_3.method8417(arg0);
				Static472.method5189(local127);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z")
	public static boolean method4161() {
		return Static30.method575("jaclib") ? Static30.method575("hw3d") : false;
	}
}
