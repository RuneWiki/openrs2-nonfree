import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public static int anInt3926;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_175 = new Class22(43, 3);

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_11 = new Class186("", 13);

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
	public static final int[] anIntArray261 = new int[13];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!qm;I)I")
	public static int method3197(@OriginalArg(0) Class4_Sub39 arg0) {
		@Pc(14) String local14 = Static200.method3166(arg0);
		@Pc(16) int[] local16 = null;
		if (Static441.method5569(arg0.anInt5699)) {
			local16 = Static444.aClass206_3.method4703((int) arg0.aLong192).anIntArray435;
		} else if (arg0.anInt5695 != -1) {
			local16 = Static444.aClass206_3.method4703(arg0.anInt5695).anIntArray435;
		} else if (Static323.method4382(arg0.anInt5699)) {
			@Pc(90) Class16_Sub1_Sub5_Sub2 local90 = Static143.aClass16_Sub1_Sub5_Sub2Array1[(int) arg0.aLong192];
			if (local90 != null) {
				@Pc(95) Class264 local95 = local90.aClass264_1;
				if (local95.anIntArray544 != null) {
					local95 = local95.method5574(Static257.aClass114_1);
				}
				if (local95 != null) {
					local16 = local95.anIntArray547;
				}
			}
		} else if (Static106.method1982(arg0.anInt5699)) {
			@Pc(58) Class202 local58;
			if (arg0.anInt5699 == 1010) {
				local58 = Static267.aClass262_2.method5560((int) arg0.aLong192);
			} else {
				local58 = Static267.aClass262_2.method5560((int) (arg0.aLong192 >>> 32 & 0x7FFFFFFFL));
			}
			if (local58.anIntArray407 != null) {
				local58 = local58.method4584(Static257.aClass114_1);
			}
			if (local58 != null) {
				local16 = local58.anIntArray408;
			}
		}
		if (local16 != null) {
			local14 = local14 + Static435.method5504(local16);
		}
		@Pc(137) int local137 = Static118.aClass89_5.method2342(local14, Static385.aClass57Array16);
		if (arg0.aBoolean511) {
			local137 += Static389.aClass57_22.la() + 4;
		}
		return local137;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(CZ)Z")
	public static boolean method3198(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static218.method3280(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static55.aCharArray2;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static437.aCharArray6;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (local54 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
