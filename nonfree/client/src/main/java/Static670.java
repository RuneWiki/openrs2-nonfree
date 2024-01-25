import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "[B")
	public static final byte[] aByteArray107 = new byte[520];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!iaa;)V")
	public static void method9077(@OriginalArg(1) Class6_Sub26 arg0) {
		Static104.aClass362_10.method8536(arg0);
		arg0.anInt3955 = arg0.aClass6_Sub23_Sub1_2.anInt9901;
		arg0.aClass6_Sub23_Sub1_2.anInt9901 = 0;
		Static630.anInt6215 += arg0.anInt3955;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!oc;II)J")
	public static long method9087(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class308 local19 = Static411.aClass88_3.method2024(arg1.method8469());
		@Pc(40) long local40 = (long) (arg2 | 0x40000000 | arg0 << 7 | arg1.method8473() << 14 | arg1.method8472() << 20);
		if (local19.anInt8580 == 0) {
			local40 |= local12;
		}
		if (local19.anInt8586 == 1) {
			local40 |= local10;
		}
		return local40 | (long) arg1.method8469() << 32;
	}
}
