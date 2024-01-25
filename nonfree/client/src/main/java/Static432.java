import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "Lclient!taa;")
	public static final Class314 aClass314_4 = new Class314(1);

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("92e708e2aa05abd02e67551ceb6b7d49acba5f20c524e8544b49f5900304006a2111eae1b57e38294fbc10f830f84262a3871d9ade0ac70b4ab604f3e6ac840c38409abe27906679c15a2a425b3ea0519194ff0980d599593ad2585333087414c20aeace3ea7d227bd624aca39f8054ae029ee7408be76ccf5d39048fc8732757533be428379d6dce2da93728f52baf249e81371e99fab2e565efb71434089fd68fa1074f5ebba2a5da8979738937c19e07a1b0d912d324a2112d71f81cb0affc663889c8c986f07750e1e8587dafb1853b9d63576af6756a64a81012d3bd1909f666fba2c0db85a10f2dd0c23194a087bf62b1806c08f0589c05d6e32d10904b01df1fcd7ab49b3196231a3665f611bfc76469ac2e705eec5c609cedcc3d904a855e1aa8b5f080363f6b35f51079e744cba70e7a7f59cd6669995a1492250c4b16cd1d95c195910652998a560853e5bafbafd1104becb09d1b95761260dd636aac122a9754c0476177d104a2d43610018c2aff03563e6a9cc9cc345c0f8d73cf10f9945d9304a0f77e8cbaee2e74442f696942da88b235ed643f3cd3eb1e60226d278e563c93190c95268dff0cee2ced3766a8b9768c49d1a8d4144c25d354f6cfea4b09146388c180a7662c98809765ec8fb6238a1dc931c79f9379842586b4fbe5a4d3d1fd7fc5167059c8fd826723884a63600fb0c695d8732c9476334f1", 16);

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
	public static int anInt7832 = -1;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	public static int anInt7833 = -1;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	public static void method6738() {
		Static385.aClass166_36.method4811();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method6739(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)I")
	public static int method6741(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method6742(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static227.aClass128_12.method3560((long) arg0);
		if (local10 != null) {
			@Pc(17) Class6_Sub13_Sub3 local17 = local10.aClass62_Sub1_1.method8472();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass62_Sub1_1.method8473();
				if (local24 >= (double) local17.method5137() && local24 <= (double) local17.method5138()) {
					return local17.method5141();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)Z")
	public static boolean method6743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static217.method3687(arg1, arg0) || Static216.method3668(arg1, arg0);
	}
}
