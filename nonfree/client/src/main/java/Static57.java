import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Lclient!id;")
	public static Class157 aClass157_5;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_5 = new Class376();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)Z")
	public static boolean method7333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static47.method900(arg0, arg1) | Static379.method5970(arg1, arg0) | Static395.method6223(arg0, arg1)) & Static574.method8059(arg0, arg1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	public static boolean method7338() {
		try {
			if (Static169.anInt3281 == 2) {
				if (Static5.aClass3_Sub6_1 == null) {
					Static5.aClass3_Sub6_1 = Static650.method234(Static240.aClass343_120, Static471.anInt8063, Static151.anInt3054);
					if (Static5.aClass3_Sub6_1 == null) {
						return false;
					}
				}
				if (Static475.aClass92_1 == null) {
					Static475.aClass92_1 = new Class92(Static298.aClass343_151, Static383.aClass343_273);
				}
				@Pc(31) Class3_Sub3_Sub1 local31 = Static466.aClass3_Sub3_Sub1_3;
				if (Static522.aClass3_Sub3_Sub1_4 != null) {
					local31 = Static522.aClass3_Sub3_Sub1_4;
				}
				if (local31.method164(Static5.aClass3_Sub6_1, Static611.aClass343_261, Static475.aClass92_1)) {
					Static466.aClass3_Sub3_Sub1_3 = local31;
					Static466.aClass3_Sub3_Sub1_3.method155();
					@Pc(69) int local69;
					if (Static491.anInt8356 > 0) {
						Static169.anInt3281 = 3;
						Static466.aClass3_Sub3_Sub1_3.method161(Static229.anInt4628 < Static491.anInt8356 ? Static229.anInt4628 : Static491.anInt8356);
						for (local69 = 0; local69 < Static12.anIntArray26.length; local69++) {
							Static466.aClass3_Sub3_Sub1_3.method163(Static12.anIntArray26[local69], local69);
							Static12.anIntArray26[local69] = 255;
						}
					} else {
						Static169.anInt3281 = 0;
						Static466.aClass3_Sub3_Sub1_3.method161(Static229.anInt4628);
						for (local69 = 0; local69 < Static12.anIntArray26.length; local69++) {
							Static466.aClass3_Sub3_Sub1_3.method163(Static12.anIntArray26[local69], local69);
							Static12.anIntArray26[local69] = 255;
						}
					}
					if (Static522.aClass3_Sub3_Sub1_4 == null) {
						if (Static263.aLong139 > 0L) {
							Static466.aClass3_Sub3_Sub1_3.method160(Static634.aBoolean764, Static5.aClass3_Sub6_1, Static263.aLong139);
						} else {
							Static466.aClass3_Sub3_Sub1_3.method141(Static634.aBoolean764, Static5.aClass3_Sub6_1);
						}
					}
					if (Static405.aClass89_4 != null) {
						Static405.aClass89_4.method4218(Static466.aClass3_Sub3_Sub1_3);
					}
					Static5.aClass3_Sub6_1 = null;
					Static475.aClass92_1 = null;
					Static522.aClass3_Sub3_Sub1_4 = null;
					Static240.aClass343_120 = null;
					Static263.aLong139 = 0L;
					return true;
				}
			}
		} catch (@Pc(158) Exception local158) {
			local158.printStackTrace();
			Static466.aClass3_Sub3_Sub1_3.method136();
			Static522.aClass3_Sub3_Sub1_4 = null;
			Static169.anInt3281 = 0;
			Static5.aClass3_Sub6_1 = null;
			Static475.aClass92_1 = null;
			Static240.aClass343_120 = null;
		}
		return false;
	}
}
