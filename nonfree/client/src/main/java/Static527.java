import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!qha", name = "v", descriptor = "I")
	public static int anInt8230;

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "[I")
	public static final int[] anIntArray594 = new int[13];

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "(I)V")
	public static void method7039() {
		Static606.anInt9195 = -1;
		Static462.aClass178_13 = null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIBI)V")
	public static void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class3_Sub7_Sub21 local19 = Static136.method2378((long) arg0 << 32 | (long) arg1, 18);
		local19.method9256();
		local19.anInt10897 = arg3;
		local19.anInt10899 = arg2;
	}
}
