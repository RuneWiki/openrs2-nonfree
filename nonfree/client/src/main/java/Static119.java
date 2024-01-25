import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!fq", name = "ob", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!fq", name = "vb", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!fq", name = "hb", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_52 = new Class119(53, -2);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!ck;I)Z")
	public static boolean method1945(@OriginalArg(1) Class3_Sub7_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method1063(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(104) int local104;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (local8 == 0) {
			if (arg0.method1063(1) != 0) {
				method1945(arg0, arg1);
			}
			local31 = arg0.method1063(6);
			local36 = arg0.method1063(6);
			@Pc(48) boolean local48 = arg0.method1063(1) == 1;
			if (local48) {
				Static260.anIntArray400[Static27.anInt2361++] = arg1;
			}
			if (Static361.aClass7_Sub2_Sub3_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class64 local71 = Static365.aClass64Array1[arg1];
			@Pc(79) Class7_Sub2_Sub3_Sub2 local79 = Static361.aClass7_Sub2_Sub3_Sub2Array1[arg1] = new Class7_Sub2_Sub3_Sub2();
			local79.anInt4391 = arg1;
			if (Static13.aClass3_Sub7Array1[arg1] != null) {
				local79.method3523(Static13.aClass3_Sub7Array1[arg1]);
			}
			local79.method3503(local71.anInt2167);
			local79.anInt4332 = local71.anInt2170;
			local104 = local71.anInt2168;
			local108 = local104 >> 28;
			local114 = local104 >> 14 & 0xFF;
			@Pc(118) int local118 = local104 & 0xFF;
			local79.aBoolean380 = local71.aBoolean171;
			local79.aByteArray52[0] = Static329.aByteArray76[arg1];
			local79.aByte77 = (byte) local108;
			local79.method3517((local114 << 6) - (Static223.anInt7618 - local31), -Static57.anInt5085 + (local118 << 6) - -local36);
			local79.aBoolean381 = false;
			Static365.aClass64Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method1063(2);
			local36 = Static365.aClass64Array1[arg1].anInt2168;
			Static365.aClass64Array1[arg1].anInt2168 = (local36 & 0xFFFFFFF) + ((local31 + (local36 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(213) int local213;
			@Pc(218) int local218;
			@Pc(226) int local226;
			if (local8 != 2) {
				local31 = arg0.method1063(18);
				local36 = local31 >> 16;
				local213 = local31 >> 8 & 0xFF;
				local218 = local31 & 0xFF;
				local226 = Static365.aClass64Array1[arg1].anInt2168;
				local104 = local36 + (local226 >> 28) & 0x3;
				local108 = (local226 >> 14) + local213 & 0xFF;
				local114 = local226 + local218 & 0xFF;
				Static365.aClass64Array1[arg1].anInt2168 = local114 + (local104 << 28) + (local108 << 14);
				return false;
			}
			local31 = arg0.method1063(5);
			local36 = local31 >> 3;
			local213 = local31 & 0x7;
			local218 = Static365.aClass64Array1[arg1].anInt2168;
			local226 = (local218 >> 28) + local36 & 0x3;
			local104 = local218 >> 14 & 0xFF;
			local108 = local218 & 0xFF;
			if (local213 == 0) {
				local104--;
				local108--;
			}
			if (local213 == 1) {
				local108--;
			}
			if (local213 == 2) {
				local108--;
				local104++;
			}
			if (local213 == 3) {
				local104--;
			}
			if (local213 == 4) {
				local104++;
			}
			if (local213 == 5) {
				local108++;
				local104--;
			}
			if (local213 == 6) {
				local108++;
			}
			if (local213 == 7) {
				local104++;
				local108++;
			}
			Static365.aClass64Array1[arg1].anInt2168 = (local226 << 28) + (local104 << 14) + local108;
			return false;
		}
	}
}
