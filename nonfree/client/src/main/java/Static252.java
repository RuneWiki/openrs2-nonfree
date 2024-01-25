import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public static int anInt4263 = 0;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_67 = new Class2(56, -1);

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_68 = new Class2(38, -1);

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[S")
	public static final short[] aShortArray66 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_91 = new Class253(15, 3);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Z")
	public static boolean method3355(@OriginalArg(1) int arg0) {
		if (Static106.aBooleanArray7[arg0]) {
			return true;
		} else if (Static414.aClass178_126.method3843(arg0)) {
			@Pc(23) int local23 = Static414.aClass178_126.method3833(arg0);
			if (local23 == 0) {
				Static106.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static294.aClass95ArrayArray3[arg0] == null) {
				Static294.aClass95ArrayArray3[arg0] = new Class95[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static294.aClass95ArrayArray3[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static414.aClass178_126.method3838(local45, arg0);
					if (local59 != null) {
						@Pc(71) Class95 local71 = Static294.aClass95ArrayArray3[arg0][local45] = new Class95();
						local71.anInt2583 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method2169(new Class7_Sub14(local59));
					}
				}
			}
			Static106.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
	public static boolean method3357(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method3361() {
		for (@Pc(14) Class7_Sub37 local14 = (Class7_Sub37) Static276.aClass85_30.method2010(); local14 != null; local14 = (Class7_Sub37) Static276.aClass85_30.method2000()) {
			if (local14.anInt5480 > 0) {
				local14.anInt5480--;
			}
			if (local14.anInt5480 != 0) {
				if (local14.anInt5474 > 0) {
					local14.anInt5474--;
				}
				if (local14.anInt5474 == 0 && local14.anInt5481 >= 1 && local14.anInt5477 >= 1 && local14.anInt5481 <= Static333.anInt3375 - 2 && Static102.anInt2086 - 2 >= local14.anInt5477 && (local14.anInt5476 < 0 || Static302.method4025(local14.anInt5475, local14.anInt5476))) {
					Static172.method2495(local14.anInt5476, local14.anInt5477, local14.anInt5482, -1, local14.anInt5478, local14.anInt5475, local14.anInt5473, local14.anInt5481);
					local14.anInt5474 = -1;
					if (local14.anInt5485 == local14.anInt5476 && local14.anInt5485 == -1) {
						local14.method5802();
					} else if (local14.anInt5485 == local14.anInt5476 && local14.anInt5479 == local14.anInt5478 && local14.anInt5475 == local14.anInt5483) {
						local14.method5802();
					}
				}
			} else if (local14.anInt5485 < 0 || Static302.method4025(local14.anInt5483, local14.anInt5485)) {
				Static172.method2495(local14.anInt5485, local14.anInt5477, local14.anInt5482, -1, local14.anInt5479, local14.anInt5483, local14.anInt5473, local14.anInt5481);
				local14.method5802();
			}
		}
	}
}
