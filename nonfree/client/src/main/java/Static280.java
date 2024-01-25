import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static int anInt5854;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt5853 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!ida;II)V")
	public static void method4952(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass3_Sub15_Sub1_3.method8419(arg2);
		arg1.aClass3_Sub15_Sub1_3.method8431(arg3);
		arg1.aClass3_Sub15_Sub1_3.method8423(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)V")
	public static void method4953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static118.anInt3044 = arg0 - Static361.anInt2230;
		Static642.anInt10524 = arg1 - Static361.anInt2229;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	public static int method4954() {
		return Static99.aClass348_1.method8112();
	}
}
