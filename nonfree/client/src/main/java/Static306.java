import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!ps;")
	public static Class257 aClass257_3;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_91 = new Class47(28, 4);

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!tl;")
	public static final Class319 aClass319_7 = new Class319();

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	public static int anInt5622 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!sn;B)V")
	public static void method4839(@OriginalArg(0) Class6_Sub41 arg0) {
		if (Static270.aClass276ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface18 local8 = null;
		if (arg0.anInt8210 == 0) {
			local8 = (Interface18) Static162.method2962(arg0.anInt8202, arg0.anInt8201, arg0.anInt8205);
		}
		if (arg0.anInt8210 == 1) {
			local8 = (Interface18) Static401.method5859(arg0.anInt8202, arg0.anInt8201, arg0.anInt8205);
		}
		if (arg0.anInt8210 == 2) {
			local8 = (Interface18) Static117.method2480(arg0.anInt8202, arg0.anInt8201, arg0.anInt8205, pba.class);
		}
		if (arg0.anInt8210 == 3) {
			local8 = (Interface18) Static300.method4758(arg0.anInt8202, arg0.anInt8201, arg0.anInt8205);
		}
		if (local8 == null) {
			arg0.anInt8213 = 0;
			arg0.anInt8208 = -1;
			arg0.anInt8204 = 0;
		} else {
			arg0.anInt8208 = local8.method6265();
			arg0.anInt8213 = local8.method6268();
			arg0.anInt8204 = local8.method6272();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
	public static void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static314.anIntArrayArray53 != null) {
			Static314.anIntArrayArray53[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static132.aShortArrayArray1 != null) {
			Static132.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static305.aByteArrayArray4 != null) {
			Static305.aByteArrayArray4[arg0][arg1] = (byte) arg4;
		}
	}
}
