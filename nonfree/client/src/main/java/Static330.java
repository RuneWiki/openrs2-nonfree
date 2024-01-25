import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!kfa", name = "W", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_56 = new Class286(10, 7);

	@OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
	public static int anInt5785 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)J")
	public static long method4919(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)Lclient!jj;")
	public static Class187 method4927(@OriginalArg(0) int arg0) {
		@Pc(10) Class187 local10 = (Class187) Static452.aClass338_41.method8049((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static177.aClass221_108.method5089(arg0, 1);
		local10 = new Class187();
		local10.anInt5476 = arg0;
		if (local27 != null) {
			local10.method4646(new Class3_Sub28(local27));
		}
		local10.method4643();
		if (local10.anInt5474 == 2 && Static248.aClass136_23.method3503((long) arg0) == null) {
			Static248.aClass136_23.method3508((long) arg0, new Class3_Sub42(Static135.anInt2515));
			Static714.aClass187Array1[Static135.anInt2515++] = local10;
		}
		Static452.aClass338_41.method8044((long) arg0, local10);
		return local10;
	}
}
