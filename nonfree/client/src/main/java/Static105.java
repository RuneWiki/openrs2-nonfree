import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	public static int anInt2387;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "Lclient!ah;")
	public static Class6 aClass6_11;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
	public static int anInt2391;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	public static int anInt2388 = 10;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "[I")
	public static int[] anIntArray305 = new int[25];

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
	public static int anInt2389 = 1;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "Lclient!kh;")
	private static Class60 aClass60_779 = Static200.method3116("slide:");

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_777 = aClass60_779;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_778 = aClass60_779;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public static void method1783() {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt97; local1++) {
			@Pc(6) Class29 local6 = Static141.aClass29Array2[local1];
			Static204.method3168(local6);
			Static141.aClass29Array2[local1] = null;
		}
		Static4.anInt97 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)[Lclient!o;")
	public static Class73_Sub1[] method1784() {
		@Pc(13) Class73_Sub1[] local13 = new Class73_Sub1[Static180.anInt3836];
		for (@Pc(15) int local15 = 0; local15 < Static180.anInt3836; local15++) {
			local13[local15] = new Class73_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[local15], Static97.anIntArray263[local15], Static181.anIntArray504[local15], Static10.anIntArray46[local15], Static96.aByteArrayArray4[local15], Static110.anIntArray317);
		}
		Static43.method711();
		return local13;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
	public static int method1785(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
