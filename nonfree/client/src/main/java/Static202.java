import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!ha;")
	public static Class75 aClass75_5;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_52 = new Class241(84, 4);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!dm;)[I")
	public static int[] method3745(@OriginalArg(1) Class6_Sub13 arg0) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method3016(10);
		local10.method3029(local13[0]);
		local10.method3029(local13[1]);
		local10.method3029(local13[2]);
		local10.method3029(local13[3]);
		for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
			local10.method3029((int) (Math.random() * 9.9999999E7D));
		}
		local10.method3040((int) (Math.random() * 9.9999999E7D));
		local10.method3038(Static537.aBigInteger7, Static219.aBigInteger5);
		arg0.aClass6_Sub15_Sub1_1.method2988(0, local10.aByteArray20, local10.anInt3174);
		return local13;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3748(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method3751() {
		@Pc(15) Class6_Sub2_Sub4 local15 = Static602.method8315(0L, 15);
		local15.method2038();
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
	public static void method3752() {
		Static466.method7048();
	}
}
