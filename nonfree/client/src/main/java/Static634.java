import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wia", name = "O", descriptor = "[Lclient!mb;")
	public static Class2_Sub3[] aClass2_Sub3Array7;

	@OriginalMember(owner = "client!wia", name = "gb", descriptor = "I")
	public static int anInt10446;

	@OriginalMember(owner = "client!wia", name = "U", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_153 = new Class218(115, 4);

	@OriginalMember(owner = "client!wia", name = "pb", descriptor = "[[I")
	public static final int[][] anIntArrayArray103 = new int[128][128];

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIB)I")
	public static int method8589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Lclient!jea;")
	public static Class3_Sub1_Sub9 method8592(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub9 local10 = (Class3_Sub1_Sub9) Static367.aClass345_3.method8056((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static347.aClass181_63.method5023(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static47.method1113(local20);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static367.aClass345_3.method8058(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!rq;Z)V")
	public static void method8595(@OriginalArg(0) Class2_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort121; local2 <= arg0.aShort122; local2++) {
			for (@Pc(6) int local6 = arg0.aShort124; local6 <= arg0.aShort123; local6++) {
				@Pc(16) Class106 local16 = Static170.aClass106ArrayArrayArray1[arg0.aByte128][local2][local6];
				if (local16 != null) {
					@Pc(21) Class243 local21 = local16.aClass243_1;
					@Pc(23) Class243 local23 = null;
					while (local21 != null) {
						if (local21.aClass2_Sub3_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass243_1 = local21.aClass243_3;
							} else {
								local23.aClass243_3 = local21.aClass243_3;
							}
							local21.method6372();
							break;
						}
						local23 = local21;
						local21 = local21.aClass243_3;
					}
				}
			}
		}
		if (!arg1) {
			Static637.method8381(arg0);
		}
	}
}
