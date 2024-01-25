import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!or;")
	public static final Class3_Sub36 aClass3_Sub36_1 = new Class3_Sub36(0, 0);

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!of;")
	public static final Class174 aClass174_91 = new Class174("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public static int anInt2944 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ik;II)Z")
	public static boolean method2511(@OriginalArg(0) Class3_Sub25_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method2783(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (local8 == 0) {
			if (arg0.method2783(1) != 0) {
				method2511(arg0, arg1);
			}
			local28 = arg0.method2783(6);
			local33 = arg0.method2783(6);
			@Pc(45) boolean local45 = arg0.method2783(1) == 1;
			if (local45) {
				Static198.anIntArray224[Static40.anInt660++] = arg1;
			}
			if (Static216.aClass1_Sub2_Sub6_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class197 local68 = Static147.aClass197Array1[arg1];
			@Pc(76) Class1_Sub2_Sub6_Sub2 local76 = Static216.aClass1_Sub2_Sub6_Sub2Array1[arg1] = new Class1_Sub2_Sub6_Sub2();
			local76.anInt7621 = arg1;
			if (Static278.aClass3_Sub25Array1[arg1] != null) {
				local76.method6214(Static278.aClass3_Sub25Array1[arg1]);
			}
			local76.method6200(local68.anInt5547, true);
			local76.anInt7580 = local68.anInt5546;
			local102 = local68.anInt5548;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local76.aBoolean512 = local68.aBoolean400;
			local120 = local102 & 0xFF;
			local76.aByteArray122[0] = Static131.aByteArray47[arg1];
			local76.aByte101 = (byte) local106;
			local76.method6209(local33 + (local120 << 6) - Static49.anInt873, -Static59.anInt1127 + local28 + (local112 << 6));
			local76.aBoolean514 = false;
			Static147.aClass197Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method2783(2);
			local33 = Static147.aClass197Array1[arg1].anInt5548;
			Static147.aClass197Array1[arg1].anInt5548 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(209) int local209;
			@Pc(214) int local214;
			if (local8 != 2) {
				local28 = arg0.method2783(18);
				local33 = local28 >> 16;
				local209 = local28 >> 8 & 0xFF;
				local214 = local28 & 0xFF;
				local102 = Static147.aClass197Array1[arg1].anInt5548;
				local106 = local33 + (local102 >> 28) & 0x3;
				local112 = local209 + (local102 >> 14) & 0xFF;
				local120 = local214 + local102 & 0xFF;
				Static147.aClass197Array1[arg1].anInt5548 = (local112 << 14) + (local106 << 28) + local120;
				return false;
			}
			local28 = arg0.method2783(5);
			local33 = local28 >> 3;
			local209 = local28 & 0x7;
			local214 = Static147.aClass197Array1[arg1].anInt5548;
			@Pc(223) int local223 = (local214 >> 28) + local33 & 0x3;
			local102 = local214 >> 14 & 0xFF;
			local106 = local214 & 0xFF;
			if (local209 == 0) {
				local102--;
				local106--;
			}
			if (local209 == 1) {
				local106--;
			}
			if (local209 == 2) {
				local106--;
				local102++;
			}
			if (local209 == 3) {
				local102--;
			}
			if (local209 == 4) {
				local102++;
			}
			if (local209 == 5) {
				local102--;
				local106++;
			}
			if (local209 == 6) {
				local106++;
			}
			if (local209 == 7) {
				local102++;
				local106++;
			}
			Static147.aClass197Array1[arg1].anInt5548 = local106 + (local223 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIIII)V")
	public static void method2514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static314.anInt5331 == 1) {
			Static215.aClass2Array12[Static368.anInt6235 / 100].method5829(Static390.anInt6546 - 8, Static105.anInt1902 + -8);
		}
		if (Static314.anInt5331 == 2) {
			Static215.aClass2Array12[Static368.anInt6235 / 100 + 4].method5829(Static390.anInt6546 - 8, Static105.anInt1902 + -8);
		}
		Static298.method4260();
	}
}
