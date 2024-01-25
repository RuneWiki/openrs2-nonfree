import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!gl;")
	public static Class2 aClass2_13;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Lclient!ld;")
	public static Class14_Sub21 aClass14_Sub21_3;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public static int anInt2492 = 0;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public static int anInt2494 = -1;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString92 = "cyan:";

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString93 = "";

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
	public static void method2412() {
		Static107.anInt2394 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static63.anInt1526; local3++) {
			@Pc(8) Class193 local8 = Static43.aClass193Array1[local3];
			@Pc(12) int local12;
			if (Static32.anIntArray50 != null) {
				for (local12 = 0; local12 < Static32.anIntArray50.length; local12++) {
					if (Static32.anIntArray50[local12] != -1000000 && (local8.anInt5834 <= Static32.anIntArray50[local12] || local8.anInt5841 <= Static32.anIntArray50[local12]) && (local8.anInt5832 <= Static22.anIntArray35[local12] || local8.anInt5830 <= Static22.anIntArray35[local12]) && (local8.anInt5832 >= Static207.anIntArray357[local12] || local8.anInt5830 >= Static207.anIntArray357[local12]) && (local8.anInt5833 <= Static96.anIntArray204[local12] || local8.anInt5849 <= Static96.anIntArray204[local12]) && (local8.anInt5833 >= Static213.anIntArray382[local12] || local8.anInt5849 >= Static213.anIntArray382[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5845 == 1) {
				local12 = local8.anInt5844 + Static312.anInt6032 - Static93.anInt2184;
				if (local12 >= 0 && local12 <= Static312.anInt6032 + Static312.anInt6032) {
					local110 = local8.anInt5829 + Static312.anInt6032 - Static18.anInt373;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5837 + Static312.anInt6032 - Static18.anInt373;
					if (local121 > Static312.anInt6032 + Static312.anInt6032) {
						local121 = Static312.anInt6032 + Static312.anInt6032;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static134.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static269.anInt5123 - local8.anInt5832;
						if (local153 > 32) {
							local8.anInt5847 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5847 = 2;
							local153 = -local153;
						}
						local8.anInt5846 = (local8.anInt5833 - Static103.anInt2312 << 8) / local153;
						local8.anInt5836 = (local8.anInt5849 - Static103.anInt2312 << 8) / local153;
						local8.anInt5828 = (local8.anInt5834 - Static107.anInt2391 << 8) / local153;
						local8.anInt5843 = (local8.anInt5841 - Static107.anInt2391 << 8) / local153;
						Static292.aClass193Array2[Static107.anInt2394++] = local8;
					}
				}
			} else if (local8.anInt5845 == 2) {
				local12 = local8.anInt5829 + Static312.anInt6032 - Static18.anInt373;
				if (local12 >= 0 && local12 <= Static312.anInt6032 + Static312.anInt6032) {
					local110 = local8.anInt5844 + Static312.anInt6032 - Static93.anInt2184;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5835 + Static312.anInt6032 - Static93.anInt2184;
					if (local121 > Static312.anInt6032 + Static312.anInt6032) {
						local121 = Static312.anInt6032 + Static312.anInt6032;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static134.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static103.anInt2312 - local8.anInt5833;
						if (local153 > 32) {
							local8.anInt5847 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5847 = 4;
							local153 = -local153;
						}
						local8.anInt5840 = (local8.anInt5832 - Static269.anInt5123 << 8) / local153;
						local8.anInt5848 = (local8.anInt5830 - Static269.anInt5123 << 8) / local153;
						local8.anInt5828 = (local8.anInt5834 - Static107.anInt2391 << 8) / local153;
						local8.anInt5843 = (local8.anInt5841 - Static107.anInt2391 << 8) / local153;
						Static292.aClass193Array2[Static107.anInt2394++] = local8;
					}
				}
			} else if (local8.anInt5845 == 4) {
				local12 = local8.anInt5834 - Static107.anInt2391;
				if (local12 > 128) {
					local110 = local8.anInt5829 + Static312.anInt6032 - Static18.anInt373;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5837 + Static312.anInt6032 - Static18.anInt373;
					if (local121 > Static312.anInt6032 + Static312.anInt6032) {
						local121 = Static312.anInt6032 + Static312.anInt6032;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt5844 + Static312.anInt6032 - Static93.anInt2184;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt5835 + Static312.anInt6032 - Static93.anInt2184;
						if (local153 > Static312.anInt6032 + Static312.anInt6032) {
							local153 = Static312.anInt6032 + Static312.anInt6032;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static134.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt5847 = 5;
							local8.anInt5840 = (local8.anInt5832 - Static269.anInt5123 << 8) / local12;
							local8.anInt5848 = (local8.anInt5830 - Static269.anInt5123 << 8) / local12;
							local8.anInt5846 = (local8.anInt5833 - Static103.anInt2312 << 8) / local12;
							local8.anInt5836 = (local8.anInt5849 - Static103.anInt2312 << 8) / local12;
							Static292.aClass193Array2[Static107.anInt2394++] = local8;
						}
					}
				}
			}
		}
	}
}
