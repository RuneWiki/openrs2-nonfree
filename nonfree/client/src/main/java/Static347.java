import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nga", name = "t", descriptor = "Lclient!gq;")
	public static Class122 aClass122_4;

	@OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
	public static int anInt6411;

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_80 = new Class208(34, -1);

	@OriginalMember(owner = "client!nga", name = "u", descriptor = "[I")
	public static final int[] anIntArray383 = new int[1000];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLclient!sea;Lclient!sea;I)V")
	public static void method5187(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class308 arg1) {
		Static166.aClass308_157 = arg1;
		Static404.aClass308_146 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)I")
	public static int method5188() {
		if (Static488.aClass160_36 == null) {
			if (!Static406.aBoolean553 && Static22.anInt572 > 0) {
				if (Static240.aBoolean315 && Static326.aClass97_3.method2365(81) && Static22.anInt572 > 2) {
					return ((Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285.aClass1_285).anInt7820;
				}
				return ((Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285).anInt7820;
			}
			@Pc(48) int local48 = Static216.aClass238_1.method5661();
			@Pc(52) int local52 = Static216.aClass238_1.method5653();
			@Pc(54) int local54 = Static405.anInt7239;
			@Pc(56) int local56 = Static130.anInt2592;
			@Pc(58) int local58 = Static570.anInt9417;
			if (local54 < local48 && local48 < local54 + local58) {
				@Pc(73) int local73 = -1;
				@Pc(92) int local92;
				for (@Pc(75) int local75 = 0; local75 < Static22.anInt572; local75++) {
					if (Static527.aBoolean672) {
						local92 = (Static22.anInt572 - local75 - 1) * 16 + local56 + 33;
						if (local52 > local92 - 13 && local92 + 3 >= local52) {
							local73 = local75;
						}
					} else {
						local92 = local56 + (-local75 + -1 + Static22.anInt572) * 16 + 31;
						if (local92 - 13 < local52 && local92 + 3 >= local52) {
							local73 = local75;
						}
					}
				}
				if (local73 != -1) {
					local92 = 0;
					@Pc(149) Class265 local149 = new Class265(Static166.aClass111_49);
					for (@Pc(154) Class1_Sub40 local154 = (Class1_Sub40) local149.method5637(); local154 != null; local154 = (Class1_Sub40) local149.method5636()) {
						if (local73 == local92++) {
							return local154.anInt7820;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	public static void method5189() {
		Static386.anInt6908 = 0;
		Static329.anInt6018 = 0;
		Static544.method7430();
		Static257.method3747();
		Static383.method5513();
		@Pc(17) boolean local17 = false;
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static329.anInt6018; local19++) {
			local25 = anIntArray383[local19];
			@Pc(32) Class1_Sub33 local32 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
			@Pc(35) Class11_Sub1_Sub1_Sub3_Sub2 local35 = local32.aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (Static406.aBoolean553 && Static58.method979(local25)) {
				Static577.method7756();
			}
			if (Static518.anInt9331 != local35.anInt7540) {
				if (local35.aClass354_1.method7671()) {
					Static510.method7148(local35);
				}
				local35.method6080(null);
				local17 = true;
				local32.method7908();
			}
		}
		if (local17) {
			Static547.anInt9151 = Static372.aClass91_30.method2273();
			Static372.aClass91_30.method2272(Static501.aClass1_Sub33Array1);
		}
		if (Static464.anInt8696 != Static158.aClass1_Sub3_Sub1_2.anInt9802) {
			throw new RuntimeException("gnp1 pos:" + Static158.aClass1_Sub3_Sub1_2.anInt9802 + " psize:" + Static464.anInt8696);
		}
		for (local25 = 0; local25 < Static306.anInt4911; local25++) {
			if (Static372.aClass91_30.method2271((long) Static11.anIntArray12[local25]) == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static306.anInt4911);
			}
		}
	}
}
