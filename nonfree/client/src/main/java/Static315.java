import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
	public static int anInt5766;

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "Lclient!en;")
	public static final Class84 aClass84_5 = new Class84("", 11);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!rc;B)I")
	public static int method4680(@OriginalArg(0) Class1_Sub40 arg0) {
		@Pc(7) String local7 = Static262.method3792(arg0);
		@Pc(14) int[] local14 = null;
		if (Static176.method2783(arg0.anInt7819)) {
			local14 = Static230.aClass225_1.method4857((int) arg0.aLong199).anIntArray352;
		} else if (arg0.anInt7818 != -1) {
			local14 = Static230.aClass225_1.method4857(arg0.anInt7818).anIntArray352;
		} else if (Static308.method4628(arg0.anInt7819)) {
			@Pc(90) Class1_Sub33 local90 = (Class1_Sub33) Static372.aClass91_30.method2271((long) arg0.aLong199);
			if (local90 != null) {
				@Pc(95) Class11_Sub1_Sub1_Sub3_Sub2 local95 = local90.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				@Pc(98) Class354 local98 = local95.aClass354_1;
				if (local98.anIntArray597 != null) {
					local98 = local98.method7683(Static390.aClass353_29);
				}
				if (local98 != null) {
					local14 = local98.anIntArray595;
				}
			}
		} else if (Static13.method257(arg0.anInt7819)) {
			@Pc(59) Class178 local59;
			if (arg0.anInt7819 == 1010) {
				local59 = Static347.aClass122_4.method2770((int) arg0.aLong199);
			} else {
				local59 = Static347.aClass122_4.method2770((int) (arg0.aLong199 >>> 32 & 0x7FFFFFFFL));
			}
			if (local59.anIntArray252 != null) {
				local59 = local59.method3713(Static390.aClass353_29);
			}
			if (local59 != null) {
				local14 = local59.anIntArray253;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static254.method2368(local14);
		}
		@Pc(139) int local139 = Static88.aClass352_7.method7577(local7, Static519.aClass5Array19);
		if (arg0.aBoolean592) {
			local139 += Static76.aClass5_22.E() + 4;
		}
		return local139;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method4681(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static383.method5512(arg0, arg0.length - 1, arg1, 0);
	}
}
