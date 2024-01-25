import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "Z")
	public static boolean aBoolean55;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
	public static int anInt426;

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!qm;B)I")
	public static int method666(@OriginalArg(0) Class62_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) Class186 local8 = arg0.aClass186_1;
		if (local8.anIntArray432 != null) {
			local8 = local8.method5206();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local8.anInt5942;
		@Pc(33) Class180 local33 = arg0.method4775();
		if (arg0.aBoolean484) {
			local27 = local8.anInt5964;
		} else if (arg0.anInt5347 == local33.anInt5767 || local33.anInt5755 == arg0.anInt5347 || local33.anInt5762 == arg0.anInt5347 || local33.anInt5773 == arg0.anInt5347) {
			local27 = local8.lb;
		} else if (local33.anInt5728 == arg0.anInt5347 || arg0.anInt5347 == local33.anInt5754 || arg0.anInt5347 == local33.anInt5746 || local33.anInt5744 == arg0.anInt5347) {
			local27 = local8.anInt5953;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!qm;)V")
	public static void method667(@OriginalArg(1) Class62_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) Static283.aClass216_43.method5992(); local15 != null; local15 = (Class2_Sub7) Static283.aClass216_43.method6000()) {
			if (local15.aClass62_Sub1_Sub2_Sub1_1 == arg0) {
				if (local15.aClass2_Sub3_Sub2_2 != null) {
					Static313.aClass2_Sub3_Sub1_2.method365(local15.aClass2_Sub3_Sub2_2);
					local15.aClass2_Sub3_Sub2_2 = null;
				}
				local15.method5945();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
	public static void method668(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub11_Sub19 local14 = Static306.method5411(5, arg0);
		local14.method5539();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BI)Z")
	public static boolean method669(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class2_Sub10 local13 = new Class2_Sub10(arg0);
		@Pc(17) int local17 = local13.method4421();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method4421() == 1;
		if (local33) {
			Static305.method5360(local13);
		}
		Static129.method2631(local13);
		return true;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)I")
	public static int method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg0 : arg3;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg0 : arg1) : arg3;
		return ((local12 & 0x2) == 0 ? local38 : -local38) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method672() {
		Static212.anIntArray326 = null;
		Static109.anIntArrayArrayArray3 = null;
		Static58.aByteArrayArrayArray2 = null;
		Static134.anIntArray239 = null;
		Static29.anIntArray34 = null;
		Static53.aByteArrayArrayArray1 = null;
		Static208.anIntArray322 = null;
		Static322.aByteArrayArrayArray13 = null;
		Static272.aByteArrayArrayArray9 = null;
		Static26.anIntArray31 = null;
		Static306.aByteArrayArrayArray11 = null;
		Static28.anIntArray32 = null;
	}
}
