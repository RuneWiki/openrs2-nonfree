import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!fo;")
	public static Class82 aClass82_74;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILclient!er;I)V")
	public static void method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class68 arg3) {
		for (@Pc(8) Class1_Sub10 local8 = (Class1_Sub10) Static448.aClass227_54.method4967(); local8 != null; local8 = (Class1_Sub10) Static448.aClass227_54.method4973()) {
			if (local8.anInt861 == arg2 && local8.anInt859 == arg1 << 7 && local8.anInt856 == arg0 << 7 && arg3.anInt1787 == local8.aClass68_1.anInt1787) {
				if (local8.aClass1_Sub6_Sub3_1 != null) {
					Static355.aClass1_Sub6_Sub4_2.method5179(local8.aClass1_Sub6_Sub3_1);
					local8.aClass1_Sub6_Sub3_1 = null;
				}
				if (local8.aClass1_Sub6_Sub3_2 != null) {
					Static355.aClass1_Sub6_Sub4_2.method5179(local8.aClass1_Sub6_Sub3_2);
					local8.aClass1_Sub6_Sub3_2 = null;
				}
				local8.method5915();
				return;
			}
		}
	}
}
