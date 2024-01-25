import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
	public static int anInt10753;

	@OriginalMember(owner = "client!vq", name = "eb", descriptor = "[I")
	public static int[] anIntArray801;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public static void method8972(@OriginalArg(0) int arg0) {
		Static563.anIntArray705 = new int[arg0];
		Static616.anIntArray762 = new int[arg0];
		Static666.anIntArray821 = new int[arg0];
		Static241.anIntArray343 = new int[arg0];
		Static230.anIntArray335 = new int[arg0];
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!wia;Lclient!jc;Lclient!wia;Lclient!wia;Lclient!hp;I)Z")
	public static boolean method8976(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class14_Sub5_Sub2 arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) Class112 arg4) {
		Static613.aClass386_127 = arg3;
		Static558.aClass14_Sub5_Sub2_2 = arg1;
		Static43.aClass112_1 = arg4;
		Static437.aClass386_99 = arg0;
		Static627.aClass386_133 = arg2;
		Static76.anIntArray127 = new int[16];
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			Static76.anIntArray127[local26] = 255;
		}
		return true;
	}
}
