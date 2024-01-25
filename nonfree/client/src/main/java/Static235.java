import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_57 = new Class142("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_151 = new Class67(34, -2);

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_152 = new Class67(36, -2);

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_67 = new Class242(42, 2);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
	public static int method3355(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!nc;I)J")
	public static long method3356(@OriginalArg(1) int arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class87 local16 = Static86.aClass248_7.method5246(arg1.method4895());
		@Pc(37) long local37 = (long) (arg0 << 7 | arg2 | arg1.method4897() << 14 | arg1.method4899() << 20 | 0x40000000);
		if (local16.anInt1928 == 0) {
			local37 |= local9;
		}
		if (local16.anInt1926 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean202) {
			local37 |= local7;
		}
		return local37 | (long) arg1.method4895() << 32;
	}
}
