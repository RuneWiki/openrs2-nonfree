import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "Lclient!ho;")
	public static Class151 aClass151_9;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_64 = new Class114();

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_19 = new Class131(7, 0, 1, 1);

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
	public static int anInt9346 = -1;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBII)V")
	public static void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(101) Class226 local101 = Static635.aClass226ArrayArrayArray3[arg3][arg2][arg1];
			if (local101 != null) {
				if (arg0 == 1) {
					local101.aShort66 = 0;
				} else if (arg0 == 2) {
					local101.aShort68 = 0;
				}
			}
			Static23.method291();
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static479.anInt8053; local15++) {
			@Pc(21) Class38 local21 = Static108.aClass38Array1[local15];
			if (arg0 == local21.aByte9 && arg2 == local21.aShort4 && arg1 == local21.aShort2 || local21.aShort5 == arg2 && arg1 == local21.aShort2) {
				if (local15 != Static479.anInt8053) {
					Static686.method4966(Static108.aClass38Array1, local15 + 1, Static108.aClass38Array1, local15, Static108.aClass38Array1.length - local15 - 1);
				}
				Static479.anInt8053--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
	public static void method7908() {
		if (Static173.anInt3397 == 9) {
			Static271.method4671(5);
		} else if (Static173.anInt3397 == 5 || Static173.anInt3397 == 6) {
			Static271.method4671(3);
		} else if (Static173.anInt3397 == 12) {
			Static271.method4671(3);
			return;
		}
	}
}
