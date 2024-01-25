import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!tn", name = "O", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_124 = new Class205(70, 8);

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_83 = new Class11(29, 3);

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
	public static final int anInt5725 = 1405;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
	public static int anInt5726 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!fo;I)V")
	public static void method4935(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt6412 - Static253.anInt4469;
		@Pc(19) int local19 = arg0.anInt6433 * 128 + arg0.method5547() * 64;
		@Pc(32) int local32 = arg0.anInt6437 * 128 + arg0.method5547() * 64;
		arg0.anInt6390 += (local19 - arg0.anInt6390) / local8;
		arg0.anInt6386 += (local32 - arg0.anInt6386) / local8;
		arg0.anInt6454 = 0;
		if (arg0.lb == 0) {
			arg0.method5554(8192);
		}
		if (arg0.lb == 1) {
			arg0.method5554(12288);
		}
		if (arg0.lb == 2) {
			arg0.method5554(0);
		}
		if (arg0.lb == 3) {
			arg0.method5554(4096);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
	public static void method4936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static8.method188(arg0, arg2, arg1, arg3);
		} else if (Static243.anInt4326 <= arg0 - arg2 && arg0 + arg2 <= Static235.anInt4193 && Static138.anInt932 <= arg1 - arg4 && Static40.anInt818 >= arg1 + arg4) {
			Static310.method4550(arg0, arg3, arg1, arg4, arg2);
		} else {
			Static184.method3168(arg2, arg4, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBI)V")
	public static void method4937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class246 local14 = new Class246(16);
		for (@Pc(19) Class2_Sub28 local19 = (Class2_Sub28) Static94.aClass246_6.method5606(); local19 != null; local19 = (Class2_Sub28) Static94.aClass246_6.method5614()) {
			local19.method5617();
			@Pc(30) int local30 = (int) (local19.aLong209 >> 28);
			@Pc(41) int local41 = (int) (local19.aLong209 >> 14 & 0x3FFFL) - arg0;
			@Pc(50) int local50 = (int) (local19.aLong209 & 0x3FFFL) - arg1;
			if (local50 >= 0 && local41 >= 0 && Static246.anInt4374 > local50 && Static185.anInt3485 > local41) {
				local14.method5609(local19, (long) (local50 | local41 << 14 | local30 << 28));
			}
		}
		Static94.aClass246_6 = local14;
	}
}
