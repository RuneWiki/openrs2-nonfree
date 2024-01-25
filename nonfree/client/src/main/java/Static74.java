import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
	public static int anInt1906;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_25 = new Class90(74, 12);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!vo;ZLclient!r;)V")
	public static void method1584(@OriginalArg(0) Class348 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(10) Class103[] local10 = Static598.method2456(arg0, Static411.anInt7971);
		Static161.aClass88Array3 = new Class88[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static161.aClass88Array3[local16] = arg1.method7808(local10[local16], true);
		}
		local10 = Static598.method2456(arg0, Static534.anInt9773);
		Static224.aClass88Array5 = new Class88[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static224.aClass88Array5[local43] = arg1.method7808(local10[local43], true);
		}
		local10 = Static598.method2456(arg0, Static448.anInt9591);
		Static356.aClass88Array8 = new Class88[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static356.aClass88Array8[local74] = arg1.method7808(local10[local74], true);
		}
		local10 = Static598.method2456(arg0, Static448.anInt9592);
		Static460.aClass88Array11 = new Class88[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static460.aClass88Array11[local101] = arg1.method7808(local10[local101], true);
		}
		local10 = Static598.method2456(arg0, Static87.anInt2291);
		Static488.aClass88Array13 = new Class88[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static488.aClass88Array13[local132] = arg1.method7808(local10[local132], true);
		}
		local10 = Static598.method2456(arg0, Static327.anInt8399);
		Static50.aClass88Array1 = new Class88[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static50.aClass88Array1[local159] = arg1.method7808(local10[local159], true);
		}
		local10 = Static598.method2456(arg0, Static423.anInt8144);
		Static191.aClass88Array4 = new Class88[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static191.aClass88Array4[local190] = arg1.method7808(local10[local190], true);
		}
		local10 = Static598.method2456(arg0, Static21.anInt959);
		Static334.aClass88Array7 = new Class88[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static334.aClass88Array7[local221] = arg1.method7808(local10[local221], true);
		}
		local10 = Static598.method2456(arg0, Static506.anInt9463);
		Static154.aClass88Array2 = new Class88[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static154.aClass88Array2[local252] = arg1.method7808(local10[local252], true);
		}
		local10 = Static598.method2456(arg0, Static386.anInt7581);
		Static478.aClass88Array12 = new Class88[local10.length];
		for (@Pc(283) int local283 = 0; local283 < local10.length; local283++) {
			Static478.aClass88Array12[local283] = arg1.method7808(local10[local283], true);
		}
		local10 = Static598.method2456(arg0, Static587.anInt10510);
		Static423.aClass88Array10 = new Class88[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static423.aClass88Array10[local310] = arg1.method7808(local10[local310], true);
		}
		local10 = Static598.method2456(arg0, Static523.anInt9611);
		Static571.aClass88Array15 = new Class88[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static571.aClass88Array15[local337] = arg1.method7808(local10[local337], true);
		}
		Static595.aClass88_39 = arg1.method7808(Static598.method2462(arg0, Static37.anInt1235, 0), true);
		Static575.aClass88_37 = arg1.method7808(Static598.method2462(arg0, Static101.anInt2437, 0), true);
		local10 = Static598.method2456(arg0, Static55.anInt1464);
		Static537.aClass88Array14 = new Class88[local10.length];
		for (@Pc(380) int local380 = 0; local380 < local10.length; local380++) {
			Static537.aClass88Array14[local380] = arg1.method7808(local10[local380], true);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static494.method7140(arg0, arg1) || Static276.method4454(arg0, arg1);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BII)Z")
	public static boolean method1591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static186.method3074(arg1, arg0) | (arg0 & 0x70000) != 0 || Static232.method3760(arg1, arg0);
	}
}
