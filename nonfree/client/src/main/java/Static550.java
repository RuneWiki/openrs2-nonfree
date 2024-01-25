import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "Z")
	public static boolean aBoolean530 = true;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)Z")
	public static boolean method6467() {
		try {
			return Static271.method4455();
		} catch (@Pc(15) IOException local15) {
			Static567.method8638();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(79) String local79 = "T2 - " + (Static61.aClass200_15 == null ? -1 : Static61.aClass200_15.method5148()) + "," + (Static191.aClass200_47 == null ? -1 : Static191.aClass200_47.method5148()) + "," + (Static66.aClass200_16 == null ? -1 : Static66.aClass200_16.method5148()) + " - " + Static272.anInt4948 + "," + (Static299.anInt5307 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0]) + "," + (Static171.anInt3340 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0]) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static272.anInt4948 && local81 < 50; local81++) {
				local79 = local79 + Static30.aClass3_Sub3_Sub2_1.aByteArray54[local81] + ",";
			}
			Static335.method5467(local79, local20);
			Static439.method6845(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLclient!jc;)I")
	public static int method6468(@OriginalArg(1) Class3_Sub3_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method4276(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method4276(5);
		} else if (local10 == 2) {
			local17 = arg0.method4276(8);
		} else {
			local17 = arg0.method4276(11);
		}
		return local17;
	}
}
