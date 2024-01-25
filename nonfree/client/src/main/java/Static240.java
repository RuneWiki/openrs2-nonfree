import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!os;")
	public static final Class258 aClass258_12 = new Class258(4, 1);

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[I")
	public static final int[] anIntArray423 = new int[4096];

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString58 = "";

	@OriginalMember(owner = "client!je", name = "y", descriptor = "S")
	public static short aShort75 = 205;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!vj;)V")
	public static void method4082(@OriginalArg(1) Class10_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt8462 - Static237.anInt7561;
		@Pc(21) int local21 = arg0.anInt8495 * 512 + arg0.method7021() * 256;
		@Pc(38) int local38 = arg0.anInt8485 * 512 + arg0.method7021() * 256;
		arg0.anInt8934 += (local21 - arg0.anInt8934) / local9;
		arg0.anInt8929 += (local38 - arg0.anInt8929) / local9;
		arg0.anInt8538 = 0;
		if (arg0.anInt8525 == 0) {
			arg0.method7034(8192);
		}
		if (arg0.anInt8525 == 1) {
			arg0.method7034(12288);
		}
		if (arg0.anInt8525 == 2) {
			arg0.method7034(0);
		}
		if (arg0.anInt8525 == 3) {
			arg0.method7034(4096);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIBIILclient!dv;Z)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class77 arg4, @OriginalArg(6) boolean arg5) {
		if (Static406.anInt7043 >= 50 || (arg4 == null || arg4.anIntArrayArray36 == null || arg3 >= arg4.anIntArrayArray36.length || arg4.anIntArrayArray36[arg3] == null)) {
			return;
		}
		@Pc(35) int local35 = arg4.anIntArrayArray36[arg3][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(62) int local62;
		if (arg4.anIntArrayArray36[arg3].length > 1) {
			local62 = (int) (Math.random() * (double) arg4.anIntArrayArray36[arg3].length);
			if (local62 > 0) {
				local39 = arg4.anIntArrayArray36[arg3][local62];
			}
		}
		@Pc(75) int local75 = local35 & 0x1F;
		if (local75 == 0) {
			if (arg5) {
				if (!arg4.aBoolean208) {
					Static3.method60(local45, 255, 0, local39);
					return;
				}
				Static560.method7718(0, 255, local39, false, local45);
			}
		} else if (Static189.aClass4_Sub2_Sub1_1.anInt9277 != 0) {
			local62 = arg1 - 256 >> 9;
			@Pc(119) int local119 = arg2 - 256 >> 9;
			Static479.aClass22Array1[Static406.anInt7043++] = new Class22((byte) (arg4.aBoolean208 ? 2 : 1), local39, local45, 0, 255, (local119 << 8) + (local62 << 16) + (arg0 << 24) + local75);
		}
	}
}
