import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lfa", name = "v", descriptor = "Lclient!rc;")
	public static Class285 aClass285_7;

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "I")
	public static int anInt6235;

	@OriginalMember(owner = "client!lfa", name = "D", descriptor = "I")
	public static int anInt6236;

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "Z")
	public static boolean aBoolean442 = true;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)Z")
	public static boolean method5074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!ig;I)Lclient!or;")
	public static Class5_Sub4 method5076(@OriginalArg(0) Class8_Sub8 arg0) {
		return new Class5_Sub4(arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8560(), arg0.method8560(), arg0.method8525());
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!cs;Z)V")
	public static void method5077(@OriginalArg(0) Class15_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort105; local2 <= arg0.aShort104; local2++) {
			for (@Pc(6) int local6 = arg0.aShort103; local6 <= arg0.aShort106; local6++) {
				@Pc(16) Class56 local16 = Static405.aClass56ArrayArrayArray2[arg0.aByte124][local2][local6];
				if (local16 != null) {
					@Pc(21) Class152 local21 = local16.aClass152_2;
					@Pc(23) Class152 local23 = null;
					while (local21 != null) {
						if (local21.aClass15_Sub1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass152_2 = local21.aClass152_3;
							} else {
								local23.aClass152_3 = local21.aClass152_3;
							}
							local21.method4440();
							break;
						}
						local23 = local21;
						local21 = local21.aClass152_3;
					}
				}
			}
		}
		if (!arg1) {
			Static260.method4580(arg0);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method5078(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static599.method8250(local6.height, local6.width);
		if (Static105.anInt2774 == 1) {
			Static580.aClass16_10.method6085(arg0, Static100.anInt2662, Static494.anInt8752);
		} else {
			Static580.aClass16_10.method6085(arg0, Static371.anInt7077, Static553.anInt9617);
		}
	}
}
