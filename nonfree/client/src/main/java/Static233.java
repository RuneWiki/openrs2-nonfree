import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[Lclient!ne;")
	public static Class173[] aClass173Array1;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_209 = new Class12(53, -2);

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class1_Sub14 local20 = new Class1_Sub14(arg4);
		@Pc(22) int local22 = -1;
		label56: while (true) {
			@Pc(26) int local26 = local20.method4507();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local20.method4521();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local20.method4548() >> 2;
					@Pc(85) int local85 = arg3 + local75;
					@Pc(89) int local89 = local69 + arg0;
					if (local85 > 0 && local89 > 0 && local85 < arg2 - 1 && arg1 - 1 > local89) {
						@Pc(116) Class29 local116 = Static251.aClass207_2.method4977(local22);
						if (local81 != 22 || Static327.aClass230_Sub1_1.aBoolean609 || local116.anInt550 != 0 || local116.anInt551 == 1 || local116.aBoolean46) {
							if (!local116.method474()) {
								Static43.anInt678++;
								local15 = false;
							}
							local36 = true;
						}
					}
				}
				local42 = local20.method4521();
				if (local42 == 0) {
					break;
				}
				local20.method4548();
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)Z")
	public static boolean method3384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	public static void method3385() {
		Static71.aStringArray12 = new String[500];
		Static55.anInt1027 = Static64.aClass62_3.anInt1455 + Static64.aClass62_3.anInt1460 + 2;
		Static283.anInt4764 = Static126.aClass62_6.anInt1460 + Static126.aClass62_6.anInt1455 + 2;
		for (@Pc(32) int local32 = 0; local32 < Static71.aStringArray12.length; local32++) {
			Static71.aStringArray12[local32] = "";
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static283.anIntArrayArray32 == null ? 0 : Static283.anIntArrayArray32[arg0][arg1] & 0xFFFFFF;
	}
}
