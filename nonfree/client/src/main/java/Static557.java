import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_234 = new Class169(37, 0);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
	public static void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static193.aClass291ArrayArrayArray2[0][arg1][arg2] != null && Static193.aClass291ArrayArrayArray2[0][arg1][arg2].aClass291_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static193.aClass291ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class291 local44 = Static193.aClass291ArrayArrayArray2[local22][arg1][arg2] = new Class291(local22);
				if (local20) {
					local44.aByte112++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public static void method8502() {
		if (Static387.anInt7336 == 0) {
			return;
		}
		try {
			if (++Static276.anInt5123 > 2000) {
				if (Static395.aClass207_2 != null) {
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
				}
				if (Static113.anInt2042 >= 2) {
					Static387.anInt7336 = 0;
					Static532.anInt9332 = -5;
					return;
				}
				Static229.aClass66_3.method1681();
				Static113.anInt2042++;
				Static387.anInt7336 = 1;
				Static276.anInt5123 = 0;
			}
			if (Static387.anInt7336 == 1) {
				Static668.aClass268_9 = Static229.aClass66_3.method1684(Static96.aClass48_5);
				Static387.anInt7336 = 2;
			}
			if (Static387.anInt7336 == 2) {
				if (Static668.aClass268_9.anInt8008 == 2) {
					throw new IOException();
				}
				if (Static668.aClass268_9.anInt8008 != 1) {
					return;
				}
				Static395.aClass207_2 = Static644.method9522((Socket) Static668.aClass268_9.anObject19);
				Static668.aClass268_9 = null;
				Static355.method6354();
				Static387.anInt7336 = 4;
			}
			if (Static387.anInt7336 == 4 && Static395.aClass207_2.method5439(1)) {
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
				@Pc(116) int local116 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
				Static387.anInt7336 = 0;
				Static532.anInt9332 = local116;
				Static395.aClass207_2.method5436();
				Static395.aClass207_2 = null;
			}
		} catch (@Pc(127) IOException local127) {
			if (Static395.aClass207_2 != null) {
				Static395.aClass207_2.method5436();
				Static395.aClass207_2 = null;
			}
			if (Static113.anInt2042 >= 2) {
				Static532.anInt9332 = -4;
				Static387.anInt7336 = 0;
			} else {
				Static229.aClass66_3.method1681();
				Static387.anInt7336 = 1;
				Static113.anInt2042++;
				Static276.anInt5123 = 0;
			}
		}
	}
}
