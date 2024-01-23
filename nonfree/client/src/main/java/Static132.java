import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public static int anInt3289;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	public static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class1_Sub21 local3 = null;
		for (@Pc(8) Class1_Sub21 local8 = (Class1_Sub21) Static174.aClass3_17.method30(); local8 != null; local8 = (Class1_Sub21) Static174.aClass3_17.method33()) {
			if (local8.anInt4024 == arg6 && arg0 == local8.anInt4014 && local8.anInt4015 == arg7 && arg4 == local8.anInt4025) {
				local3 = local8;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class1_Sub21();
			local3.anInt4015 = arg7;
			local3.anInt4025 = arg4;
			local3.anInt4024 = arg6;
			local3.anInt4014 = arg0;
			Static97.method2671(local3);
			Static174.aClass3_17.method28(local3);
		}
		local3.anInt4019 = arg5;
		local3.anInt4033 = arg2;
		local3.anInt4021 = arg3;
		local3.anInt4026 = arg8;
		local3.anInt4031 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
	public static int method2485(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(36) int local36 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!hc;BLclient!hc;)V")
	public static void method2488(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1) {
		Static45.aClass51_17 = arg1;
		Static42.aClass51_15 = arg0;
	}
}
