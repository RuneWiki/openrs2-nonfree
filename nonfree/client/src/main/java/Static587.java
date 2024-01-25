import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8141(@OriginalArg(1) String arg0) {
		if (!Static291.aBoolean314 || (Static255.anInt5389 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static475.anInt8165;
		@Pc(18) int[] local18 = Static75.anIntArray82;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class2_Sub1_Sub1_Sub3_Sub1 local28 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local18[local20]];
			if (local28.aString45 != null && local28.aString45.equalsIgnoreCase(arg0) && (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == local28 && (Static255.anInt5389 & 0x10) != 0 || local28 != null && (Static255.anInt5389 & 0x8) != 0)) {
				@Pc(61) Class6_Sub26 local61 = Static268.method3981(Static377.aClass15_2, Static474.aClass289_104);
				local61.aClass6_Sub23_Sub1_2.method8349(0);
				local61.aClass6_Sub23_Sub1_2.method8338(local18[local20]);
				local61.aClass6_Sub23_Sub1_2.method8364(Static663.anInt9822);
				local61.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
				local61.aClass6_Sub23_Sub1_2.method8338(Static672.anInt10372);
				Static670.method9077(local61);
				local14 = true;
				Static508.method8438(true, 0, local28.method4326(), -2, local28.anIntArray301[0], 0, local28.method4326(), local28.anIntArray302[0]);
				break;
			}
		}
		if (!local14) {
			Static270.method3991(Static52.aClass41_21.method1007(Static616.anInt10077) + arg0);
		}
		if (Static291.aBoolean314) {
			Static221.method3209();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)B")
	public static byte method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBII)V")
	public static void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = Static424.anInt7322;
		@Pc(11) int local11 = Static630.anInt6211;
		if (Static594.aBoolean693) {
			local9 += Static234.method3562();
			local11 += Static314.method4504();
		}
		@Pc(34) Class9 local34;
		if (Static642.anInt10379 == 1) {
			local34 = Static605.aClass9Array165[Static349.anInt5939 / 100];
			local34.method8920(local9 - 8, local11 + -8);
			Static629.method8681(local9 + local34.method8937() - 8, local11 + -8, local34.method8930() + local11 - 8, local9 + -8);
		}
		if (Static642.anInt10379 == 2) {
			local34 = Static605.aClass9Array165[Static349.anInt5939 / 100 + 4];
			local34.method8920(local9 - 8, local11 + -8);
			Static629.method8681(local34.method8937() + local9 - 8, local11 + -8, local34.method8930() + local11 - 8, local9 - 8);
		}
		Static188.method2687();
	}
}
