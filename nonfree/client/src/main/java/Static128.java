import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!wl;")
	public static Class265 aClass265_20;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!nc;")
	public static Class2_Sub29 aClass2_Sub29_1 = null;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
	public static final int[] anIntArray142 = new int[8];

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
	public static final boolean aBoolean214 = false;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	public static void method1856(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static266.aString44 = arg0;
		Static230.aString39 = arg1;
		Static110.anInt2286 = arg2;
		if (Static230.aString39.equals("") || Static266.aString44.equals("")) {
			Static33.anInt668 = 3;
		} else if (Static62.anInt1710 == -1) {
			Static402.anInt6993 = 0;
			Static334.anInt5940 = 0;
			Static350.anInt6149 = 1;
			Static33.anInt668 = -3;
			@Pc(39) Class2_Sub20 local39 = new Class2_Sub20(128);
			local39.method3699(10);
			local39.method3713((int) (Math.random() * 9.9999999E7D));
			local39.method3692(Static41.method777(Static230.aString39));
			local39.method3713((int) (Math.random() * 9.9999999E7D));
			local39.method3715(Static266.aString44);
			local39.method3713((int) (Math.random() * 9.9999999E7D));
			local39.method3749(Static133.aBigInteger1, Static334.aBigInteger2);
			Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
			Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_10.anInt7355);
			Static98.aClass2_Sub20_Sub1_1.method3699(local39.anInt4608 + 2);
			Static98.aClass2_Sub20_Sub1_1.method3745(585);
			Static98.aClass2_Sub20_Sub1_1.method3710(local39.anInt4608, local39.aByteArray136);
		} else {
			Static440.method5946();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method1857() {
		Static257.method3907(Static399.aClass167_Sub1_1.anInt5566);
		@Pc(17) int local17 = (Static173.anInt3340 >> 3) + (Static225.anInt4310 >> 10);
		@Pc(25) int local25 = (Static379.anInt6721 >> 3) + (Static293.anInt5621 >> 10);
		Static301.anInt5383 = Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 = 0;
		Static231.aClass4_Sub2_Sub2_Sub1_2.method4603(8, 8);
		Static83.anIntArray110 = new int[18];
		Static420.anIntArray494 = new int[18];
		Static287.aByteArrayArray16 = new byte[18][];
		Static257.anIntArrayArray37 = new int[18][4];
		Static280.aByteArrayArray14 = new byte[18][];
		Static57.anIntArray69 = new int[18];
		Static96.anIntArray119 = new int[18];
		Static342.aByteArrayArray20 = new byte[18][];
		Static312.anIntArray200 = new int[18];
		Static170.anIntArray218 = new int[18];
		Static340.aByteArrayArray19 = new byte[18][];
		Static253.aByteArrayArray12 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local17 - (Static81.anInt1950 >> 4)) / 8; local85 <= ((Static81.anInt1950 >> 4) + local17) / 8; local85++) {
			for (local95 = (local25 - (Static171.anInt3288 >> 4)) / 8; local95 <= (local25 + (Static171.anInt3288 >> 4)) / 8; local95++) {
				@Pc(104) int local104 = (local85 << 8) + local95;
				Static96.anIntArray119[local76] = local104;
				Static57.anIntArray69[local76] = Static438.aClass188_126.method4279("m" + local85 + "_" + local95);
				Static83.anIntArray110[local76] = Static438.aClass188_126.method4279("l" + local85 + "_" + local95);
				Static420.anIntArray494[local76] = Static438.aClass188_126.method4279("n" + local85 + "_" + local95);
				Static170.anIntArray218[local76] = Static438.aClass188_126.method4279("um" + local85 + "_" + local95);
				Static312.anIntArray200[local76] = Static438.aClass188_126.method4279("ul" + local85 + "_" + local95);
				if (Static420.anIntArray494[local76] == -1) {
					Static57.anIntArray69[local76] = -1;
					Static83.anIntArray110[local76] = -1;
					Static170.anIntArray218[local76] = -1;
					Static312.anIntArray200[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static420.anIntArray494.length; local95++) {
			Static420.anIntArray494[local95] = -1;
			Static57.anIntArray69[local95] = -1;
			Static83.anIntArray110[local95] = -1;
			Static170.anIntArray218[local95] = -1;
			Static312.anIntArray200[local95] = -1;
		}
		Static356.method4998(local17, local25, true, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!of;)V")
	public static void method1859(@OriginalArg(1) Class38_Sub7 arg0) {
		arg0.aClass4_Sub2_Sub2_1 = null;
		if (Static279.anInt5101 < 20) {
			Static61.aClass184_1.method4207(arg0);
			Static279.anInt5101++;
		}
	}
}
