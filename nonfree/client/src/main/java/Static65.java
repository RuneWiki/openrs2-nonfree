import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "[S")
	public static short[] aShortArray158;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[Lclient!gm;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array27 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)Lclient!dn;")
	public static Class11 method7159() {
		try {
			return (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!gba;I)Z")
	public static boolean method7160(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method3087(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg1.method3087(1) != 0) {
				method7160(arg0, arg1);
			}
			local28 = arg1.method3087(6);
			local33 = arg1.method3087(6);
			@Pc(43) boolean local43 = arg1.method3087(1) == 1;
			if (local43) {
				Static255.anIntArray355[Static125.anInt3025++] = arg0;
			}
			if (Static473.aClass47_Sub2_Sub3_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class159 local66 = Static351.aClass159Array1[arg0];
			@Pc(74) Class47_Sub2_Sub3_Sub2 local74 = Static473.aClass47_Sub2_Sub3_Sub2Array1[arg0] = new Class47_Sub2_Sub3_Sub2();
			local74.anInt5045 = arg0;
			if (Static133.aClass1_Sub13Array1[arg0] != null) {
				local74.method4376(Static133.aClass1_Sub13Array1[arg0]);
			}
			local74.method4351(true, local66.anInt4753);
			local74.anInt5061 = local66.anInt4751;
			local100 = local66.anInt4756;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean346 = local66.aBoolean289;
			local74.aByteArray68[0] = Static31.aByteArray13[arg0];
			local74.aByte94 = (byte) local104;
			local74.method4378((local114 << 6) - (Static517.anInt8716 - local33), local28 + (local110 << 6) - Static324.anInt6132);
			local74.aBoolean345 = false;
			Static351.aClass159Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method3087(2);
			local33 = Static351.aClass159Array1[arg0].anInt4756;
			Static351.aClass159Array1[arg0].anInt4756 = ((local28 + (local33 >> 28) & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(208) int local208;
			@Pc(213) int local213;
			@Pc(222) int local222;
			if (local8 != 2) {
				local28 = arg1.method3087(18);
				local33 = local28 >> 16;
				local208 = local28 >> 8 & 0xFF;
				local213 = local28 & 0xFF;
				local222 = Static351.aClass159Array1[arg0].anInt4756;
				local100 = (local222 >> 28) + local33 & 0x3;
				local104 = (local222 >> 14) + local208 & 0xFF;
				local110 = local213 + local222 & 0xFF;
				Static351.aClass159Array1[arg0].anInt4756 = (local104 << 14) + (local100 << 28) + local110;
				return false;
			}
			local28 = arg1.method3087(5);
			local33 = local28 >> 3;
			local208 = local28 & 0x7;
			local213 = Static351.aClass159Array1[arg0].anInt4756;
			local222 = (local213 >> 28) + local33 & 0x3;
			local100 = local213 >> 14 & 0xFF;
			local104 = local213 & 0xFF;
			if (local208 == 0) {
				local100--;
				local104--;
			}
			if (local208 == 1) {
				local104--;
			}
			if (local208 == 2) {
				local104--;
				local100++;
			}
			if (local208 == 3) {
				local100--;
			}
			if (local208 == 4) {
				local100++;
			}
			if (local208 == 5) {
				local104++;
				local100--;
			}
			if (local208 == 6) {
				local104++;
			}
			if (local208 == 7) {
				local100++;
				local104++;
			}
			Static351.aClass159Array1[arg0].anInt4756 = local104 + (local222 << 28) + (local100 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	public static void method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub1_Sub13 local15 = Static476.method6225(5, arg0);
		local15.method4919();
		local15.anInt5686 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
	public static void method7167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static497.anInt8450 == 1) {
			Static538.method7882(Static478.aClass1_Sub50_3, arg1, arg0);
		} else if (Static497.anInt8450 == 2) {
			Static360.method7850(arg1, arg0);
		}
		Static497.anInt8450 = 0;
		Static478.aClass1_Sub50_3 = null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
	public static int method7168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
