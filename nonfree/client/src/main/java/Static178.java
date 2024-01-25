import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
	public static int anInt3536;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "Z")
	public static boolean aBoolean224;

	@OriginalMember(owner = "client!li", name = "X", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
	public static final int[] anIntArray227 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!li", name = "U", descriptor = "[Lclient!ph;")
	public static final Class11_Sub4_Sub14[] aClass11_Sub4_Sub14Array4 = new Class11_Sub4_Sub14[14];

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(B)V")
	public static void method2897() {
		Static42.aClass97_6 = null;
		Static91.anInt1786 = -1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([I[Ljava/lang/Object;BII)V")
	public static void method2898(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg3) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local21 + (local47 & 0x1)) {
				@Pc(62) int local62 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local62;
				@Pc(76) Object local76 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local76;
			}
		}
		arg0[arg3] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method2898(arg0, arg1, arg2, local17 - 1);
		method2898(arg0, arg1, local17 + 1, arg3);
	}
}
