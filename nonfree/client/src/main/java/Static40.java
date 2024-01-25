import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	public static int anInt655;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "Lclient!o;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Lclient!s;")
	public static final Class217 aClass217_25 = new Class217(90, -2);

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Lclient!s;")
	public static final Class217 aClass217_26 = new Class217(64, 10);

	@OriginalMember(owner = "client!br", name = "t", descriptor = "Lclient!je;")
	public static final Class127 aClass127_2 = new Class127(10, 2, 2, 0);

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public static int anInt656 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLclient!ok;)V")
	public static void method554(@OriginalArg(1) Class10_Sub33 arg0) {
		if (Static309.aClass11ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface10 local8 = null;
		if (arg0.anInt5098 == 0) {
			local8 = (Interface10) Static96.method1755(arg0.anInt5109, arg0.anInt5100, arg0.anInt5108);
		}
		if (arg0.anInt5098 == 1) {
			local8 = (Interface10) Static137.method2391(arg0.anInt5109, arg0.anInt5100, arg0.anInt5108);
		}
		if (arg0.anInt5098 == 2) {
			local8 = (Interface10) Static106.method1867(arg0.anInt5109, arg0.anInt5100, arg0.anInt5108, rj.class);
		}
		if (arg0.anInt5098 == 3) {
			local8 = (Interface10) Static447.method5138(arg0.anInt5109, arg0.anInt5100, arg0.anInt5108);
		}
		if (local8 == null) {
			arg0.anInt5101 = -1;
			arg0.anInt5099 = 0;
			arg0.anInt5104 = 0;
		} else {
			arg0.anInt5101 = local8.method5706();
			arg0.anInt5099 = local8.method5702();
			arg0.anInt5104 = local8.method5705();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZ)Lclient!vl;")
	public static Class10_Sub44 method555(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) long local16 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class10_Sub44) Static81.aClass167_10.method3709(local16);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lclient!gh;")
	public static Class89 method557(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static166.aClass89ArrayArray2[local7] == null || Static166.aClass89ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static419.method5518(local7);
			if (!local30) {
				return null;
			}
		}
		return Static166.aClass89ArrayArray2[local7][local16];
	}
}
