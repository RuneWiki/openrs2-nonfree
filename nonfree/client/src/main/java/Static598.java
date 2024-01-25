import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt10850;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method9151() {
		Static333.method5032(Static388.aClass238_11);
		Static20.anInt292++;
		if (Static56.aBoolean79 && Static129.aBoolean146) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static377.aBoolean419) {
				local32 = Static194.method8971();
				local34 = Static5.method9220();
			}
			@Pc(50) int local50 = Static300.aClass164_1.method4999() + local32;
			@Pc(57) int local57 = Static300.aClass164_1.method5000() + local34;
			local57 -= Static501.anInt8061;
			local50 -= Static412.anInt6980;
			if (Static583.anInt9374 > local50) {
				local50 = Static583.anInt9374;
			}
			if (local57 < Static269.anInt4798) {
				local57 = Static269.anInt4798;
			}
			if (local50 + Static388.aClass238_11.anInt5985 > Static230.aClass238_4.anInt5985 + Static583.anInt9374) {
				local50 = Static583.anInt9374 + Static230.aClass238_4.anInt5985 - Static388.aClass238_11.anInt5985;
			}
			if (Static388.aClass238_11.anInt5973 + local57 > Static269.anInt4798 + Static230.aClass238_4.anInt5973) {
				local57 = Static269.anInt4798 + Static230.aClass238_4.anInt5973 - Static388.aClass238_11.anInt5973;
			}
			@Pc(125) int local125 = Static230.aClass238_4.anInt5951 + local50 - Static583.anInt9374;
			@Pc(133) int local133 = local57 + Static230.aClass238_4.anInt5953 - Static269.anInt4798;
			@Pc(203) Class5_Sub24 local203;
			if (Static300.aClass164_1.method4998()) {
				if (Static388.aClass238_11.anInt5970 < Static20.anInt292) {
					@Pc(152) int local152 = local50 - Static147.anInt2911;
					@Pc(156) int local156 = local57 - Static522.anInt8283;
					if (local152 > Static388.aClass238_11.anInt5977 || local152 < -Static388.aClass238_11.anInt5977 || Static388.aClass238_11.anInt5977 < local156 || local156 < -Static388.aClass238_11.anInt5977) {
						Static595.aBoolean673 = true;
					}
				}
				if (Static388.aClass238_11.anObjectArray32 != null && Static595.aBoolean673) {
					local203 = new Class5_Sub24();
					local203.anObjectArray2 = Static388.aClass238_11.anObjectArray32;
					local203.anInt4053 = local133;
					local203.aClass238_6 = Static388.aClass238_11;
					local203.anInt4054 = local125;
					Static247.method3957(local203);
					return;
				}
			} else {
				if (Static595.aBoolean673) {
					Static55.method973();
					if (Static388.aClass238_11.anObjectArray16 != null) {
						local203 = new Class5_Sub24();
						local203.anObjectArray2 = Static388.aClass238_11.anObjectArray16;
						local203.anInt4054 = local125;
						local203.aClass238_5 = Static397.aClass238_12;
						local203.aClass238_6 = Static388.aClass238_11;
						local203.anInt4053 = local133;
						Static247.method3957(local203);
					}
					if (Static397.aClass238_12 != null && Static73.method1227(Static388.aClass238_11) != null) {
						Static114.method1711(Static388.aClass238_11, Static397.aClass238_12);
					}
				} else if ((Static446.anInt7312 == 1 || Static308.method4795()) && Static651.anInt10662 > 2) {
					Static470.method6647(Static412.anInt6980 + Static147.anInt2911, Static522.anInt8283 + Static501.anInt8061);
				} else if (Static56.method977()) {
					Static470.method6647(Static147.anInt2911 + Static412.anInt6980, Static522.anInt8283 + Static501.anInt8061);
				}
				Static388.aClass238_11 = null;
			}
		} else if (Static20.anInt292 > 1) {
			Static388.aClass238_11 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method9153(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(27) int local27 = arg2 + arg0;
		while (local27 > local23) {
			@Pc(36) int local36 = arg1[local23++] & 0xFF;
			@Pc(50) int local50;
			if (local36 >= 128) {
				if (local36 < 192) {
					local50 = 65533;
				} else if (local36 < 224) {
					if (local27 > local23 && (arg1[local23] & 0xC0) == 128) {
						local50 = (local36 & 0x1F) << 6 | arg1[local23++] & 0x3F;
						if (local50 < 128) {
							local50 = 65533;
						}
					} else {
						local50 = 65533;
					}
				} else if (local36 >= 240) {
					if (local36 >= 248) {
						local50 = 65533;
					} else if (local27 > local23 + 2 && (arg1[local23] & 0xC0) == 128 && (arg1[local23 + 1] & 0xC0) == 128 && (arg1[local23 + 2] & 0xC0) == 128) {
						local50 = (local36 & 0x7) << 18 | (arg1[local23++] & 0x3F) << 12 | (arg1[local23++] & 0x3F) << 6 | arg1[local23++] & 0x3F;
						if (local50 >= 65536 && local50 <= 1114111) {
							local50 = 65533;
						} else {
							local50 = 65533;
						}
					} else {
						local50 = 65533;
					}
				} else if (local23 + 1 < local27 && (arg1[local23] & 0xC0) == 128 && (arg1[local23 + 1] & 0xC0) == 128) {
					local50 = (arg1[local23++] & 0x3F) << 6 | (local36 & 0xF) << 12 | arg1[local23++] & 0x3F;
					if (local50 < 2048) {
						local50 = 65533;
					}
				} else {
					local50 = 65533;
				}
			} else if (local36 == 0) {
				local50 = 65533;
			} else {
				local50 = local36;
			}
			local8[local21++] = (char) local50;
		}
		return new String(local8, 0, local21);
	}
}
