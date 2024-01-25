import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "[Lclient!saa;")
	public static Class299_Sub1[] aClass299_Sub1Array1;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
	public static int anInt2112;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_43 = new Class73(77, 8);

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public static void method1943() {
		if (Static162.anInt3371 <= 0) {
			Static342.aString46 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static272.aStringArray17.length; local14++) {
			if (Static272.aStringArray17[local14].startsWith("--> ")) {
				@Pc(25) int local25 = ~Static162.anInt3371;
				local12++;
				if (local25 == ~local12) {
					Static342.aString46 = Static272.aStringArray17[local14].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class6_Sub21 local17 = new Class6_Sub21(arg4);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method6041();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(95) Class252 local95;
				do {
					@Pc(68) int local68;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method6005();
										if (local39 == 0) {
											continue label68;
										}
										local17.method6069();
									}
									local39 = local17.method6005();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method6069() >> 2;
									local68 = local57 + arg2;
									local73 = local51 + arg3;
								} while (local68 <= 0);
							} while (local73 <= 0);
						} while (arg1 - 1 <= local68);
					} while (arg0 - 1 <= local73);
					local95 = Static412.aClass307_4.method6636(local19);
				} while (local63 == 22 && !Static140.aClass6_Sub48_Sub1_1.aBoolean674 && local95.anInt6889 == 0 && local95.anInt6914 != 1 && !local95.aBoolean482);
				local33 = true;
				if (!local95.method5793()) {
					Static47.anInt1067++;
					local12 = false;
				}
			}
		}
	}
}
