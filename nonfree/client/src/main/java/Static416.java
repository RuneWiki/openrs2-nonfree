import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	public static int anInt3517;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!ula;")
	public static Class379 aClass379_6;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!aba;)V")
	public static void method3200(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static393.anInt6120; local7++) {
			@Pc(15) int local15 = Static95.anIntArray119[local7];
			@Pc(19) Class9_Sub1_Sub1_Sub2_Sub1 local19 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local15];
			@Pc(23) int local23 = arg0.method2048(255);
			if ((local23 & 0x8) != 0) {
				local23 += arg0.method2048(255) << 8;
			}
			if ((local23 & 0x400) != 0) {
				local23 += arg0.method2048(255) << 16;
			}
			Static50.method1251(local19, local23, arg0, local15);
		}
		if (72 < 16) {
			anInt3517 = -8;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method3201(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 10);
		local9.method9260();
	}
}
