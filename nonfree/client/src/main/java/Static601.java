import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "[Lclient!du;")
	public static final Class89_Sub1[] aClass89_Sub1Array2 = new Class89_Sub1[37];

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lclient!kh;I)V")
	public static void method8005(@OriginalArg(0) int arg0, @OriginalArg(1) Class208[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(16) Class208 local16 = arg1[local3];
			if (local16 != null && arg0 == local16.anInt5634 && !Static82.method1768(local16)) {
				if (local16.anInt5643 == 0) {
					method8005(local16.anInt5653, arg1);
					if (local16.aClass208Array20 != null) {
						method8005(local16.anInt5653, local16.aClass208Array20);
					}
					@Pc(50) Class3_Sub28 local50 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local16.anInt5653);
					if (local50 != null) {
						Static190.method3054(local50.anInt5252);
					}
				}
				if (local16.anInt5643 == 6 && local16.anInt5596 != -1) {
					@Pc(72) Class48 local72 = Static483.aClass373_2.method8323(local16.anInt5596);
					if (local72 != null) {
						local16.anInt5655 += Static527.anInt8716;
						@Pc(83) int local83 = local16.anInt5656;
						while (local72.anIntArray68[local16.anInt5656] < local16.anInt5655) {
							local16.anInt5655 -= local72.anIntArray68[local16.anInt5656];
							local16.anInt5656++;
							if (local72.anIntArray72.length <= local16.anInt5656) {
								local16.anInt5656 -= local72.anInt1548;
								if (local16.anInt5656 < 0 || local72.anIntArray72.length <= local16.anInt5656) {
									local16.anInt5656 = 0;
								}
							}
							local16.anInt5591 = local16.anInt5656 + 1;
							if (local16.anInt5591 >= local72.anIntArray72.length) {
								local16.anInt5591 -= local72.anInt1548;
								if (local16.anInt5591 < 0 || local16.anInt5591 >= local72.anIntArray72.length) {
									local16.anInt5591 = -1;
								}
							}
							Static374.method5525(local16);
						}
						if (local83 != local16.anInt5656) {
							Static4.method46(local72, local16.anInt5656);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(B)V")
	public static void method8007() {
		for (@Pc(3) int local3 = 0; local3 < Static653.anInt10053; local3++) {
			@Pc(15) int local15 = Static88.method1799(local3 + Static638.anInt9840, Static653.anInt10053) * Static67.anInt9115;
			for (@Pc(17) int local17 = 0; local17 < Static67.anInt9115; local17++) {
				@Pc(28) int local28 = Static88.method1799(local17 + Static125.anInt2416, Static67.anInt9115) + local15;
				if (Static611.anInt9531 == Static256.anIntArray322[local28]) {
					Static560.anInterface8Array1[local28].method8721(0, 0, Static552.anInt8938, Static502.anInt8445, local17 * Static552.anInt8938, Static502.anInt8445 * local3);
				}
			}
		}
	}
}
