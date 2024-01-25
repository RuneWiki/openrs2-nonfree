import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_57 = new Class274(26, -2);

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_46 = new Class269(66, -1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!bl;")
	public static Class29 method3752(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class29 local8;
		try {
			local8 = (Class29) Class.forName("Class29_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class29_Sub1();
		}
		local8.anInt6805 = arg1;
		local8.aString66 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3754(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = Static106.method8244(arg0, arg1);
		@Pc(18) String[] local18 = new String[local13 + 1];
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			@Pc(27) int local27;
			for (local27 = local22; arg1.charAt(local27) != arg0; local27++) {
			}
			local18[local20++] = arg1.substring(local22, local27);
			local22 = local27 + 1;
		}
		local18[local13] = arg1.substring(local22);
		return local18;
	}
}
