import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int anInt9178 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)V")
	public static void method7233(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub7_Sub19 local14 = Static73.method5992(16, arg0);
		local14.method7364();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method7234(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.length();
		if (local12 == 0) {
			return new byte[0];
		}
		@Pc(23) int local23 = local12 + 3 & 0xFFFFFFFC;
		@Pc(29) int local29 = local23 / 4 * 3;
		if (local12 <= local23 - 2 || Static589.method8110(arg0.charAt(local23 - 2)) == -1) {
			local29 -= 2;
		} else if (local12 <= local23 - 1 || Static589.method8110(arg0.charAt(local23 - 1)) == -1) {
			local29--;
		}
		@Pc(74) byte[] local74 = new byte[local29];
		Static245.method3873(local74, 0, arg0);
		return local74;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BII)Z")
	public static boolean method7235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
