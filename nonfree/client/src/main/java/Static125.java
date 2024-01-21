import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ni", name = "S", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!ni", name = "jb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_956 = Static158.method3034("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "Lclient!ob;")
	public static Class60 aClass60_952 = aClass60_956;

	@OriginalMember(owner = "client!ni", name = "Y", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_953 = Static158.method3034("Welcome to RuneScape");

	@OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
	public static volatile int anInt3413 = 0;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_954 = Static158.method3034(":chalreq:");

	@OriginalMember(owner = "client!ni", name = "eb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_955 = aClass60_953;

	@OriginalMember(owner = "client!ni", name = "lb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_957 = Static158.method3034(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ni", name = "mb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_958 = Static158.method3034(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)Lclient!ah;")
	public static Class6 method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3604; local13++) {
			@Pc(19) Class6 local19 = local7.aClass6Array2[local13];
			if ((local19.aLong8 >> 29 & 0x3L) == 2L && local19.anInt299 == arg1 && local19.anInt291 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "(I)V")
	public static void method2641() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static166.anInt4101; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static169.anIntArray458[local3];
			}
			@Pc(21) Class2_Sub1_Sub1_Sub3_Sub1 local21 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local13];
			if (local21 != null && local21.anInt3300 > 0) {
				local21.anInt3300--;
				if (local21.anInt3300 == 0) {
					local21.aClass60_919 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static174.anInt4255; local13++) {
			@Pc(64) int local64 = Static180.anIntArray370[local13];
			@Pc(68) Class2_Sub1_Sub1_Sub3_Sub2 local68 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local64];
			if (local68 != null && local68.anInt3300 > 0) {
				local68.anInt3300--;
				if (local68.anInt3300 == 0) {
					local68.aClass60_919 = null;
				}
			}
		}
	}
}
