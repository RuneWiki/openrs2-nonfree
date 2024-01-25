import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!lf;")
	public static Class90 aClass90_13;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ng;")
	public static Class140 aClass140_99 = new Class140(128);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method3667() {
		Static105.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method3669(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static333.anInt4645 > 0) {
			local18 = Static224.aByteArrayArray14[--Static333.anInt4645];
			Static224.aByteArrayArray14[Static333.anInt4645] = null;
			return local18;
		} else if (arg0 == 5000 && Static283.anInt5491 > 0) {
			local18 = Static227.aByteArrayArray15[--Static283.anInt5491];
			Static227.aByteArrayArray15[Static283.anInt5491] = null;
			return local18;
		} else if (arg0 == 30000 && Static165.anInt3451 > 0) {
			local18 = Static205.aByteArrayArray13[--Static165.anInt3451];
			Static205.aByteArrayArray13[Static165.anInt3451] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
