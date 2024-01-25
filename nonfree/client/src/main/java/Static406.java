import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_38 = new Class326(128, 4);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	public static void method5724(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static219.anInt4263 != -1) {
				Static208.method7272(Static219.anInt4263);
			}
			for (@Pc(14) Class1_Sub16 local14 = (Class1_Sub16) Static68.aClass356_4.method7792(); local14 != null; local14 = (Class1_Sub16) Static68.aClass356_4.method7795()) {
				if (!local14.method7877()) {
					local14 = (Class1_Sub16) Static68.aClass356_4.method7792();
					if (local14 == null) {
						break;
					}
				}
				Static546.method7412(local14, true, false);
			}
			Static219.anInt4263 = -1;
			Static68.aClass356_4 = new Class356(8);
			Static384.method5934();
			Static219.anInt4263 = Static573.anInt9329;
			Static261.method4073(false);
			Static388.method5569();
			Static145.method2351(Static219.anInt4263);
		}
		Static578.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZII)I")
	public static int method5726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static450.method6372(local17, local7);
		@Pc(35) int local35 = Static450.method6372(local17, local7 + 1);
		@Pc(42) int local42 = Static450.method6372(local17 + 1, local7);
		@Pc(51) int local51 = Static450.method6372(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static424.method5938(arg1, local13, local28, local35);
		@Pc(65) int local65 = Static424.method5938(arg1, local13, local42, local51);
		return Static424.method5938(arg1, local23, local58, local65);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
	public static void method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg2) {
			Static191.method3386(arg3, arg1, arg4, arg0);
		} else if (Static487.anInt8210 <= arg3 - arg1 && Static278.anInt5111 >= arg1 + arg3 && Static126.anInt6658 <= arg4 - arg2 && arg4 + arg2 <= Static494.anInt8295) {
			Static24.method596(arg4, arg0, arg1, arg2, arg3);
		} else {
			Static247.method3983(arg4, arg2, arg3, arg1, arg0);
		}
	}
}
