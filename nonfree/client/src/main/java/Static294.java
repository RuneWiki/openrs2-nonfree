import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt5093 = -1;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_121 = new Class163(63, -1);

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
	public static final int[] anIntArray327 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!nj;)V")
	public static void method4200(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static207.aClass176_2 != null) {
			@Pc(32) int local32;
			try {
				Static207.aClass176_2.method4271(0L);
				Static207.aClass176_2.method4269(local16);
				for (local32 = 0; local32 < 24 && local16[local32] == 0; local32++) {
				}
				if (local32 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(57) Exception local57) {
				for (local32 = 0; local32 < 24; local32++) {
					local16[local32] = -1;
				}
			}
		}
		arg0.method4098(local16, 24);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!ga;I)V")
	public static void method4202(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray4 != null) {
			@Pc(13) Class3_Sub15 local13 = new Class3_Sub15();
			local13.aClass82_1 = arg1;
			local13.anObjectArray3 = arg1.anObjectArray4;
			Static219.method3217(local13);
		}
		Static336.anInt5620 = arg1.anInt2217;
		Static116.anInt2044 = arg2;
		Static73.aBoolean88 = true;
		Static138.anInt2449 = arg1.anInt2200;
		Static327.anInt5460 = arg1.anInt2208;
		Static102.anInt1846 = arg1.anInt2209;
		Static302.anInt5198 = arg1.anInt2196;
		Static385.anInt6504 = arg0;
		Static463.method6297(arg1);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIII)I")
	public static int method4206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static360.aByteArrayArrayArray16[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static360.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
