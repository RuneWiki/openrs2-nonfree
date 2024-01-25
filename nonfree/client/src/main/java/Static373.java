import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mha", name = "f", descriptor = "Lclient!el;")
	public static Class104_Sub1 aClass104_Sub1_2;

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "Z")
	public static boolean aBoolean589 = false;

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "J")
	public static long aLong176 = -1L;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZB)V")
	public static void method5591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class5_Sub43 local10 = Static10.method153(arg0, arg1);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray406.length; local23++) {
				local10.anIntArray406[local23] = -1;
				local10.anIntArray405[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)Lclient!vha;")
	public static Class368 method5593(@OriginalArg(1) int arg0) {
		@Pc(8) Class368[] local8 = Static184.method3078();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class368 local16 = local8[local10];
			if (local16.anInt10300 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIII)V")
	public static void method5594(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static7.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}
}
