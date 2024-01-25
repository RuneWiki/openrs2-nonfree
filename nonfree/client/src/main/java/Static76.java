import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_62 = new Class184(50, 0);

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
	public static final int[] anIntArray152 = new int[1000];

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Z")
	public static final boolean aBoolean135 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIILclient!qa;I)Lclient!c;")
	public static Class31 method1359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class31 local12 = (Class31) Static231.aClass5_37.method104(local6);
		if (local12 == null) {
			@Pc(24) Class242 local24 = Static275.method4093(arg2, Static341.aClass56_73);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt7154 < 13) {
				local24.method5546();
			}
			local12 = arg4.method2616(local24, 2055, Static302.anInt5510, 64, 768);
			Static231.aClass5_37.method114(local6, local12);
		}
		local12 = local12.method5710((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.k(arg1);
		}
		if (arg3 != 0) {
			local12.WA(arg3);
		}
		if (arg5 != 0) {
			local12.o(arg5);
		}
		if (arg0 != 0) {
			local12.ja(0, arg0, 0);
		}
		return local12;
	}
}
