import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
	public static int anInt6630;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_59 = new Class208(15, 4);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([BI)[B")
	public static byte[] method5694(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static655.method5836(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Lclient!cha;")
	public static Class51_Sub1 method5695() {
		return Static265.anInt3617 < Static187.aClass51_Sub1Array1.length ? Static187.aClass51_Sub1Array1[Static265.anInt3617++] : null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public static boolean method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
	public static void method5698() {
		if (Static399.anObject18 == null) {
			@Pc(9) Class25_Sub1_Sub2 local9 = new Class25_Sub1_Sub2();
			@Pc(16) byte[] local16 = local9.method1167();
			Static399.anObject18 = Static493.method7391(local16);
		}
		if (Static580.anObject22 == null) {
			@Pc(35) Class25_Sub2_Sub1 local35 = new Class25_Sub2_Sub1();
			@Pc(42) byte[] local42 = local35.method1113();
			Static580.anObject22 = Static493.method7391(local42);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([[SI[[F)[[S")
	public static short[][] method5700(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg0[local7].length; local11++) {
				arg0[local7][local11] = (short) (int) (arg1[local7][local11] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!rg;I)Lclient!kg;")
	public static Class69_Sub2 method5701(@OriginalArg(0) Class6_Sub40 arg0) {
		return new Class69_Sub2(arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8606(), arg0.method8606(), arg0.method8604());
	}
}
