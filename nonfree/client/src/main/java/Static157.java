import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V", line = 29)
	public static void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class58 local3 = new Class58();
		local3.anInt1694 = arg1 >> Static299.anInt6017;
		local3.anInt1685 = arg2 >> Static299.anInt6017;
		local3.anInt1686 = arg3 >> Static299.anInt6017;
		local3.anInt1689 = arg4 >> Static299.anInt6017;
		local3.anInt1687 = arg0;
		local3.anInt1697 = arg1;
		local3.anInt1693 = arg2;
		local3.anInt1684 = arg3;
		local3.anInt1690 = arg4;
		local3.anInt1695 = arg5;
		local3.anInt1701 = arg6;
		Static227.aClass58Array3[Static245.anInt4891++] = local3;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I", line = 74)
	public static int method6477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static31.aByteArrayArray4 == null ? 0 : (Static31.aByteArrayArray4[arg0][arg1] & 0xFF) << 3;
	}
}
