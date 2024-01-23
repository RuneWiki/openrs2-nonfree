import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!rn;")
	public static Class155 aClass155_114;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!rn;")
	public static Class155 aClass155_115;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
	public static int[] anIntArray570 = new int[50];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
	public static void method4534() {
		for (@Pc(1) int local1 = 0; local1 < Static51.anInt994; local1++) {
			@Pc(8) Class85 local8 = Static104.aClass85Array1[local1];
			Static167.method2791(local8);
			Static104.aClass85Array1[local1] = null;
		}
		Static51.anInt994 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ug;I)V")
	public static void method4539(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (Static100.aClass159_3 == null) {
			return;
		}
		try {
			Static100.aClass159_3.method4243(0L);
			Static100.aClass159_3.method4239(24, arg1, arg0.aByteArray64);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method4541() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(19) int local19 = 0; local19 < Static152.anInt2876 - 1; local19++) {
				if (Static259.aShortArray87[local19] < 1000 && Static259.aShortArray87[local19 + 1] > 1000) {
					local3 = false;
					@Pc(48) String local48 = Static103.aStringArray19[local19];
					Static103.aStringArray19[local19] = Static103.aStringArray19[local19 + 1];
					Static103.aStringArray19[local19 + 1] = local48;
					@Pc(66) String local66 = Static73.aStringArray13[local19];
					Static73.aStringArray13[local19] = Static73.aStringArray13[local19 + 1];
					Static73.aStringArray13[local19 + 1] = local66;
					@Pc(84) int local84 = Static56.anIntArray99[local19];
					Static56.anIntArray99[local19] = Static56.anIntArray99[local19 + 1];
					Static56.anIntArray99[local19 + 1] = local84;
					@Pc(102) int local102 = Static196.anIntArray438[local19];
					Static196.anIntArray438[local19] = Static196.anIntArray438[local19 + 1];
					Static196.anIntArray438[local19 + 1] = local102;
					@Pc(120) int local120 = Static153.anIntArray332[local19];
					Static153.anIntArray332[local19] = Static153.anIntArray332[local19 + 1];
					Static153.anIntArray332[local19 + 1] = local120;
					@Pc(138) short local138 = Static259.aShortArray87[local19];
					Static259.aShortArray87[local19] = Static259.aShortArray87[local19 + 1];
					Static259.aShortArray87[local19 + 1] = local138;
					@Pc(156) long local156 = Static259.aLongArray12[local19];
					Static259.aLongArray12[local19] = Static259.aLongArray12[local19 + 1];
					Static259.aLongArray12[local19 + 1] = local156;
				}
			}
		}
	}
}
