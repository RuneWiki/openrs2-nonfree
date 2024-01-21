import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Lclient!jg;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "Lclient!jg;")
	public static Class44 aClass44_3;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!kb;")
	private static Class46 aClass46_112 = Static65.method1172("Select a world");

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "Lclient!kb;")
	public static Class46 aClass46_113 = aClass46_112;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!nb;")
	public static Class57 aClass57_3 = new Class57(64);

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	public static int anInt408 = 0;

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "Lclient!kb;")
	public static Class46 aClass46_114 = Static65.method1172(" loggt sich aus)3");

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_115 = Static65.method1172("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method317() {
		aClass44_3 = null;
		aClass46_114 = null;
		aClass46_115 = null;
		aClass57_3 = null;
		aClass44_2 = null;
		aClass46_112 = null;
		aClass46_113 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)[B")
	public static byte[] method318(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(12) int local12 = local8.method191();
		@Pc(21) int local21 = local8.method213();
		if (local21 < 0 || Static168.anInt3716 != 0 && local21 > Static168.anInt3716) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(50) byte[] local50 = new byte[local21];
			local8.method178(local21, local50);
			return local50;
		} else {
			@Pc(62) int local62 = local8.method213();
			if (local62 < 0 || Static168.anInt3716 != 0 && Static168.anInt3716 < local62) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local62];
			if (local12 == 1) {
				Static17.method329(local79, local62, arg0, local21);
			} else {
				Static85.aClass58_2.method1726(local8, local79);
			}
			return local79;
		}
	}
}
