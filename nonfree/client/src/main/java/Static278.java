import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method3934() {
		for (@Pc(12) Class2_Sub6_Sub7 local12 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local12 != null; local12 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
			if (local12.anInt4448 > 1) {
				local12.anInt4448 = 0;
				Static279.aClass85_31.method1745(((Class2_Sub6_Sub20) local12.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64).aLong303, 16383, local12);
				local12.aClass388_4.method9211();
			}
		}
		Static7.anInt82 = 0;
		Static535.anInt8486 = 0;
		Static273.aClass60_88.method1223();
		Static678.aClass218_43.method5097();
		Static416.aClass388_6.method9211();
		Static189.aBoolean301 = false;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V")
	public static void method3935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(14, (long) arg1);
		local14.method6239();
		local14.anInt6936 = arg0;
	}
}
