import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static624 {

	@OriginalMember(owner = "client!wea", name = "O", descriptor = "Lclient!efa;")
	public static final Class85 aClass85_5 = new Class85();

	@OriginalMember(owner = "client!wea", name = "P", descriptor = "Lclient!vfa;")
	public static final Class361 aClass361_12 = new Class361();

	@OriginalMember(owner = "client!wea", name = "R", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_130 = new Class179(44, 1);

	@OriginalMember(owner = "client!wea", name = "S", descriptor = "I")
	public static int anInt10032 = 100;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!paa;I)V")
	public static void method8351(@OriginalArg(0) Class261 arg0) {
		if (Static170.anInt9509 == arg0.anInt6591) {
			Static69.aBooleanArray25[arg0.anInt6625] = true;
		}
	}

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)Lclient!qc;")
	public static Class2_Sub13_Sub3 method8352() {
		return Static267.aClass2_Sub13_Sub3_3;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(II)I")
	public static int method8353(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "(II)I")
	public static int method8354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static491.anIntArrayArray50 == null ? 0 : Static491.anIntArrayArray50[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIII)V")
	public static void method8356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static491.anIntArrayArray50 != null) {
			Static491.anIntArrayArray50[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static459.aShortArrayArray25 != null) {
			Static459.aShortArrayArray25[arg0][arg1] = (short) arg3;
		}
		if (Static136.aByteArrayArray32 != null) {
			Static136.aByteArrayArray32[arg0][arg1] = (byte) arg4;
		}
	}
}
