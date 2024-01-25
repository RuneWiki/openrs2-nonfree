import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
	public static int anInt2780;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!eo", name = "O", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_9 = new Class130();

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!eo", name = "S", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_51 = new Class298(65, -1);

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "[Lclient!nr;")
	public static final Interface16[] anInterface16Array1 = new Interface16[75];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZ)V")
	public static void method2528(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class3_Sub11 local15 = new Class3_Sub11(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method3118();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(29) int[] local29 = Static228.anIntArray131 = new int[6];
					local29[0] = local15.method3109();
					local29[1] = local15.method3109();
					local29[2] = local15.method3109();
					local29[3] = local15.method3109();
					local29[4] = local15.method3109();
					local29[5] = local15.method3109();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local19 == 4) {
						local76 = local15.method3118();
						Static183.anIntArray306 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static183.anIntArray306[local81] = local15.method3109();
							if (Static183.anIntArray306[local81] == 65535) {
								Static183.anIntArray306[local81] = -1;
							}
						}
					} else if (local19 == 5) {
						local76 = local15.method3118();
						Static16.anIntArray28 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static16.anIntArray28[local81] = local15.method3109();
							if (Static16.anIntArray28[local81] == 65535) {
								Static16.anIntArray28[local81] = -1;
							}
						}
					}
				}
			}
		}
	}
}
