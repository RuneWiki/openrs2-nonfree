import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!le", name = "E", descriptor = "I")
	public static int anInt3620;

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "I")
	public static final int anInt3622 = 50;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method3432(@OriginalArg(0) Class143 arg0) {
		Static157.aClass143_65 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method3433() {
		@Pc(8) int local8 = Static179.aByteArrayArray9.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (Static179.aByteArrayArray9[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static270.anInt5158; local28++) {
					if (Static8.anIntArray9[local18] == Static294.anIntArray517[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static294.anIntArray517[Static270.anInt5158] = Static8.anIntArray9[local18];
					local26 = Static270.anInt5158++;
				}
				@Pc(75) Class14_Sub4 local75 = new Class14_Sub4(Static179.aByteArrayArray9[local18]);
				@Pc(77) int local77 = 0;
				while (local75.anInt2637 < Static179.aByteArrayArray9[local18].length && local77 < 511 && Static315.anInt6456 < 1023) {
					@Pc(96) int local96 = local26 | local77++ << 6;
					@Pc(100) int local100 = local75.method2498();
					@Pc(104) int local104 = local100 >> 14;
					@Pc(110) int local110 = local100 >> 7 & 0x3F;
					@Pc(114) int local114 = local100 & 0x3F;
					@Pc(127) int local127 = (Static8.anIntArray9[local18] >> 8) * 64 + local110 - Static151.anInt3234;
					@Pc(140) int local140 = (Static8.anIntArray9[local18] & 0xFF) * 64 + local114 - Static251.anInt3170;
					@Pc(146) Class192 local146 = Static267.method4561(local75.method2498());
					if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local96] == null && (local146.aByte59 & 0x1) > 0 && local104 == Static125.anInt2720 && local127 >= 0 && Static195.anInt3965 > local146.anInt5798 + local127 && local140 >= 0 && Static298.anInt5716 > local146.anInt5798 + local140) {
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local96] = new Class10_Sub3_Sub3_Sub1();
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local96].anInt5954 = local96;
						@Pc(200) Class10_Sub3_Sub3_Sub1 local200 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local96];
						Static98.anIntArray205[Static315.anInt6456++] = local96;
						local200.anInt5927 = Static153.anInt3257;
						local200.method4957(local146);
						local200.method5362(local200.aClass192_1.anInt5798);
						local200.anInt5922 = local200.aClass192_1.anInt5784 << 3;
						if (local200.anInt5922 == 0) {
							local200.method5366(0);
						} else {
							local200.method5366(Static199.anIntArray345[local200.aClass192_1.aByte58 - 1]);
						}
						local200.method5352(local104, local127, true, local200.method5353(), local140);
					}
				}
			}
		}
	}
}
