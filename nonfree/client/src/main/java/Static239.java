import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!bf;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_90 = new Class265(96, 8);

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt4584 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!vc;II)Z")
	public static boolean method3692(@OriginalArg(0) Class2_Sub23_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method5519(2);
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg0.method5519(1) != 0) {
				method3692(arg0, arg1);
			}
			local30 = arg0.method5519(6);
			local35 = arg0.method5519(6);
			@Pc(47) boolean local47 = arg0.method5519(1) == 1;
			if (local47) {
				Static344.anIntArray506[Static404.anInt6735++] = arg1;
			}
			if (Static74.aClass3_Sub2_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(70) Class224 local70 = Static171.aClass224Array1[arg1];
			@Pc(78) Class3_Sub2_Sub1_Sub2 local78 = Static74.aClass3_Sub2_Sub1_Sub2Array1[arg1] = new Class3_Sub2_Sub1_Sub2();
			local78.anInt6137 = arg1;
			if (Static316.aClass2_Sub23Array2[arg1] != null) {
				local78.method4942(Static316.aClass2_Sub23Array2[arg1]);
			}
			local78.method4921(local70.anInt6255);
			local78.anInt6167 = local70.anInt6251;
			local103 = local70.anInt6249;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			@Pc(117) int local117 = local103 & 0xFF;
			local78.aBoolean432 = local70.aBoolean436;
			local78.aByteArray119[0] = Static160.aByteArray86[arg1];
			local78.aByte89 = (byte) local107;
			local78.method4948((local113 << 6) + local30 - Static48.anInt962, (local117 << 6) - -local35 - Static324.anInt5624);
			local78.aBoolean431 = false;
			Static171.aClass224Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local30 = arg0.method5519(2);
			local35 = Static171.aClass224Array1[arg1].anInt6249;
			Static171.aClass224Array1[arg1].anInt6249 = (local35 & 0xFFFFFFF) + (((local35 >> 28) + local30 & 0x3) << 28);
			return false;
		} else {
			@Pc(210) int local210;
			@Pc(215) int local215;
			@Pc(223) int local223;
			if (local8 != 2) {
				local30 = arg0.method5519(18);
				local35 = local30 >> 16;
				local210 = local30 >> 8 & 0xFF;
				local215 = local30 & 0xFF;
				local223 = Static171.aClass224Array1[arg1].anInt6249;
				local103 = local35 + (local223 >> 28) & 0x3;
				local107 = local210 + (local223 >> 14) & 0xFF;
				local113 = local215 + local223 & 0xFF;
				Static171.aClass224Array1[arg1].anInt6249 = (local103 << 28) - (-(local107 << 14) - local113);
				return false;
			}
			local30 = arg0.method5519(5);
			local35 = local30 >> 3;
			local210 = local30 & 0x7;
			local215 = Static171.aClass224Array1[arg1].anInt6249;
			local223 = local35 + (local215 >> 28) & 0x3;
			local103 = local215 >> 14 & 0xFF;
			local107 = local215 & 0xFF;
			if (local210 == 0) {
				local107--;
				local103--;
			}
			if (local210 == 1) {
				local107--;
			}
			if (local210 == 2) {
				local107--;
				local103++;
			}
			if (local210 == 3) {
				local103--;
			}
			if (local210 == 4) {
				local103++;
			}
			if (local210 == 5) {
				local107++;
				local103--;
			}
			if (local210 == 6) {
				local107++;
			}
			if (local210 == 7) {
				local103++;
				local107++;
			}
			Static171.aClass224Array1[arg1].anInt6249 = (local103 << 14) + (local223 << 28) + local107;
			return false;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBZ)V")
	public static void method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static399.anInt6653 == 0) {
			Static251.method5213(false);
		} else {
			Static179.anInt3489 = Static399.anInt6653;
			Static171.method2780(0);
		}
		Static162.aBoolean250 = arg3;
		Static55.anInt1188 = arg1;
		Static234.anInt4526 = arg2;
		Static88.method3638(arg0);
	}
}
