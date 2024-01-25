import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!cr;)V")
	public static void method3657(@OriginalArg(1) Class41 arg0) {
		if (!Static428.aBoolean637) {
			return;
		}
		if (arg0.anObjectArray10 != null) {
			@Pc(21) Class41 local21 = Static85.method2627(Static255.anInt4805, Static443.anInt7737);
			if (local21 != null) {
				@Pc(27) Class2_Sub14 local27 = new Class2_Sub14();
				local27.anObjectArray32 = arg0.anObjectArray10;
				local27.aClass41_5 = arg0;
				local27.aClass41_4 = local21;
				Static290.method4227(local27);
			}
		}
		Static448.method6059(Static451.aClass44_21);
		Static98.aClass2_Sub20_Sub1_1.method3713(arg0.anInt1613);
		Static98.aClass2_Sub20_Sub1_1.method3745(arg0.anInt1683);
		Static98.aClass2_Sub20_Sub1_1.method3740(arg0.anInt1671);
		Static98.aClass2_Sub20_Sub1_1.method3687(Static443.anInt7737);
		Static98.aClass2_Sub20_Sub1_1.method3713(Static255.anInt4805);
		Static98.aClass2_Sub20_Sub1_1.method3697(Static245.anInt4645);
	}
}
