import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
	public static int anInt3761;

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "I")
	public static int anInt3768;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_81 = new Class220(6, 0, 4, 2);

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_62 = new Class198("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "Lclient!eg;")
	public static final Class60 aClass60_6 = new Class60("", 17);

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "[I")
	public static final int[] anIntArray238 = new int[200];

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
	public static int anInt3766 = 13156520;

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_5 = new Class163(13, 4);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V")
	public static void method2976(@OriginalArg(1) byte arg0) {
		if (Static264.aByteArrayArrayArray15 == null) {
			Static264.aByteArrayArrayArray15 = new byte[4][Static433.anInt7210][Static418.anInt6969];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static433.anInt7210; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static418.anInt6969; local26++) {
					Static264.aByteArrayArrayArray15[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIBI)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg4 - arg3;
		@Pc(23) int local23 = arg1 - arg2;
		if (local18 == 0) {
			if (local23 != 0) {
				Static265.method3371(arg3, arg1, arg2, arg0);
			}
		} else if (local23 == 0) {
			Static180.method2465(arg3, arg2, arg4, arg0);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(63) int local63 = arg2 - (local55 * arg3 >> 12);
			@Pc(83) int local83;
			@Pc(81) int local81;
			if (arg4 < Static3.anInt45) {
				local81 = (local55 * Static3.anInt45 >> 12) + local63;
				local83 = Static3.anInt45;
			} else if (arg4 > Static112.anInt1900) {
				local81 = local63 + (local55 * Static112.anInt1900 >> 12);
				local83 = Static112.anInt1900;
			} else {
				local83 = arg4;
				local81 = arg1;
			}
			@Pc(106) int local106;
			@Pc(114) int local114;
			if (Static3.anInt45 > arg3) {
				local106 = Static3.anInt45;
				local114 = (Static3.anInt45 * local55 >> 12) + local63;
			} else if (arg3 <= Static112.anInt1900) {
				local114 = arg2;
				local106 = arg3;
			} else {
				local106 = Static112.anInt1900;
				local114 = (Static112.anInt1900 * local55 >> 12) + local63;
			}
			if (Static356.anInt5817 > local114) {
				local106 = (Static356.anInt5817 - local63 << 12) / local55;
				local114 = Static356.anInt5817;
			} else if (Static3.anInt46 < local114) {
				local106 = (Static3.anInt46 - local63 << 12) / local55;
				local114 = Static3.anInt46;
			}
			if (Static356.anInt5817 > local81) {
				local83 = (Static356.anInt5817 - local63 << 12) / local55;
				local81 = Static356.anInt5817;
			} else if (local81 > Static3.anInt46) {
				local83 = (Static3.anInt46 - local63 << 12) / local55;
				local81 = Static3.anInt46;
			}
			Static196.method2623(local106, arg0, local114, local81, local83);
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Lclient!wr;")
	public static Class5_Sub2_Sub18 method2983() {
		return Static98.aClass5_Sub2_Sub18_4;
	}
}
