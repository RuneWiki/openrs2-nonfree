import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "B")
	public static byte aByte64;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	public static int anInt4638;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "[I")
	public static int[] anIntArray311 = new int[2];

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "Lclient!of;")
	public static final Class174 aClass174_134 = new Class174("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(Lclient!qa;I)V")
	public static void method3835(@OriginalArg(0) Class167 arg0) {
		arg0.w(0, 0, Static310.anInt5307, 350);
		arg0.M(0, 0, Static310.anInt5307, 350, Static189.anInt3452 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static130.anInt2355;
		@Pc(35) int local35;
		if (Static458.anInt7716 > 0) {
			local35 = 346 - Static130.anInt2355 - 4;
			@Pc(46) int local46 = local27 * local35 / (local27 + Static458.anInt7716 - 1);
			@Pc(48) int local48 = 4;
			if (Static458.anInt7716 > 1) {
				local48 = (Static458.anInt7716 - Static22.anInt381 - 1) * (local35 + -local46) / (Static458.anInt7716 - 1) + 4;
			}
			arg0.M(Static310.anInt5307 - 16, local48, 12, local46, Static189.anInt3452 << 24 | 0x332277, 2);
			for (@Pc(85) int local85 = Static22.anInt381; local27 + Static22.anInt381 > local85 && local85 < Static458.anInt7716; local85++) {
				@Pc(96) String[] local96 = Static403.method5514(Static363.aStringArray39[local85], '\b');
				@Pc(105) int local105 = (Static310.anInt5307 - 16 - 8) / local96.length;
				for (@Pc(107) int local107 = 0; local107 < local96.length; local107++) {
					@Pc(115) int local115 = local105 * local107 + 8;
					arg0.w(local115, 0, local115 + local105 - 8, 350);
					Static244.aClass18_1.method5167(local96[local107], -1, -16777216, local115, 350 - (local85 - Static22.anInt381) * Static130.anInt2355 - Static298.aClass124_11.anInt3597 - Static148.anInt2688 - 2);
				}
			}
		}
		arg0.w(0, 0, Static310.anInt5307, 350);
		arg0.method6018(Static310.anInt5307, 350 - Static148.anInt2688, -1, 0);
		Static266.aClass18_2.method5167("--> " + Static121.aString29, -1, -16777216, 10, 350 - Static251.aClass124_14.anInt3597 - 1);
		local35 = -1;
		if (Static172.anInt3107 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method5960(local35, 350 - Static251.aClass124_14.anInt3597 - 11, 12, Static251.aClass124_14.method3099("--> " + Static121.aString29.substring(0, Static73.anInt1339)) + 10);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3837(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static466.method205(arg0, 0, local14, 0, local11);
		return local14;
	}
}
