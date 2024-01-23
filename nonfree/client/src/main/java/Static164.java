import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt3279;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
	public static int[] anIntArray295 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt3278 = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Starting 3d Library";

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fh;Z)V")
	public static void method2823(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static298.aClass38_5 != null) {
			try {
				@Pc(12) int local12 = 0;
				Static298.aClass38_5.method1030(0L);
				Static298.aClass38_5.method1041(local8);
				while (local12 < 24 && local8[local12] == 0) {
					local12++;
				}
				if (local12 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (@Pc(45) int local45 = 0; local45 < 24; local45++) {
					local8[local45] = -1;
				}
			}
		}
		arg0.method1864(local8, 24);
	}
}
