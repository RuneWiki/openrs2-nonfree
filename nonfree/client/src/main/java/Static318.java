import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[S")
	public static final short[] aShortArray100 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static final int anInt6106 = -1;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
	public static boolean aBoolean455 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method5489(@OriginalArg(0) int arg0) {
		Static112.anInt2495 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static300.anInt5778; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static354.anInt6714; local6++) {
				if (Static105.aClass155ArrayArrayArray3[arg0][local3][local6] == null) {
					Static105.aClass155ArrayArrayArray3[arg0][local3][local6] = new Class155(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	public static void method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static118.anIntArrayArray20 != null) {
			Static118.anIntArrayArray20[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
