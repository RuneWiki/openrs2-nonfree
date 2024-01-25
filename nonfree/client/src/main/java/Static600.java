import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!pg;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)I")
	public static int method8378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static299.aClass40Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || Static111.anInt1752 - 1 < local11 || Static279.anInt4567 - 1 < local15) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static480.aByteArrayArrayArray19[1][local11][local15] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static299.aClass40Array1[local48].method8447(arg1, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fs;IILclient!qfa;IIILclient!fha;)V")
	public static void method8380(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class283 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class14_Sub1_Sub1_Sub3_Sub1 arg6) {
		@Pc(7) Class5_Sub52 local7 = new Class5_Sub52();
		local7.anInt10409 = arg5 << 9;
		local7.anInt10424 = arg4;
		local7.anInt10413 = arg2 << 9;
		if (arg3 != null) {
			local7.aClass283_1 = arg3;
			@Pc(37) int local37 = arg3.anInt7838;
			@Pc(40) int local40 = arg3.anInt7822;
			if (arg1 == 1 || arg1 == 3) {
				local40 = arg3.anInt7838;
				local37 = arg3.anInt7822;
			}
			local7.anInt10420 = local40 + arg5 << 9;
			local7.anIntArray838 = arg3.anIntArray622;
			local7.anInt10421 = local37 + arg2 << 9;
			local7.anInt10422 = arg3.anInt7827;
			local7.anInt10417 = arg3.anInt7791;
			local7.anInt10411 = arg3.anInt7798 << 9;
			local7.anInt10412 = arg3.anInt7792 << 9;
			local7.anInt10425 = arg3.anInt7837;
			local7.anInt10419 = arg3.anInt7812;
			local7.anInt10423 = arg3.anInt7825;
			local7.aBoolean837 = arg3.aBoolean648;
			local7.aBoolean835 = arg3.aBoolean653;
			local7.anInt10410 = arg3.anInt7834;
			if (arg3.anIntArray623 != null) {
				local7.aBoolean836 = true;
				local7.method8843();
			}
			if (local7.anIntArray838 != null) {
				local7.anInt10416 = local7.anInt10422 + (int) ((double) (local7.anInt10417 - local7.anInt10422) * Math.random());
			}
			Static250.aClass306_16.method7303(local7);
		} else if (arg0 != null) {
			local7.aClass14_Sub1_Sub1_Sub3_Sub2_2 = arg0;
			@Pc(221) Class271 local221 = arg0.aClass271_1;
			if (local221.anIntArray591 != null) {
				local7.aBoolean836 = true;
				local221 = local221.method6476(Static564.aClass304_1);
			}
			if (local221 != null) {
				local7.anInt10420 = local221.anInt7335 + arg5 << 9;
				local7.anInt10421 = arg2 + local221.anInt7335 << 9;
				local7.anInt10410 = Static138.method2075(arg0);
				local7.anInt10419 = local221.anInt7337;
				local7.anInt10411 = local221.anInt7334 << 9;
				local7.anInt10423 = local221.anInt7329;
				local7.anInt10425 = local221.anInt7313;
				local7.aBoolean837 = local221.aBoolean612;
				local7.anInt10412 = local221.anInt7323 << 9;
			}
			Static573.aClass306_59.method7303(local7);
		} else if (arg6 != null) {
			local7.aClass14_Sub1_Sub1_Sub3_Sub1_2 = arg6;
			local7.anInt10421 = arg2 + arg6.method2509() << 9;
			local7.anInt10420 = arg5 + arg6.method2509() << 9;
			local7.anInt10410 = Static94.method8744(arg6);
			local7.aBoolean837 = arg6.aBoolean239;
			local7.anInt10425 = arg6.anInt2737;
			local7.anInt10412 = 0;
			local7.anInt10411 = arg6.anInt2727 << 9;
			local7.anInt10419 = 256;
			local7.anInt10423 = 256;
			Static616.aClass81_73.method1607(local7, (long) arg6.anInt2960);
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method8381() {
		aClass38_1.method796();
		Static81.aClass13_1.method6344();
		Static108.aClient1.method1197();
		Static181.aCanvas3.setBackground(Color.black);
		Static46.anInt747 = -1;
		aClass38_1 = Static200.method3154(Static181.aCanvas3);
		Static81.aClass13_1 = Static143.method4227(Static181.aCanvas3);
	}
}
