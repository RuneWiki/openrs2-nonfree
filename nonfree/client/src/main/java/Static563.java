import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt9436;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public static int anInt9432 = 0;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray39 = new boolean[8];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z")
	public static boolean method7748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static425.method6081(arg0, arg1) || Static183.method3404(arg1, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILclient!cea;)Z")
	public static boolean method7750(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method1046(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg1.method1046(1) != 0) {
				method7750(arg0, arg1);
			}
			local28 = arg1.method1046(6);
			local33 = arg1.method1046(6);
			@Pc(43) boolean local43 = arg1.method1046(1) == 1;
			if (local43) {
				Static136.anIntArray298[Static295.anInt5451++] = arg0;
			}
			if (Static246.aClass10_Sub1_Sub2_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class319 local66 = Static230.aClass319Array1[arg0];
			@Pc(74) Class10_Sub1_Sub2_Sub2 local74 = Static246.aClass10_Sub1_Sub2_Sub2Array1[arg0] = new Class10_Sub1_Sub2_Sub2();
			local74.anInt8531 = arg0;
			if (Static590.aClass4_Sub9Array1[arg0] != null) {
				local74.method7048(Static590.aClass4_Sub9Array1[arg0]);
			}
			local74.method7033(local66.anInt8809, true);
			local74.anInt8465 = local66.anInt8810;
			local100 = local66.anInt8807;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean598 = local66.aBoolean611;
			local74.aByteArray107[0] = Static178.aByteArray43[arg0];
			local74.aByte101 = (byte) local104;
			local74.method7045(local33 + (local114 << 6) - Static6.anInt97, local28 + (local110 << 6) + -Static373.anInt6695);
			local74.aBoolean596 = false;
			Static230.aClass319Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method1046(2);
			local33 = Static230.aClass319Array1[arg0].anInt8807;
			Static230.aClass319Array1[arg0].anInt8807 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(204) int local204;
			@Pc(209) int local209;
			@Pc(217) int local217;
			if (local8 != 2) {
				local28 = arg1.method1046(18);
				local33 = local28 >> 16;
				local204 = local28 >> 8 & 0xFF;
				local209 = local28 & 0xFF;
				local217 = Static230.aClass319Array1[arg0].anInt8807;
				local100 = (local217 >> 28) + local33 & 0x3;
				local104 = (local217 >> 14) + local204 & 0xFF;
				local110 = local209 + local217 & 0xFF;
				Static230.aClass319Array1[arg0].anInt8807 = (local104 << 14) + (local100 << 28) + local110;
				return false;
			}
			local28 = arg1.method1046(5);
			local33 = local28 >> 3;
			local204 = local28 & 0x7;
			local209 = Static230.aClass319Array1[arg0].anInt8807;
			local217 = local33 + (local209 >> 28) & 0x3;
			local100 = local209 >> 14 & 0xFF;
			local104 = local209 & 0xFF;
			if (local204 == 0) {
				local104--;
				local100--;
			}
			if (local204 == 1) {
				local104--;
			}
			if (local204 == 2) {
				local104--;
				local100++;
			}
			if (local204 == 3) {
				local100--;
			}
			if (local204 == 4) {
				local100++;
			}
			if (local204 == 5) {
				local104++;
				local100--;
			}
			if (local204 == 6) {
				local104++;
			}
			if (local204 == 7) {
				local104++;
				local100++;
			}
			Static230.aClass319Array1[arg0].anInt8807 = local104 + (local217 << 28) + (local100 << 14);
			return false;
		}
	}
}
