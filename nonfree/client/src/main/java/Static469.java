import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt7945;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_169 = new Class40(93, 12);

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Z")
	public static boolean aBoolean541 = false;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6571(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I")
	public static int method6572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static79.anIntArray96[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!oa;IIIII)Lclient!ba;")
	public static Class22 method6574(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class22 local12 = (Class22) Static137.aClass332_64.method7502(local6);
		if (local12 == null) {
			@Pc(24) Class274 local24 = Static250.method3550(Static251.aClass251_88, arg4);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt7670 < 13) {
				local24.method6335();
			}
			local12 = arg1.method7088(local24, 2055, Static267.anInt4422, 64, 768);
			Static137.aClass332_64.method7498(local6, local12);
		}
		local12 = local12.method4699((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.I(arg5);
		}
		if (arg0 != 0) {
			local12.AA(arg0);
		}
		if (arg3 != 0) {
			local12.v(arg3);
		}
		if (arg2 != 0) {
			local12.m(0, arg2, 0);
		}
		return local12;
	}
}
