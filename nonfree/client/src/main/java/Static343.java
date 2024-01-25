import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
	public static final int[] anIntArray414 = new int[3];

	@OriginalMember(owner = "client!md", name = "d", descriptor = "S")
	public static short aShort86 = 32767;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Z")
	public static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_100 = new Class274(102, -2);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!rr;B)I")
	public static int method5242(@OriginalArg(0) Class300 arg0) {
		if (arg0 == Static148.aClass300_3) {
			return 7681;
		} else if (arg0 == Static40.aClass300_1) {
			return 8448;
		} else if (Static215.aClass300_4 == arg0) {
			return 34165;
		} else if (arg0 == Static591.aClass300_5) {
			return 260;
		} else if (arg0 == Static52.aClass300_6) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg1, 14);
		local8.method4393();
		local8.anInt5255 = arg0;
	}
}
