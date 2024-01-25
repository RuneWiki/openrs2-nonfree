import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!lp;")
	public static Class182 aClass182_3;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!sj;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array4;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!kda;")
	public static Class160 aClass160_8;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_13 = new Class186(38, -1);

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_14 = new Class186(80, 8);

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_15 = new Class186(75, -1);

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "[I")
	public static int[] anIntArray130 = new int[1];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	public static void method1368() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static171.aClass206ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static171.aClass206ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static488.anInt8353; local6++) {
					for (local9 = 0; local9 < Static60.anInt1677; local9++) {
						if (Static171.aClass206ArrayArrayArray1[local3][local6][local9] != null) {
							Static171.aClass206ArrayArrayArray1[local3][local6][local9].method5292();
						}
						Static171.aClass206ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static171.aClass206ArrayArrayArray1 = null;
		Static53.aClass10Array3 = null;
		if (Static406.aClass206ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static406.aClass206ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static488.anInt8353; local6++) {
					for (local9 = 0; local9 < Static60.anInt1677; local9++) {
						if (Static406.aClass206ArrayArrayArray3[local3][local6][local9] != null) {
							Static406.aClass206ArrayArrayArray3[local3][local6][local9].method5292();
						}
						Static406.aClass206ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static406.aClass206ArrayArrayArray3 = null;
		Static106.aClass10Array5 = null;
		Static313.aClass206ArrayArrayArray2 = null;
		Static290.aClass10Array7 = null;
		Static64.anInt1870 = 0;
		if (Static327.aClass138Array3 != null) {
			for (local3 = 0; local3 < Static64.anInt1870; local3++) {
				Static327.aClass138Array3[local3] = null;
			}
		}
		if (Static530.aClass47_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static375.anInt6600; local3++) {
				Static530.aClass47_Sub2Array3[local3] = null;
			}
			Static375.anInt6600 = 0;
		}
		if (Static172.aClass201Array3 != null) {
			for (local3 = 0; local3 < Static321.anInt6084; local3++) {
				Static172.aClass201Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static538.anInt9338; local6++) {
				for (local9 = 0; local9 < Static488.anInt8353; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static60.anInt1677; local160++) {
						Static17.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static321.anInt6084 = 0;
		}
		Static145.anIntArrayArrayArray4 = null;
		Static33.method1296();
		Static314.aClass145_5.method3920();
		Static39.aByteArrayArray7 = null;
		Static184.anIntArrayArray32 = null;
		Static184.aShortArrayArray3 = null;
		Static128.aClass43_1 = null;
		Static299.aClass22_8 = null;
		Static423.aClass9_12 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!fw;III)V")
	public static void method1369(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static17.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt3335 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub27Array4[arg0.anInt3335++] = Static172.aClass201Array3[local21 - 1].aClass1_Sub27_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt3335; local21 < 4; local21++) {
			arg0.aClass1_Sub27Array4[local21] = null;
		}
	}
}
