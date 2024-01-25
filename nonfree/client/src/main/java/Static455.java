import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "Lclient!lea;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "[I")
	public static final int[] anIntArray434 = new int[8];

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
	public static int anInt8019 = 0;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIBLclient!ha;III)V")
	public static void method6748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class67 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static622.aClass67_15 = arg2;
		Static640.aClass181_14 = Static622.aClass67_15.method7646();
		Static30.aClass181_1 = Static622.aClass67_15.method7646();
		Static437.aClass181_8 = Static622.aClass67_15.method7646();
		Static299.anInt6879 = arg4;
		Static488.anInterface20_1 = null;
		Static179.anInt3232 = 0;
		Static481.anInt8379 = 0;
		Static293.anInt5243 = 1;
		Static180.anInt3233 = 2;
		Static533.anInt8992 = 2;
		Static523.anInt8898 = arg0;
		Static271.method4143(arg3, arg1);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!rba;)Lclient!ga;")
	public static Class21_Sub3_Sub1 method6749(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(15) Class21_Sub3 local15 = Static40.method588(arg0);
		@Pc(19) int local19 = arg0.method5281();
		return new Class21_Sub3_Sub1(local15.aClass304_9, local15.aClass216_9, local15.anInt3469, local15.anInt3465, local15.anInt3462, local15.anInt3460, local15.anInt3467, local15.anInt3463, local15.anInt3466, local15.anInt3476, local15.anInt3470, local15.anInt3477, local15.anInt3474, local15.anInt3475, local15.anInt3473, local19);
	}
}
