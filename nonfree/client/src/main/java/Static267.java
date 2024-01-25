import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!o;")
	public static final Class169 aClass169_249 = new Class169("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[100];

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
	public static int anInt4674 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ui;Lclient!ui;Lclient!ui;ILclient!ui;)V")
	public static void method4122(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(4) Class230 arg3) {
		Static147.aClass230_42 = arg2;
		Static66.aClass230_24 = arg0;
		Static382.aClass230_85 = arg3;
		Static383.aClass230_87 = arg1;
		Static137.aClass117ArrayArray1 = new Class117[Static383.aClass230_87.method4969()][];
		Static277.aBooleanArray25 = new boolean[Static383.aClass230_87.method4969()];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!vg;)Z")
	public static boolean method4124(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method5191(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg1.method5191(1) != 0) {
				method4124(arg0, arg1);
			}
			local31 = arg1.method5191(6);
			local36 = arg1.method5191(6);
			@Pc(48) boolean local48 = arg1.method5191(1) == 1;
			if (local48) {
				Static144.anIntArray324[Static143.anInt2673++] = arg0;
			}
			if (Static225.aClass25_Sub1_Sub1_Sub1Array3[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class25_Sub1_Sub1_Sub1 local75 = Static225.aClass25_Sub1_Sub1_Sub1Array3[arg0] = new Class25_Sub1_Sub1_Sub1();
			local75.anInt2331 = arg0;
			if (Static322.aClass1_Sub33Array1[arg0] != null) {
				local75.method472(Static322.aClass1_Sub33Array1[arg0]);
			}
			local75.method1891(Static131.anIntArray301[arg0]);
			local75.anInt2353 = Static253.anIntArray538[arg0];
			local103 = Static16.anIntArray29[arg0];
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			local75.aByteArray40[0] = Static268.aByteArray75[arg0];
			local75.aByte70 = (byte) local107;
			local75.method468((local117 << 6) + (local36 - Static293.anInt5053), local31 + (local113 << 6) + -Static256.anInt4410);
			local75.anInt599 = -1;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method5191(2);
			local36 = Static16.anIntArray29[arg0];
			Static16.anIntArray29[arg0] = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(198) int local198;
			@Pc(202) int local202;
			if (local8 != 2) {
				local31 = arg1.method5191(18);
				local36 = local31 >> 16;
				local198 = local31 >> 8 & 0xFF;
				local202 = local31 & 0xFF;
				local103 = Static16.anIntArray29[arg0];
				local107 = local36 + (local103 >> 28) & 0x3;
				local113 = (local103 >> 14) + local198 & 0xFF;
				local117 = local202 + local103 & 0xFF;
				Static16.anIntArray29[arg0] = (local113 << 14) + (local107 << 28) + local117;
				return false;
			}
			local31 = arg1.method5191(5);
			local36 = local31 >> 3;
			local198 = local31 & 0x7;
			local202 = Static16.anIntArray29[arg0];
			local103 = local36 + (local202 >> 28) & 0x3;
			local107 = local202 >> 14 & 0xFF;
			local113 = local202 & 0xFF;
			if (local198 == 0) {
				local113--;
				local107--;
			}
			if (local198 == 1) {
				local113--;
			}
			if (local198 == 2) {
				local113--;
				local107++;
			}
			if (local198 == 3) {
				local107--;
			}
			if (local198 == 4) {
				local107++;
			}
			if (local198 == 5) {
				local107--;
				local113++;
			}
			if (local198 == 6) {
				local113++;
			}
			if (local198 == 7) {
				local107++;
				local113++;
			}
			Static16.anIntArray29[arg0] = local113 + (local103 << 28) + (local107 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
	public static void method4125() {
		if (Static221.aBoolean370) {
			return;
		}
		if (Static188.aClass135_Sub1_1.aBoolean329) {
			Static19.aFloat1 = (int) Static19.aFloat1 - 17 & 0xFFFFFFF0;
		} else {
			Static37.aFloat2 += (-Static37.aFloat2 - 12.0F) / 2.0F;
		}
		Static221.aBoolean370 = true;
		Static187.aBoolean292 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIZIZ)I")
	public static int method4130(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub37 local10 = Static367.method5078(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray589.length; local18++) {
			if (local10.anIntArray589[local18] >= 0 && Static263.aClass102_2.anInt2686 > local10.anIntArray589[local18]) {
				@Pc(47) Class88 local47 = Static263.aClass102_2.method2172(local10.anIntArray589[local18]);
				@Pc(57) int local57 = local47.method1662(Static232.aClass47_2.method888(arg2).anInt392, arg2);
				if (arg0) {
					local16 += local10.anIntArray591[local18] * local57;
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}
}
