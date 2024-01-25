import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	public static int anInt2929 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2158(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg1, 3);
		local8.method2957();
		local8.aString33 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZIII)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static12.aClass34_Sub1_1.anInt7173 != 0 && arg0 != 0 && Static113.anInt2513 < 50 && arg3 != -1) {
			Static117.aClass45Array1[Static113.anInt2513++] = new Class45((byte) 2, arg3, arg0, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Z")
	public static boolean method2160() {
		try {
			return Static442.method6001();
		} catch (@Pc(14) IOException local14) {
			Static48.method898();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static102.aClass263_56 == null ? -1 : Static102.aClass263_56.method5904()) + "," + (Static340.aClass263_146 == null ? -1 : Static340.aClass263_146.method5904()) + "," + (Static280.aClass263_128 == null ? -1 : Static280.aClass263_128.method5904()) + " - " + Static350.anInt6510 + "," + (Static278.anInt5374 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0]) + "," + (Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0] + Static380.anInt6896) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static350.anInt6510 && local79 < 50; local79++) {
				local77 = local77 + Static5.aClass1_Sub3_Sub1_1.aByteArray14[local79] + ",";
			}
			Static247.method3669(local77, local19);
			Static162.method2668(false);
			return true;
		}
	}
}
