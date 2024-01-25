import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "Lclient!sf;")
	public static Class180 aClass180_39;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "Lclient!iq;")
	public static Class104 aClass104_149;

	@OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lclient!kr;")
	public static Class46 aClass46_21;

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "[I")
	public static final int[] anIntArray448 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
	public static int anInt5721 = -2;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4825(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static94.method1860("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4828(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static36.aClass104_26.anInt3077 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		@Pc(72) int local72;
		for (@Pc(18) int local18 = 0; local18 < Static310.aClass184_2.anInt5966; local18++) {
			@Pc(25) Class122 local25 = Static310.aClass184_2.method5040(local18);
			if ((!arg0 || local25.aBoolean336) && local25.anInt3914 == -1 && local25.anInt3935 == -1 && local25.anInt3895 == 0 && local25.aString37.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static228.aShortArray87 = null;
					Static229.anInt4967 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(70) short[] local70 = new short[local14.length * 2];
					for (local72 = 0; local72 < local16; local72++) {
						local70[local72] = local14[local72];
					}
					local14 = local70;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static228.aShortArray87 = local14;
		Static229.anInt4967 = local16;
		Static174.anInt5326 = 0;
		@Pc(114) String[] local114 = new String[Static229.anInt4967];
		for (local72 = 0; local72 < Static229.anInt4967; local72++) {
			local114[local72] = Static310.aClass184_2.method5040(local14[local72]).aString37;
		}
		Static10.method152(Static228.aShortArray87, local114);
		Static36.aClass104_26.method2751();
		Static36.aClass104_26.anInt3077 = 2;
	}
}
