import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	public static int anInt1319;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "Lclient!iaa;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
	public static int anInt1324 = 104;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
	public static int anInt1327 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I[ILclient!cb;)Lclient!wi;")
	public static Class23_Sub3 method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class9_Sub1 arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg4.method7713(Static489.aClass289_13, Static97.aClass16_17)) {
			@Pc(21) int[] local21 = new int[arg0 * arg1];
			for (local23 = 0; local23 < arg1; local23++) {
				local33 = local23 * arg0 + arg2[local23];
				for (local35 = 0; local35 < arg3[local23]; local35++) {
					local21[local33++] = -16777216;
				}
			}
			return new Class23_Sub3(arg4, arg0, arg1, local21);
		}
		@Pc(65) byte[] local65 = new byte[arg1 * arg0];
		for (local23 = 0; local23 < arg1; local23++) {
			local33 = arg0 * local23 + arg2[local23];
			for (local35 = 0; local35 < arg3[local23]; local35++) {
				local65[local33++] = -1;
			}
		}
		return new Class23_Sub3(arg4, arg0, arg1, local65);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(CI)C")
	public static char method1330(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZII)V")
	public static void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg0 < arg1) {
			for (local14 = arg0; local14 < arg1; local14++) {
				Static81.anIntArrayArray25[local14][arg2] = arg3;
			}
		} else {
			for (local14 = arg1; local14 < arg0; local14++) {
				Static81.anIntArrayArray25[local14][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
	public static void method1333() {
		if (Static478.aFrame1 != null) {
			return;
		}
		@Pc(11) Container local11;
		if (Static543.aFrame2 == null) {
			local11 = Static91.aClass182_2.anApplet1;
		} else {
			local11 = Static543.aFrame2;
		}
		Static60.anInt1681 = local11.getSize().width;
		Static547.anInt9471 = local11.getSize().height;
		@Pc(28) Insets local28;
		if (local11 == Static543.aFrame2) {
			local28 = Static543.aFrame2.getInsets();
			Static547.anInt9471 -= local28.bottom + local28.top;
			Static60.anInt1681 -= local28.left + local28.right;
		}
		if (Static155.method3122() == 1) {
			Static145.anInt3327 = (Static60.anInt1681 - Static347.anInt6402) / 2;
			Static90.anInt2326 = Static450.anInt7569;
			Static12.anInt658 = 0;
			Static290.anInt6867 = Static347.anInt6402;
		} else if (Static318.anInt6040 < 96 && Static526.anInt8926 == 0) {
			@Pc(87) int local87 = Static60.anInt1681 <= 1024 ? Static60.anInt1681 : 1024;
			Static145.anInt3327 = (Static60.anInt1681 - local87) / 2;
			Static290.anInt6867 = local87;
			@Pc(105) int local105 = Static547.anInt9471 > 768 ? 768 : Static547.anInt9471;
			Static90.anInt2326 = local105;
			Static12.anInt658 = 0;
		} else {
			Static90.anInt2326 = Static547.anInt9471;
			Static145.anInt3327 = 0;
			Static12.anInt658 = 0;
			Static290.anInt6867 = Static60.anInt1681;
		}
		if (Static359.aClass199_13 != Static363.aClass199_14) {
			@Pc(123) boolean local123;
			if (Static290.anInt6867 < 1024 && Static90.anInt2326 < 768) {
				local123 = true;
			} else {
				local123 = false;
			}
		}
		Static78.aCanvas7.setSize(Static290.anInt6867, Static90.anInt2326);
		if (Static478.aClass9_10 != null) {
			Static478.aClass9_10.method7627(Static78.aCanvas7);
		}
		if (Static543.aFrame2 == local11) {
			local28 = Static543.aFrame2.getInsets();
			Static78.aCanvas7.setLocation(local28.left + Static145.anInt3327, Static12.anInt658 + local28.top);
		} else {
			Static78.aCanvas7.setLocation(Static145.anInt3327, Static12.anInt658);
		}
		if (Static85.anInt2201 != -1) {
			Static204.method3768(true);
		}
		Static153.method3117();
	}
}
