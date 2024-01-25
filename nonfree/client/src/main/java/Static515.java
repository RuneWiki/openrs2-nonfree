import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public static int anInt8875;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!bba;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
	public static void method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static497.aClass350_9.method8356(Static21.aClass21_23.method324(Static26.anInt352));
		@Pc(79) int local79;
		@Pc(38) int local38;
		if (Static35.aBoolean45) {
			for (@Pc(20) Class14_Sub2_Sub17 local20 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local20 != null; local20 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
				if (local20.anInt9298 == 1) {
					local38 = Static323.method5076((Class14_Sub2_Sub20) local20.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67);
				} else {
					local38 = Static288.method4793(local20);
				}
				if (local38 > local13) {
					local13 = local38;
				}
			}
			Static252.anInt4767 = Static164.anInt2537 * 16 + (Static575.aBoolean661 ? 26 : 22);
			local13 += 8;
			local79 = Static164.anInt2537 * 16 + 21;
		} else {
			for (@Pc(86) Class14_Sub2_Sub20 local86 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local86 != null; local86 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				local38 = Static323.method5076(local86);
				if (local38 > local13) {
					local13 = local38;
				}
			}
			local79 = Static638.anInt10454 * 16 + 21;
			Static252.anInt4767 = (Static575.aBoolean661 ? 26 : 22) + Static638.anInt10454 * 16;
			local13 += 8;
		}
		@Pc(137) int local137 = arg0 - local13 / 2;
		if (Static563.anInt4939 < local13 + local137) {
			local137 = Static563.anInt4939 - local13;
		}
		if (local137 < 0) {
			local137 = 0;
		}
		local38 = arg1;
		if (arg1 + local79 > Static506.anInt8791) {
			local38 = Static506.anInt8791 - local79;
		}
		Static189.anInt3199 = local137;
		if (local38 < 0) {
			local38 = 0;
		}
		Static501.anInt8738 = local13;
		Static455.aBoolean533 = true;
		Static78.anInt1261 = local38;
	}
}
