import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_2 = new Class352(14, 0, 4, 1);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!kq;B)I")
	public static int method3088(@OriginalArg(0) Class176 arg0) {
		if (arg0 == Static302.aClass176_5) {
			return 5120;
		} else if (Static302.aClass176_6 == arg0) {
			return 5122;
		} else if (Static302.aClass176_7 == arg0) {
			return 5124;
		} else if (Static302.aClass176_8 == arg0) {
			return 5121;
		} else if (arg0 == Static302.aClass176_9) {
			return 5123;
		} else if (Static302.aClass176_10 == arg0) {
			return 5125;
		} else if (arg0 == Static302.aClass176_11) {
			return 5131;
		} else if (Static302.aClass176_12 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Z")
	public static boolean method3089(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)Z")
	public static boolean method3090(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static467.aClass5_13.method6131();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static467.aClass5_13.method6119();
		} else if (!Static467.aClass5_13.method6165()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static87.aClass6_Sub33_6.method4996(arg0 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub5_1);
			Static541.method7640();
			return true;
		}
	}
}
