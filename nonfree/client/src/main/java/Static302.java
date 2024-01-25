import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "Lclient!db;")
	public static Class74 aClass74_3;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_90 = new Class225(0, 2);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BI)Lclient!rka;")
	public static Class2_Sub6_Sub19 method4221(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub6_Sub19 local9 = new Class2_Sub6_Sub19();
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg0);
		local14.anInt9723 = local14.aByteArray111.length - 2;
		@Pc(25) int local25 = local14.method8575();
		@Pc(35) int local35 = local14.aByteArray111.length - local25 - 2 - 16;
		local14.anInt9723 = local35;
		@Pc(44) int local44 = local14.method8555(-9372);
		local9.anInt8766 = local14.method8575();
		local9.anInt8767 = local14.method8575();
		local9.anInt8769 = local14.method8575();
		local9.anInt8765 = local14.method8575();
		local9.anInt8771 = local14.method8575();
		local9.anInt8768 = local14.method8575();
		@Pc(84) int local84 = local14.method8581(-17416);
		@Pc(92) int local92;
		@Pc(98) int local98;
		if (local84 > 0) {
			local9.aClass218Array1 = new Class218[local84];
			for (local92 = 0; local92 < local84; local92++) {
				local98 = local14.method8575();
				@Pc(105) Class218 local105 = new Class218(Static330.method4577(local98));
				local9.aClass218Array1[local92] = local105;
				while (local98-- > 0) {
					@Pc(116) int local116 = local14.method8555(-9372);
					@Pc(120) int local120 = local14.method8555(-9372);
					local105.method5099(new Class2_Sub2(local120), (long) local116);
				}
			}
		}
		local14.anInt9723 = 0;
		local9.aString98 = local14.method8569();
		local9.anIntArray635 = new int[local44];
		local92 = 0;
		while (local14.anInt9723 < local35) {
			local98 = local14.method8575();
			if (local98 == 3) {
				if (local9.aStringArray39 == null) {
					local9.aStringArray39 = new String[local44];
				}
				local9.aStringArray39[local92] = local14.method8553().intern();
			} else if (local98 == 54) {
				if (local9.aLongArray18 == null) {
					local9.aLongArray18 = new long[local44];
				}
				local9.aLongArray18[local92] = local14.method8590();
			} else {
				if (local9.anIntArray636 == null) {
					local9.anIntArray636 = new int[local44];
				}
				if (local98 >= 150 || local98 == 21 || local98 == 38 || local98 == 39) {
					local9.anIntArray636[local92] = local14.method8581(-17416);
				} else {
					local9.anIntArray636[local92] = local14.method8555(-9372);
				}
			}
			local9.anIntArray635[local92++] = local98;
		}
		return local9;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IBI)Z")
	public static boolean method4222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
	public static void method4224() {
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub12_2);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub12_1);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub27_2);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub27_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub10_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub24_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub1_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub21_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub4_1);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub16_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub29_1);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub26_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub7_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_2);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_1);
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub19_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub13_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub23_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub17_1);
		Static334.method4628();
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub14_1);
		Static650.aClass2_Sub30_29.method2988(4, Static650.aClass2_Sub30_29.aClass11_Sub9_1);
		Static593.method8176();
		Static408.method6014();
		Static30.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4225(@OriginalArg(0) String arg0) {
		return Static406.aHashtable5.containsKey(arg0);
	}
}
