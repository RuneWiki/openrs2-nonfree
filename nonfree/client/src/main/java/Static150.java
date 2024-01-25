import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array5;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!ie;")
	public static Class112 aClass112_2;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static int anInt2864 = 0;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "S")
	public static short aShort49 = 320;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIII)V")
	public static void method2455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (client.lb == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 << 28 | arg0 << 14 | arg2);
		@Pc(25) Class1_Sub25 local25 = (Class1_Sub25) Static129.aClass96_24.method2335(local19);
		if (local25 == null) {
			Static405.method5430(arg1, arg2, arg0);
			return;
		}
		@Pc(47) Class1_Sub22 local47 = (Class1_Sub22) local25.aClass181_29.method4112();
		if (local47 == null) {
			Static405.method5430(arg1, arg2, arg0);
			return;
		}
		@Pc(61) Class31_Sub5_Sub1 local61 = (Class31_Sub5_Sub1) Static405.method5430(arg1, arg2, arg0);
		if (local61 == null) {
			local61 = new Class31_Sub5_Sub1();
		} else {
			local61.anInt7253 = local61.anInt7245 = -1;
		}
		local61.anInt7249 = local47.anInt3023;
		local61.anInt7252 = local47.anInt3025;
		label44: while (true) {
			@Pc(89) Class1_Sub22 local89 = (Class1_Sub22) local25.aClass181_29.method4104();
			if (local89 == null) {
				break;
			}
			if (local89.anInt3023 != local61.anInt7249) {
				local61.anInt7248 = local89.anInt3025;
				local61.anInt7253 = local89.anInt3023;
				while (true) {
					@Pc(110) Class1_Sub22 local110 = (Class1_Sub22) local25.aClass181_29.method4104();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt3023 != local61.anInt7249 && local61.anInt7253 != local110.anInt3023) {
						local61.anInt7251 = local110.anInt3025;
						local61.anInt7245 = local110.anInt3023;
					}
				}
			}
		}
		@Pc(154) int local154 = Static301.method4312(arg1, (arg2 << 7) + 64, (arg0 << 7) + 64);
		Static256.method3831(arg1, arg2, arg0, local154, local61);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!lq;I)Lclient!bg;")
	public static Class22 method2457(@OriginalArg(1) Class31_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class22 local14;
		if (Static200.aClass22_3 == null) {
			local14 = new Class22();
		} else {
			local14 = Static200.aClass22_3;
			Static200.aClass22_3 = Static200.aClass22_3.aClass22_1;
			Static156.anInt2954--;
			local14.aClass22_1 = null;
		}
		local14.aClass31_Sub2_1 = arg0;
		local14.anInt640 = arg1;
		return local14;
	}
}
