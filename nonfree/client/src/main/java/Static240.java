import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!kda;")
	public static final Class168 aClass168_2 = new Class168();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z")
	public static boolean method3740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static245.method3831(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static23.anInt420;
			@Pc(14) int local14 = arg2 << Static23.anInt420;
			return Static416.method5920(local10 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static416.method5920(local10 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static416.method5920(local10 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static113.anInt1928 - 1) && Static416.method5920(local10 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static113.anInt1928 - 1);
		} else {
			return false;
		}
	}
}
