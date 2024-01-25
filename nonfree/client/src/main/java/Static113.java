import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_10 = new Class38(512);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public static int anInt2527 = 0;

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "[I")
	public static final int[] anIntArray188 = new int[5];

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public static void method2407() {
		if (Static171.anIntArray265 != null && Static6.anIntArray22 != null) {
			return;
		}
		Static171.anIntArray265 = new int[256];
		Static6.anIntArray22 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static171.anIntArray265[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static6.anIntArray22[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2408(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local8 + local10);
		for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
			@Pc(54) char local54 = arg0.charAt(local48);
			if (local54 == '<') {
				local46.append("<lt>");
			} else if (local54 == '>') {
				local46.append("<gt>");
			} else {
				local46.append(local54);
			}
		}
		return local46.toString();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!kg;I)V")
	public static void method2409(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int arg2) {
		Static356.anInt6820 = arg0;
		Static204.anInt4069 = arg2;
		Static27.aClass112_2 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	public static void method2410() {
		@Pc(8) int local8 = Static225.method4175();
		if (local8 == 0) {
			Static341.aByteArrayArrayArray10 = null;
			Static168.method3166(0);
		} else if (local8 == 1) {
			Static234.method4347((byte) 0);
			Static168.method3166(512);
			if (Static264.aByteArrayArrayArray7 != null) {
				Static259.method4775();
			}
		} else {
			Static234.method4347((byte) (Static365.anInt7010 - 4 & 0xFF));
			Static168.method3166(2);
		}
		Static132.anInt2868 = Static284.anInt6477;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!jb;)Z")
	public static boolean method2411(@OriginalArg(1) Interface4 arg0) {
		@Pc(9) Class71 local9 = Static219.method4081(arg0.method5927());
		if (local9.anInt2368 == -1) {
			return true;
		} else {
			@Pc(22) Class85 local22 = Static251.method4730(local9.anInt2368);
			return local22.anInt2751 == -1 ? true : local22.method2628();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ct;Z)V")
	public static void method2412(@OriginalArg(0) Class30 arg0) {
		Static341.aClass30_100 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Lclient!la;")
	public static Class1_Sub4_Sub16 method2414(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub4_Sub16 local12 = (Class1_Sub4_Sub16) Static272.aClass44_7.method1612((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = Static152.aClass30_45.method1161(arg0, 1);
		} else {
			local27 = Static197.aClass30_58.method1161(arg0 & 0x7FFF, 1);
		}
		local12 = new Class1_Sub4_Sub16();
		if (local27 != null) {
			local12.method3420(new Class1_Sub7(local27));
		}
		if (arg0 >= 32768) {
			local12.method3425();
		}
		Static272.aClass44_7.method1616((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public static void method2415() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static207.aBooleanArray21[local7] = true;
		}
	}
}
