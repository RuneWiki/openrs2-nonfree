import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	public static int anInt4758;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
	public static int anInt4759;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	public static int anInt4761;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!caa;")
	public static Class48 aClass48_23;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_25 = new Class114();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZLjava/lang/String;Lclient!nd;)Lclient!gea;")
	public static Class129 method4167(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class238 arg2) {
		@Pc(15) int local15 = arg2.method5575(arg1);
		if (local15 == -1) {
			return new Class129(0);
		}
		@Pc(28) int[] local28 = arg2.method5595(local15);
		@Pc(34) Class129 local34 = new Class129(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt3588) {
				@Pc(51) Class2_Sub17 local51 = new Class2_Sub17(arg2.method5567(local28[local38++], local15));
				@Pc(55) int local55 = local51.method2881();
				@Pc(59) int local59 = local51.method2825();
				@Pc(63) int local63 = local51.method2859();
				if (!arg0 && local63 == 1) {
					local34.anInt3588--;
				} else {
					local34.anIntArray232[local36] = local55;
					local34.anIntArray233[local36] = local59;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)I")
	public static int method4169(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
