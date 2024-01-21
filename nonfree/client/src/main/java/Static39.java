import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!ea;")
	private static Class18 aClass18_293 = Static8.method128("Attack");

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_291 = aClass18_293;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array6 = new Class18[100];

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
	public static int anInt1204 = 0;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!ef", name = "Hc", descriptor = "Lclient!ea;")
	private static Class18 aClass18_301 = Static8.method128("No reply from loginserver)3");

	@OriginalMember(owner = "client!ef", name = "tc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_299 = aClass18_301;

	@OriginalMember(owner = "client!ef", name = "Ac", descriptor = "Lclient!ea;")
	public static Class18 aClass18_300 = Static8.method128("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method776() {
		aClass18_291 = null;
		anIntArray77 = null;
		aClass18_300 = null;
		aClass18Array6 = null;
		aClass18_293 = null;
		aClass18_301 = null;
		aClass18_299 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)I")
	public static int method778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	public static void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub9 local6 = (Class1_Sub9) Static12.aClass59_59.method2417(); local6 != null; local6 = (Class1_Sub9) Static12.aClass59_59.method2424()) {
			if (local6.anInt1331 != -1 || local6.anIntArray89 != null) {
				@Pc(18) int local18 = 0;
				if (local6.anInt1333 < arg0) {
					local18 = arg0 - local6.anInt1333;
				} else if (local6.anInt1319 > arg0) {
					local18 = local6.anInt1319 - arg0;
				}
				if (local6.anInt1328 < arg3) {
					local18 += arg3 - local6.anInt1328;
				} else if (local6.anInt1334 > arg3) {
					local18 += local6.anInt1334 - arg3;
				}
				if (local6.anInt1327 < local18 - 64 || Static97.anInt3004 == 0 || local6.anInt1325 != arg1) {
					if (local6.aClass1_Sub5_Sub4_1 != null) {
						Static2.aClass1_Sub5_Sub2_1.method1191(local6.aClass1_Sub5_Sub4_1);
						local6.aClass1_Sub5_Sub4_1 = null;
					}
					if (local6.aClass1_Sub5_Sub4_2 != null) {
						Static2.aClass1_Sub5_Sub2_1.method1191(local6.aClass1_Sub5_Sub4_2);
						local6.aClass1_Sub5_Sub4_2 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(133) int local133 = Static97.anInt3004 * (local6.anInt1327 - local18) / local6.anInt1327;
					if (local6.aClass1_Sub5_Sub4_1 != null) {
						local6.aClass1_Sub5_Sub4_1.method1337(local133);
					} else if (local6.anInt1331 >= 0) {
						@Pc(151) Class12 local151 = Static181.method383(Static12.aClass16_Sub1_51, local6.anInt1331, 0);
						if (local151 != null) {
							@Pc(158) Class1_Sub13_Sub1 local158 = local151.method381().method1445(Static174.aClass32_1);
							@Pc(163) Class1_Sub5_Sub4 local163 = Static183.method1320(local158, local133);
							local163.method1357(-1);
							Static2.aClass1_Sub5_Sub2_1.method1188(local163);
							local6.aClass1_Sub5_Sub4_1 = local163;
						}
					}
					if (local6.aClass1_Sub5_Sub4_2 != null) {
						local6.aClass1_Sub5_Sub4_2.method1337(local133);
						if (!local6.aClass1_Sub5_Sub4_2.method3199()) {
							local6.aClass1_Sub5_Sub4_2 = null;
						}
					} else if (local6.anIntArray89 != null && (local6.anInt1337 -= arg2) <= 0) {
						@Pc(194) int local194 = (int) ((double) local6.anIntArray89.length * Math.random());
						@Pc(202) Class12 local202 = Static181.method383(Static12.aClass16_Sub1_51, local6.anIntArray89[local194], 0);
						if (local202 != null) {
							@Pc(209) Class1_Sub13_Sub1 local209 = local202.method381().method1445(Static174.aClass32_1);
							@Pc(214) Class1_Sub5_Sub4 local214 = Static183.method1320(local209, local133);
							local214.method1357(0);
							Static2.aClass1_Sub5_Sub2_1.method1188(local214);
							local6.anInt1337 = local6.anInt1329 + (int) (Math.random() * (double) (local6.anInt1330 - local6.anInt1329));
							local6.aClass1_Sub5_Sub4_2 = local214;
						}
					}
				}
			}
		}
	}
}
