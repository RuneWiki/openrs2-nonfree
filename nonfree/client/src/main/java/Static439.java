import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public static int anInt7489 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 >= arg0) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static294.method4291(arg6)) {
			if (Static4.aClass68ArrayArray2[arg6] == null) {
				Static25.method691(arg1, arg7, arg4, arg0, Static300.aClass68ArrayArray3[arg6], arg5, -1, arg3, arg2);
			} else {
				Static25.method691(arg1, arg7, arg4, arg0, Static4.aClass68ArrayArray2[arg6], arg5, -1, arg3, arg2);
			}
		} else if (arg7 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static308.aBooleanArray18[local24] = true;
			}
		} else {
			Static308.aBooleanArray18[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!wt;)V")
	public static void method5866(@OriginalArg(1) Class3_Sub2_Sub2 arg0) {
		arg0.method6056();
		@Pc(8) int local8 = Static177.anInt3617;
		@Pc(18) Class1_Sub3_Sub3_Sub1 local18 = Static113.aClass1_Sub3_Sub3_Sub1_4 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local8] = new Class1_Sub3_Sub3_Sub1();
		local18.anInt6066 = local8;
		@Pc(26) int local26 = arg0.method6057(30);
		@Pc(36) byte local36 = (byte) (local26 >> 28);
		@Pc(42) int local42 = local26 >> 14 & 0x3FFF;
		@Pc(46) int local46 = local26 & 0x3FFF;
		local18.anIntArray453[0] = local42 - Static108.anInt3458;
		local18.anInt6053 = (local18.anIntArray453[0] << 7) + (local18.method4831() << 6);
		local18.anIntArray454[0] = local46 - Static339.anInt6223;
		local18.anInt6055 = (local18.anIntArray454[0] << 7) + (local18.method4831() << 6);
		Static124.anInt2688 = local18.aByte77 = local36;
		if (Static319.aClass3_Sub2Array1[local8] != null) {
			local18.method3934(Static319.aClass3_Sub2Array1[local8]);
		}
		Static207.anInt4136 = 0;
		Static322.anIntArray436[Static207.anInt4136++] = local8;
		Static206.aByteArray45[local8] = 0;
		Static211.anInt4169 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local8) {
				@Pc(134) int local134 = arg0.method6057(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				@Pc(156) Class239 local156 = Static405.aClass239Array1[local125] = new Class239();
				local156.anInt7069 = 0;
				local156.anInt7064 = -1;
				local156.anInt7065 = local148 + (local138 << 28) + (local144 << 14);
				local156.aBoolean493 = false;
				Static224.anIntArray327[Static211.anInt4169++] = local125;
				Static206.aByteArray45[local125] = 0;
			}
		}
		arg0.method6059();
	}
}
