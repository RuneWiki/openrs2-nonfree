import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public static int anInt4258;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_90 = new Class253(25, -1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
	public static void method3352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class260 local3 = new Class260();
		local3.anInt7220 = arg1 >> Static168.anInt3026;
		local3.anInt7215 = arg2 >> Static168.anInt3026;
		local3.anInt7229 = arg3 >> Static168.anInt3026;
		local3.anInt7213 = arg4 >> Static168.anInt3026;
		local3.anInt7226 = arg0;
		local3.anInt7216 = arg1;
		local3.anInt7225 = arg2;
		local3.anInt7222 = arg3;
		local3.anInt7230 = arg4;
		local3.anInt7232 = arg5;
		local3.anInt7214 = arg6;
		Static124.aClass260Array1[Static36.anInt641++] = local3;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!dr;I)V")
	public static void method3353(@OriginalArg(0) Class7_Sub14_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static345.anInt5547; local3++) {
			@Pc(9) int local9 = Static419.anIntArray587[local3];
			@Pc(13) Class26_Sub2_Sub4_Sub2 local13 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method3981();
			if ((local17 & 0x40) != 0) {
				local17 += arg0.method3981() << 8;
			}
			if ((local17 & 0x200) != 0) {
				local17 += arg0.method3981() << 16;
			}
			Static360.method4616(local9, local17, local13, arg0);
		}
	}
}
