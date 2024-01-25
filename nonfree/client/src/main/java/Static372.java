import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Lclient!mr;")
	public static Class161 aClass161_6;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!oa;")
	public static Class129 aClass129_6;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!ks;")
	public static final Class1_Sub22 aClass1_Sub22_3 = new Class1_Sub22(0, 0);

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_185 = new Class131(22, 7);

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	public static int anInt7405 = 0;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public static int method5739() {
		if ((double) Static7.aFloat38 == 3.0D) {
			return 37;
		} else if ((double) Static7.aFloat38 == 4.0D) {
			return 50;
		} else if ((double) Static7.aFloat38 == 6.0D) {
			return 75;
		} else if ((double) Static7.aFloat38 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)V")
	public static void method5742() {
		for (@Pc(9) int local9 = 0; local9 < Static74.anInt1467; local9++) {
			@Pc(15) int local15 = Static178.anIntArray272[local9];
			@Pc(19) Class26_Sub2_Sub2_Sub2 local19 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local15];
			@Pc(23) int local23 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if ((local23 & 0x40) != 0) {
				local23 += Static173.aClass1_Sub1_Sub1_1.method4130() << 8;
			}
			if ((local23 & 0x800) != 0) {
				local19.aByte97 = Static173.aClass1_Sub1_Sub1_1.method4090();
				local19.aByte99 = Static173.aClass1_Sub1_Sub1_1.method4090();
				local19.aByte96 = Static173.aClass1_Sub1_Sub1_1.method4128();
				local19.aByte98 = (byte) Static173.aClass1_Sub1_Sub1_1.method4130();
				local19.anInt7117 = Static403.anInt6978 + Static173.aClass1_Sub1_Sub1_1.method4095();
				local19.anInt7083 = Static403.anInt6978 + Static173.aClass1_Sub1_Sub1_1.method4093();
			}
			if ((local23 & 0x20) != 0) {
				local19.anInt7090 = Static173.aClass1_Sub1_Sub1_1.method4088();
				if (local19.anInt7090 == 65535) {
					local19.anInt7090 = -1;
				}
			}
			if ((local23 & 0x200) != 0) {
				local19.anInt7167 = Static173.aClass1_Sub1_Sub1_1.method4124();
				local19.anInt7166 = Static173.aClass1_Sub1_Sub1_1.method4124();
			}
			@Pc(122) int local122;
			@Pc(131) int local131;
			@Pc(137) int local137;
			if ((local23 & 0x1) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4124();
				if (local122 == 65535) {
					local122 = -1;
				}
				local131 = Static173.aClass1_Sub1_Sub1_1.method4133();
				local137 = Static173.aClass1_Sub1_Sub1_1.method4118();
				local19.method5532(local137, local122, local131, false);
			}
			if ((local23 & 0x100) != 0) {
				local19.anInt7137 = Static173.aClass1_Sub1_Sub1_1.method4112();
				local19.anInt7142 = Static173.aClass1_Sub1_Sub1_1.method4112();
				local19.anInt7094 = Static173.aClass1_Sub1_Sub1_1.method4090();
				local19.anInt7143 = Static173.aClass1_Sub1_Sub1_1.method4128();
				local19.anInt7088 = Static173.aClass1_Sub1_Sub1_1.method4088() + Static403.anInt6978;
				local19.anInt7103 = Static173.aClass1_Sub1_Sub1_1.method4124() + Static403.anInt6978;
				local19.anInt7093 = Static173.aClass1_Sub1_Sub1_1.method4129();
				local19.anInt7094 += local19.anIntArray590[0];
				local19.anInt7143 += local19.anIntArray589[0];
				local19.anInt7137 += local19.anIntArray590[0];
				local19.anInt7147 = 0;
				local19.anInt7142 += local19.anIntArray589[0];
				local19.anInt7148 = 1;
			}
			if ((local23 & 0x1000) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4095();
				if (local122 == 65535) {
					local122 = -1;
				}
				local131 = Static173.aClass1_Sub1_Sub1_1.method4126();
				local137 = Static173.aClass1_Sub1_Sub1_1.method4129();
				local19.method5532(local137, local122, local131, true);
			}
			if ((local23 & 0x8) != 0) {
				if (local19.aClass66_1.method1456()) {
					Static425.method5710(local19);
				}
				local19.method5546(Static322.aClass187_2.method4504(Static173.aClass1_Sub1_Sub1_1.method4095()));
				local19.method5539(local19.aClass66_1.anInt1717);
				local19.anInt7126 = local19.aClass66_1.anInt1704 << 3;
				if (local19.aClass66_1.method1456()) {
					Static409.method5547(0, local19.aByte95, null, local19.anIntArray590[0], local19.anIntArray589[0], local19, null);
				}
			}
			if ((local23 & 0x10) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4096();
				local131 = Static173.aClass1_Sub1_Sub1_1.method4130();
				local19.method5531(Static403.anInt6978, local122, local131);
			}
			if ((local23 & 0x2000) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4118();
				@Pc(352) int[] local352 = new int[local122];
				@Pc(355) int[] local355 = new int[local122];
				@Pc(358) int[] local358 = new int[local122];
				for (@Pc(360) int local360 = 0; local360 < local122; local360++) {
					@Pc(366) int local366 = Static173.aClass1_Sub1_Sub1_1.method4095();
					if (local366 == 65535) {
						local366 = -1;
					}
					local352[local360] = local366;
					local355[local360] = Static173.aClass1_Sub1_Sub1_1.method4086();
					local358[local360] = Static173.aClass1_Sub1_Sub1_1.method4124();
				}
				Static159.method2400(local352, local358, local19, local355);
			}
			if ((local23 & 0x2) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4095();
				if (local122 == 65535) {
					local122 = -1;
				}
				local131 = Static173.aClass1_Sub1_Sub1_1.method4086();
				Static175.method2736(local122, local131, local19);
			}
			if ((local23 & 0x80) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4096();
				local131 = Static173.aClass1_Sub1_Sub1_1.method4118();
				local19.method5531(Static403.anInt6978, local122, local131);
				local19.anInt7139 = Static403.anInt6978 + 300;
				local19.anInt7118 = Static173.aClass1_Sub1_Sub1_1.method4118();
			}
			if ((local23 & 0x400) != 0) {
				local122 = Static173.aClass1_Sub1_Sub1_1.method4088();
				local19.anInt7130 = Static173.aClass1_Sub1_Sub1_1.method4129();
				local19.anInt7084 = Static173.aClass1_Sub1_Sub1_1.method4130();
				local19.anInt7124 = local122 & 0x7FFF;
				local19.aBoolean456 = (local122 & 0x8000) != 0;
				local19.anInt7096 = Static403.anInt6978 + local19.anInt7124 + local19.anInt7130;
			}
			if ((local23 & 0x4) != 0) {
				local19.aString55 = Static173.aClass1_Sub1_Sub1_1.method4137();
				local19.anInt7114 = 100;
			}
		}
	}
}
