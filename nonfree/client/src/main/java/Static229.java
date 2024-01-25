import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_5 = new Class278("", 14);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3920(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(28) String local28;
		if (Static346.anInt7032 >= 200 && !Static10.aBoolean29 || Static346.anInt7032 >= 200) {
			Static477.method7310(Static139.aClass101_9.method2841(Static126.anInt2904));
			local28 = Static139.aClass101_10.method2841(Static126.anInt2904);
			if (local28 != null) {
				Static477.method7310(local28);
			}
			return;
		}
		local28 = Static67.method8230(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(82) String local82;
		for (@Pc(44) int local44 = 0; local44 < Static346.anInt7032; local44++) {
			@Pc(51) String local51 = Static67.method8230(Static520.aStringArray34[local44]);
			if (local51 != null && local51.equals(local28)) {
				Static477.method7310(arg0 + Static139.aClass101_37.method2841(Static126.anInt2904));
				return;
			}
			if (Static199.aStringArray17[local44] != null) {
				local82 = Static67.method8230(Static199.aStringArray17[local44]);
				if (local82 != null && local82.equals(local28)) {
					Static477.method7310(arg0 + Static139.aClass101_37.method2841(Static126.anInt2904));
					return;
				}
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static403.anInt7927; local109++) {
			local82 = Static67.method8230(Class21_Sub3.lb[local109]);
			if (local82 != null && local82.equals(local28)) {
				Static477.method7310(Static139.aClass101_42.method2841(Static126.anInt2904) + arg0 + Static139.aClass101_43.method2841(Static126.anInt2904));
				return;
			}
			if (Static406.aStringArray28[local109] != null) {
				@Pc(152) String local152 = Static67.method8230(Static406.aStringArray28[local109]);
				if (local152 != null && local152.equals(local28)) {
					Static477.method7310(Static139.aClass101_42.method2841(Static126.anInt2904) + arg0 + Static139.aClass101_43.method2841(Static126.anInt2904));
					return;
				}
			}
		}
		if (Static67.method8230(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23).equals(local28)) {
			Static477.method7310(Static139.aClass101_40.method2841(Static126.anInt2904));
		} else {
			@Pc(206) Class3_Sub9 local206 = Static587.method8316(Static187.aClass40_2, Static423.aClass230_83);
			local206.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0));
			local206.aClass3_Sub7_Sub1_1.method6516(arg0);
			Static230.method3933(local206);
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)I")
	public static int method3921() {
		@Pc(10) Class15 local10 = Static546.aClass15_16;
		@Pc(12) boolean local12 = false;
		if (Static275.anInt5823 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local10 = Static362.method5283(null, local18, null, 0, 0);
			local12 = true;
		}
		@Pc(35) long local35 = Static376.method6088();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local10.method5299();
		}
		@Pc(63) int local63 = (int) (Static376.method6088() - local35);
		local10.method5341(-16777216, 0, 100, 100, 0);
		if (local12) {
			local10.method5337();
		}
		return local63;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method3922(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		@Pc(17) int local17 = arg2 + arg1;
		for (@Pc(19) int local19 = arg2; local19 < local17; local19++) {
			@Pc(26) int local26 = arg0[local19] & 0xFF;
			if (local26 < 128) {
				local6[local8++] = (char) local26;
			} else if (local26 >= 194) {
				@Pc(104) int local104;
				if (local26 >= 224) {
					if (local26 >= 240) {
						if (local26 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local26);
					}
					if (local17 <= local19 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local19++;
					local104 = arg0[local19] & 0xFF;
					if (local104 < 128 || local104 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local19++;
					@Pc(122) int local122 = arg0[local19] & 0xFF;
					if (local122 < 128 || local122 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local6[local8++] = (char) (local122 & 0xFFFFFF7F | (local26 & 0xFFF1F) << 12 | (local104 & 0x3FFFF7F) << 6);
				} else if (local19 + 1 < local17) {
					local19++;
					local104 = arg0[local19] & 0xFF;
					if (local104 < 128 || local104 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local6[local8++] = (char) (local104 & 0xFFFFFF7F | (local26 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
			}
		}
		return new String(local6, 0, local8);
	}
}
