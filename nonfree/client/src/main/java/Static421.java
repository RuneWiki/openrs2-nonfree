import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public static int anInt7650 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!vg;I)V")
	public static void method6398(@OriginalArg(0) Class11_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anIntArray230 == null && arg0.anIntArray231 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(24) int local24 = 0; local24 < arg0.anIntArray230.length; local24++) {
			@Pc(28) int local28 = -1;
			if (arg0.anIntArray230 != null) {
				local28 = arg0.anIntArray230[local24];
			}
			if (local28 != -1) {
				local14 = false;
				@Pc(102) int local102;
				@Pc(95) int local95;
				@Pc(74) int local74;
				if ((local28 & 0xC0000000) == -1073741824) {
					local74 = local28 & 0xFFFFFFF;
					@Pc(147) int local147 = local74 >> 14;
					@Pc(151) int local151 = local74 & 0x3FFF;
					local102 = arg0.anInt9925 - (local147 - Static451.anInt7933) * 512 - 256;
					local95 = arg0.anInt9929 - (local151 - Static470.anInt8063) * 512 - 256;
				} else if ((local28 & 0x8000) == 0) {
					@Pc(111) Class2_Sub51 local111 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local28);
					if (local111 == null) {
						arg0.method2763(-1, local24);
						continue;
					}
					@Pc(116) Class11_Sub1_Sub1_Sub2_Sub2 local116 = local111.aClass11_Sub1_Sub1_Sub2_Sub2_2;
					local102 = arg0.anInt9925 - local116.anInt9925;
					local95 = arg0.anInt9929 - local116.anInt9929;
				} else {
					local74 = local28 & 0x7FFF;
					@Pc(78) Class11_Sub1_Sub1_Sub2_Sub1 local78 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local74];
					if (local78 == null) {
						arg0.method2763(-1, local24);
						continue;
					}
					local95 = arg0.anInt9929 - local78.anInt9929;
					local102 = arg0.anInt9925 - local78.anInt9925;
				}
				if (local102 != 0 || local95 != 0) {
					arg0.method2763((int) (Math.atan2((double) local102, (double) local95) * 2607.5945876176133D) & 0x3FFF, local24);
				}
			} else if (!arg0.method2763(-1, local24)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray231 = null;
			arg0.anIntArray230 = null;
		}
	}
}
