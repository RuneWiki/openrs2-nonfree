import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	public static volatile int anInt2426 = 0;

	@OriginalMember(owner = "client!ik", name = "W", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public static void method1917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static83.anInt1943 > 0) {
			Static171.method2715(Static83.anInt1943);
			Static83.anInt1943 = 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static270.anInt5189 * arg0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < 255; local29++) {
			@Pc(49) int local49 = (256 - local29) * Static168.anIntArray314[local29] / 256;
			if (local49 < 0) {
				local49 = 0;
			}
			local15 += local49;
			@Pc(61) int local61;
			for (local61 = local49; local61 < 128; local61++) {
				@Pc(74) int local74 = Static270.anIntArray561[arg1 + local23++];
				@Pc(79) int local79 = Static69.anIntArray100[local15++];
				if (local79 == 0) {
					Static142.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = local74;
				} else {
					@Pc(96) int local96 = local79 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(108) int local108 = 256 - local79 - 18;
					if (local108 > 255) {
						local108 = 255;
					}
					local79 = Static118.anIntArray196[local79];
					Static142.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = (local108 * (local74 & 0xFF00FF) + (local79 & 0xFF00FF) * local96 & 0xFF00FF00) + (local108 * (local74 & 0xFF00) + (local79 & 0xFF00) * local96 & 0xFF0000) >> 8;
				}
			}
			for (local61 = 0; local61 < local49; local61++) {
				Static142.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = Static270.anIntArray561[arg1 + local23++];
			}
			local23 += Static270.anInt5189 - 128;
		}
		if (Static94.aBoolean138) {
			Static104.method1698(Static142.aClass4_Sub3_Sub14_Sub1_4.anIntArray241, arg1, arg0, Static142.aClass4_Sub3_Sub14_Sub1_4.anInt5610, Static142.aClass4_Sub3_Sub14_Sub1_4.anInt5609);
		} else {
			Static142.aClass4_Sub3_Sub14_Sub1_4.method4547(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLclient!fh;)Lclient!uj;")
	public static Class4_Sub3_Sub14 method1918(@OriginalArg(0) int arg0, @OriginalArg(3) Class58 arg1) {
		return Static12.method197(arg1, arg0, 0) ? Static67.method1063() : null;
	}
}
