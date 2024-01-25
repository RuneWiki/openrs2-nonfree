import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public static final int[] anIntArray686 = new int[1000];

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger10 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!de;")
	public static final Class69 aClass69_64 = new Class69(30);

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_209 = new Class200(72, -1);

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public static int anInt9525 = 0;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
	public static final int[] anIntArray687 = new int[1000];

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public static void method8083() {
		for (@Pc(8) int local8 = 0; local8 < Static317.anInt5602; local8++) {
			@Pc(14) int local14 = Static363.anIntArray409[local8];
			@Pc(21) Class2_Sub32 local21 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local14);
			if (local21 != null) {
				@Pc(26) Class16_Sub1_Sub1_Sub3_Sub1 local26 = local21.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				Static403.method6008(local26, local26.aClass113_1.anInt3238);
			}
		}
	}
}
