import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!gf;")
	public static Class132 aClass132_4;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
	public static int anInt9774;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public static int anInt9775;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)I")
	public static int method8370(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(48) int local48 = (arg0 & 0x7F) * 96 >> 7;
			if (local48 < 2) {
				local48 = 2;
			} else if (local48 > 126) {
				local48 = 126;
			}
			return (arg0 & 0xFF80) + local48;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Lclient!uea;")
	public static Class4_Sub48 method8371() {
		@Pc(12) Class4_Sub48 local12 = Static316.method4373();
		local12.anInt9240 = 0;
		local12.aClass216_139 = null;
		local12.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(5000);
		return local12;
	}
}
