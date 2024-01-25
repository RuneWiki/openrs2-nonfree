import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "[[[Lclient!ih;")
	public static Class156[][][] aClass156ArrayArrayArray1;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_24 = new Class181(65, -1);

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!fs;B)I")
	public static int method2075(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) Class271 local8 = arg0.aClass271_1;
		if (local8.anIntArray591 != null) {
			local8 = local8.method6476(Static564.aClass304_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt7327;
		@Pc(32) Class295 local32 = arg0.method2519();
		if (arg0.anInt2924 == -1 || arg0.aBoolean257) {
			local23 = local8.anInt7325;
		} else if (arg0.anInt2924 == local32.anInt7956 || local32.anInt7959 == arg0.anInt2924 || arg0.anInt2924 == local32.anInt7984 || arg0.anInt2924 == local32.anInt7970) {
			local23 = local8.anInt7345;
		} else if (local32.anInt7969 == arg0.anInt2924 || arg0.anInt2924 == local32.anInt8001 || local32.anInt7997 == arg0.anInt2924 || arg0.anInt2924 == local32.anInt7958) {
			local23 = local8.anInt7351;
		}
		return local23;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IC)Z")
	public static boolean method2077(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static233.method6787(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static593.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static456.aCharArray5;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}
