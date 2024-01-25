import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	public static int anInt5556 = 0;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	public static int anInt5564 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4374(@OriginalArg(0) String arg0) {
		if (Static54.aStringArray8 == null) {
			Static58.method1035();
		}
		@Pc(19) String[] local19 = Static192.method2761('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			for (@Pc(25) int local25 = Static188.anInt3240; local25 > 0; local25--) {
				Static54.aStringArray8[local25] = Static54.aStringArray8[local25 - 1];
			}
			Static54.aStringArray8[0] = local19[local21];
			if (Static188.anInt3240 < Static54.aStringArray8.length - 1) {
				if (Static119.anInt2216 > 0) {
					Static119.anInt2216++;
				}
				Static188.anInt3240++;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!vb;)V")
	public static void method4375(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub25_5 != null) {
			arg0.aClass1_Sub25_5.anInt3337 = 0;
		}
		arg0.aBoolean726 = false;
		for (@Pc(22) Class1_Sub6 local22 = arg0.method5167(); local22 != null; local22 = arg0.method5168()) {
			method4375(local22);
		}
	}
}
