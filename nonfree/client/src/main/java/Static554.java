import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "[I")
	public static final int[] anIntArray645 = new int[14];

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)Z")
	public static boolean method8265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V")
	public static void method8267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(21) Class100 local21 = Static395.aClass100ArrayArrayArray3[arg0][arg3][arg2];
			if (local21 != null) {
				if (arg1 == 1) {
					local21.aShort32 = 0;
				} else if (arg1 == 2) {
					local21.aShort30 = 0;
				}
			}
			Static130.method3023();
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < Static617.anInt10803; local45++) {
			@Pc(51) Class82 local51 = Static618.aClass82Array4[local45];
			if (local51.aByte39 == arg1 && arg3 == local51.aShort21 && arg2 == local51.aShort23 || arg3 == local51.aShort20 && arg2 == local51.aShort23) {
				if (Static617.anInt10803 != local45) {
					Static653.method7721(Static618.aClass82Array4, local45 + 1, Static618.aClass82Array4, local45, Static618.aClass82Array4.length - local45 - 1);
				}
				Static617.anInt10803--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public static void method8268() {
		Static273.aClass20_8.xa(((float) Static74.aClass2_Sub13_5.aClass14_Sub18_1.method6463() * 0.1F + 0.7F) * Static414.aFloat167);
		Static273.aClass20_8.ZA(Static86.anInt2582, Static535.aFloat203, Static147.aFloat105, (float) (Static214.anInt4837 << 2), (float) (Class3_Sub1_Sub3_Sub1.lb << 2), (float) (Static473.anInt8872 << 2));
		Static273.aClass20_8.method7256(Static409.aClass78_3);
	}
}
