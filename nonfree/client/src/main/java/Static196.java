import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "Lclient!iu;")
	public static Class112 aClass112_6;

	@OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
	public static int anInt3485;

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "I")
	public static int anInt3486;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "Lclient!j;")
	public static final Class113 aClass113_8 = new Class113(8, 2);

	@OriginalMember(owner = "client!kq", name = "Y", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)[B")
	public static byte[] method2843(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub6_Sub14 local12 = (Class1_Sub6_Sub14) Static46.aClass219_1.method4799((long) arg0);
		if (local12 == null) {
			@Pc(21) byte[] local21 = new byte[512];
			@Pc(27) Random local27 = new Random((long) arg0);
			for (@Pc(29) int local29 = 0; local29 < 255; local29++) {
				local21[local29] = (byte) local29;
			}
			for (@Pc(44) int local44 = 0; local44 < 255; local44++) {
				@Pc(50) int local50 = 255 - local44;
				@Pc(55) int local55 = Static351.method4927(local50, local27);
				@Pc(59) byte local59 = local21[local55];
				local21[local55] = local21[local50];
				local21[local50] = local21[511 - local44] = local59;
			}
			local12 = new Class1_Sub6_Sub14(local21);
			Static46.aClass219_1.method4801((long) arg0, local12);
		}
		return local12.aByteArray76;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Z")
	public static boolean method2844(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)Z")
	public static boolean method2845(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static365.anInt5878; local1 < Static337.anInt5599; local1++) {
			@Pc(6) Class132[][] local6 = Static25.aClass132ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static32.anInt647; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static266.anInt4625 + local9;
				@Pc(18) int local18 = Static266.anInt4625 - local9;
				if (local14 >= Static39.anInt751 || local18 < Static60.anInt1201) {
					for (@Pc(27) int local27 = -Static32.anInt647; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static249.anInt4358 + local27;
						@Pc(36) int local36 = Static249.anInt4358 - local27;
						@Pc(48) Class132 local48;
						if (local14 >= Static39.anInt751) {
							if (local32 >= Static35.anInt679) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean294) {
									Static328.aBoolean517 = arg0;
									Static273.aClass54_1.method1116(local48);
									Static273.aClass54_1.method1109();
								}
							}
							if (local36 < Static255.anInt4404) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean294) {
									Static328.aBoolean517 = arg0;
									Static273.aClass54_1.method1116(local48);
									Static273.aClass54_1.method1109();
								}
							}
						}
						if (local18 < Static60.anInt1201) {
							if (local32 >= Static35.anInt679) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean294) {
									Static328.aBoolean517 = arg0;
									Static273.aClass54_1.method1116(local48);
									Static273.aClass54_1.method1109();
								}
							}
							if (local36 < Static255.anInt4404) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean294) {
									Static328.aBoolean517 = arg0;
									Static273.aClass54_1.method1116(local48);
									Static273.aClass54_1.method1109();
								}
							}
						}
						if (Static280.anInt4876 == 0) {
							if (Static172.aBoolean279) {
								Static273.aClass54_1.method1110(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
