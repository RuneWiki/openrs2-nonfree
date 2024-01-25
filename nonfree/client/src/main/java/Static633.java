import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public static int anInt9786;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt9789 = -1;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt9792 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method8381() {
		Static570.aClass4_Sub3_Sub4_6.method6785();
		Static554.aClass4_Sub3_Sub4_5 = null;
		Static91.anInt1809 = 1;
		Static586.aClass34_116 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB[B)I")
	public static int method8385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg1; local17 < arg0; local17++) {
			local15 = Class220.anIntArray415[(local15 ^ arg2[local17]) & 0xFF] ^ local15 >>> 8;
		}
		return ~local15;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8388(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(39) int local39 = arg0.indexOf(" ", "directlogin ".length());
			if (local39 >= 0) {
				@Pc(47) int local47 = arg0.length();
				arg0 = arg0.substring(0, local39) + " ";
				for (@Pc(63) int local63 = local39 + 1; local63 < local47; local63++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBLclient!gda;Lclient!fs;)V")
	public static void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1 arg1, @OriginalArg(3) Class124 arg2) {
		if (Static655.anInt10336 >= 50 || (arg2 == null || arg2.anIntArrayArray16 == null || arg2.anIntArrayArray16.length <= arg0 || arg2.anIntArrayArray16[arg0] == null)) {
			return;
		}
		@Pc(37) int local37 = arg2.anIntArrayArray16[arg0][0];
		@Pc(41) int local41 = local37 >> 8;
		@Pc(47) int local47 = local37 >> 5 & 0x7;
		@Pc(66) int local66;
		if (arg2.anIntArrayArray16[arg0].length > 1) {
			local66 = (int) (Math.random() * (double) arg2.anIntArrayArray16[arg0].length);
			if (local66 > 0) {
				local41 = arg2.anIntArrayArray16[arg0][local66];
			}
		}
		@Pc(82) int local82 = local37 & 0x1F;
		local66 = 256;
		if (arg2.anIntArray222 != null && arg2.anIntArray225 != null) {
			local66 = arg2.anIntArray222[arg0] + (int) (Math.random() * (double) (arg2.anIntArray225[arg0] - arg2.anIntArray222[arg0]));
		}
		@Pc(119) int local119 = arg2.anIntArray223 == null ? 255 : arg2.anIntArray223[arg0];
		if (local82 == 0) {
			if (arg1 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4) {
				if (!arg2.aBoolean220) {
					Static430.method5939(0, local41, local66, local47, local119);
					return;
				}
				Static412.method5195(local66, local119, local47, local41, false, 0);
			}
		} else if (Static124.aClass4_Sub20_4.aClass8_Sub22_3.method7414() != 0) {
			@Pc(157) int local157 = arg1.anInt9925 - 256 >> 9;
			@Pc(164) int local164 = arg1.anInt9917 - 256 >> 9;
			@Pc(186) int local186 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == arg1 ? 0 : (local164 << 8) + ((arg1.aByte141 << 24) - (-(local157 << 16) - local82));
			Static665.aClass129Array1[Static655.anInt10336++] = new Class129((byte) (arg2.aBoolean220 ? 2 : 1), local41, local47, 0, local119, local186, local66, arg1);
		}
	}
}
