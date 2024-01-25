import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!us", name = "n", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_241 = new Class186(72, 8);

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	public static final int anInt6981 = 1407;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILclient!jb;)V")
	public static void method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class126 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray16 != null) {
			@Pc(13) Class4_Sub40 local13 = new Class4_Sub40();
			local13.anObjectArray35 = arg2.anObjectArray16;
			local13.aClass126_16 = arg2;
			Static172.method2513(local13);
		}
		Static114.anInt2420 = arg1;
		Static195.anInt2838 = arg2.anInt3469;
		Static222.aBoolean305 = true;
		Static52.anInt1389 = arg2.anInt3417;
		Static8.anInt336 = arg2.anInt3397;
		Static234.anInt4263 = arg0;
		Static14.anInt5474 = arg2.anInt3392;
		Static384.anInt6284 = arg2.anInt3395;
		Static430.method5524(arg2);
	}
}
