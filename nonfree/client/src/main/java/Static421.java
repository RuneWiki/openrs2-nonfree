import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_142 = new Class254(78, 8);

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public static int anInt7828 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIII)V")
	public static void method6528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub3 local10 = (Class5_Sub3) Static58.aClass267_2.method6544(); local10 != null; local10 = (Class5_Sub3) Static58.aClass267_2.method6543()) {
			if (local10.anInt4939 <= Static508.anInt8998) {
				local10.method7282();
			} else {
				Static186.method3601(local10.anInt4936, arg3 >> 1, (local10.anInt4938 << 9) + 256, local10.anInt4931 * 2, arg2 >> 1, (local10.anInt4937 << 9) + 256);
				Static489.aClass73_5.method7892(Static350.anIntArray431[0] + arg1, Static350.anIntArray431[1] + arg0, local10.aString57, local10.anInt4932 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
	public static int method6531(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ag;I)I")
	public static int method6532(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) Class222 local8 = arg0.aClass222_1;
		if (local8.anIntArray464 != null) {
			local8 = local8.method5329(Static435.aClass234_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6254;
		@Pc(27) Class169 local27 = arg0.method6209();
		if (arg0.aBoolean545) {
			local23 = local8.anInt6243;
		} else if (local27.anInt5181 == arg0.anInt7390 || arg0.anInt7390 == local27.anInt5178 || arg0.anInt7390 == local27.anInt5164 || arg0.anInt7390 == local27.anInt5191) {
			local23 = local8.anInt6253;
		} else if (arg0.anInt7390 == local27.anInt5161 || local27.anInt5160 == arg0.anInt7390 || local27.anInt5166 == arg0.anInt7390 || local27.anInt5194 == arg0.anInt7390) {
			local23 = local8.anInt6256;
		}
		return local23;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([SIB)[S")
	public static short[] method6533(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static589.method5378(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
