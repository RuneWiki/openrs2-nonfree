import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_18 = new Class223(4);

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!wd;Z)[Lclient!pc;")
	public static Class257[] method3183(@OriginalArg(0) Class354 arg0) {
		if (!arg0.method8226()) {
			return new Class257[0];
		}
		@Pc(16) Class234 local16 = arg0.method8233();
		while (local16.anInt6717 == 0) {
			Static63.method1019(10L);
		}
		if (local16.anInt6717 == 2) {
			return new Class257[0];
		}
		@Pc(45) int[] local45 = (int[]) local16.anObject16;
		@Pc(51) Class257[] local51 = new Class257[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class257 local59 = new Class257();
			local51[local53] = local59;
			local59.anInt7525 = local45[local53 << 2];
			local59.anInt7527 = local45[(local53 << 2) + 1];
			local59.anInt7528 = local45[(local53 << 2) + 2];
			local59.anInt7532 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!jn;I)V")
	public static void method3184(@OriginalArg(0) Class176 arg0) {
		Static296.aClass176_75 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3185(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static218.method3580(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(30) int local30;
			for (local30 = local17; arg1.charAt(local30) != arg0; local30++) {
			}
			local13[local15++] = arg1.substring(local17, local30);
			local17 = local30 + 1;
		}
		local13[local8] = arg1.substring(local17);
		return local13;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZII)I")
	public static int method3187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(FBZIIIIII)[[I")
	public static int[][] method3189(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub1_Sub4 local13 = new Class4_Sub1_Sub4();
		local13.anInt683 = 4;
		local13.anInt679 = 3;
		local13.anInt675 = (int) (arg0 * 4096.0F);
		local13.anInt676 = 4;
		local13.aBoolean35 = false;
		local13.method8391();
		Static419.method6557(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method632(local9[local45], local45);
		}
		return local9;
	}
}
