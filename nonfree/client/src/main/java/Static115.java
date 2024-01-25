import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	public static int anInt2266;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!lga;I)V")
	public static void method2160(@OriginalArg(0) Class223 arg0) {
		Static619.anInt9779 = 0;
		Static434.anInt7432 = 0;
		Static374.aClass385_6 = new Class385();
		Static155.aClass60_Sub2_Sub1_Sub1Array1 = new Class60_Sub2_Sub1_Sub1[1024];
		Static239.aClass60_Sub4Array1 = new Class60_Sub4[Static493.anIntArray525[Static470.anInt8040] + 1];
		Static688.anInt10535 = 0;
		Static450.anInt7768 = 0;
		Static327.method5131(arg0);
		Static378.method5859(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!qp;I)V")
	public static void method2161(@OriginalArg(1) int arg0, @OriginalArg(2) Class304 arg1, @OriginalArg(3) int arg2) {
		Static401.aClass304ArrayArray1[arg2][arg0] = arg1;
	}
}
