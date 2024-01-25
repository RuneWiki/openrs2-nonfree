import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[S")
	public static short[] aShortArray53;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public static int anInt3121 = 13156520;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_9 = new Class101("", 12);

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "J")
	public static long aLong105 = 0L;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_52 = new Class11(32, 3);

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_18 = new Class30();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!id;IIILclient!ir;ILclient!vc;Lclient!we;)V")
	public static void method2877(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class110 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5, @OriginalArg(7) Class243 arg6) {
		@Pc(15) int local15 = arg0.anInt2804 - arg4 / 2 - 5;
		@Pc(19) int local19 = arg2 + 2;
		if (arg6.anInt6358 != 0) {
			arg5.method1951(local19, arg1 * arg3.method2791() + arg2 + 1 - local19, arg4 + 10, arg6.anInt6358, local15);
		}
		if (arg6.anInt6353 != 0) {
			arg5.method2027(arg4 + 10, -local19 + arg3.method2791() * arg1 + (arg2 - -1), local15, arg6.anInt6353, local19);
		}
		@Pc(73) int local73 = arg6.anInt6373;
		if (arg0.aBoolean210 && arg6.anInt6372 != -1) {
			local73 = arg6.anInt6372;
		}
		for (@Pc(86) int local86 = 0; local86 < arg1; local86++) {
			@Pc(92) String local92 = Static203.aStringArray95[local86];
			if (arg1 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg3.method2793(arg5, local92, arg0.anInt2804, arg2, local73);
			arg2 += arg3.method2791();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	public static void method2879() {
		@Pc(7) Class154[] local7 = Class59.aClass154Array1;
		synchronized (Class59.aClass154Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class59.aClass154Array1.length; local11++) {
				Class59.aClass154Array1[local11] = new Class154();
				Static207.anIntArray970[local11] = 0;
			}
		}
	}
}
