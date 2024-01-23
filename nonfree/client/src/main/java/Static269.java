import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public static int anInt415;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!lf;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_2 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString15 = "Walk here";

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString16 = "Cancel";

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
	public static int[] anIntArray35 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ph;B)Lclient!pk;")
	public static Class1_Sub23 method417(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1) {
		@Pc(8) byte[] local8 = arg1.method3339(arg0);
		return local8 == null ? null : new Class1_Sub23(local8);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ph;IZLclient!ph;)Lclient!vk;")
	public static Class1_Sub1_Sub24 method419(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(4) Class138 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method3334(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg2.method3348(local12[local14], arg0);
			if (local26 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(55) byte[] local55 = arg1.method3348(0, local47);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub24(arg2, arg1, arg0, false);
		} catch (@Pc(92) Exception local92) {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lclient!rc;")
	public static Class37 method420() {
		try {
			return new Class37_Sub3();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class37_Sub2();
			}
		}
	}
}
