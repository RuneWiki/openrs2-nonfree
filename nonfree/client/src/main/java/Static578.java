import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	public static int anInt6963 = 0;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
	public static int anInt6964 = 0;

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_72 = new Class341(62, -1);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(JJ)J")
	public static long method6235(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public static void method6238() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static222.anInt4533; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static668.anInt11370; local17++) {
				if (Static227.method4161(Static193.aClass291ArrayArrayArray2, local11, local17, true, local13)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILclient!uf;)V")
	public static void method6240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class357 arg2) {
		@Pc(8) Class1 local8 = arg2.method8989(Static607.aClass101_15);
		if (local8 == null) {
			return;
		}
		Static607.aClass101_15.KA(arg0, arg1, arg2.anInt10395 + arg0, arg1 - -arg2.anInt10465);
		if (Static460.anInt11073 < 3) {
			Static58.aClass71_3.method7692((float) arg2.anInt10395 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt10465 / 2.0F, ((int) -Static278.aFloat108 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static607.aClass101_15.A(-16777216, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)V")
	public static void method6241() {
		if (Static451.aClass34_2 != null) {
			Static451.aClass34_2.method6333();
		}
		if (Static330.aClass34_1 != null) {
			Static330.aClass34_1.method6333();
		}
	}
}
