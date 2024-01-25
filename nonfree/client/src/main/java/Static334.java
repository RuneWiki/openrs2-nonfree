import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_46 = new Class268(8);

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method4608() {
		for (@Pc(15) int local15 = 0; local15 < Static124.anInt2278; local15++) {
			@Pc(21) int local21 = Static288.anIntArray324[local15];
			@Pc(29) Class1_Sub2_Sub6_Sub1 local29 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) local21)).aClass1_Sub2_Sub6_Sub1_2;
			@Pc(33) int local33 = Static176.aClass3_Sub25_Sub1_1.method4096();
			if ((local33 & 0x4) != 0) {
				local33 += Static176.aClass3_Sub25_Sub1_1.method4096() << 8;
			}
			if ((local33 & 0x80) != 0) {
				local29.anInt7580 = Static176.aClass3_Sub25_Sub1_1.method4109();
				if (local29.anInt7580 == 65535) {
					local29.anInt7580 = -1;
				}
			}
			@Pc(75) int local75;
			@Pc(86) int local86;
			if ((local33 & 0x10) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4109();
				if (local75 == 65535) {
					local75 = -1;
				}
				local86 = Static176.aClass3_Sub25_Sub1_1.method4076();
				Static306.method4345(local29, local86, local75);
			}
			if ((local33 & 0x20) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4086();
				local86 = Static176.aClass3_Sub25_Sub1_1.method4076();
				local29.method6202(local86, local75, Static172.anInt3107);
			}
			@Pc(133) int local133;
			if ((local33 & 0x40) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4088();
				if (local75 == 65535) {
					local75 = -1;
				}
				local86 = Static176.aClass3_Sub25_Sub1_1.method4068();
				local133 = Static176.aClass3_Sub25_Sub1_1.method4066();
				local29.method6207(false, local133, local86, local75);
			}
			if ((local33 & 0x800) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
				@Pc(151) int[] local151 = new int[local75];
				@Pc(154) int[] local154 = new int[local75];
				@Pc(157) int[] local157 = new int[local75];
				for (@Pc(159) int local159 = 0; local159 < local75; local159++) {
					@Pc(165) int local165 = Static176.aClass3_Sub25_Sub1_1.method4088();
					if (local165 == 65535) {
						local165 = -1;
					}
					local151[local159] = local165;
					local154[local159] = Static176.aClass3_Sub25_Sub1_1.method4076();
					local157[local159] = Static176.aClass3_Sub25_Sub1_1.method4109();
				}
				Static305.method4320(local29, local151, local154, local157);
			}
			if ((local33 & 0x200) != 0) {
				local29.anInt7577 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local29.anInt7601 = Static176.aClass3_Sub25_Sub1_1.method4101();
				local29.anInt7610 = Static176.aClass3_Sub25_Sub1_1.method4101();
				local29.anInt7587 = Static176.aClass3_Sub25_Sub1_1.method4074();
				local29.anInt7568 = Static176.aClass3_Sub25_Sub1_1.method4083() + Static172.anInt3107;
				local29.anInt7611 = Static176.aClass3_Sub25_Sub1_1.method4109() + Static172.anInt3107;
				local29.anInt7565 = Static176.aClass3_Sub25_Sub1_1.method4095();
				local29.anInt7587 += local29.anIntArray509[0];
				local29.anInt7601 += local29.anIntArray509[0];
				local29.anInt7577 += local29.anIntArray510[0];
				local29.anInt7610 += local29.anIntArray510[0];
				local29.anInt7641 = 0;
				local29.anInt7644 = 1;
			}
			if ((local33 & 0x8) != 0) {
				if (local29.aClass158_1.method3710()) {
					Static186.method2925(local29);
				}
				local29.method5632(Static118.aClass19_1.method401(Static176.aClass3_Sub25_Sub1_1.method4109()));
				local29.method6203(local29.aClass158_1.anInt4454);
				local29.anInt7618 = local29.aClass158_1.anInt4442 << 3;
				if (local29.aClass158_1.method3710()) {
					Static331.method5981(0, local29.anIntArray509[0], local29, local29.aByte101, null, local29.anIntArray510[0], null);
				}
			}
			if ((local33 & 0x1000) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local29.anInt7639 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local29.anInt7608 = Static176.aClass3_Sub25_Sub1_1.method4095();
				local29.aBoolean508 = (local75 & 0x8000) != 0;
				local29.anInt7622 = local75 & 0x7FFF;
				local29.anInt7616 = local29.anInt7622 + Static172.anInt3107 + local29.anInt7639;
			}
			if ((local33 & 0x400) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
				if (local75 == 65535) {
					local75 = -1;
				}
				local86 = Static176.aClass3_Sub25_Sub1_1.method4068();
				local133 = Static176.aClass3_Sub25_Sub1_1.method4066();
				local29.method6207(true, local133, local86, local75);
			}
			if ((local33 & 0x2) != 0) {
				local29.aString68 = Static176.aClass3_Sub25_Sub1_1.method4073();
				local29.anInt7619 = 100;
			}
			if ((local33 & 0x1) != 0) {
				local75 = Static176.aClass3_Sub25_Sub1_1.method4086();
				local86 = Static176.aClass3_Sub25_Sub1_1.method4066();
				local29.method6202(local86, local75, Static172.anInt3107);
				local29.anInt7607 = Static172.anInt3107 + 300;
				local29.anInt7634 = Static176.aClass3_Sub25_Sub1_1.method4095();
			}
			if ((local33 & 0x2000) != 0) {
				local29.anInt6916 = Static176.aClass3_Sub25_Sub1_1.method4088();
				local29.anInt6921 = Static176.aClass3_Sub25_Sub1_1.method4109();
			}
			if ((local33 & 0x100) != 0) {
				local29.aByte104 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local29.aByte103 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local29.aByte105 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local29.aByte102 = (byte) Static176.aClass3_Sub25_Sub1_1.method4096();
				local29.anInt7638 = Static172.anInt3107 + Static176.aClass3_Sub25_Sub1_1.method4109();
				local29.anInt7633 = Static172.anInt3107 + Static176.aClass3_Sub25_Sub1_1.method4067();
			}
		}
	}
}
