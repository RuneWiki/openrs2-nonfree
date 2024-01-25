import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!fu;Lclient!fu;I)V")
	public static void method5313(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		if (arg0.aClass6_Sub2_61 != null) {
			arg0.method7405();
		}
		arg0.aClass6_Sub2_61 = arg1;
		arg0.aClass6_Sub2_62 = arg1.aClass6_Sub2_62;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Lclient!lh;")
	public static Class194 method5314(@OriginalArg(0) int arg0) {
		@Pc(8) Class194[] local8 = Static138.method2734();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class194 local16 = local8[local10];
			if (arg0 == local16.anInt5367) {
				return local16;
			}
		}
		return null;
	}
}
