import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_2 = new Class61(8, 0, 4, 1);

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_77 = new Class119(90, -2);

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Z")
	public static boolean aBoolean303 = true;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "Lclient!an;")
	public static final Class11 aClass11_21 = new Class11(8);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!en;I)I")
	public static int method2819(@OriginalArg(0) Class3_Sub14 arg0) {
		@Pc(12) String local12 = Static407.method5245(arg0);
		@Pc(14) int[] local14 = null;
		if (Static353.method4700(arg0.anInt2182)) {
			local14 = Static314.aClass12_2.method327((int) arg0.aLong76).anIntArray144;
		} else if (arg0.anInt2183 != -1) {
			local14 = Static314.aClass12_2.method327(arg0.anInt2183).anIntArray144;
		} else if (Static376.method4928(arg0.anInt2182)) {
			@Pc(34) Class7_Sub2_Sub3_Sub1 local34 = Static139.aClass7_Sub2_Sub3_Sub1Array11[(int) arg0.aLong76];
			if (local34 != null) {
				@Pc(39) Class47 local39 = local34.aClass47_1;
				if (local39.anIntArray94 != null) {
					local39 = local39.method1251(Static85.aClass49_1);
				}
				if (local39 != null) {
					local14 = local39.anIntArray95;
				}
			}
		} else if (Static102.method1794(arg0.anInt2182)) {
			@Pc(73) Class93 local73;
			if (arg0.anInt2182 == 1011) {
				local73 = Static435.aClass30_4.method769((int) arg0.aLong76);
			} else {
				local73 = Static435.aClass30_4.method769((int) (arg0.aLong76 >>> 32 & 0x7FFFFFFFL));
			}
			if (local73.anIntArray171 != null) {
				local73 = local73.method2066(Static85.aClass49_1);
			}
			if (local73 != null) {
				local14 = local73.lb;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static390.method5066(local14);
		}
		@Pc(136) int local136 = Static269.aClass70_27.method1756(Static430.aClass8Array88, local12);
		if (arg0.aBoolean174) {
			local136 += Static183.aClass8_14.UA() + 4;
		}
		return local136;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IC)B")
	public static byte method2821(@OriginalArg(1) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	public static void method2822() {
		Static158.anInt3162 = 0;
		Static184.aClass243_21.method5200();
		Static438.aBoolean636 = false;
	}
}
