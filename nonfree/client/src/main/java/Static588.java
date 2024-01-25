import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "[Lclient!ui;")
	public static Class374[] aClass374Array1;

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "[I")
	public static final int[] anIntArray652 = new int[8];

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method7591(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static159.method2585(arg0, arg1, local14);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)[Lclient!taa;")
	public static Class352[] method7593() {
		return new Class352[] { Static472.aClass352_10, Static207.aClass352_3, Static683.aClass352_13 };
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZII)V")
	public static void method7594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 9);
		local9.method9256();
		local9.anInt10897 = arg2;
		local9.anInt10899 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	public static void method7595() {
		if (!Static372.aBoolean374) {
			Static372.aBoolean374 = true;
			Static150.aFloat57 += (24.0F - Static150.aFloat57) / 2.0F;
			Static96.aBoolean732 = true;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIIB)V")
	public static void method7596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class208 local16 = Static343.aClass208ArrayArray1[arg2][arg0];
		Static95.method1960(local16 == null ? Static559.aClass208_6 : local16, arg1);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
	public static void method7597(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static327.aClass3_Sub7_Sub18_2 != null) {
			Static334.anInt5383 = Static327.aClass3_Sub7_Sub18_2.anInt8103;
		} else {
			Static334.anInt5383 = -1;
		}
		Static654.aClass342_80 = null;
		Static140.aClass270_6 = null;
		Static327.aClass3_Sub7_Sub18_2 = null;
		Static147.anInt2696 = 0;
		Static327.method1021();
		Static327.aClass342_14.method7655();
		Static614.anInt9290 = -1;
		Static577.aClass193_7 = null;
		Static235.aClass193_3 = null;
		Static327.aClass377_2 = null;
		Static675.aClass193_8 = null;
		Static226.aClass178_4 = null;
		Static322.aClass193_5 = null;
		Static146.aClass193_6 = null;
		Static720.aClass193_10 = null;
		Static205.aClass193_2 = null;
		Static700.aClass193_9 = null;
		Static531.anInt8269 = -1;
		if (Static327.aClass111_2 != null) {
			Static327.aClass111_2.method2740();
			Static327.aClass111_2.method2744(128, 64);
		}
		if (Static327.aClass68_2 != null) {
			Static327.aClass68_2.method1957(64, 64);
		}
		if (Static327.aClass53_2 != null) {
			Static327.aClass53_2.method1526(64);
		}
		Static90.aClass98_3.method2480(64);
	}
}
