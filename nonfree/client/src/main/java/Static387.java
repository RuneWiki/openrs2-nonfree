import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "Lclient!ci;")
	public static Class38 aClass38_79;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_132 = new Class266(2, 4, 4, 0);

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "[I")
	public static final int[] anIntArray543 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!nf;BII)V")
	public static void method5426(@OriginalArg(0) Class169 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static195.aClass169ArrayArray2[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method5427(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6533 - Static277.anInt2834;
		@Pc(24) int local24 = arg0.anInt6474 * 128 + arg0.method5302() * 64;
		@Pc(36) int local36 = arg0.anInt6509 * 128 + arg0.method5302() * 64;
		arg0.anInt6551 = 0;
		arg0.anInt7514 += (local24 - arg0.anInt7514) / local8;
		arg0.anInt7515 += (local36 - arg0.anInt7515) / local8;
		if (arg0.anInt6500 == 0) {
			arg0.method5301(8192);
		}
		if (arg0.anInt6500 == 1) {
			arg0.method5301(12288);
		}
		if (arg0.anInt6500 == 2) {
			arg0.method5301(0);
		}
		if (arg0.anInt6500 == 3) {
			arg0.method5301(4096);
		}
	}
}
