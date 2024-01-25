import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "[Lclient!qg;")
	public static Class264[] aClass264Array1;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public static int anInt3168 = -1;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	public static int anInt3179 = -1;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_40 = new Class316(7, 18);

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
	public static int anInt3184 = -1;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_41 = new Class98(89, 4);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2720(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub12 local8 = new Class6_Sub12(arg0);
		@Pc(12) int local12 = local8.method6019();
		@Pc(23) int local23 = local8.method6015();
		if (local23 < 0 || Static493.anInt8641 != 0 && local23 > Static493.anInt8641) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local8.method6020(local45, local23);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method6015();
			if (local57 < 0 || Static493.anInt8641 != 0 && local57 > Static493.anInt8641) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local57];
			if (local12 == 1) {
				Static434.method6158(local74, local57, arg0, local23);
			} else {
				@Pc(88) Class328 local88 = Static301.aClass328_1;
				synchronized (Static301.aClass328_1) {
					Static301.aClass328_1.method7381(local8, local74);
				}
			}
			return local74;
		}
	}
}
