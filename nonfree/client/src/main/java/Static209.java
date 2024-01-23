import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub20 aClass1_Sub1_Sub20_1;

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
	public static int anInt4485;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1524 = Static200.method3116("wave2:");

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1525 = aClass60_1524;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13 = new byte[4][104][104];

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1526 = aClass60_1524;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	private static void method3283() {
		for (@Pc(3) int local3 = 0; local3 < Static192.anInt4121; local3++) {
			@Pc(9) int local9 = Static180.anIntArray502[local3];
			@Pc(13) Class9_Sub4_Sub2 local13 = Static1.aClass9_Sub4_Sub2Array1[local9];
			@Pc(17) int local17 = Static16.aClass1_Sub9_Sub1_1.method895();
			@Pc(25) int local25;
			@Pc(36) int local36;
			if ((local17 & 0x8) != 0) {
				local25 = Static16.aClass1_Sub9_Sub1_1.method885();
				if (local25 == 65535) {
					local25 = -1;
				}
				local36 = Static16.aClass1_Sub9_Sub1_1.method930();
				Static97.method1672(local36, local25, local13);
			}
			if ((local17 & 0x1) != 0) {
				local13.aClass60_1328 = Static16.aClass1_Sub9_Sub1_1.method935();
				local13.anInt3900 = 100;
			}
			if ((local17 & 0x20) != 0) {
				local13.anInt3926 = Static16.aClass1_Sub9_Sub1_1.method885();
				local13.anInt3918 = Static16.aClass1_Sub9_Sub1_1.method946();
			}
			if ((local17 & 0x80) != 0) {
				local13.anInt3914 = Static16.aClass1_Sub9_Sub1_1.method916();
				local25 = Static16.aClass1_Sub9_Sub1_1.method923();
				if (local13.anInt3914 == 65535) {
					local13.anInt3914 = -1;
				}
				local13.anInt3929 = 0;
				local13.anInt3904 = Static42.anInt910 + (local25 & 0xFFFF);
				local13.anInt3893 = 0;
				local13.anInt3934 = local25 >> 16;
				if (local13.anInt3904 > Static42.anInt910) {
					local13.anInt3893 = -1;
				}
			}
			if ((local17 & 0x2) != 0) {
				local13.anInt3953 = Static16.aClass1_Sub9_Sub1_1.method901();
				if (local13.anInt3953 == 65535) {
					local13.anInt3953 = -1;
				}
			}
			if ((local17 & 0x10) != 0) {
				local13.aClass1_Sub1_Sub9_1 = Static52.method1014(Static16.aClass1_Sub9_Sub1_1.method901());
				local13.anInt3938 = local13.aClass1_Sub1_Sub9_1.anInt2326;
				local13.anInt3919 = local13.aClass1_Sub1_Sub9_1.anInt2316;
				local13.anInt3942 = local13.aClass1_Sub1_Sub9_1.anInt2325;
				local13.anInt3947 = local13.aClass1_Sub1_Sub9_1.anInt2310;
				local13.anInt3931 = local13.aClass1_Sub1_Sub9_1.anInt2322;
				local13.anInt3932 = local13.aClass1_Sub1_Sub9_1.anInt2328;
				local13.anInt3940 = local13.aClass1_Sub1_Sub9_1.anInt2321;
				local13.anInt3928 = local13.aClass1_Sub1_Sub9_1.anInt2309;
				local13.anInt3937 = local13.aClass1_Sub1_Sub9_1.anInt2329;
			}
			if ((local17 & 0x40) != 0) {
				local25 = Static16.aClass1_Sub9_Sub1_1.method942();
				local36 = Static16.aClass1_Sub9_Sub1_1.method942();
				local13.method2910(local25, local36, Static42.anInt910);
			}
			if ((local17 & 0x4) != 0) {
				local25 = Static16.aClass1_Sub9_Sub1_1.method939();
				local36 = Static16.aClass1_Sub9_Sub1_1.method895();
				local13.method2910(local25, local36, Static42.anInt910);
				local13.anInt3916 = Static42.anInt910 + 300;
				local13.anInt3898 = Static16.aClass1_Sub9_Sub1_1.method942();
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
	public static void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		@Pc(20) int[] local20 = new int[4];
		@Pc(22) int local22 = 1;
		local20[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg1 != Static64.anIntArray184[local28]) {
				local13[local22] = Static64.anIntArray184[local28];
				local20[local22] = Static23.anIntArray333[local28];
				local22++;
			}
		}
		Static23.anIntArray333 = local20;
		Static64.anIntArray184 = local13;
		Static53.method1022(Static179.aClass63Array3, Static179.aClass63Array3.length - 1, 0);
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
	public static void method3285() {
		Static59.anInt1503 = 0;
		Static192.anInt4121 = 0;
		Static53.method1021();
		Static219.method3522();
		method3283();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static59.anInt1503; local21++) {
			local27 = Static122.anIntArray343[local21];
			if (Static42.anInt910 != Static1.aClass9_Sub4_Sub2Array1[local27].anInt3907) {
				Static1.aClass9_Sub4_Sub2Array1[local27].aClass1_Sub1_Sub9_1 = null;
				Static1.aClass9_Sub4_Sub2Array1[local27] = null;
			}
		}
		if (Static16.aClass1_Sub9_Sub1_1.anInt1192 != Static27.anInt644) {
			throw new RuntimeException("gnp1 pos:" + Static16.aClass1_Sub9_Sub1_1.anInt1192 + " psize:" + Static27.anInt644);
		}
		for (local27 = 0; local27 < Static56.anInt1482; local27++) {
			if (Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static56.anInt1482);
			}
		}
	}
}
