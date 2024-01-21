import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "Yc", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!ae", name = "Jc", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_36 = Static181.method2795("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!qe;")
	public static Class83 aClass83_25 = aClass83_36;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public static volatile int anInt107 = 0;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_27 = Static181.method2795("<img=1>");

	@OriginalMember(owner = "client!ae", name = "ec", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_32 = Static181.method2795("green:");

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_28 = aClass83_32;

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_30 = Static181.method2795(")1 ");

	@OriginalMember(owner = "client!ae", name = "rb", descriptor = "I")
	public static int anInt138 = 0;

	@OriginalMember(owner = "client!ae", name = "dc", descriptor = "I")
	public static int anInt161 = 0;

	@OriginalMember(owner = "client!ae", name = "nc", descriptor = "Lclient!qe;")
	public static Class83 aClass83_33 = aClass83_32;

	@OriginalMember(owner = "client!ae", name = "tc", descriptor = "I")
	public static int anInt166 = 1;

	@OriginalMember(owner = "client!ae", name = "Nc", descriptor = "I")
	public static int anInt175 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!b;IILclient!ee;)V")
	public static void method96(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2) {
		@Pc(11) Class2_Sub17 local11 = new Class2_Sub17();
		local11.aClass28_Sub1_17 = arg2;
		local11.aLong149 = arg1;
		local11.aClass8_3 = arg0;
		local11.anInt2536 = 1;
		@Pc(26) Class19 local26 = Static96.aClass19_11;
		synchronized (Static96.aClass19_11) {
			Static96.aClass19_11.method684(local11);
		}
		Static3.method65();
	}
}
