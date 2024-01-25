import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!u", name = "x", descriptor = "[B")
	public static byte[] aByteArray99;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!mj;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_113 = new Class387(62, -1);

	@OriginalMember(owner = "client!u", name = "D", descriptor = "[S")
	private static final short[] aShortArray131 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!u", name = "K", descriptor = "[S")
	private static final short[] aShortArray132 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!u", name = "C", descriptor = "[S")
	private static final short[] aShortArray133 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!u", name = "F", descriptor = "[S")
	public static final short[] aShortArray134 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!u", name = "B", descriptor = "[[S")
	public static final short[][] aShortArrayArray15 = new short[][] { aShortArray131, aShortArray132, aShortArray133, aShortArray134 };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Lclient!ec;")
	public static Class8_Sub1_Sub3_Sub2 method8439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class174 local11 = Static260.aClass174ArrayArrayArray2[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class8_Sub1_Sub3_Sub2 local18 = null;
		@Pc(20) int local20 = -1;
		for (@Pc(23) Class273 local23 = local11.aClass273_67; local23 != null; local23 = local23.aClass273_114) {
			@Pc(27) Class8_Sub1_Sub3 local27 = local23.aClass8_Sub1_Sub3_1;
			if (local27 instanceof Class8_Sub1_Sub3_Sub2) {
				@Pc(33) Class8_Sub1_Sub3_Sub2 local33 = (Class8_Sub1_Sub3_Sub2) local27;
				@Pc(41) int local41 = local33.method5993() * 256 - 4;
				@Pc(48) int local48 = local33.anInt10355 - local41 >> 9;
				@Pc(55) int local55 = local33.anInt10363 - local41 >> 9;
				@Pc(63) int local63 = local33.anInt10355 + local41 >> 9;
				@Pc(70) int local70 = local33.anInt10363 + local41 >> 9;
				if (local48 <= arg2 && local55 <= arg1 && local63 >= arg2 && local70 >= arg1) {
					@Pc(110) int local110 = (local70 + 1 - arg1) * (local63 + 1 + -arg2);
					if (local110 > local20) {
						local20 = local110;
						local18 = local33;
					}
				}
			}
		}
		return local18;
	}
}
