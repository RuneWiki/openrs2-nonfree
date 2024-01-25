import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public static int anInt3390;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_20 = new Class163();

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt3391 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IC)Z")
	public static boolean method3122(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static295.aCharArray4;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(36) char local36 = local28[local30];
				if (local36 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[ILclient!iaa;I)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class3_Sub1_Sub2_Sub2_Sub1 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray690 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray690.length; local12++) {
				if (arg1[local12] != arg2.anIntArray690[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt9981 != -1) {
				@Pc(53) Class124 local53 = Static99.aClass2_1.method22(arg2.anInt9981);
				@Pc(56) int local56 = local53.anInt3024;
				if (local56 == 1) {
					arg2.anInt9941 = 0;
					arg2.anInt9960 = 0;
					arg2.anInt9934 = arg0;
					arg2.anInt9946 = 1;
					arg2.anInt9984 = 0;
					if (!arg2.aBoolean773) {
						Static633.method8389(arg2.anInt9960, arg2, local53);
					}
				}
				if (local56 == 2) {
					arg2.anInt9984 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray690 == null || arg2.anIntArray690[local12] == -1 || Static99.aClass2_1.method22(arg1[local12]).anInt3029 >= Static99.aClass2_1.method22(arg2.anIntArray690[local12]).anInt3029) {
				arg2.anIntArray690 = arg1;
				arg2.anInt9934 = arg0;
				break;
			}
		}
		if (local10) {
			arg2.anIntArray690 = arg1;
			arg2.anInt9934 = arg0;
		}
	}
}
