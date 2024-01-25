import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!ml;")
	public static Class134 aClass134_7;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "[[[Lclient!ls;")
	public static Class128[][][] aClass128ArrayArrayArray3;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public static int anInt5230 = 0;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "[Lclient!lf;")
	public static final Class4_Sub11[] aClass4_Sub11Array2 = new Class4_Sub11[2048];

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public static void method4520() {
		Static346.aClass43_37.method1282();
		Static5.aClass43_15.method1282();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!vq;)V")
	public static void method4521(@OriginalArg(0) Class47 arg0) {
		for (@Pc(1) int local1 = Static346.anInt6569; local1 < Static327.anInt6252; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static198.anInt4128; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static15.anInt1162; local7++) {
					@Pc(16) Class128 local16 = Static273.aClass128ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class8_Sub4 local21 = local16.aClass8_Sub4_1;
						@Pc(24) Class8_Sub4 local24 = local16.aClass8_Sub4_2;
						if (local21 != null && local21.method5622()) {
							Static17.method305(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5622()) {
								Static17.method305(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5621(arg0, false, local21, 0, 0, 0);
								local24.method5625();
							}
							local21.method5625();
						}
						for (@Pc(70) Class117 local70 = local16.aClass117_2; local70 != null; local70 = local70.aClass117_1) {
							@Pc(74) Class8_Sub1 local74 = local70.aClass8_Sub1_1;
							if (local74 != null && local74.method5622()) {
								Static17.method305(arg0, local74, local1, local4, local7, local74.aShort96 + 1 - local74.aShort98, local74.aShort99 - local74.aShort97 + 1);
								local74.method5625();
							}
						}
						@Pc(111) Class8_Sub5 local111 = local16.aClass8_Sub5_1;
						if (local111 != null && local111.method5622()) {
							Static237.method5585(arg0, local111, local1, local4, local7);
							local111.method5625();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public static void method4522() {
		@Pc(5) Class198 local5 = Static77.aClass198_66;
		synchronized (Static77.aClass198_66) {
			Static77.aClass198_66.method5202(5);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZII)V")
	public static void method4523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static67.anInt1778; local3++) {
			@Pc(9) Rectangle local9 = Class13.aRectangleArray1[local3];
			if (arg0 < local9.width + local9.x && local9.x < arg0 + arg1 && arg2 < local9.height + local9.y && local9.y < arg2 + arg3) {
				Static353.aBooleanArray12[local3] = true;
			}
		}
	}
}
