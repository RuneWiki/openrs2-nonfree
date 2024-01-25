import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public static int anInt6166;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	public static int anInt6169;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_102 = new Class349(103, 0);

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)I")
	public static int method5155(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
	public static void method5156(@OriginalArg(0) int arg0) {
		if (Static453.method5906(arg0)) {
			Static284.method4048(-1, Static509.aClass273ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) Static61.aClass90_3.method1685(local14);
		if (local20 == null) {
			local20 = new Class2_Sub16();
			Static61.aClass90_3.method1684(local20, local14);
		}
		if (local20.anIntArray215.length <= arg3) {
			@Pc(43) int[] local43 = new int[arg3 + 1];
			@Pc(48) int[] local48 = new int[arg3 + 1];
			for (@Pc(50) int local50 = 0; local50 < local20.anIntArray215.length; local50++) {
				local43[local50] = local20.anIntArray215[local50];
				local48[local50] = local20.anIntArray214[local50];
			}
			for (@Pc(80) int local80 = local20.anIntArray215.length; local80 < arg3; local80++) {
				local43[local80] = -1;
				local48[local80] = 0;
			}
			local20.anIntArray215 = local43;
			local20.anIntArray214 = local48;
		}
		local20.anIntArray215[arg3] = arg2;
		local20.anIntArray214[arg3] = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
	public static void method5161(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub18 local10 = Static508.method6607(arg0, 10);
		local10.method6229();
	}
}
