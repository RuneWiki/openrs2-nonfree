import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lclient!m;")
	public static Class157 method5732(@OriginalArg(1) int arg0) {
		@Pc(10) Class157 local10 = (Class157) Static230.aClass44_70.method1028((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static280.aClass243_153.method5455(arg0, 0);
		local10 = new Class157();
		if (local20 != null) {
			local10.method3220(new Class5_Sub15(local20), arg0);
		}
		Static230.aClass44_70.method1017((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!aa;)V")
	public static void method5733(@OriginalArg(0) Class2_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort107; local2 <= arg0.aShort104; local2++) {
			for (@Pc(6) int local6 = arg0.aShort106; local6 <= arg0.aShort105; local6++) {
				@Pc(16) Class258 local16 = Static319.aClass258ArrayArrayArray3[arg0.aByte105][local2][local6];
				if (local16 != null) {
					@Pc(21) Class122 local21 = local16.aClass122_3;
					@Pc(23) Class122 local23 = null;
					while (local21 != null) {
						if (local21.aClass2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass122_3 = local21.aClass122_1;
							} else {
								local23.aClass122_1 = local21.aClass122_1;
							}
							local21.method2597();
							break;
						}
						local23 = local21;
						local21 = local21.aClass122_1;
					}
					local16.aByte97 = 0;
					for (@Pc(56) Class122 local56 = local16.aClass122_3; local56 != null; local56 = local56.aClass122_1) {
						local16.aByte97 = (byte) (local16.aByte97 | local56.anInt3227);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public static void method5734() {
		Static210.aClass5_Sub22_Sub1_1.method2747();
		Static199.aClass243_113 = null;
		Static223.anInt3720 = 1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLclient!hp;)V")
	public static void method5735(@OriginalArg(1) Class88_Sub2 arg0) {
		arg0.aClass2_1 = null;
		@Pc(16) int local16 = arg0.aClass88_Sub8Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass88_Sub8Array1[local18].aBoolean496 = false;
		}
		@Pc(32) Class107[] local32 = Class15_Sub2.aClass107Array1;
		synchronized (Class15_Sub2.aClass107Array1) {
			if (Class15_Sub2.aClass107Array1.length > local16 && Static97.anIntArray78[local16] < 200) {
				Class15_Sub2.aClass107Array1[local16].method2332(arg0);
				@Pc(55) int local55 = Static97.anIntArray78[local16]++;
			}
		}
	}
}
