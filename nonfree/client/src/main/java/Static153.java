import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
	public static int anInt3147;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_51 = new Class359(98, 6);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I")
	public static int method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!lq;Z[[[BIB)Z")
	public static boolean method2781(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static5.aBoolean4) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10781 >> Static588.anInt9672;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10784 >> Static588.anInt9672;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class28_Sub1_Sub4) {
			local10 = ((Class28_Sub1_Sub4) arg0).aShort122;
			local17 = ((Class28_Sub1_Sub4) arg0).aShort123;
			local8 = ((Class28_Sub1_Sub4) arg0).aShort124;
			local15 = ((Class28_Sub1_Sub4) arg0).aShort121;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte144 < Static219.anInt4088 && local38 >= Static521.anInt8682 && local38 < Static23.anInt329 && local41 >= Static450.anInt7698 && local41 < Static68.anInt1012) {
					if ((arg2 == null || arg0.aByte145 < arg3 || arg2[arg0.aByte145][local38][local41] != arg4) && arg0.method8961() && !arg0.method8974(Static10.aClass65_1)) {
						return false;
					}
					if (!arg1 && local38 >= Static57.anInt852 - 16 && local38 <= Static57.anInt852 + 16 && local41 >= Static481.anInt8080 - 16 && local41 <= Static481.anInt8080 + 16) {
						if (Static23.aBoolean21) {
							Static198.aClass289Array2[Static486.anInt8171++].method6859(arg0);
							Static486.anInt8171 %= Static306.anInt5853;
						} else {
							arg0.method8962(Static10.aClass65_1);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILclient!ih;II)V")
	public static void method2782(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static573.aClass114_64.method2805(); local10 != null; local10 = (Class5_Sub52) Static573.aClass114_64.method2814()) {
			if (local10.anInt9157 == arg3 && local10.anInt9154 == arg2 << 9 && arg0 << 9 == local10.anInt9160 && local10.aClass164_1.anInt4670 == arg1.anInt4670) {
				if (local10.aClass5_Sub17_Sub2_2 != null) {
					Static245.aClass5_Sub17_Sub4_2.method6184(local10.aClass5_Sub17_Sub2_2);
					local10.aClass5_Sub17_Sub2_2 = null;
				}
				if (local10.aClass5_Sub17_Sub2_3 != null) {
					Static245.aClass5_Sub17_Sub4_2.method6184(local10.aClass5_Sub17_Sub2_3);
					local10.aClass5_Sub17_Sub2_3 = null;
				}
				local10.method9052();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZIZ)I")
	public static int method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class5_Sub43 local8 = Static10.method153(arg1, false);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8.anIntArray406.length; local16++) {
			if (local8.anIntArray406[local16] >= 0 && local8.anIntArray406[local16] < Static110.aClass105_1.anInt2978) {
				@Pc(37) Class238 local37 = Static110.aClass105_1.method2659(local8.anIntArray406[local16]);
				@Pc(47) int local47 = local37.method5687(arg0, Static191.aClass381_2.method8728(arg0).anInt6763);
				if (arg2) {
					local14 += local47 * local8.anIntArray405[local16];
				} else {
					local14 += local47;
				}
			}
		}
		return local14;
	}
}
