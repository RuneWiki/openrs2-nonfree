import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public static int method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static343.anIntArrayArray58 == null ? 0 : Static343.anIntArrayArray58[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method1733(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) boolean local10 = true;
		@Pc(15) Class3_Sub7 local15 = new Class3_Sub7(arg1);
		@Pc(17) int local17 = -1;
		label70: while (true) {
			@Pc(21) int local21 = local15.method6557();
			if (local21 == 0) {
				return local10;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(97) Class292 local97;
				do {
					@Pc(65) int local65;
					@Pc(69) int local69;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local15.method6542();
										if (local37 == 0) {
											continue label70;
										}
										local15.method6538();
									}
									local37 = local15.method6542();
									if (local37 == 0) {
										continue label70;
									}
									local29 += local37 - 1;
									@Pc(49) int local49 = local29 & 0x3F;
									@Pc(55) int local55 = local29 >> 6 & 0x3F;
									local61 = local15.method6538() >> 2;
									local65 = arg0 + local55;
									local69 = arg3 + local49;
								} while (local65 <= 0);
							} while (local69 <= 0);
						} while (arg4 - 1 <= local65);
					} while (arg2 - 1 <= local69);
					local97 = Static253.aClass146_2.method3356(local17);
				} while (local61 == 22 && !Static455.aClass3_Sub27_Sub1_1.aBoolean382 && local97.anInt8778 == 0 && local97.anInt8782 != 1 && !local97.aBoolean736);
				if (!local97.method7185()) {
					Static37.anInt1043++;
					local10 = false;
				}
				local31 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public static void method1734() {
		@Pc(5) Class148 local5 = null;
		try {
			@Pc(11) Class66 local11 = Static480.aClass326_3.method7783("3", false);
			while (local11.anInt2308 == 0) {
				Static1.method125(1L);
			}
			if (local11.anInt2308 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local5 = (Class148) local11.anObject4;
			@Pc(47) byte[] local47 = new byte[(int) local5.method3371()];
			if (local47.length == 0) {
				Static361.aString81 = "";
				Static551.aString128 = "";
			} else {
				@Pc(67) int local67;
				for (@Pc(55) int local55 = 0; local55 < local47.length; local55 += local67) {
					local67 = local5.method3370(local47.length - local55, local47, local55);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(92) Class3_Sub7 local92 = new Class3_Sub7(local47);
				@Pc(96) int local96 = local92.method6538();
				if (local96 > 60) {
					throw new RuntimeException("Bad length");
				}
				local92.anInt7869 = local96 + 1;
				if (!local92.method6520()) {
					throw new RuntimeException("Invalid CRC");
				}
				local92.anInt7869 = 1;
				@Pc(127) int local127 = local92.method6538();
				if (local127 > 2) {
					throw new RuntimeException("Invalid version " + local127);
				}
				Static551.aString128 = local92.method6492();
				Static361.aString81 = local92.method6492();
				if (local127 >= 1) {
					Static24.anInt772 = local92.method6535();
				} else {
					Static24.anInt772 = Static32.anInt2893;
				}
				if (local127 >= 2) {
					Static113.aLong80 = local92.method6519();
				} else {
					Static113.aLong80 = Static339.aLong179;
				}
			}
		} catch (@Pc(182) Exception local182) {
			Static361.aString81 = "";
			Static551.aString128 = "";
		}
		try {
			if (local5 != null) {
				local5.method3377();
			}
		} catch (@Pc(193) Exception local193) {
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1735(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
