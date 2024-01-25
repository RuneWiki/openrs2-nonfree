import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "Lclient!ha;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!gia", name = "q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "Lclient!tb;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "[S")
	private static final short[] aShortArray38 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!gia", name = "v", descriptor = "[S")
	private static final short[] aShortArray39 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "[S")
	private static final short[] aShortArray40 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "[S")
	private static final short[] aShortArray41 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!gia", name = "y", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray39, aShortArray41, aShortArray40, aShortArray38 };

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "[I")
	public static final int[] anIntArray221 = new int[3];

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BLclient!kda;)I")
	public static int method3881(@OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg0) {
		if (arg0.anInt6097 == 0) {
			return 0;
		}
		@Pc(66) int local66;
		@Pc(59) int local59;
		if (arg0.anInt6070 != -1) {
			@Pc(19) Class3_Sub1_Sub3_Sub3 local19 = null;
			if (arg0.anInt6070 < 32768) {
				@Pc(45) Class2_Sub33 local45 = (Class2_Sub33) Static600.aClass99_79.method3056((long) arg0.anInt6070);
				if (local45 != null) {
					local19 = local45.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				}
			} else if (arg0.anInt6070 >= 32768) {
				local19 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[arg0.anInt6070 - 32768];
			}
			if (local19 != null) {
				local59 = arg0.anInt10303 - local19.anInt10303;
				local66 = arg0.anInt10310 - local19.anInt10310;
				if (local59 != 0 || local66 != 0) {
					arg0.method5218((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub1_Sub3_Sub3_Sub2) {
			@Pc(92) Class3_Sub1_Sub3_Sub3_Sub2 local92 = (Class3_Sub1_Sub3_Sub3_Sub2) arg0;
			if (local92.anInt6112 != -1 && (local92.anInt6102 == 0 || local92.anInt6105 > 0)) {
				local92.method5218(local92.anInt6112);
				local92.anInt6112 = -1;
			}
		} else if (arg0 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
			@Pc(122) Class3_Sub1_Sub3_Sub3_Sub1 local122 = (Class3_Sub1_Sub3_Sub3_Sub1) arg0;
			if (local122.anInt3863 != -1 && (local122.anInt6102 == 0 || local122.anInt6105 > 0)) {
				local59 = local122.anInt10303 - (local122.anInt3863 - Static84.anInt2565 - Static84.anInt2565) * 256;
				local66 = local122.anInt10310 - (local122.anInt3875 - Static32.anInt723 - Static32.anInt723) * 256;
				if (local59 != 0 || local66 != 0) {
					local122.method5218((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
				local122.anInt3863 = -1;
			}
		}
		return arg0.method5206();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Lclient!fh;")
	public static Class107 method3883(@OriginalArg(1) int arg0) {
		@Pc(13) Class107[] local13 = Static587.method8684();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class107 local21 = local13[local15];
			if (local21.anInt3900 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(JJ)J")
	public static long method3884(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
