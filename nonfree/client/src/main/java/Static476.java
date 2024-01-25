import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!ft;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_4;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_56 = new Class293(4);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!paa;III)J")
	public static long method6935(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class283 local19 = Static525.aClass371_4.method8554(arg0.method8009());
		@Pc(40) long local40 = (long) ((arg0.method8015() | 0x10000) << 14 | arg2 | arg1 << 7 | arg0.method8012() << 20);
		if (local19.anInt7843 == 0) {
			local40 |= local12;
		}
		if (local19.anInt7801 == 1) {
			local40 |= local5;
		}
		return local40 | (long) arg0.method8009() << 32;
	}
}
