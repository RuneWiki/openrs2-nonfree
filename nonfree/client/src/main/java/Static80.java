import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!he", name = "R", descriptor = "I")
	public static int anInt1768;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_46;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_47;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_513 = Static231.method3737("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_514 = Static231.method3737("sl_back");

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	public static int anInt1769 = 0;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
	public static boolean method1379() {
		try {
			return Static113.method1958();
		} catch (@Pc(13) IOException local13) {
			Static38.method718();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(59) String local59 = "T2 - " + Static176.anInt3812 + "," + Static18.anInt382 + "," + Static13.anInt317 + " - " + Static24.anInt450 + "," + (Static36.anInt764 + Static204.aClass5_Sub5_Sub1_2.anIntArray260[0]) + "," + (Static204.aClass5_Sub5_Sub1_2.anIntArray256[0] + Static152.anInt3377) + " - ";
			for (@Pc(61) int local61 = 0; Static24.anInt450 > local61 && local61 < 50; local61++) {
				local59 = local59 + Static194.aClass1_Sub26_Sub1_3.aByteArray52[local61] + ",";
			}
			Static81.method1384(local18, local59);
			Static14.method334();
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!jb;)[Lclient!tg;")
	public static Class1_Sub2_Sub2[] method1380(@OriginalArg(2) int arg0, @OriginalArg(3) Class28 arg1) {
		return Static83.method1393(arg0, arg1) ? Static230.method3725() : null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I")
	public static int method1381(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local30 > local14) {
			local32 = local14;
		}
		if (local21 < local32) {
			local32 = local21;
		}
		@Pc(46) double local46 = local30;
		if (local14 > local30) {
			local46 = local14;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		if (local46 < local21) {
			local46 = local21;
		}
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local54 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local54 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local30) {
				local56 = (local14 - local21) / (-local32 + local46);
			} else if (local46 == local14) {
				local56 = (local21 - local30) / (local46 - local32) + 2.0D;
			} else if (local21 == local46) {
				local56 = (local30 - local14) / (-local32 + local46) + 4.0D;
			}
		}
		local56 /= 6.0D;
		@Pc(156) int local156 = (int) (local56 * 256.0D);
		@Pc(161) int local161 = (int) (local54 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(179) int local179 = (int) (local68 * 256.0D);
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local161 >>= 0x4;
		} else if (local179 > 217) {
			local161 >>= 0x3;
		} else if (local179 > 192) {
			local161 >>= 0x2;
		} else if (local179 > 179) {
			local161 >>= 0x1;
		}
		return (local156 >> 2 << 10) + (local161 >> 5 << 7) + (local179 >> 1);
	}
}
