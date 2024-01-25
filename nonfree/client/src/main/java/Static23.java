import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public static int anInt458;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public static int anInt459;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public static int anInt463;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public static int anInt465;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B)[B")
	public static byte[] method380(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method3440();
		@Pc(16) int local16 = local8.method3418();
		if (local16 < 0 || Static270.anInt5394 != 0 && local16 > Static270.anInt5394) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(86) byte[] local86 = new byte[local16];
			local8.method3456(local16, local86);
			return local86;
		} else {
			@Pc(39) int local39 = local8.method3418();
			if (local39 < 0 || Static270.anInt5394 != 0 && local39 > Static270.anInt5394) {
				throw new RuntimeException();
			}
			@Pc(60) byte[] local60 = new byte[local39];
			if (local12 == 1) {
				Static326.method5280(local60, local39, arg0, local16);
			} else {
				Static249.aClass69_1.method2211(local8, local60);
			}
			return local60;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method381(@OriginalArg(1) int arg0) {
		Static258.anInt5197 = arg0;
		Static108.aClass198_91.method5213();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lclient!rj;")
	public static Class4_Sub4_Sub17 method383(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub17 local10 = (Class4_Sub4_Sub17) Static77.aClass198_66.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static348.aClass193_108.method5047(26, arg0);
		local10 = new Class4_Sub4_Sub17();
		if (local25 != null) {
			local10.method4714(new Class4_Sub11(local25));
		}
		Static77.aClass198_66.method5201(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method384() {
		for (@Pc(13) Class2_Sub6 local13 = (Class2_Sub6) Static197.aClass32_8.method843(); local13 != null; local13 = (Class2_Sub6) Static197.aClass32_8.method843()) {
			Static331.method5366(local13);
		}
		Static44.method888();
		Static44.method892();
		Static44.method890();
		Static44.method878();
		Static44.method893();
		Static44.method894();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZILclient!br;)V")
	public static void method385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21 arg2) {
		if (Static103.aClass21_5 != null || Static272.aBoolean393 || (arg2 == null || Static274.method4696(arg2) == null)) {
			return;
		}
		Static103.aClass21_5 = arg2;
		Static182.aClass21_11 = Static274.method4696(arg2);
		Static205.anInt4303 = 0;
		Static176.aBoolean141 = false;
		Static70.anInt1828 = arg0;
		Static173.anInt3682 = arg1;
	}
}
