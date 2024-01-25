import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt7034;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!cha;")
	public static Class3_Sub14 aClass3_Sub14_1;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_86 = new Class218(114, 28);

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
	public static boolean aBoolean609 = false;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public static int anInt7035 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(JJ)J")
	public static long method5901(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILclient!maa;)V")
	public static void method5902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub4 arg4) {
		@Pc(4) Class106 local4 = Static139.method3134(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10428 = (arg1 << Static276.anInt5846) + Static510.anInt8986;
		arg4.anInt10429 = arg3;
		arg4.anInt10424 = (arg2 << Static276.anInt5846) + Static510.anInt8986;
		local4.aClass2_Sub3_Sub4_1 = arg4;
		@Pc(33) int local33 = Static500.aClass274Array2 == Static524.aClass274Array3 ? 1 : 0;
		if (arg4.method8570()) {
			if (arg4.method8579()) {
				arg4.aClass2_Sub3_23 = Static464.aClass2_Sub3Array6[local33];
				Static464.aClass2_Sub3Array6[local33] = arg4;
				return;
			}
			arg4.aClass2_Sub3_23 = Static44.aClass2_Sub3Array3[local33];
			Static44.aClass2_Sub3Array3[local33] = arg4;
			Static160.aBoolean330 = true;
			return;
		}
		arg4.aClass2_Sub3_23 = Static634.aClass2_Sub3Array7[local33];
		Static634.aClass2_Sub3Array7[local33] = arg4;
	}
}
