import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "Lclient!eq;")
	public static Class97 aClass97_62;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Lclient!fp;")
	public static Class114 aClass114_19;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_5 = new Class271(11, 0, 1, 2);

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
	public static void method3961() {
		Static391.aClass233_31.method5663();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)I")
	public static int method3962(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static380.method5723(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)V")
	public static void method3964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = aClass114_19.method3015(Static628.aClass369_24.method8475(Static377.anInt6756));
		@Pc(49) int local49;
		@Pc(30) int local30;
		if (Static155.aBoolean303) {
			for (@Pc(66) Class2_Sub5_Sub2 local66 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local66 != null; local66 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
				if (local66.anInt964 == 1) {
					local30 = Static474.method6804((Class2_Sub5_Sub20) local66.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66);
				} else {
					local30 = Static121.method2492(local66);
				}
				if (local30 > local17) {
					local17 = local30;
				}
			}
			local17 += 8;
			Static256.anInt5056 = (Static507.aBoolean636 ? 26 : 22) + Static178.anInt3981 * 16;
			local49 = Static178.anInt3981 * 16 + 21;
		} else {
			for (@Pc(24) Class2_Sub5_Sub20 local24 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local24 != null; local24 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				local30 = Static474.method6804(local24);
				if (local30 > local17) {
					local17 = local30;
				}
			}
			local17 += 8;
			local49 = Static90.anInt1824 * 16 + 21;
			Static256.anInt5056 = (Static507.aBoolean636 ? 26 : 22) + Static90.anInt1824 * 16;
		}
		@Pc(124) int local124 = arg1 - local17 / 2;
		if (Static571.anInt9399 < local124 + local17) {
			local124 = Static571.anInt9399 - local17;
		}
		if (local124 < 0) {
			local124 = 0;
		}
		local30 = arg0;
		if (Static585.anInt9606 < arg0 + local49) {
			local30 = Static585.anInt9606 - local49;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		Static254.anInt5025 = local124;
		Static133.anInt3038 = local17;
		Static642.aBoolean757 = true;
		Static378.anInt6772 = local30;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIZ)V")
	public static void method3965(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static23.anInt720++;
			Static575.method7997();
		}
		if (arg1) {
			Static325.anInt5886++;
			Static459.method7104();
		}
	}
}
