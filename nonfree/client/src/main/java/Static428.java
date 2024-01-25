import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array15;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[Lclient!o;)V")
	public static void method5663(@OriginalArg(1) Class6[] arg0) {
		Static240.anInt6651 = arg0.length;
		Static57.aClass6Array3 = new Class6[Static240.anInt6651 + 10];
		Static299.anIntArray502 = new int[Static240.anInt6651 + 10];
		Static468.method5039(arg0, 0, Static57.aClass6Array3, 0, Static240.anInt6651);
		for (@Pc(30) int local30 = 0; local30 < Static240.anInt6651; local30++) {
			Static299.anIntArray502[local30] = Static57.aClass6Array3[local30].Q();
		}
		for (@Pc(49) int local49 = Static240.anInt6651; local49 < Static57.aClass6Array3.length; local49++) {
			Static299.anIntArray502[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)I")
	public static int method5664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg6) {
			Static270.method3798(arg1, arg4, arg6, arg3, arg5, arg0);
		} else if (arg0 - arg6 >= Static427.anInt7214 && Static434.anInt7302 >= arg0 + arg6 && Static289.anInt5053 <= arg3 - arg2 && arg3 + arg2 <= Static93.anInt1676) {
			Static363.method4851(arg4, arg3, arg0, arg1, arg5, arg6, arg2);
		} else {
			Static287.method3951(arg4, arg5, arg1, arg2, arg3, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)I")
	public static int method5666(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
