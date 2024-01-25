import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!vea;)V")
	public static void method8669(@OriginalArg(1) Class2_Sub7_Sub21 arg0) {
		if (arg0 == null) {
			return;
		}
		Static177.aClass114_19.method2771(arg0);
		Static633.anInt10265++;
		@Pc(30) Class2_Sub7_Sub20 local30;
		if (arg0.aBoolean721 || "".equals(arg0.aString107)) {
			local30 = new Class2_Sub7_Sub20(arg0.aString107);
			Static471.anInt7593++;
		} else {
			@Pc(38) long local38 = arg0.aLong261;
			for (local30 = (Class2_Sub7_Sub20) Static5.aClass323_2.method7484(local38); local30 != null && !local30.aString106.equals(arg0.aString107); local30 = (Class2_Sub7_Sub20) Static5.aClass323_2.method7486()) {
			}
			if (local30 == null) {
				local30 = (Class2_Sub7_Sub20) Static585.aClass69_64.method1919(local38);
				if (local30 != null && !local30.aString106.equals(arg0.aString107)) {
					local30 = null;
				}
				if (local30 == null) {
					local30 = new Class2_Sub7_Sub20(arg0.aString107);
				}
				Static5.aClass323_2.method7477(local30, local38);
				Static471.anInt7593++;
			}
		}
		if (local30.method8483(arg0)) {
			Static176.method3033(local30);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(II)Z")
	public static boolean method8671(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
