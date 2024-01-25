import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
	public static int anInt7335;

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
	public static int anInt7336;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_114 = new Class394("", 12);

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_63 = new Class305(19, 8);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6154(@OriginalArg(0) String arg0) {
		return Static24.method6157(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!fda;)V")
	public static void method6155(@OriginalArg(1) Class28_Sub1_Sub4_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5473 == Static26.anInt350 || arg0.anInt5482 == -1 || arg0.anInt5475 != 0) {
			local5 = true;
		} else {
			@Pc(23) Class175 local23 = Static591.aClass66_2.method1768(arg0.anInt5482);
			if (local23.aBoolean426 || local23.anIntArray291[arg0.anInt5498] < arg0.anInt5504 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(49) int local49 = arg0.anInt5473 - arg0.anInt5463;
			@Pc(55) int local55 = Static26.anInt350 - arg0.anInt5463;
			@Pc(66) int local66 = arg0.anInt5511 * 512 + arg0.method4599() * 256;
			@Pc(77) int local77 = arg0.anInt5518 * 512 + arg0.method4599() * 256;
			@Pc(88) int local88 = arg0.anInt5503 * 512 + arg0.method4599() * 256;
			@Pc(99) int local99 = arg0.anInt5467 * 512 + arg0.method4599() * 256;
			arg0.anInt10784 = (local55 * local99 + (local49 - local55) * local77) / local49;
			arg0.anInt10781 = (local55 * local88 + (local49 - local55) * local66) / local49;
		}
		arg0.anInt5522 = 0;
		if (arg0.anInt5476 == 0) {
			arg0.method4590(8192, false);
		}
		if (arg0.anInt5476 == 1) {
			arg0.method4590(12288, false);
		}
		if (arg0.anInt5476 == 2) {
			arg0.method4590(0, false);
		}
		if (arg0.anInt5476 == 3) {
			arg0.method4590(4096, false);
		}
	}
}
