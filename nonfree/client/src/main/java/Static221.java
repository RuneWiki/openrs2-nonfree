import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public static int anInt4514;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "[Lclient!nf;")
	public static final Class245[] aClass245Array1 = new Class245[2048];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4080(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520() != 0 && arg3 != 0 && Static356.anInt6821 < 50 && arg2 != -1) {
			Static307.aClass150Array1[Static356.anInt6821++] = new Class150((byte) 2, arg2, arg3, arg0, arg5, arg1, arg4, (Class15_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method4081(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static654.method9609(local18) : local18;
		} else if (arg0 instanceof Class95) {
			@Pc(32) Class95 local32 = (Class95) arg0;
			return local32.method7798();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
