import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	public static int anInt8708;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	public static int anInt8709;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	public static int anInt8710;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_181 = new Class156(38, -1);

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean574 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;II)Lclient!ha;")
	public static Class100 method7493(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3) {
		return new oa(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBII)V")
	public static void method7494(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 + Static315.anInt5380;
		@Pc(13) int local13 = Static290.anInt5128 + arg2;
		if (Static283.aClass128ArrayArrayArray1 == null || arg0 < 0 || arg2 < 0 || Static271.anInt4910 <= arg0 || Static613.anInt9909 <= arg2 || Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0 && arg1 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139) {
			return;
		}
		@Pc(62) long local62 = (long) (local9 | local13 << 14 | arg1 << 28);
		@Pc(68) Class5_Sub53 local68 = (Class5_Sub53) Static248.aClass306_18.method6943(local62);
		if (local68 == null) {
			Static385.method5703(arg1, arg0, arg2);
			return;
		}
		@Pc(83) Class5_Sub2 local83 = (Class5_Sub2) local68.aClass20_72.method378();
		if (local83 == null) {
			Static385.method5703(arg1, arg0, arg2);
			return;
		}
		@Pc(98) Class4_Sub1_Sub4_Sub1 local98 = (Class4_Sub1_Sub4_Sub1) Static385.method5703(arg1, arg0, arg2);
		if (local98 == null) {
			local98 = new Class4_Sub1_Sub4_Sub1(arg0 << 9, Static177.aClass84Array2[arg1].method7620(arg2, arg0), arg2 << 9, arg1, arg1);
		} else {
			local98.anInt4883 = local98.anInt4890 = -1;
		}
		local98.anInt4884 = local83.anInt113;
		local98.anInt4899 = local83.anInt118;
		label56: while (true) {
			@Pc(153) Class5_Sub2 local153 = (Class5_Sub2) local68.aClass20_72.method366();
			if (local153 == null) {
				break;
			}
			if (local153.anInt118 != local98.anInt4899) {
				local98.anInt4893 = local153.anInt113;
				local98.anInt4883 = local153.anInt118;
				while (true) {
					@Pc(180) Class5_Sub2 local180 = (Class5_Sub2) local68.aClass20_72.method366();
					if (local180 == null) {
						break label56;
					}
					if (local98.anInt4899 != local180.anInt118 && local98.anInt4883 != local180.anInt118) {
						local98.anInt4890 = local180.anInt118;
						local98.anInt4886 = local180.anInt113;
					}
				}
			}
		}
		@Pc(234) int local234 = Static461.method6500((arg0 << 9) + 256, arg1, (arg2 << 9) + 256);
		local98.aByte139 = (byte) arg1;
		local98.anInt9797 = local234;
		local98.aByte138 = (byte) arg1;
		local98.anInt4898 = 0;
		local98.anInt9803 = arg2 << 9;
		local98.anInt9805 = arg0 << 9;
		if (Static389.method1741(arg2, arg0)) {
			local98.aByte138++;
		}
		Static75.method1249(arg1, arg0, arg2, local234, local98);
	}
}
