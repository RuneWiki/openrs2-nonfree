import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array4;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "[Lclient!eg;")
	public static final Class98[] aClass98Array1 = new Class98[6];

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([BB)[B")
	public static byte[] method1383(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		@Pc(12) int local12 = local8.method4888();
		@Pc(16) int local16 = local8.method4868();
		if (local16 < 0 || Static68.anInt1612 != 0 && local16 > Static68.anInt1612) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(44) byte[] local44 = new byte[local16];
			local8.method4832(local44, 0, local16);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method4868();
			if (local56 < 0 || Static68.anInt1612 != 0 && Static68.anInt1612 < local56) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local56];
			if (local12 == 1) {
				Static234.method3768(local80, local56, arg0, local16);
			} else {
				@Pc(94) Class195 local94 = Static173.aClass195_1;
				synchronized (Static173.aClass195_1) {
					Static173.aClass195_1.method4487(local8, local80);
				}
			}
			return local80;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I")
	public static int method1384() {
		return Static200.anInt3634;
	}
}
