import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!hh;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_183 = new Class214(3, 0);

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lclient!mc;")
	public static final Class155[] aClass155Array1 = new Class155[6];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
	public static boolean method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
	public static int method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static410.aByteArrayArray20 == null ? 0 : Static410.aByteArrayArray20[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public static void method4881(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub5 local12 = Static431.method5935(16, arg0);
		local12.method517();
	}
}
