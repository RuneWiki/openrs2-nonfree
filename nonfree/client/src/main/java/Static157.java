import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "[I")
	public static int[] anIntArray159 = null;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLclient!ei;)V")
	public static void method2274(@OriginalArg(1) Class5_Sub5_Sub4 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8952();
		for (@Pc(15) Class5_Sub5_Sub4 local15 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local15 != null; local15 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
			if (Static70.method1149(local15.method1892(), arg0.method1892())) {
				Static569.method8252(local15, arg0);
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static601.aClass368_13.method8709(arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ofa;B)V")
	public static void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		if (Static389.aClass363_5 == null) {
			return;
		}
		try {
			Static389.aClass363_5.method8575(0L);
			Static389.aClass363_5.method8574(24, arg0, arg1.aByteArray71);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Z")
	public static boolean method2277(@OriginalArg(1) int arg0) {
		return arg0 == 46 || arg0 == 10 || arg0 == 1001 || arg0 == 8 || arg0 == 3;
	}
}
