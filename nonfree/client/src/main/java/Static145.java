import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
	public static boolean aBoolean206;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!k;")
	public static final Class128 aClass128_11 = new Class128(0);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_59 = new Class234(44, 12);

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[Lclient!vo;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array3 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
	public static int[] anIntArray289 = new int[2];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2285(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static351.anInt3266; local11++) {
			if (arg0.equalsIgnoreCase(Static244.aStringArray28[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method2286(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static109.anInt2151 > 0) {
			local21 = Static46.aByteArrayArray3[--Static109.anInt2151];
			Static46.aByteArrayArray3[Static109.anInt2151] = null;
			return local21;
		} else if (arg0 == 5000 && Static290.anInt5039 > 0) {
			local21 = Static209.aByteArrayArray10[--Static290.anInt5039];
			Static209.aByteArrayArray10[Static290.anInt5039] = null;
			return local21;
		} else if (arg0 == 30000 && Static49.anInt5256 > 0) {
			local21 = Static229.aByteArrayArray13[--Static49.anInt5256];
			Static229.aByteArrayArray13[Static49.anInt5256] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2287() {
		if (!Static72.aBoolean104) {
			return;
		}
		while (true) {
			while (Static197.anInt3538 < Static97.aClass23_Sub1Array1.length) {
				@Pc(29) Class23_Sub1 local29 = Static97.aClass23_Sub1Array1[Static197.anInt3538];
				if (local29 != null && local29.anInt335 == -1) {
					if (Static113.aClass3_Sub2_1 == null) {
						Static113.aClass3_Sub2_1 = Static335.aClass72_1.method1542(local29.aString3);
					}
					@Pc(52) int local52 = Static113.aClass3_Sub2_1.anInt353;
					if (local52 == -1) {
						return;
					}
					Static113.aClass3_Sub2_1 = null;
					Static197.anInt3538++;
					local29.anInt335 = local52;
				} else {
					Static197.anInt3538++;
				}
			}
			return;
		}
	}
}
