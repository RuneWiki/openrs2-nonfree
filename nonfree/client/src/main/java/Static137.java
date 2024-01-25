import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!il", name = "P", descriptor = "I")
	public static int anInt2651;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public static int anInt2629 = -1;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_64 = new Class85("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method2430() {
		@Pc(5) Class109 local5 = Static110.aClass109_25;
		synchronized (Static110.aClass109_25) {
			Static110.aClass109_25.method2858();
		}
		local5 = Static289.aClass109_51;
		synchronized (Static289.aClass109_51) {
			Static289.aClass109_51.method2858();
		}
		local5 = Static78.aClass109_21;
		synchronized (Static78.aClass109_21) {
			Static78.aClass109_21.method2858();
		}
		local5 = Static321.aClass109_58;
		synchronized (Static321.aClass109_58) {
			Static321.aClass109_58.method2858();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!gf;Lclient!ij;I)V")
	public static void method2432(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class93 arg1) {
		Static332.aClass93_139 = arg1;
		Static27.anInterface3_1 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	public static void method2433() {
		Static188.aClass5_Sub16_Sub1_3.method1660();
		Static56.aClass93_22 = null;
		Static250.anInt4969 = 1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static255.aByteArrayArrayArray13 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!p;BILclient!ea;)V")
	public static void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class55 arg4) {
		@Pc(8) Class213 local8 = Static346.method5925(arg2.anInt4766);
		if (local8.anInt6739 == -1) {
			return;
		}
		if (arg2.aBoolean385) {
			@Pc(21) int local21 = arg3 + arg2.anInt4733;
			arg3 = local21 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(37) Class95 local37 = local8.method5984(arg3, arg4, arg2.aBoolean388);
		if (local37 == null) {
			return;
		}
		@Pc(43) int local43 = arg2.anInt4775;
		@Pc(46) int local46 = arg2.anInt4769;
		if ((arg3 & 0x1) == 1) {
			local43 = arg2.anInt4769;
			local46 = arg2.anInt4775;
		}
		@Pc(64) int local64 = local37.method5507();
		@Pc(67) int local67 = local37.method5494();
		if (local8.aBoolean586) {
			local64 = local43 * 4;
			local67 = local46 * 4;
		}
		if (local8.anInt6740 == 0) {
			local37.method5490(arg1, arg0 + 4 - local46 * 4, local64, local67);
		} else {
			local37.method5493(arg1, arg0 - (local46 - 1) * 4, local64, local67, 1, local8.anInt6740 | 0xFF000000, 1);
		}
	}
}
