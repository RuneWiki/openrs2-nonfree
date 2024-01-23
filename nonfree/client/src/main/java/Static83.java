import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array5;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt1959;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
	public static int[] anIntArray230 = new int[1000];

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_644 = Static200.method3116(" GMT");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt1954 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_645 = Static200.method3116(":assistreq:");

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public static int anInt1957 = -1;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt1958 = -1;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_646 = Static200.method3116("l");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method1457(@OriginalArg(1) Class9_Sub4 arg0) {
		if (arg0.anInt3940 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(36) int local36;
		if (arg0.anInt3953 != -1 && arg0.anInt3953 < 32768) {
			@Pc(27) Class9_Sub4_Sub2 local27 = Static1.aClass9_Sub4_Sub2Array1[arg0.anInt3953];
			if (local27 != null) {
				local36 = arg0.anInt3903 - local27.anInt3903;
				local43 = arg0.anInt3925 - local27.anInt3925;
				if (local43 != 0 || local36 != 0) {
					arg0.anInt3930 = (int) (Math.atan2((double) local43, (double) local36) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt3953 >= 32768) {
			local73 = arg0.anInt3953 - 32768;
			if (local73 == Static65.anInt1615) {
				local73 = 2047;
			}
			@Pc(82) Class9_Sub4_Sub1 local82 = Static41.aClass9_Sub4_Sub1Array2[local73];
			if (local82 != null) {
				@Pc(91) int local91 = arg0.anInt3903 - local82.anInt3903;
				local36 = arg0.anInt3925 - local82.anInt3925;
				if (local36 != 0 || local91 != 0) {
					arg0.anInt3930 = (int) (Math.atan2((double) local36, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3926 != 0 || arg0.anInt3918 != 0) && (arg0.anInt3946 == 0 || arg0.anInt3939 > 0)) {
			local73 = (arg0.anInt3937 - 1) * 64 + arg0.anInt3925 - (arg0.anInt3926 - Static128.anInt2813 - Static128.anInt2813) * 64;
			local43 = (arg0.anInt3937 - 1) * 64 + arg0.anInt3903 - (arg0.anInt3918 - Static163.anInt3587 - Static163.anInt3587) * 64;
			if (local73 != 0 || local43 != 0) {
				arg0.anInt3930 = (int) (Math.atan2((double) local73, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt3926 = 0;
			arg0.anInt3918 = 0;
		}
		local73 = arg0.anInt3930 - arg0.anInt3913 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt3950 = 0;
			return;
		}
		arg0.anInt3950++;
		@Pc(244) boolean local244;
		if (local73 > 1024) {
			arg0.anInt3913 -= arg0.anInt3940;
			local244 = true;
			if (local73 < arg0.anInt3940 || local73 > 2048 - arg0.anInt3940) {
				local244 = false;
				arg0.anInt3913 = arg0.anInt3930;
			}
			if (arg0.anInt3932 == arg0.anInt3905 && (arg0.anInt3950 > 25 || local244)) {
				if (arg0.anInt3947 == -1) {
					arg0.anInt3905 = arg0.anInt3938;
				} else {
					arg0.anInt3905 = arg0.anInt3947;
				}
			}
		} else {
			local244 = true;
			arg0.anInt3913 += arg0.anInt3940;
			if (arg0.anInt3940 > local73 || 2048 - arg0.anInt3940 < local73) {
				arg0.anInt3913 = arg0.anInt3930;
				local244 = false;
			}
			if (arg0.anInt3932 == arg0.anInt3905 && (arg0.anInt3950 > 25 || local244)) {
				if (arg0.anInt3931 == -1) {
					arg0.anInt3905 = arg0.anInt3938;
				} else {
					arg0.anInt3905 = arg0.anInt3931;
				}
			}
		}
		arg0.anInt3913 &= 0x7FF;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method1458() {
		Static95.aClass39_16.method1158();
	}
}
