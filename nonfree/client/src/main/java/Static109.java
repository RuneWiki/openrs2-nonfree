import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!vi;")
	public static final Class3_Sub46 aClass3_Sub46_1 = new Class3_Sub46(0, 0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	public static void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub1 local13 = local7.aClass1_Sub1_1;
		@Pc(16) Class1_Sub1 local16 = local7.aClass1_Sub1_2;
		if (local13 != null) {
			local13.anInt7737 = local13.anInt7737 * arg3 / (0x10 << Static437.anInt7308 - 7);
			local13.anInt7739 = local13.anInt7739 * arg3 / (0x10 << Static437.anInt7308 - 7);
		}
		if (local16 != null) {
			local16.anInt7737 = local16.anInt7737 * arg3 / (0x10 << Static437.anInt7308 - 7);
			local16.anInt7739 = local16.anInt7739 * arg3 / (0x10 << Static437.anInt7308 - 7);
		}
	}
}
