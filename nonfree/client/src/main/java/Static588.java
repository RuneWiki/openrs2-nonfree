import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static588 {

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
	public static int anInt10538;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIILclient!vo;Z)V")
	public static void method8212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class348 arg3) {
		if (arg0 <= 0) {
			Static586.method8188(arg2, arg3, arg1);
			return;
		}
		Static132.aClass4_Sub21_Sub4_1 = null;
		Static139.aBoolean230 = false;
		Static575.anInt10386 = arg2;
		Static221.aClass348_16 = arg3;
		Static491.anInt9287 = 1;
		Static419.anInt7992 = arg1;
		Static563.anInt10263 = 0;
		Static480.anInt10343 = Static365.aClass4_Sub21_Sub4_6.method6187() / arg0;
		if (Static480.anInt10343 < 1) {
			Static480.anInt10343 = 1;
			return;
		}
	}
}
