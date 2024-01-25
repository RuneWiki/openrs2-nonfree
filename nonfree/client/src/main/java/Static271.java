import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public static void method4126() {
		if (Static90.anInt1675 == 0) {
			return;
		}
		try {
			if (++Static376.anInt5177 > 2000) {
				if (Static103.aClass30_1 != null) {
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
				}
				if (Static264.anInt4544 >= 1) {
					Static201.anInt3540 = -5;
					Static90.anInt1675 = 0;
					return;
				}
				if (Static384.anInt6347 == Static178.anInt1113) {
					Static384.anInt6347 = Static358.anInt6021;
				} else {
					Static384.anInt6347 = Static178.anInt1113;
				}
				Static264.anInt4544++;
				Static90.anInt1675 = 1;
				Static376.anInt5177 = 0;
			}
			if (Static90.anInt1675 == 1) {
				Static215.aClass249_5 = Static165.aClass103_3.method2378(Static367.aString66, Static384.anInt6347);
				Static90.anInt1675 = 2;
			}
			@Pc(102) int local102;
			if (Static90.anInt1675 == 2) {
				if (Static215.aClass249_5.anInt6929 == 2) {
					throw new IOException();
				}
				if (Static215.aClass249_5.anInt6929 != 1) {
					return;
				}
				Static103.aClass30_1 = new Class30((Socket) Static215.aClass249_5.anObject10, Static165.aClass103_3);
				Static215.aClass249_5 = null;
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static124.method3215();
				local102 = Static103.aClass30_1.method738();
				Static124.method3215();
				if (local102 != 21) {
					Static90.anInt1675 = 0;
					Static201.anInt3540 = local102;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					return;
				}
				Static90.anInt1675 = 3;
			}
			if (Static90.anInt1675 == 3) {
				if (Static103.aClass30_1.method735() < 1) {
					return;
				}
				Static237.aStringArray27 = new String[Static103.aClass30_1.method738()];
				Static90.anInt1675 = 4;
			}
			if (Static90.anInt1675 == 4) {
				if (Static103.aClass30_1.method735() < Static237.aStringArray27.length * 8) {
					return;
				}
				Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
				Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, Static237.aStringArray27.length * 8);
				for (local102 = 0; local102 < Static237.aStringArray27.length; local102++) {
					Static237.aStringArray27[local102] = Static350.method4963(Static55.aClass6_Sub15_Sub1_1.method3119());
				}
				Static201.anInt3540 = 21;
				Static90.anInt1675 = 0;
				Static103.aClass30_1.method741();
				Static103.aClass30_1 = null;
				return;
			}
		} catch (@Pc(196) IOException local196) {
			if (Static103.aClass30_1 != null) {
				Static103.aClass30_1.method741();
				Static103.aClass30_1 = null;
			}
			if (Static264.anInt4544 >= 1) {
				Static201.anInt3540 = -4;
				Static90.anInt1675 = 0;
			} else {
				if (Static178.anInt1113 == Static384.anInt6347) {
					Static384.anInt6347 = Static358.anInt6021;
				} else {
					Static384.anInt6347 = Static178.anInt1113;
				}
				Static90.anInt1675 = 1;
				Static376.anInt5177 = 0;
				Static264.anInt4544++;
			}
		}
	}
}
