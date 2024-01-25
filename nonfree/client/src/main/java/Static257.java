import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt4830;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt4827 = -50;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method3906(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static86.method1482(arg1, 0, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	public static void method3907(@OriginalArg(1) int arg0) {
		if (Static306.anInt5401 == arg0) {
			return;
		}
		Static81.anInt1950 = Static171.anInt3288 = Static81.anIntArray104[arg0];
		Static424.method5741();
		Static34.anIntArrayArray5 = new int[Static81.anInt1950][Static171.anInt3288];
		Static293.anIntArrayArrayArray13 = new int[4][Static81.anInt1950 >> 3][Static171.anInt3288 >> 3];
		Static275.anIntArrayArray60 = new int[Static81.anInt1950][Static171.anInt3288];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static332.aClass37Array1[local44] = Static446.method6041(Static81.anInt1950, Static171.anInt3288);
		}
		Static440.aByteArrayArrayArray17 = new byte[4][Static81.anInt1950][Static171.anInt3288];
		Static220.method3386(Static81.anInt1950, Static171.anInt3288);
		Static440.method5947(Static171.anInt3288 >> 3, Static81.anInt1950 >> 3, Static387.aClass26_9);
		Static306.anInt5401 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	public static void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class113 local28 = Static176.aClass113ArrayArrayArray3[local9][arg0][arg1] = Static176.aClass113ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte29--;
				for (@Pc(40) Class134 local40 = local28.aClass134_1; local40 != null; local40 = local40.aClass134_2) {
					@Pc(44) Class4_Sub2 local44 = local40.aClass4_Sub2_1;
					if (local44.aShort88 == arg0 && local44.aShort89 == arg1) {
						local44.aByte92--;
					}
				}
			}
		}
		if (Static176.aClass113ArrayArrayArray3[0][arg0][arg1] == null) {
			Static176.aClass113ArrayArrayArray3[0][arg0][arg1] = new Class113(0, arg0, arg1);
			Static176.aClass113ArrayArrayArray3[0][arg0][arg1].aByte33 = 1;
		}
		Static176.aClass113ArrayArrayArray3[0][arg0][arg1].aClass113_1 = local7;
		Static176.aClass113ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method3911(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static52.method5823(local13) : local13;
		} else if (arg1 instanceof Class142) {
			@Pc(33) Class142 local33 = (Class142) arg1;
			return local33.method3343();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
