import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!gj;")
	public static Class59 aClass59_37 = new Class59();

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4367(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static153.aString171 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static242.aString252 + "</col>";
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
	public static int method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local8.anIntArray22.length; local34++) {
				if (arg1 == local8.anIntArray23[local34]) {
					local32 += local8.anIntArray22[local34];
				}
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!lf;I)V")
	public static void method4370(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static114.anInt2372; local7++) {
			@Pc(14) int local14 = arg0.method1362();
			@Pc(18) int local18 = arg0.method1386();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static272.aClass29_Sub1Array4[local14] != null) {
				Static272.aClass29_Sub1Array4[local14].anInt5336 = local18;
			}
		}
	}
}
