import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Lclient!ea;")
	public static final Class56 aClass56_3 = new Class56(1);

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	public static int anInt5356 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!tf;I)V")
	public static void method4458(@OriginalArg(0) int arg0, @OriginalArg(2) Class240 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray21 != null) {
			@Pc(13) Class4_Sub10 local13 = new Class4_Sub10();
			local13.anObjectArray4 = arg1.anObjectArray21;
			local13.aClass240_5 = arg1;
			Static64.method1462(local13);
		}
		Static457.anInt7815 = arg1.anInt6895;
		Static25.anInt464 = arg1.anInt6876;
		Static449.aBoolean564 = true;
		Static353.anInt6237 = arg0;
		Static281.anInt5275 = arg1.anInt6914;
		Static344.anInt6075 = arg1.anInt6885;
		Static383.anInt6696 = arg1.anInt6909;
		Static352.anInt6231 = arg2;
		Static273.method4374(arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILclient!tf;)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class240 arg2) {
		@Pc(8) Class74 local8 = arg2.method5528(Static30.aClass30_3);
		if (local8 == null) {
			return;
		}
		Static30.aClass30_3.w(arg1, arg0, arg1 + arg2.anInt6904, arg0 - -arg2.anInt6894);
		if (Static431.anInt7385 >= 3) {
			Static30.aClass30_3.GA(-16777216, local8, arg1, arg0);
		} else {
			Static197.aClass2_19.method5917((float) arg2.anInt6904 / 2.0F + (float) arg1, (float) arg2.anInt6894 / 2.0F + (float) arg0, ((int) -Static322.aFloat82 & 0x3FFF) << 2, local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILclient!ka;Lclient!em;I)V")
	public static void method4461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg3.method1819(arg2.da(), arg2.ia(), arg2.J(), arg2.K(), arg2.H(), arg2.ja(), arg1, arg2.F(), arg0, arg4);
		}
	}
}
