import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aia", name = "L", descriptor = "[I")
	public static final int[] anIntArray37 = new int[1];

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLjava/lang/String;Lclient!wu;Z)Lclient!eea;")
	public static Class84 method226(@OriginalArg(1) String arg0, @OriginalArg(2) Class380 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method8609(arg0);
		if (local10 == -1) {
			return new Class84(0);
		}
		@Pc(23) int[] local23 = arg1.method8617(local10);
		@Pc(29) Class84 local29 = new Class84(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local31 < local29.anInt2183) {
				@Pc(52) Class2_Sub22 local52 = new Class2_Sub22(arg1.method8620(local10, local23[local38++]));
				@Pc(56) int local56 = local52.method8542();
				@Pc(60) int local60 = local52.method8546();
				@Pc(64) int local64 = local52.method8547();
				if (!arg2 && local64 == 1) {
					local29.anInt2183--;
				} else {
					local29.anIntArray156[local31] = local56;
					local29.anIntArray157[local31] = local60;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!am;B)I")
	public static int method228(@OriginalArg(0) Class13_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(13) Class150 local13 = arg0.aClass150_1;
		if (local13.anIntArray262 != null) {
			local13 = local13.method3196(Static431.aClass205_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt3809;
		@Pc(32) Class334 local32 = arg0.method3964();
		if (arg0.anInt4553 == -1 || arg0.aBoolean319) {
			local28 = local13.anInt3799;
		} else if (arg0.anInt4553 == local32.anInt8919 || local32.anInt8931 == arg0.anInt4553 || local32.anInt8945 == arg0.anInt4553 || arg0.anInt4553 == local32.anInt8921) {
			local28 = local13.anInt3779;
		} else if (arg0.anInt4553 == local32.anInt8943 || local32.anInt8913 == arg0.anInt4553 || local32.anInt8930 == arg0.anInt4553 || local32.anInt8926 == arg0.anInt4553) {
			local28 = local13.anInt3810;
		}
		return local28;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)I")
	public static int method229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BII)V")
	public static void method230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static361.aClass95_9 == null) {
			return;
		}
		@Pc(10) int local10 = Static176.anInt3100;
		@Pc(12) int local12 = Static174.anInt3080;
		Static66.method8417(arg0, arg1);
		if (Static491.anInt8078 == 0) {
			Static151.anInterface4_1 = null;
			Static151.anInterface4_1 = Static361.aClass95_9.method6959(Static361.aClass95_9.method6968(Static61.anInt1162, Static158.anInt2827), Static361.aClass95_9.method6983(Static61.anInt1162, Static158.anInt2827));
		} else if (Static491.anInt8078 == 1 && (Static319.anInterface4Array1 == null || local10 != Static176.anInt3100 || local12 != Static174.anInt3080)) {
			Static319.anInterface4Array1 = new Interface4[Static174.anInt3080 * Static176.anInt3100];
			for (@Pc(45) int local45 = 0; local45 < Static319.anInterface4Array1.length; local45++) {
				Static319.anInterface4Array1[local45] = Static361.aClass95_9.method6959(Static361.aClass95_9.method6968(Static281.anInt4510, Static598.anInt9689), Static361.aClass95_9.method6983(Static281.anInt4510, Static598.anInt9689));
			}
			Static613.anInt9883 = 1;
			Static70.anIntArray93 = new int[Static176.anInt3100 * Static174.anInt3080];
		}
		Static116.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method231(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}
}
