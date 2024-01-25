import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!wo;")
	public static Class362 aClass362_169;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public static int anInt7652;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[Lclient!bg;")
	public static Class32[] aClass32Array1 = null;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public static int anInt7654 = -60;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)Z")
	public static boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static570.method8152(arg0, arg1)) {
			return Static554.method8025(arg1, arg0) | (arg0 & 0x9000) != 0 | Static480.method8255(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static296.method5098(arg0, arg1) | Static240.method7426(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[F)[F")
	public static float[] method6310(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static597.method3726(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
