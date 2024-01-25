import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "Lclient!uq;")
	public static Class362 aClass362_112;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
	public static int anInt8276;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	public static int anInt8267 = 0;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_130 = new Class171(100, -2);

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)I")
	public static int method6795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(21) int local21 = 128 - arg2;
		@Pc(35) int local35 = arg2 * (arg0 & 0x7F) + local21 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = local21 * (arg1 & 0x380) + (arg0 & 0x380) * arg2 >> 7;
		@Pc(64) int local64 = arg2 * (arg0 & 0xFC00) + local21 * (arg1 & 0xFC00) >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local35 & 0x7F;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V")
	public static void method6797() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static185.aBooleanArray13[local3] = false;
		}
		Static451.anInt7263 = 5;
		Static6.anInt85 = Static655.anInt10676;
		Static614.anInt10208 = -1;
		Static180.anInt3305 = Static564.anInt9117;
		Static131.anInt2538 = 0;
		Static595.anInt9608 = Static40.anInt856;
		Static481.anInt10578 = Static122.anInt2190;
		Static468.anInt7425 = -1;
		Static351.anInt6038 = -1;
		Static405.anInt6667 = -1;
		Static202.anInt3565 = Static370.anInt6266;
		Static528.anInt8313 = 0;
		Static632.anInt10466 = Static166.anInt3034;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	public static void method6799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) 0, 15);
		local9.method8832();
		local9.anInt10756 = arg1;
		local9.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ka;IIII)Lclient!ln;")
	public static Class214 method6802(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == null ? null : new Class214(arg2, arg3, arg1, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method6804() {
		for (@Pc(6) Class34_Sub4 local6 = (Class34_Sub4) Static122.aClass317_2.method6895(); local6 != null; local6 = (Class34_Sub4) Static122.aClass317_2.method6895()) {
			Static285.method4144(local6);
		}
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 1) {
			local32 = 0;
			local34 = 3;
		} else {
			local34 = Static566.anInt9142;
			local32 = Static566.anInt9142;
		}
		Static86.method1369();
		for (@Pc(43) int local43 = local32; local43 <= local34; local43++) {
			Static86.method1378();
			Static86.method1373(local43);
			Static86.method1370(local43);
		}
		Static86.method1377();
		Static86.method1376();
	}
}
