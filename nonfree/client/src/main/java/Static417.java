import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lclient!ofa;I)V")
	public static void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) Class265[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) Class265 local11 = arg1[local3];
			if (local11 != null) {
				if (local11.anInt6967 == 0) {
					if (local11.aClass265Array4 != null) {
						method5666(arg0, local11.aClass265Array4);
					}
					@Pc(32) Class3_Sub25 local32 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local11.anInt7032);
					if (local32 != null) {
						Static628.method8496(local32.anInt3959, arg0);
					}
				}
				@Pc(51) Class3_Sub53 local51;
				if (arg0 == 0 && local11.anObjectArray7 != null) {
					local51 = new Class3_Sub53();
					local51.aClass265_16 = local11;
					local51.anObjectArray35 = local11.anObjectArray7;
					Static250.method3767(local51);
				}
				if (arg0 == 1 && local11.anObjectArray19 != null) {
					if (local11.anInt7004 >= 0) {
						@Pc(77) Class265 local77 = Static223.method3278(local11.anInt7032);
						if (local77 == null || local77.aClass265Array4 == null || local77.aClass265Array4.length <= local11.anInt7004 || local77.aClass265Array4[local11.anInt7004] != local11) {
							continue;
						}
					}
					local51 = new Class3_Sub53();
					local51.aClass265_16 = local11;
					local51.anObjectArray35 = local11.anObjectArray19;
					Static250.method3767(local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZI)V")
	public static void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(17) Class3_Sub37 local17 = Static90.method1509(Static574.aClass240_102, Static226.aClass144_2);
			local17.aClass3_Sub4_Sub1_2.method7956(arg0);
			Static301.method2678(local17);
		} else {
			Static250.method3776(Static587.aClass343_13, arg0, -1);
		}
	}
}
