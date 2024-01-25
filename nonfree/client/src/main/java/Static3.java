import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "Lclient!ah;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("ccad585be67402e8adefadad45ff284c50e9ba1f8d7e4bf7c50f452ad50ed5f14d6692072b565aa9dcd1e9c60c88290577d33472ca4698f94f1f716863fb3937", 16);

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_1 = new Class274(22, -2);

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
	public static int anInt46 = 104;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIIIB)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static306.anInt5020 <= arg4 && arg1 <= Static252.anInt4988 && arg2 >= Static570.anInt9385 && Static177.anInt3963 >= arg3) {
			if (arg0 == 1) {
				Static92.method1621(arg3, arg1, arg5, arg2, arg4);
			} else {
				Static624.method8449(arg1, arg5, arg4, arg2, arg3, arg0);
			}
		} else if (arg0 == 1) {
			Static493.method7073(arg1, arg3, arg2, arg5, arg4);
		} else {
			Static71.method1357(arg3, arg4, arg5, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!jda;Lclient!jda;)V")
	public static void method53(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		if (arg1.aClass2_Sub5_67 != null) {
			arg1.method8464();
		}
		arg1.aClass2_Sub5_67 = arg0;
		arg1.aClass2_Sub5_66 = arg0.aClass2_Sub5_66;
		arg1.aClass2_Sub5_67.aClass2_Sub5_66 = arg1;
		arg1.aClass2_Sub5_66.aClass2_Sub5_67 = arg1;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V")
	public static void method54(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub5_Sub10 local10 = Static594.method8175(arg0, 6);
		local10.method4393();
		local10.anInt5255 = arg1;
	}
}
