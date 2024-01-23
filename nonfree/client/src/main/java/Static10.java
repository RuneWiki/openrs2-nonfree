import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public static int anInt190 = 0;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
	public static int[] anIntArray17 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public static void method154(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub4_Sub7 local6 = Static34.method528(arg0, 3);
		local6.method970();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method155(@OriginalArg(1) String arg0) {
		return Static19.method315(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
	public static void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		if (Static22.anInt421 != arg1) {
			Static185.anIntArray424 = new int[arg1];
			for (local10 = 0; local10 < arg1; local10++) {
				Static185.anIntArray424[local10] = (local10 << 12) / arg1;
			}
			Static73.anInt1379 = arg1 * 32;
			Static84.anInt1566 = arg1 - 1;
			Static22.anInt421 = arg1;
		}
		if (Static62.anInt1150 == arg0) {
			return;
		}
		if (arg0 == Static22.anInt421) {
			Static205.anIntArray450 = Static185.anIntArray424;
		} else {
			Static205.anIntArray450 = new int[arg0];
			for (local10 = 0; local10 < arg0; local10++) {
				Static205.anIntArray450[local10] = (local10 << 12) / arg0;
			}
		}
		Static148.anInt2810 = arg0 - 1;
		Static62.anInt1150 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ug;I)V")
	public static void method157(@OriginalArg(0) Class3_Sub26 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static315.anInt6131; local3++) {
			@Pc(14) int local14 = arg0.method3904();
			@Pc(18) int local18 = arg0.method3948();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static186.aClass87_Sub1Array2[local14] != null) {
				Static186.aClass87_Sub1Array2[local14].anInt4358 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method158(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class3_Sub4_Sub7 local6 = Static34.method528(arg1, 2);
		local6.method971();
		local6.aString46 = arg0;
	}
}
