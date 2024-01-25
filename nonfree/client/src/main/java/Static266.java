import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public static int anInt5335 = -1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method4596(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = (arg1 ? Static205.anInt4298 : Static334.anInt3923) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class4_Sub4_Sub16 local35 = Static318.method5246(local29);
			if (local35.aBoolean399 && local35.method4694().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static204.aShortArray53 = null;
					Static209.anInt4336 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(66) short[] local66 = new short[local11.length * 2];
					for (@Pc(68) int local68 = 0; local68 < local13; local68++) {
						local66[local68] = local11[local68];
					}
					local11 = local66;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static204.aShortArray53 = local11;
		Static209.anInt4336 = local13;
		Static140.anInt3221 = 0;
		@Pc(105) String[] local105 = new String[Static209.anInt4336];
		for (@Pc(107) int local107 = 0; local107 < Static209.anInt4336; local107++) {
			local105[local107] = Static318.method5246(local11[local107]).method4694();
		}
		Static312.method5145(local105, Static204.aShortArray53);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)Lclient!ac;")
	public static Class3 method4597(@OriginalArg(0) int arg0) {
		@Pc(10) Class3 local10 = (Class3) Static24.aClass198_22.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static128.aClass193_44.method5047(34, arg0);
		local10 = new Class3();
		if (local20 != null) {
			local10.method49(new Class4_Sub11(local20), arg0);
		}
		Static24.aClass198_22.method5201(local10, (long) arg0);
		return local10;
	}
}
