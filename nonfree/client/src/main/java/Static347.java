import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt6580;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!se;")
	public static final Class180 aClass180_10 = new Class180();

	@OriginalMember(owner = "client!we", name = "l", descriptor = "J")
	public static volatile long aLong216 = 0L;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	public static int anInt6585 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!tj;IZLclient!tj;)V")
	public static void method5524(@OriginalArg(1) Class193 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class193 arg2) {
		Static158.anInt3399 = arg1;
		Static166.aBoolean288 = true;
		Static183.aClass193_67 = arg2;
		Static192.aClass193_70 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!sf;")
	public static Class8_Sub1 method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class117 local14 = local7.aClass117_2; local14 != null; local14 = local14.aClass117_1) {
			@Pc(18) Class8_Sub1 local18 = local14.aClass8_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort98 == arg1 && local18.aShort97 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5530(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static117.aStringArray30.length; local7++) {
			if (Static117.aStringArray30[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
