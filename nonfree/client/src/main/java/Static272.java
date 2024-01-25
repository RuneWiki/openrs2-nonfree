import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!no", name = "t", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public static int anInt4644 = -2;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_76 = new Class186(97, -1);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	public static void method4132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg0, 14);
		local8.method3043();
		local8.anInt3397 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBI)Z")
	public static boolean method4135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fo;)V")
	public static void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1) {
		Static420.aClass84Array4[arg0] = arg1;
	}
}
