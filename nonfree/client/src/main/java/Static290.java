import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public static int anInt4775;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!on", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	public static int anInt4777 = 0;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public static void method3868() {
		if (Static450.anInt7195 == 5) {
			Static450.anInt7195 = 6;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!or;ILjava/lang/String;)Lclient!gp;")
	public static Class91 method3869(@OriginalArg(1) Class183 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method3910(arg2);
		}
		@Pc(36) Class91 local36;
		if (arg1 == 1) {
			try {
				Static469.method4192(new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() }, arg0.anApplet1, "openjs");
				local36 = new Class91();
				local36.anInt2446 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class91();
				local36.anInt2446 = 2;
				return local36;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local36 = new Class91();
				local36.anInt2446 = 1;
				return local36;
			} catch (@Pc(78) Exception local78) {
				local36 = new Class91();
				local36.anInt2446 = 2;
				return local36;
			}
		} else if (arg1 == 3) {
			try {
				Static469.method4194("loggedout", arg0.anApplet1);
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local36 = new Class91();
				local36.anInt2446 = 1;
				return local36;
			} catch (@Pc(122) Exception local122) {
				local36 = new Class91();
				local36.anInt2446 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!pu;[[BI)V")
	public static void method3872(@OriginalArg(0) Class118_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt5443; local3++) {
			Static123.method5625();
			for (@Pc(11) int local11 = 0; local11 < Static166.anInt2852 >> 3; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static426.anInt6923 >> 3; local15++) {
					@Pc(25) int local25 = Static121.anIntArrayArrayArray1[local3][local11][local15];
					if (local25 != -1) {
						@Pc(35) int local35 = local25 >> 24 & 0x3;
						if (!arg0.aBoolean408 || local35 == 0) {
							@Pc(49) int local49 = local25 >> 1 & 0x3;
							@Pc(55) int local55 = local25 >> 14 & 0x3FF;
							@Pc(61) int local61 = local25 >> 3 & 0x7FF;
							@Pc(72) int local72 = (local55 / 8 << 8) + (local61 / 8);
							for (@Pc(74) int local74 = 0; local74 < Static225.anIntArray310.length; local74++) {
								if (Static225.anIntArray310[local74] == local72 && arg1[local74] != null) {
									arg0.method4319(arg1[local74], local11 * 8, local49, (local55 & 0x7) * 8, local35, local15 * 8, (local61 & 0x7) * 8, Static82.aClass163_1, local3, Static361.aClass71Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
