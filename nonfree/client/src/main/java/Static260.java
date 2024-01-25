import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt4664 = -1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!rba;ILclient!rba;)V")
	public static void method4247(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0.aClass5_Sub1_64 != null) {
			arg0.method8955();
		}
		arg0.aClass5_Sub1_65 = arg1;
		arg0.aClass5_Sub1_64 = arg1.aClass5_Sub1_64;
		arg0.aClass5_Sub1_64.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public static int method4249() {
		if (Static95.aFrame1 == null) {
			return Static149.aBoolean219 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method4250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static230.anInt3962 && arg3 <= Static463.anInt7530) {
			@Pc(29) int local29 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg2);
			@Pc(35) int local35 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg0);
			Static135.method1998(arg3, arg1, local29, local35);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/Object;IB)[B")
	public static byte[] method4253(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return Static546.method7474(arg0, local14);
		} else if (arg1 instanceof Class121) {
			@Pc(26) Class121 local26 = (Class121) arg1;
			return local26.method3015(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
