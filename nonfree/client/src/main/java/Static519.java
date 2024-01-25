import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sea", name = "y", descriptor = "[Lclient!lm;")
	public static Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
	public static int anInt8387;

	@OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
	public static int anInt8389;

	@OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
	public static int anInt8384 = -50;

	@OriginalMember(owner = "client!sea", name = "w", descriptor = "S")
	public static short aShort110 = 256;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!vea;I)Ljava/lang/String;")
	public static String method7225(@OriginalArg(0) Class2_Sub7_Sub21 arg0) {
		if (arg0.aString108 == null || arg0.aString108.length() == 0) {
			return arg0.aString107 == null || arg0.aString107.length() <= 0 ? arg0.aString109 : arg0.aString109 + Static573.aClass345_34.method7951(Static496.anInt7407) + arg0.aString107;
		} else if (arg0.aString107 == null || arg0.aString107.length() <= 0) {
			return arg0.aString109 + Static573.aClass345_34.method7951(Static496.anInt7407) + arg0.aString108;
		} else {
			return arg0.aString109 + Static573.aClass345_34.method7951(Static496.anInt7407) + arg0.aString107 + Static573.aClass345_34.method7951(Static496.anInt7407) + arg0.aString108;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIILclient!vda;)V")
	public static void method7226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub7_Sub20 arg2) {
		if (!Static113.aBoolean192) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class2_Sub7_Sub21 local16 = (Class2_Sub7_Sub21) arg2.aClass290_13.method6680(); local16 != null; local16 = (Class2_Sub7_Sub21) arg2.aClass290_13.method6673()) {
			local22 = Static185.method3166(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		Static122.anInt2592 = (Static266.aBoolean372 ? 26 : 22) + arg2.anInt9985 * 16;
		local22 = arg2.anInt9985 * 16 + 21;
		@Pc(58) int local58 = Static131.anInt2708 + Static441.anInt7238;
		if (local58 + local10 > Class16_Sub1_Sub5_Sub1.lb) {
			local58 = Static441.anInt7238 - local10;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(82) int local82 = Static266.aBoolean372 ? 33 : 31;
		@Pc(89) int local89 = arg1 + 13 - local82;
		if (local22 + local89 > Static71.anInt1925) {
			local89 = Static71.anInt1925 - local22;
		}
		if (local89 < 0) {
			local89 = 0;
		}
		Static540.anInt8699 = local58;
		Static573.anInt9360 = local89;
		Static429.aClass2_Sub7_Sub20_3 = arg2;
		Static220.anInt4137 = local10;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
	public static void method7228() {
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_2, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_2, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_1, 1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub21_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub23_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub6_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub16_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub24_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub3_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub18_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub2_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub20_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub17_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_2, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub13_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub4_1, 0);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub26_1, 0);
		Static449.method6406();
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub10_1, 2);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub5_1, 1);
		Static350.method5257();
		Static350.method5258();
		Static35.aBoolean69 = true;
	}
}
