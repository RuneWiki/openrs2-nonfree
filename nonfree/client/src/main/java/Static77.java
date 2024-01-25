import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "Lclient!uga;")
	public static Class361 aClass361_1;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "[Lclient!s;")
	public static Class84[] aClass84Array1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!wea;B)Z")
	public static boolean method1286(@OriginalArg(0) Class389 arg0) {
		try {
			return Static578.method7756(arg0);
		} catch (@Pc(15) IOException local15) {
			if (Static652.anInt10664 == 9) {
				arg0.aClass50_2 = null;
				return false;
			} else {
				Static613.method8423();
				return true;
			}
		} catch (@Pc(29) Exception local29) {
			@Pc(104) String local104 = "T2 - " + (arg0.aClass156_220 == null ? -1 : arg0.aClass156_220.method3528()) + "," + (arg0.aClass156_217 == null ? -1 : arg0.aClass156_217.method3528()) + "," + (arg0.aClass156_218 == null ? -1 : arg0.aClass156_218.method3528()) + " - " + arg0.anInt10756 + "," + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] + Static315.anInt5380) + "," + (Static290.anInt5128 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0]) + " - ";
			for (@Pc(106) int local106 = 0; arg0.anInt10756 > local106 && local106 < 50; local106++) {
				local104 = local104 + arg0.aClass5_Sub36_Sub2_2.aByteArray89[local106] + ",";
			}
			Static522.method7115(local29, local104);
			Static452.method6395(false);
			return true;
		}
	}
}
