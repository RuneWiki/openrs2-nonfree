import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Lclient!js;")
	public static final Class156 aClass156_6 = new Class156(10, 2, 2, 0);

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
	public static final int[] anIntArray327 = new int[2048];

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
	public static int anInt4108 = 1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!av;I)I")
	public static int method3848(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt677;
		@Pc(14) Class299 local14 = arg0.method7819();
		if (arg0.aBoolean677) {
			local8 = arg0.anInt683;
		} else if (local14.anInt8814 == arg0.anInt9030 || local14.anInt8834 == arg0.anInt9030 || local14.anInt8817 == arg0.anInt9030 || local14.anInt8843 == arg0.anInt9030) {
			local8 = arg0.anInt671;
		} else if (local14.anInt8826 == arg0.anInt9030 || arg0.anInt9030 == local14.anInt8844 || local14.anInt8827 == arg0.anInt9030 || arg0.anInt9030 == local14.anInt8818) {
			local8 = arg0.anInt687;
		}
		return local8;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3849(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static198.aStringArray22.length; local12++) {
			if (Static198.aStringArray22[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!kj;I)V")
	public static void method3850(@OriginalArg(0) Class1_Sub17_Sub2 arg0) {
		arg0.method4510();
		@Pc(19) int local19 = Static16.anInt9513;
		@Pc(29) Class20_Sub1_Sub1_Sub1 local29 = Static107.aClass20_Sub1_Sub1_Sub1_1 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local19] = new Class20_Sub1_Sub1_Sub1();
		local29.anInt8969 = local19;
		@Pc(37) int local37 = arg0.method4517(30);
		@Pc(42) byte local42 = (byte) (local37 >> 28);
		@Pc(48) int local48 = local37 >> 14 & 0x3FFF;
		local29.anIntArray780[0] = local48 - Static538.anInt9485;
		@Pc(60) int local60 = local37 & 0x3FFF;
		local29.anInt8954 = (local29.anIntArray780[0] << 7) + (local29.method7808() << 6);
		local29.anIntArray781[0] = local60 - Static282.anInt5380;
		local29.anInt8949 = (local29.anIntArray781[0] << 7) + (local29.method7808() << 6);
		Static322.anInt6113 = local29.aByte108 = local42;
		if (Static316.aClass1_Sub17Array1[local19] != null) {
			local29.method723(Static316.aClass1_Sub17Array1[local19]);
		}
		Static207.anInt4085 = 0;
		anIntArray327[Static207.anInt4085++] = local19;
		Static165.aByteArray46[local19] = 0;
		Static262.anInt5082 = 0;
		for (@Pc(130) int local130 = 1; local130 < 2048; local130++) {
			if (local19 != local130) {
				@Pc(140) int local140 = arg0.method4517(18);
				@Pc(144) int local144 = local140 >> 16;
				@Pc(150) int local150 = local140 >> 8 & 0xFF;
				@Pc(154) int local154 = local140 & 0xFF;
				@Pc(162) Class312 local162 = Class20_Sub1_Sub5.lb[local130] = new Class312();
				local162.anInt9200 = 0;
				local162.anInt9198 = local154 + (local150 << 14) + (local144 << 28);
				local162.anInt9201 = -1;
				local162.aBoolean689 = false;
				Static297.anIntArray451[Static262.anInt5082++] = local130;
				Static165.aByteArray46[local130] = 0;
			}
		}
		arg0.method4518();
	}
}
