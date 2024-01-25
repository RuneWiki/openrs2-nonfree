import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public static int anInt9140;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!fs;")
	public static final Class121 aClass121_9 = new Class121("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_110 = new Class241(39, 3);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I")
	public static int method7972(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([IBI[II)V")
	public static void method7973(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(48) int local48 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg3; local50 < arg1; local50++) {
			if (arg0[local50] < local16 + (local50 & local48)) {
				@Pc(71) int local71 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local71;
				@Pc(85) int local85 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12++] = local85;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method7973(arg0, local12 - 1, arg2, arg3);
		method7973(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	public static void method7974() {
		Static366.aString75 = "";
		Static527.aString100 = "";
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	public static int method7975(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static243.anInt4677 - 1; local3++) {
			if (arg0 < Static7.anIntArray6[local3] + Static394.anIntArray409[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static243.anInt4677 - 1;
		}
		return local1;
	}
}
