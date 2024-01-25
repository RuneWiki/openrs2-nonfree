import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sr", name = "gb", descriptor = "I")
	public static int anInt5968;

	@OriginalMember(owner = "client!sr", name = "rb", descriptor = "I")
	public static int anInt5974;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_179 = new Class119(256);

	@OriginalMember(owner = "client!sr", name = "ib", descriptor = "I")
	public static int anInt5969 = 0;

	@OriginalMember(owner = "client!sr", name = "nb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!sr", name = "vb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray56 = new String[100];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
	public static void method5202() {
		Static255.anInt5037 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static69.anInt1500; local3++) {
			@Pc(8) Class184 local8 = Static234.aClass184Array1[local3];
			@Pc(12) int local12;
			if (Static20.anIntArray28 != null) {
				for (local12 = 0; local12 < Static20.anIntArray28.length; local12++) {
					if (Static20.anIntArray28[local12] != -1000000 && (local8.anInt5831 <= Static20.anIntArray28[local12] || local8.anInt5828 <= Static20.anIntArray28[local12]) && (local8.anInt5836 <= Static296.anIntArray436[local12] || local8.anInt5835 <= Static296.anIntArray436[local12]) && (local8.anInt5836 >= Static247.anIntArray376[local12] || local8.anInt5835 >= Static247.anIntArray376[local12]) && (local8.anInt5832 <= Static203.anIntArray285[local12] || local8.anInt5829 <= Static203.anIntArray285[local12]) && (local8.anInt5832 >= Static320.anIntArray455[local12] || local8.anInt5829 >= Static320.anIntArray455[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5824 == 1) {
				local12 = local8.anInt5833 + Static206.anInt4000 - Static250.anInt4943;
				if (local12 >= 0 && local12 <= Static206.anInt4000 + Static206.anInt4000) {
					local110 = local8.anInt5830 + Static206.anInt4000 - Static230.anInt4394;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5825 + Static206.anInt4000 - Static230.anInt4394;
					if (local121 > Static206.anInt4000 + Static206.anInt4000) {
						local121 = Static206.anInt4000 + Static206.anInt4000;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static207.aBooleanArrayArray25[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static120.anInt2593 - local8.anInt5836;
						if (local153 > 32) {
							local8.anInt5834 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5834 = 2;
							local153 = -local153;
						}
						local8.anInt5841 = (local8.anInt5832 - Static79.anInt1748 << 8) / local153;
						local8.anInt5826 = (local8.anInt5829 - Static79.anInt1748 << 8) / local153;
						local8.anInt5839 = (local8.anInt5831 - Static75.anInt1604 << 8) / local153;
						local8.anInt5827 = (local8.anInt5828 - Static75.anInt1604 << 8) / local153;
						Static277.aClass184Array2[Static255.anInt5037++] = local8;
					}
				}
			} else if (local8.anInt5824 == 2) {
				local12 = local8.anInt5830 + Static206.anInt4000 - Static230.anInt4394;
				if (local12 >= 0 && local12 <= Static206.anInt4000 + Static206.anInt4000) {
					local110 = local8.anInt5833 + Static206.anInt4000 - Static250.anInt4943;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5842 + Static206.anInt4000 - Static250.anInt4943;
					if (local121 > Static206.anInt4000 + Static206.anInt4000) {
						local121 = Static206.anInt4000 + Static206.anInt4000;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static207.aBooleanArrayArray25[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static79.anInt1748 - local8.anInt5832;
						if (local153 > 32) {
							local8.anInt5834 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5834 = 4;
							local153 = -local153;
						}
						local8.anInt5840 = (local8.anInt5836 - Static120.anInt2593 << 8) / local153;
						local8.anInt5838 = (local8.anInt5835 - Static120.anInt2593 << 8) / local153;
						local8.anInt5839 = (local8.anInt5831 - Static75.anInt1604 << 8) / local153;
						local8.anInt5827 = (local8.anInt5828 - Static75.anInt1604 << 8) / local153;
						Static277.aClass184Array2[Static255.anInt5037++] = local8;
					}
				}
			} else if (local8.anInt5824 == 4) {
				local12 = local8.anInt5831 - Static75.anInt1604;
				if (local12 > 128) {
					local110 = local8.anInt5830 + Static206.anInt4000 - Static230.anInt4394;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5825 + Static206.anInt4000 - Static230.anInt4394;
					if (local121 > Static206.anInt4000 + Static206.anInt4000) {
						local121 = Static206.anInt4000 + Static206.anInt4000;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt5833 + Static206.anInt4000 - Static250.anInt4943;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt5842 + Static206.anInt4000 - Static250.anInt4943;
						if (local153 > Static206.anInt4000 + Static206.anInt4000) {
							local153 = Static206.anInt4000 + Static206.anInt4000;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static207.aBooleanArrayArray25[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt5834 = 5;
							local8.anInt5840 = (local8.anInt5836 - Static120.anInt2593 << 8) / local12;
							local8.anInt5838 = (local8.anInt5835 - Static120.anInt2593 << 8) / local12;
							local8.anInt5841 = (local8.anInt5832 - Static79.anInt1748 << 8) / local12;
							local8.anInt5826 = (local8.anInt5829 - Static79.anInt1748 << 8) / local12;
							Static277.aClass184Array2[Static255.anInt5037++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	public static void method5205() {
		Static14.method614();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BIIIIIIFZ)[[I")
	public static int[][] method5212(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub2_Sub28 local13 = new Class2_Sub2_Sub28();
		local13.anInt4643 = 4;
		local13.anInt4659 = 8;
		local13.anInt4660 = 3;
		local13.aBoolean424 = false;
		local13.anInt4648 = (int) (arg0 * 4096.0F);
		local13.method5877();
		Static102.method2280(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method4173(local9[local45], local45);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	public static void method5215() {
		Static355.aClass66_1.method5851();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static297.aLongArray4[local17] = 0L;
		}
		for (@Pc(31) int local31 = 0; local31 < 32; local31++) {
			Static79.aLongArray2[local31] = 0L;
		}
		Static170.anInt3039 = 0;
	}
}
