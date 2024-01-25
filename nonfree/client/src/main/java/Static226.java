import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	public static int anInt4209;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
	public static int anInt4220;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public static int anInt4217 = 0;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_75 = new Class70(4);

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
	public static final int[] anIntArray482 = new int[256];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
	public static void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static39.aClass187ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(25) Class6_Sub8 local25 = (Class6_Sub8) Static33.aClass108_3.method2900(local19);
		if (local25 == null) {
			Static61.method998(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class6_Sub23 local39 = (Class6_Sub23) local25.aClass211_4.method5594();
		if (local39 == null) {
			Static61.method998(arg2, arg0, arg1);
			return;
		}
		@Pc(53) Class44_Sub2_Sub1 local53 = (Class44_Sub2_Sub1) Static61.method998(arg2, arg0, arg1);
		if (local53 == null) {
			local53 = new Class44_Sub2_Sub1();
		} else {
			local53.anInt2913 = local53.anInt2912 = -1;
		}
		local53.anInt2917 = local39.anInt3151;
		local53.anInt2922 = local39.anInt3148;
		label44: while (true) {
			@Pc(89) Class6_Sub23 local89 = (Class6_Sub23) local25.aClass211_4.method5582();
			if (local89 == null) {
				break;
			}
			if (local53.anInt2917 != local89.anInt3151) {
				local53.anInt2918 = local89.anInt3148;
				local53.anInt2913 = local89.anInt3151;
				while (true) {
					@Pc(110) Class6_Sub23 local110 = (Class6_Sub23) local25.aClass211_4.method5582();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt3151 != local53.anInt2917 && local110.anInt3151 != local53.anInt2913) {
						local53.anInt2911 = local110.anInt3148;
						local53.anInt2912 = local110.anInt3151;
					}
				}
			}
		}
		@Pc(158) int local158 = Static306.method5249((arg1 << 7) + 64, (arg0 << 7) + 64, arg2);
		Static351.method5753(arg2, arg0, arg1, local158, local53);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z")
	public static boolean method4029(@OriginalArg(1) int arg0) {
		@Pc(14) Class64_Sub1 local14 = Static354.method5809(arg0);
		if (local14 == null) {
			return false;
		} else if (Static332.anInt6108 == 3) {
			@Pc(46) String local46 = "";
			if (Static189.anInt3601 != 0) {
				local46 = ":" + (local14.anInt2867 + 7000);
			}
			@Pc(61) String local61 = "";
			if (Static106.aString74 != null) {
				local61 = "/p=" + Static106.aString74;
			}
			@Pc(110) String local110 = "http://" + local14.aString125 + local46 + "/l=" + Static247.anInt4265 + "/a=" + Static41.anInt6384 + local61 + "/j" + (Static23.aBoolean27 ? "1" : "0") + ",o" + (Static148.aBoolean217 ? "1" : "0") + ",a2";
			try {
				Static16.aClient1.getAppletContext().showDocument(new URL(local110), "_self");
				return true;
			} catch (@Pc(120) Exception local120) {
				return false;
			}
		} else {
			Static239.aString304 = local14.aString125;
			Static181.anInt3403 = local14.anInt2867;
			if (Static189.anInt3601 != 0) {
				Static309.anInt5826 = Static181.anInt3403 + 40000;
				Static47.anInt914 = Static181.anInt3403 + 50000;
				Static253.anInt4714 = Static309.anInt5826;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method4030(@OriginalArg(0) Class20_Sub6 arg0) {
		arg0.aClass44_1 = null;
		@Pc(12) int local12 = arg0.aClass20_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass20_Sub8Array1[local14].aBoolean384 = false;
		}
		@Pc(32) Class109[] local32 = Class216.aClass109Array1;
		synchronized (Class216.aClass109Array1) {
			if (Class216.aClass109Array1.length > local12 && Static155.anIntArray582[local12] < 200) {
				Class216.aClass109Array1[local12].method2935(arg0);
				@Pc(65) int local65 = Static155.anIntArray582[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14 local9 = Static139.aClass14ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static152.anInt2875 = local9.anInt319;
			Static192.anInt3642 = local9.anInt317;
			Static75.anInt1396 = local9.anInt316;
		}
		Static114.method2319();
	}
}
