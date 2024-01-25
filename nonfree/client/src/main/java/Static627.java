import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!vaa", name = "Q", descriptor = "Lclient!mo;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!vaa", name = "T", descriptor = "I")
	public static int anInt10388;

	@OriginalMember(owner = "client!vaa", name = "G", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_154 = new Class171(57, -2);

	@OriginalMember(owner = "client!vaa", name = "M", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_155 = new Class171(0, 3);

	@OriginalMember(owner = "client!vaa", name = "S", descriptor = "I")
	public static final int anInt10387 = 328;

	@OriginalMember(owner = "client!vaa", name = "U", descriptor = "I")
	public static int anInt10389 = 13156520;

	@OriginalMember(owner = "client!vaa", name = "V", descriptor = "[I")
	public static final int[] anIntArray553 = new int[14];

	@OriginalMember(owner = "client!vaa", name = "W", descriptor = "I")
	public static int anInt10390 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILclient!iga;Lclient!iga;)V")
	public static void method8479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34_Sub1_Sub5 arg3, @OriginalArg(4) Class34_Sub1_Sub5 arg4) {
		@Pc(4) Class368 local4 = Static172.method2744(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass34_Sub1_Sub5_2 = arg3;
		local4.aClass34_Sub1_Sub5_1 = arg4;
		@Pc(19) int local19 = Static582.aClass35Array3 == Static368.aClass35Array1 ? 1 : 0;
		if (!arg3.method7845()) {
			arg3.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local19];
			Static392.aClass34_Sub1Array4[local19] = arg3;
		} else if (arg3.method7853()) {
			arg3.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local19];
			Static218.aClass34_Sub1Array2[local19] = arg3;
		} else {
			arg3.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local19];
			Static368.aClass34_Sub1Array3[local19] = arg3;
			Static182.aBoolean246 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7845()) {
			if (arg4.method7853()) {
				arg4.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local19];
				Static218.aClass34_Sub1Array2[local19] = arg4;
				return;
			}
			arg4.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local19];
			Static368.aClass34_Sub1Array3[local19] = arg4;
			Static182.aBoolean246 = true;
			return;
		}
		arg4.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local19];
		Static392.aClass34_Sub1Array4[local19] = arg4;
	}
}
