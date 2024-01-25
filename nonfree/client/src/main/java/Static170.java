import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "Lclient!ri;")
	public static Class1_Sub9_Sub3 aClass1_Sub9_Sub3_1;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_111 = new Class67(64, 1);

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!am;")
	public static final Class14 aClass14_9 = new Class14();

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
	public static void method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class254 local3 = new Class254();
		local3.anInt6674 = arg1 >> Static41.anInt612;
		local3.anInt6684 = arg2 >> Static41.anInt612;
		local3.anInt6673 = arg3 >> Static41.anInt612;
		local3.anInt6680 = arg4 >> Static41.anInt612;
		local3.anInt6681 = arg0;
		local3.anInt6686 = arg1;
		local3.anInt6675 = arg2;
		local3.anInt6688 = arg3;
		local3.anInt6677 = arg4;
		local3.anInt6683 = arg5;
		local3.anInt6671 = arg6;
		Static350.aClass254Array2[Static269.anInt4694++] = local3;
	}
}
