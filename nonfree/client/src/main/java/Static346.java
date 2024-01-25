import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "[I")
	public static int[] anIntArray453;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_189 = new Class88("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIZLclient!wf;)J")
	public static long method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface19 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class279 local16 = Static49.aClass155_2.method4063(arg2.method7915());
		@Pc(37) long local37 = (long) ((arg1 | 0x800000) << 7 | arg0 | arg2.method7918() << 14 | arg2.method7919() << 20);
		if (local16.anInt8276 == 0) {
			local37 |= local9;
		}
		if (local16.anInt8286 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean582) {
			local37 |= local7;
		}
		return local37 | (long) arg2.method7915() << 32;
	}
}
