import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "S")
	public static short aShort53 = 32767;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public static int anInt5350 = -1;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIZ)V")
	public static void method4588(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class2_Sub52 local6 = Static483.method7528();
		local6.aClass2_Sub11_Sub2_7.method8374(Static444.aClass141_9.anInt4991);
		local6.aClass2_Sub11_Sub2_7.method8333(0);
		@Pc(21) int local21 = local6.aClass2_Sub11_Sub2_7.anInt10066;
		local6.aClass2_Sub11_Sub2_7.method8333(634);
		@Pc(30) int[] local30 = Static172.method3630(local6);
		@Pc(34) int local34 = local6.aClass2_Sub11_Sub2_7.anInt10066;
		local6.aClass2_Sub11_Sub2_7.method8329(arg1);
		local6.aClass2_Sub11_Sub2_7.method8333(Static482.anInt8988);
		local6.aClass2_Sub11_Sub2_7.method8329(arg0);
		local6.aClass2_Sub11_Sub2_7.method8388(Static535.aLong241);
		local6.aClass2_Sub11_Sub2_7.method8374(Static476.anInt8915);
		local6.aClass2_Sub11_Sub2_7.method8374(Static423.aClass316_4.anInt9447);
		Static119.method2928(local6.aClass2_Sub11_Sub2_7);
		@Pc(71) String local71 = Static49.aString11;
		local6.aClass2_Sub11_Sub2_7.method8374(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass2_Sub11_Sub2_7.method8329(local71);
		}
		local6.aClass2_Sub11_Sub2_7.method8374(arg2);
		local6.aClass2_Sub11_Sub2_7.method8374(arg3 ? 1 : 0);
		local6.aClass2_Sub11_Sub2_7.anInt10066 += 7;
		local6.aClass2_Sub11_Sub2_7.method8346(local34, local30, local6.aClass2_Sub11_Sub2_7.anInt10066);
		local6.aClass2_Sub11_Sub2_7.method8379(local6.aClass2_Sub11_Sub2_7.anInt10066 - local21);
		Static96.method2563(local6);
		Static129.anInt3275 = -3;
		Static411.anInt7764 = 1;
		Static427.anInt8027 = 0;
		Static256.anInt5473 = 0;
		if (arg2 < 13) {
			Static97.aBoolean224 = true;
			Static585.method8658();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method4589(@OriginalArg(1) String arg0) {
		return Static145.method3221(16, arg0);
	}
}
