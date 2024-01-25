import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_128 = new Class15("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
	public static final int[] anIntArray532 = new int[100];

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!up;")
	public static final Class250 aClass250_22 = new Class250(14, 7);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method5666(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(72) int local72;
			if (local44 >= '0' && local44 <= '9') {
				local72 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local72 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local72 = local44 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local72 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local72 = -local72;
			}
			@Pc(122) int local122 = local72 + local33 * arg1;
			if (local122 / arg1 != local33) {
				throw new NumberFormatException();
			}
			local33 = local122;
			local31 = true;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local33;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII)V")
	public static void method5668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static177.anInt3224; local15++) {
			@Pc(21) Rectangle local21 = Class4_Sub9.aRectangleArray3[local15];
			if (arg0 < local21.width + local21.x && arg1 + arg0 > local21.x && arg3 < local21.height + local21.y && local21.y < arg2 + arg3) {
				Static324.aBooleanArray26[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	public static void method5669(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static258.anInt4313 = arg0;
	}
}
