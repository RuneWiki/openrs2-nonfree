import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_91 = new Class186(33, 4);

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
	public static int anInt6268 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method5434(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (arg1.charAt(local15) == arg0) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[B)[B")
	public static byte[] method5435(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static555.method5095(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLclient!kda;)V")
	public static void method5436(@OriginalArg(1) Class160 arg0) {
		Static47.anInt1423 = 0;
		Static270.anInt5256 = 0;
		Static14.aClass145_2 = new Class145();
		Static259.aClass2_Sub4_Sub1_Sub1Array2 = new Class2_Sub4_Sub1_Sub1[1024];
		Static202.aClass2_Sub3Array3 = new Class2_Sub3[Static144.anIntArray263[Static309.anInt5935] + 1];
		Static476.anInt7308 = 0;
		Static275.anInt5397 = 0;
		Static215.method3856(arg0);
		Static326.method5319(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
	public static void method5438(@OriginalArg(1) int arg0) {
		Static527.anInt8941 = 100;
		Static116.anInt2817 = -1;
		Static173.anInt3748 = 3;
		Static388.anInt6745 = arg0;
	}
}
