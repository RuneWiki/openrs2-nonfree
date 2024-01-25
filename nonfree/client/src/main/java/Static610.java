import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uia", name = "s", descriptor = "Lclient!uq;")
	public static Class362 aClass362_143;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_1 = new Class356(0, 3, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_2 = new Class356(1, 3, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_3 = new Class356(2, 4, Static666.aClass389_16);

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_4 = new Class356(3, 1, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_5 = new Class356(4, 2, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "p", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_6 = new Class356(5, 3, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "q", descriptor = "Lclient!uia;")
	public static final Class356 aClass356_7 = new Class356(6, 4, Static666.aClass389_20);

	@OriginalMember(owner = "client!uia", name = "r", descriptor = "I")
	public static final int anInt10152 = Static407.method5605(16);

	@OriginalMember(owner = "client!uia", name = "t", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_148 = new Class171(88, 3);

	@OriginalMember(owner = "client!uia", name = "u", descriptor = "I")
	public static int anInt10153 = 0;

	@OriginalMember(owner = "client!uia", name = "v", descriptor = "I")
	public static int anInt10154 = -1;

	@OriginalMember(owner = "client!uia", name = "w", descriptor = "I")
	public static int anInt10155 = 0;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I")
	public static int method8275(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "([BI)[B")
	public static byte[] method8276(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static681.method4034(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8277(@OriginalArg(0) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static498.aBoolean757) {
			local7 = Static84.method1336();
			local9 = Static614.method8324();
		}
		arg0.KA(local7, local9, local7 + Static531.anInt8327, local9 + 350);
		arg0.aa(local7, local9, Static531.anInt8327, 350, Static137.anInt2624 << 24 | 0x332277, 1);
		Static63.method1147(local9, local7 + Static531.anInt8327, local7, local9 + 350);
		@Pc(53) int local53 = 350 / Static91.anInt1853;
		@Pc(62) int local62;
		if (Class14_Sub26.anInt9540 > 0) {
			local62 = 346 - Static91.anInt1853 - 4;
			@Pc(72) int local72 = local62 * local53 / (Class14_Sub26.anInt9540 + local53 - 1);
			@Pc(74) int local74 = 4;
			if (Class14_Sub26.anInt9540 > 1) {
				local74 = (Class14_Sub26.anInt9540 - Static76.anInt1484 - 1) * (local62 + -local72) / (Class14_Sub26.anInt9540 - 1) + 4;
			}
			arg0.aa(Static531.anInt8327 + local7 - 16, local9 + local74, 12, local72, Static137.anInt2624 << 24 | 0x332277, 2);
			for (@Pc(116) int local116 = Static76.anInt1484; local116 < Static76.anInt1484 + local53 && local116 < Class14_Sub26.anInt9540; local116++) {
				@Pc(125) String[] local125 = Static120.method1814(Static239.aStringArray27[local116], '\b');
				@Pc(134) int local134 = (Static531.anInt8327 - 16 - 8) / local125.length;
				for (@Pc(136) int local136 = 0; local136 < local125.length; local136++) {
					@Pc(145) int local145 = local134 * local136 + 8;
					arg0.KA(local7 + local145, local9, local7 + local145 + local134 - 8, local9 + 350);
					Static184.aClass67_3.method7684(-1, local145 + local7, -Static513.aClass91_12.anInt2205 + -2 + local9 + 350 - (Static285.anInt4849 - -((-Static76.anInt1484 + local116) * Static91.anInt1853)), Static315.method4523(local125[local136]), -16777216);
				}
			}
		}
		Static261.aClass67_5.method7675(local9 + 330, local7 - -Static531.anInt8327 + -25, -16777216, -1, "Build: 645");
		arg0.KA(local7, local9, Static531.anInt8327 + local7, local9 + 350);
		arg0.method8066(local7, Static531.anInt8327, local9 + 350 - Static285.anInt4849, -1);
		Static293.aClass67_14.method7684(-1, local7 + 10, -1 + 350 + (local9 - Static281.aClass91_7.anInt2205), "--> " + Static315.method4523(Static89.aString26), -16777216);
		if (!Static584.aBoolean658) {
			return;
		}
		local62 = -1;
		if (Static122.anInt2190 % 30 > 15) {
			local62 = 16777215;
		}
		arg0.method8000(Static281.aClass91_7.method1849("--> " + Static315.method4523(Static89.aString26).substring(0, anInt10155)) + local7 + 10, local62, local9 + 350 - Static281.aClass91_7.anInt2205 - 11, 12);
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(II)Lclient!uia;")
	public static Class356 method8279(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass356_1;
		} else if (arg0 == 1) {
			return aClass356_2;
		} else if (arg0 == 2) {
			return aClass356_3;
		} else if (arg0 == 3) {
			return aClass356_4;
		} else if (arg0 == 4) {
			return aClass356_5;
		} else if (arg0 == 5) {
			return aClass356_6;
		} else if (arg0 == 6) {
			return aClass356_7;
		} else {
			return null;
		}
	}
}
