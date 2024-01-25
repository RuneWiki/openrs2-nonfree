import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!pu;")
	public static Class7_Sub36 aClass7_Sub36_1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "[I")
	public static final int[] anIntArray169 = new int[200];

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "[I")
	public static final int[] anIntArray170 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "[I")
	public static final int[] anIntArray171 = new int[8];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method2017(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static257.aClass6_3 != null) {
			@Pc(24) int local24;
			try {
				Static257.aClass6_3.method28(0L);
				Static257.aClass6_3.method31(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method3952(24, local12);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!ok;I)V")
	public static void method2020(@OriginalArg(0) Class178 arg0) {
		Static183.aClass178_47 = arg0;
	}
}
