import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_144 = new Class145(47, 2);

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "[I")
	public static final int[] anIntArray603 = new int[13];

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_145 = new Class145(58, -1);

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	public static int anInt8218 = -1;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_146 = new Class145(83, -1);

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
	public static int anInt8219 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7061(@OriginalArg(0) Class13 arg0) {
		Static193.aClass332Array2 = new Class332[Static417.anIntArray468.length];
		for (@Pc(20) int local20 = 0; local20 < Static417.anIntArray468.length; local20++) {
			@Pc(25) int local25 = Static417.anIntArray468[local20];
			@Pc(30) Class183 local30 = Static427.method6221(local25, Static142.aClass238_69);
			@Pc(38) Class37 local38 = arg0.method8136(local30, Static654.method3454(Static631.aClass238_291, local25));
			Static193.aClass332Array2[local20] = new Class332(local38, local30);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI)Z")
	public static boolean method7063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static113.method2019(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static457.method7542(arg0, arg1) | Static363.method5407(arg0, arg1));
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIBII)V")
	public static void method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg0 >= Static566.anInt9279 && arg0 + arg4 <= Static392.anInt6753 && arg1 - arg0 >= Static346.anInt5494 && arg0 + arg1 <= Static640.anInt10333) {
			Static260.method4306(arg2, arg4, arg5, arg3, arg1, arg0);
		} else {
			Static464.method6568(arg0, arg2, arg3, arg1, arg5, arg4);
		}
	}
}
