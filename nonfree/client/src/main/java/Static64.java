import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!jg;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt1101 = 0;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_24 = new Class314(20, -1);

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static final int anInt1104 = 1406;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_15 = new Class136(64);

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	public static int anInt1105 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z")
	public static boolean method1059(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static266.aClass82_8.method6103();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static266.aClass82_8.method6162();
		} else if (!Static266.aClass82_8.method6177()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static32.aClass3_Sub41_3.method6773(arg0 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub25_1);
			Static124.method2223();
			return true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
	public static int method1060(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(153) int local153 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		@Pc(181) int local181 = (int) (local68 * 256.0D);
		if (local181 < 0) {
			local181 = 0;
		} else if (local181 > 255) {
			local181 = 255;
		}
		if (local181 > 243) {
			local165 >>= 0x4;
		} else if (local181 > 217) {
			local165 >>= 0x3;
		} else if (local181 > 192) {
			local165 >>= 0x2;
		} else if (local181 > 179) {
			local165 >>= 0x1;
		}
		return (local165 >> 5 << 7) + ((local153 & 0xFF) >> 2 << 10) + (local181 >> 1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
	public static boolean method1061(@OriginalArg(0) int arg0) {
		if (Static397.aBooleanArray25[arg0]) {
			return true;
		} else if (Static5.aClass343_8.method8146(arg0)) {
			@Pc(28) int local28 = Static5.aClass343_8.method8157(arg0);
			if (local28 == 0) {
				Static397.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static319.aClass344ArrayArray2[arg0] == null) {
				Static319.aClass344ArrayArray2[arg0] = new Class344[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static319.aClass344ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static5.aClass343_8.method8132(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class344 local76 = Static319.aClass344ArrayArray2[arg0][local50] = new Class344();
						local76.anInt9571 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method8170(new Class3_Sub9(local64));
					}
				}
			}
			Static397.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
