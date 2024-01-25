import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	public static int anInt10474;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method9170(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			local16 = (local16 << 5) + arg0.charAt(local18) - local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!tw;B)V")
	public static void method9173(@OriginalArg(0) Class2_Sub20_Sub2 arg0) {
		arg0.method8607();
		@Pc(10) int local10 = Class4_Sub2_Sub1_Sub2.lb;
		@Pc(20) Class4_Sub2_Sub1_Sub2_Sub1 local20 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local10] = new Class4_Sub2_Sub1_Sub2_Sub1();
		local20.anInt2320 = local10;
		@Pc(28) int local28 = arg0.method8608(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray183[0] = local39 - Static243.anInt3820;
		local20.anInt10229 = (local20.anIntArray183[0] << 9) + (local20.method2046() << 8);
		local20.anIntArray182[0] = local43 - Static224.anInt11062;
		local20.anInt10228 = (local20.anIntArray182[0] << 9) + (local20.method2046() << 8);
		Static684.anInt10516 = local20.aByte133 = local20.aByte134 = local33;
		if (Static83.method1237(local20.anIntArray183[0], local20.anIntArray182[0])) {
			local20.aByte134++;
		}
		if (Static388.aClass2_Sub20Array1[local10] != null) {
			local20.method730(Static388.aClass2_Sub20Array1[local10]);
		}
		Static268.anInt4162 = 0;
		Static597.anIntArray677[Static268.anInt4162++] = local10;
		Static384.aByteArray84[local10] = 0;
		Static261.anInt10709 = 0;
		for (@Pc(150) int local150 = 1; local150 < 2048; local150++) {
			if (local150 != local10) {
				@Pc(166) int local166 = arg0.method8608(18);
				@Pc(170) int local170 = local166 >> 16;
				@Pc(176) int local176 = local166 >> 8 & 0xFF;
				@Pc(180) int local180 = local166 & 0xFF;
				@Pc(188) Class361 local188 = Static701.aClass361Array2[local150] = new Class361();
				local188.anInt9763 = -1;
				local188.aBoolean834 = false;
				local188.anInt9762 = 0;
				local188.aBoolean835 = false;
				local188.anInt9765 = local180 + (local176 << 14) + (local170 << 28);
				Static347.anIntArray375[Static261.anInt10709++] = local150;
				Static384.aByteArray84[local150] = 0;
			}
		}
		arg0.method8605();
	}
}
