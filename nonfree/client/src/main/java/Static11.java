import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_6;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_7 = new Class47(7, 16);

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_8 = new Class47(11, 8);

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
	public static int anInt321 = 64;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z[Lclient!rr;I)V")
	public static void method240(@OriginalArg(1) Class292[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) Class292 local11 = arg0[local3];
			if (local11 != null) {
				if (local11.lb == 0) {
					if (local11.aClass292Array2 != null) {
						method240(local11.aClass292Array2, arg1);
					}
					@Pc(32) Class6_Sub11 local32 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local11.anInt7890);
					if (local32 != null) {
						Static201.method3632(local32.anInt1216, arg1);
					}
				}
				@Pc(48) Class6_Sub43 local48;
				if (arg1 == 0 && local11.anObjectArray18 != null) {
					local48 = new Class6_Sub43();
					local48.aClass292_12 = local11;
					local48.anObjectArray34 = local11.anObjectArray18;
					Static446.method6319(local48);
				}
				if (arg1 == 1 && local11.anObjectArray27 != null) {
					if (local11.anInt7964 >= 0) {
						@Pc(76) Class292 local76 = Static367.method5505(local11.anInt7890);
						if (local76 == null || local76.aClass292Array2 == null || local11.anInt7964 >= local76.aClass292Array2.length || local11 != local76.aClass292Array2[local11.anInt7964]) {
							continue;
						}
					}
					local48 = new Class6_Sub43();
					local48.anObjectArray34 = local11.anObjectArray27;
					local48.aClass292_12 = local11;
					Static446.method6319(local48);
				}
			}
		}
	}
}
