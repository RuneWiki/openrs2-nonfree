import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_190 = new Class215(92, -1);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_1 = new Class141(14, 0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_2 = new Class141(15, 4);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_3 = new Class141(16, -2);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_4 = new Class141(17, 0);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_5 = new Class141(18, -2);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_6 = new Class141(19, -2);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_7 = new Class141(20, 6);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_8 = new Class141(21, 9);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_9 = new Class141(22, -2);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_10 = new Class141(23, 4);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_11 = new Class141(24, -1);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_12 = new Class141(26, 0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_13 = new Class141(27, 0);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!hv;")
	public static final Class141 aClass141_14 = new Class141(28, -2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/lang/String;IIZLjava/lang/String;Z)V")
	public static void method7024(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) String arg5) {
		Static435.aClass157_222.anInt5303 = 1;
		@Pc(11) String local11 = arg5.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(26) Class335 local26 = Static229.aClass70_1.method2496(arg3);
			if (local26 == null || arg0 != local26.method8409()) {
				return;
			}
			if (local26.method8409()) {
				local18 = local26.aString102;
			} else {
				local16 = local26.anInt10093;
			}
		}
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < Static635.aClass336_2.anInt10100; local57++) {
			@Pc(69) Class301 local69 = Static635.aClass336_2.method8424(local57);
			if ((!arg4 || local69.aBoolean660) && local69.anInt9230 == -1 && local69.anInt9212 == -1 && local69.anInt9201 == 0 && local69.aString97.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg0) {
						if (!arg1.equals(local69.method7707(local18, arg3))) {
							continue;
						}
					} else if (local69.method7713(local16, arg3) != arg2) {
						continue;
					}
				}
				if (local55 >= 250) {
					Static468.aShortArray116 = null;
					Static305.anInt6352 = -1;
					return;
				}
				if (local14.length <= local55) {
					@Pc(138) short[] local138 = new short[local14.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local55; local140++) {
						local138[local140] = local14[local140];
					}
					local14 = local138;
				}
				local14[local55++] = (short) local57;
			}
		}
		Static468.aShortArray116 = local14;
		Static305.anInt6352 = local55;
		Static396.anInt7578 = 0;
		@Pc(174) String[] local174 = new String[Static305.anInt6352];
		for (@Pc(176) int local176 = 0; local176 < Static305.anInt6352; local176++) {
			local174[local176] = Static635.aClass336_2.method8424(local14[local176]).aString97;
		}
		Static435.method6897(Static468.aShortArray116, local174);
		Static435.aClass157_222.method4566();
		Static435.aClass157_222.anInt5303 = 2;
	}
}
