import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
	public static int anInt8220;

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_15 = new Class174(1);

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(III)Lclient!ao;")
	public static Class15_Sub1 method6634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_3;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIII)I")
	public static int method6635(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub24 local8 = Static459.method6391(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray260.length > arg2) {
			return local8.anIntArray260[arg2];
		} else {
			return 0;
		}
	}
}
