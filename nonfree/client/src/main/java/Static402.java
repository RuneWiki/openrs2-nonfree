import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt6522;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
	public static boolean aBoolean534;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!no;")
	public static Class173 aClass173_6;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_203 = new Class151("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_31 = new Class257(8);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!jd;III)V")
	public static void method5017(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static112.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5076 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub24Array3[arg0.anInt5076++] = Static280.aClass71Array1[local21 - 1].aClass1_Sub24_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5076; local21 < 4; local21++) {
			arg0.aClass1_Sub24Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)I")
	public static int method5018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!dt;B)Z")
	public static boolean method5020(@OriginalArg(0) Class56 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean118) {
			return false;
		} else if (!arg0.method1234(Static114.anInterface11_2)) {
			return false;
		} else if (aClass257_31.method5503((long) arg0.anInt1480) == null) {
			return Static120.aClass257_20.method5503((long) arg0.anInt1479) == null;
		} else {
			return false;
		}
	}
}
