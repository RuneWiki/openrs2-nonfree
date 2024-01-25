import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!lb;")
	public static Class221 aClass221_99;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt5900 = 0;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public static int anInt5903 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIILclient!wka;I)V")
	public static void method5027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class274 local16 = arg2.method6600();
		@Pc(19) Class100 local19 = arg2.aClass100_8;
		@Pc(29) int local29 = arg2.anInt7810 - arg2.aClass340_7.anInt9603 & 0x3FFF;
		if (arg0 == -1) {
			if (local29 == 0 && arg2.anInt7819 <= 25) {
				if (!arg2.aBoolean595 || !local16.method6903(local19.method8976())) {
					local19.method8962(local16.method6901());
					arg2.aBoolean595 = local19.method8963();
				}
			} else if (arg3 < 0 && local16.anInt8193 != -1) {
				local19.method8962(local16.anInt8193);
				arg2.aBoolean595 = false;
			} else if (arg3 > 0 && local16.anInt8160 != -1) {
				local19.method8962(local16.anInt8160);
				arg2.aBoolean595 = false;
			} else if (!arg2.aBoolean595 || !local16.method6903(local19.method8976())) {
				local19.method8962(local16.method6901());
				arg2.aBoolean595 = arg2.aClass100_8.method8963();
			}
		} else if (arg2.anInt7780 != -1 && (local29 >= 10240 || local29 <= 2048)) {
			@Pc(62) int local62 = Static206.anIntArray640[arg1] - arg2.aClass340_7.anInt9603 & 0x3FFF;
			if (arg0 == 2 && local16.anInt8174 != -1) {
				if (local62 > 2048 && local62 <= 6144 && local16.anInt8171 != -1) {
					local19.method8962(local16.anInt8171);
				} else if (local62 >= 10240 && local62 < 14336 && local16.anInt8197 != -1) {
					local19.method8962(local16.anInt8197);
				} else if (local62 <= 6144 || local62 >= 10240 || local16.anInt8180 == -1) {
					local19.method8962(local16.anInt8174);
				} else {
					local19.method8962(local16.anInt8180);
				}
			} else if (arg0 == 0 && local16.anInt8185 != -1) {
				if (local62 > 2048 && local62 <= 6144 && local16.anInt8159 != -1) {
					local19.method8962(local16.anInt8159);
				} else if (local62 >= 10240 && local62 < 14336 && local16.anInt8181 != -1) {
					local19.method8962(local16.anInt8181);
				} else if (local62 <= 6144 || local62 >= 10240 || local16.anInt8166 == -1) {
					local19.method8962(local16.anInt8185);
				} else {
					local19.method8962(local16.anInt8166);
				}
			} else if (local62 > 2048 && local62 <= 6144 && local16.anInt8192 != -1) {
				local19.method8962(local16.anInt8192);
			} else if (local62 >= 10240 && local62 < 14336 && local16.anInt8184 != -1) {
				local19.method8962(local16.anInt8184);
			} else if (local62 <= 6144 || local62 >= 10240 || local16.anInt8170 == -1) {
				local19.method8962(local16.anInt8163);
			} else {
				local19.method8962(local16.anInt8170);
			}
			arg2.aBoolean595 = false;
		} else if (local29 == 0 && arg2.anInt7819 <= 25) {
			if (arg0 == 2 && local16.anInt8174 != -1) {
				local19.method8962(local16.anInt8174);
			} else if (arg0 == 0 && local16.anInt8185 != -1) {
				local19.method8962(local16.anInt8185);
			} else {
				local19.method8962(local16.anInt8163);
			}
			arg2.aBoolean595 = false;
		} else {
			if (arg0 == 2 && local16.anInt8174 != -1) {
				if (arg3 < 0 && local16.anInt8194 != -1) {
					local19.method8962(local16.anInt8194);
				} else if (arg3 <= 0 || local16.anInt8167 == -1) {
					local19.method8962(local16.anInt8174);
				} else {
					local19.method8962(local16.anInt8167);
				}
			} else if (arg0 == 0 && local16.anInt8185 != -1) {
				if (arg3 < 0 && local16.anInt8195 != -1) {
					local19.method8962(local16.anInt8195);
				} else if (arg3 <= 0 || local16.anInt8199 == -1) {
					local19.method8962(local16.anInt8185);
				} else {
					local19.method8962(local16.anInt8199);
				}
			} else if (arg3 < 0 && local16.anInt8157 != -1) {
				local19.method8962(local16.anInt8157);
			} else if (arg3 <= 0 || local16.anInt8182 == -1) {
				local19.method8962(local16.anInt8163);
			} else {
				local19.method8962(local16.anInt8182);
			}
			arg2.aBoolean595 = false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)I")
	public static int method5029(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (local25 * arg0 >> 12) + 40960;
		return local34 * local13 >> 12;
	}
}
