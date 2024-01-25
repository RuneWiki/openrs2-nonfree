import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
	public static int anInt9983 = 500;

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "[F")
	public static final float[] aFloatArray106 = new float[4];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!ic;)I")
	public static int method8586(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt4201;
		@Pc(20) Class101 local20 = arg0.method5991(101);
		if (arg0.anInt7008 == -1 || arg0.aBoolean543) {
			local14 = arg0.anInt4210;
		} else if (arg0.anInt7008 == local20.anInt2168 || arg0.anInt7008 == local20.anInt2179 || arg0.anInt7008 == local20.anInt2197 || local20.anInt2185 == arg0.anInt7008) {
			local14 = arg0.anInt4224;
		} else if (local20.anInt2165 == arg0.anInt7008 || arg0.anInt7008 == local20.anInt2205 || local20.anInt2182 == arg0.anInt7008 || arg0.anInt7008 == local20.anInt2172) {
			local14 = arg0.anInt4198;
		}
		return local14;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)I")
	public static int method8588() {
		return Static53.anInt839;
	}
}
