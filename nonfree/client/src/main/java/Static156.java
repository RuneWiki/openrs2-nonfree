import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ia", name = "Db", descriptor = "Lclient!ku;")
	public static Class146 aClass146_3;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "(II)I")
	public static int method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static5.anIntArrayArray1 == null ? 0 : Static5.anIntArrayArray1[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
	public static void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class219 local3 = new Class219();
		local3.anInt5939 = arg1 >> Static301.anInt2759;
		local3.anInt5929 = arg2 >> Static301.anInt2759;
		local3.anInt5938 = arg3 >> Static301.anInt2759;
		local3.anInt5934 = arg4 >> Static301.anInt2759;
		local3.anInt5935 = arg0;
		local3.anInt5943 = arg1;
		local3.anInt5933 = arg2;
		local3.anInt5936 = arg3;
		local3.anInt5931 = arg4;
		local3.anInt5940 = arg5;
		local3.anInt5937 = arg6;
		Static84.aClass219Array2[Static269.anInt4605++] = local3;
	}
}
