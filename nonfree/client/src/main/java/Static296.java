import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!ci;")
	public static Class38 aClass38_80;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "Lclient!gg;")
	public static Class84 aClass84_10;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_136 = new Class266(1, 2, 2, 0);

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "[Lclient!fq;")
	public static final Class79_Sub1[] aClass79_Sub1Array3 = new Class79_Sub1[30];

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_53 = new Class83(50);

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_50 = new Class91();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIII)V")
	public static void method5573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class4_Sub6 local8 = (Class4_Sub6) Static324.aClass91_35.method2584(); local8 != null; local8 = (Class4_Sub6) Static324.aClass91_35.method2586()) {
			Static134.method2486(arg2, arg1, local8, arg0, arg3);
		}
		for (@Pc(35) Class4_Sub6 local35 = (Class4_Sub6) Static429.aClass91_52.method2584(); local35 != null; local35 = (Class4_Sub6) Static429.aClass91_52.method2586()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class231 local44 = local35.aClass11_Sub5_Sub2_Sub2_1.method5306();
			if (local35.aClass11_Sub5_Sub2_Sub2_1.aBoolean475) {
				local39 = 0;
			} else if (local44.anInt6389 == local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 || local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 == local44.anInt6423 || local44.anInt6397 == local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 || local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 == local44.anInt6404) {
				local39 = 2;
			} else if (local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 == local44.anInt6422 || local44.anInt6414 == local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 || local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484 == local44.anInt6396 || local44.anInt6412 == local35.aClass11_Sub5_Sub2_Sub2_1.anInt6484) {
				local39 = 3;
			}
			if (local35.anInt990 != local39) {
				@Pc(135) int local135 = Static371.method5251(local35.aClass11_Sub5_Sub2_Sub2_1);
				if (local135 != local35.anInt994) {
					if (local35.aClass4_Sub7_Sub1_3 != null) {
						Static132.aClass4_Sub7_Sub4_1.method5474(local35.aClass4_Sub7_Sub1_3);
						local35.aClass4_Sub7_Sub1_3 = null;
					}
					local35.anInt994 = local135;
				}
				local35.anInt990 = local39;
			}
			local35.anInt986 = local35.aClass11_Sub5_Sub2_Sub2_1.anInt7514;
			local35.anInt993 = local35.aClass11_Sub5_Sub2_Sub2_1.anInt7514 + (local35.aClass11_Sub5_Sub2_Sub2_1.method5302() << 6);
			local35.anInt987 = local35.aClass11_Sub5_Sub2_Sub2_1.anInt7515;
			local35.anInt995 = local35.aClass11_Sub5_Sub2_Sub2_1.anInt7515 + (local35.aClass11_Sub5_Sub2_Sub2_1.method5302() << 6);
			Static134.method2486(arg2, arg1, local35, arg0, arg3);
		}
		for (@Pc(208) Class4_Sub6 local208 = (Class4_Sub6) Static48.aClass96_3.method2798(); local208 != null; local208 = (Class4_Sub6) Static48.aClass96_3.method2796()) {
			@Pc(212) byte local212 = 1;
			@Pc(217) Class231 local217 = local208.aClass11_Sub5_Sub2_Sub1_1.method5306();
			if (local208.aClass11_Sub5_Sub2_Sub1_1.aBoolean475) {
				local212 = 0;
			} else if (local217.anInt6389 == local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 || local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 == local217.anInt6423 || local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 == local217.anInt6397 || local217.anInt6404 == local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484) {
				local212 = 2;
			} else if (local217.anInt6422 == local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 || local217.anInt6414 == local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 || local217.anInt6396 == local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 || local208.aClass11_Sub5_Sub2_Sub1_1.anInt6484 == local217.anInt6412) {
				local212 = 3;
			}
			if (local212 != local208.anInt990) {
				@Pc(312) int local312 = Static188.method3408(local208.aClass11_Sub5_Sub2_Sub1_1);
				if (local208.anInt994 != local312) {
					if (local208.aClass4_Sub7_Sub1_3 != null) {
						Static132.aClass4_Sub7_Sub4_1.method5474(local208.aClass4_Sub7_Sub1_3);
						local208.aClass4_Sub7_Sub1_3 = null;
					}
					local208.anInt994 = local312;
				}
				local208.anInt990 = local212;
			}
			local208.anInt986 = local208.aClass11_Sub5_Sub2_Sub1_1.anInt7514;
			local208.anInt993 = local208.aClass11_Sub5_Sub2_Sub1_1.anInt7514 + (local208.aClass11_Sub5_Sub2_Sub1_1.method5302() << 6);
			local208.anInt987 = local208.aClass11_Sub5_Sub2_Sub1_1.anInt7515;
			local208.anInt995 = local208.aClass11_Sub5_Sub2_Sub1_1.anInt7515 + (local208.aClass11_Sub5_Sub2_Sub1_1.method5302() << 6);
			Static134.method2486(arg2, arg1, local208, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)V")
	public static void method5577(@OriginalArg(0) int arg0) {
		Static326.anIntArray474 = new int[arg0];
		Static77.anIntArray130 = new int[arg0];
		Static150.anIntArray256 = new int[arg0];
		Static171.anIntArray274 = new int[arg0];
		Static103.anIntArray192 = new int[arg0];
	}
}
