import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "Lclient!bd;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
	public static void method2858(@OriginalArg(0) int arg0) {
		Static559.anInt8812 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLclient!hh;Lclient!hh;)V")
	public static void method2861(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_346 != null) {
			arg0.method9872();
		}
		arg0.aClass2_346 = arg1.aClass2_346;
		arg0.aClass2_345 = arg1;
		arg0.aClass2_346.aClass2_345 = arg0;
		arg0.aClass2_345.aClass2_346 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!tt;)V")
	public static void method2862(@OriginalArg(1) Class2_Sub6_Sub20 arg0) {
		if (Static189.aBoolean301) {
			return;
		}
		arg0.method9872();
		Static535.anInt8486--;
		if (!arg0.aBoolean828) {
			@Pc(30) long local30 = arg0.aLong303;
			@Pc(36) Class2_Sub6_Sub7 local36;
			for (local36 = (Class2_Sub6_Sub7) Static678.aClass218_43.method5095(local30, 0); local36 != null && !local36.aString51.equals(arg0.aString106); local36 = (Class2_Sub6_Sub7) Static678.aClass218_43.method5100((byte) 74)) {
			}
			if (local36 != null && local36.method4059(arg0)) {
				Static681.method9204(local36);
				return;
			}
			return;
		}
		for (@Pc(76) Class2_Sub6_Sub7 local76 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local76 != null; local76 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
			if (local76.aString51.equals(arg0.aString106)) {
				@Pc(88) boolean local88 = false;
				for (@Pc(94) Class2_Sub6_Sub20 local94 = (Class2_Sub6_Sub20) local76.aClass388_4.method9213(); local94 != null; local94 = (Class2_Sub6_Sub20) local76.aClass388_4.method9212()) {
					if (arg0 == local94) {
						if (local76.method4059(arg0)) {
							Static681.method9204(local76);
						}
						local88 = true;
						break;
					}
				}
				if (local88) {
					return;
				}
			}
		}
	}
}
