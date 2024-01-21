import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_988 = Static158.method3034("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BZI)Lclient!ob;")
	public static Class60 method2764(@OriginalArg(2) int arg0) {
		return Static97.method2262(arg0, true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method2766(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt3260 == 0) {
			return;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt3291 != -1 && arg0.anInt3291 < 32768) {
			@Pc(27) Class2_Sub1_Sub1_Sub3_Sub2 local27 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[arg0.anInt3291];
			if (local27 != null) {
				local36 = arg0.anInt3302 - local27.anInt3302;
				local43 = arg0.anInt3273 - local27.anInt3273;
				if (local36 != 0 || local43 != 0) {
					arg0.anInt3255 = (int) (Math.atan2((double) local36, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.anInt3291 >= 32768) {
			local36 = arg0.anInt3291 - 32768;
			if (Static89.anInt2601 == local36) {
				local36 = 2047;
			}
			@Pc(90) Class2_Sub1_Sub1_Sub3_Sub1 local90 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local36];
			if (local90 != null) {
				@Pc(99) int local99 = arg0.anInt3302 - local90.anInt3302;
				@Pc(106) int local106 = arg0.anInt3273 - local90.anInt3273;
				if (local99 != 0 || local106 != 0) {
					arg0.anInt3255 = (int) (Math.atan2((double) local99, (double) local106) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3293 != 0 || arg0.anInt3269 != 0) && (arg0.anInt3254 == 0 || arg0.anInt3275 > 0)) {
			local36 = arg0.anInt3302 - (arg0.anInt3293 - Static76.anInt2319 - Static76.anInt2319) * 64;
			local43 = arg0.anInt3273 - (arg0.anInt3269 - Static76.anInt2317 - Static76.anInt2317) * 64;
			if (local36 != 0 || local43 != 0) {
				arg0.anInt3255 = (int) (Math.atan2((double) local36, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt3293 = 0;
			arg0.anInt3269 = 0;
		}
		local36 = arg0.anInt3255 - arg0.anInt3265 & 0x7FF;
		if (local36 == 0) {
			arg0.anInt3276 = 0;
			return;
		}
		arg0.anInt3276++;
		@Pc(223) boolean local223;
		if (local36 > 1024) {
			arg0.anInt3265 -= arg0.anInt3260;
			local223 = true;
			if (local36 < arg0.anInt3260 || local36 > 2048 - arg0.anInt3260) {
				arg0.anInt3265 = arg0.anInt3255;
				local223 = false;
			}
			if (arg0.anInt3289 == arg0.anInt3250 && (arg0.anInt3276 > 25 || local223)) {
				if (arg0.anInt3296 == -1) {
					arg0.anInt3250 = arg0.anInt3258;
				} else {
					arg0.anInt3250 = arg0.anInt3296;
				}
			}
		} else {
			arg0.anInt3265 += arg0.anInt3260;
			local223 = true;
			if (arg0.anInt3260 > local36 || local36 > 2048 - arg0.anInt3260) {
				local223 = false;
				arg0.anInt3265 = arg0.anInt3255;
			}
			if (arg0.anInt3289 == arg0.anInt3250 && (arg0.anInt3276 > 25 || local223)) {
				if (arg0.anInt3252 == -1) {
					arg0.anInt3250 = arg0.anInt3258;
				} else {
					arg0.anInt3250 = arg0.anInt3252;
				}
			}
		}
		arg0.anInt3265 &= 0x7FF;
	}
}
