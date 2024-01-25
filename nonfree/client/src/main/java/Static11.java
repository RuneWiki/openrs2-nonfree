import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!tq;")
	public static Class191 aClass191_10;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	public static int anInt293;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	public static void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(8, arg3);
		local8.method5537();
		local8.anInt6368 = arg1;
		local8.anInt6362 = arg0;
		local8.anInt6365 = arg2;
	}
}
