import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_9 = new Class210(14, 0, 4, 1);

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_375 = new Class64(84, 6);

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "[I")
	public static final int[] anIntArray617 = new int[1024];

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_10 = new Class210(2, 4, 4, 0);

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
	public static void method6279() {
		Static338.aClass115Array2 = null;
		Static402.method5814(-1, Static249.anInt4945, 0, Static2.anInt29, 0, 0, 0, Static19.anInt390);
		if (Static338.aClass115Array2 != null) {
			Static504.method7175(-1412584499, Static468.anInt2402, 0, Static19.anInt390, Static107.aClass115_13.anInt3436, Static2.anInt29, Static338.aClass115Array2, 0, Static28.anInt550);
			Static338.aClass115Array2 = null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)I")
	public static int method6280(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6281(@OriginalArg(1) String arg0) {
		if (Static192.aStringArray13 == null) {
			Static421.method7828();
		}
		@Pc(14) String[] local14 = Static246.method4172(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static174.anInt3757; local20 > 0; local20--) {
				Static192.aStringArray13[local20] = Static192.aStringArray13[local20 - 1];
			}
			Static192.aStringArray13[0] = local14[local16];
			if (Static192.aStringArray13.length - 1 > Static174.anInt3757) {
				Static174.anInt3757++;
				if (Static335.anInt6552 > 0) {
					Static335.anInt6552++;
				}
			}
		}
	}
}
