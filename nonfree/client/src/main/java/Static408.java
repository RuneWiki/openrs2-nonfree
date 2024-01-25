import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Lclient!qa;")
	public static Class172 aClass172_10;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!mq;")
	public static Class156 aClass156_16 = null;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_221 = new Class189("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
	public static boolean method5247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	public static int method5248(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)I")
	public static int method5249(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
