import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!qka", name = "p", descriptor = "I")
	public static int anInt8376;

	@OriginalMember(owner = "client!qka", name = "k", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_58 = new Class74(512);

	@OriginalMember(owner = "client!qka", name = "m", descriptor = "I")
	public static int anInt8378 = -1;

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7320(@OriginalArg(1) String arg0) {
		Static14.method193("", "", "", 0, arg0, 0);
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(IBI)V")
	public static void method7321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static83.anInt1268 != arg0) {
			Static2.anIntArray1 = new int[arg0];
			for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
				Static2.anIntArray1[local13] = (local13 << 12) / arg0;
			}
			Static333.anInt5727 = arg0 - 1;
			Static126.anInt2533 = arg0 * 32;
			Static83.anInt1268 = arg0;
		}
		if (Static226.anInt4404 == arg1) {
			return;
		}
		if (arg1 == Static83.anInt1268) {
			Static424.anIntArray466 = Static2.anIntArray1;
		} else {
			Static424.anIntArray466 = new int[arg1];
			for (@Pc(78) int local78 = 0; local78 < arg1; local78++) {
				Static424.anIntArray466[local78] = (local78 << 12) / arg1;
			}
		}
		Static165.anInt3453 = arg1 - 1;
		Static226.anInt4404 = arg1;
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(IB)V")
	public static void method7322(@OriginalArg(0) int arg0) {
		Static499.anInt8390 = -1;
		Static91.anInt1364 = arg0;
		Static51.anInt617 = -1;
		Static62.method784();
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(ILclient!jc;)Lclient!no;")
	public static Class58_Sub2 method7324(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) Class58 local7 = Static559.method7902(arg0);
		@Pc(11) int local11 = arg0.method3018();
		@Pc(15) int local15 = arg0.method3018();
		@Pc(19) int local19 = arg0.method3018();
		@Pc(23) int local23 = arg0.method3018();
		@Pc(27) int local27 = arg0.method3018();
		@Pc(31) int local31 = arg0.method3018();
		return new Class58_Sub2(local7.aClass318_20, local7.aClass238_13, local7.anInt10051, local7.anInt10055, local7.anInt10052, local7.anInt10050, local7.anInt10053, local7.anInt10054, local7.anInt10056, local11, local15, local19, local23, local27, local31);
	}
}
