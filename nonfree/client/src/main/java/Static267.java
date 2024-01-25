import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Lclient!ii;")
	public static Class2_Sub1_Sub6 method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class2_Sub1_Sub6 local23 = (Class2_Sub1_Sub6) Static111.aClass220_8.method5099((long) arg1 << 32 | (long) arg0);
		if (local23 == null) {
			local23 = new Class2_Sub1_Sub6(arg1, arg0);
			Static111.aClass220_8.method5104(local23, local23.aLong401);
		}
		return local23;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3707(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static259.anInt4591; local19++) {
			if (arg0.equalsIgnoreCase(Static449.aStringArray67[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!mn;Lclient!za;)V")
	public static void method3708(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(10) Class190[] local10 = Static470.method4237(arg0, Static308.anInt5543);
		Static202.aClass41Array4 = new Class41[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static202.aClass41Array4[local16] = arg1.method5986(local10[local16]);
		}
		local10 = Static470.method4237(arg0, Static57.anInt1031);
		Static233.aClass41Array6 = new Class41[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static233.aClass41Array6[local47] = arg1.method5986(local10[local47]);
		}
		local10 = Static470.method4237(arg0, Static249.anInt4281);
		Static255.aClass41Array9 = new Class41[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static255.aClass41Array9[local78] = arg1.method5986(local10[local78]);
		}
		local10 = Static470.method4237(arg0, Static405.anInt7035);
		Static230.aClass41Array5 = new Class41[local10.length];
		for (@Pc(109) int local109 = 0; local109 < local10.length; local109++) {
			Static230.aClass41Array5[local109] = arg1.method5986(local10[local109]);
		}
		local10 = Static470.method4237(arg0, Static184.anInt3247);
		Static170.aClass41Array2 = new Class41[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static170.aClass41Array2[local136] = arg1.method5986(local10[local136]);
		}
		local10 = Static470.method4237(arg0, Static141.anInt7049);
		Static157.aClass41Array1 = new Class41[local10.length];
		for (@Pc(167) int local167 = 0; local167 < local10.length; local167++) {
			Static157.aClass41Array1[local167] = arg1.method5986(local10[local167]);
		}
		local10 = Static470.method4237(arg0, Static152.anInt2781);
		Static239.aClass41Array7 = new Class41[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static239.aClass41Array7[local194] = arg1.method5986(local10[local194]);
		}
		local10 = Static470.method4237(arg0, Static422.anInt3433);
		Static321.aClass41Array10 = new Class41[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static321.aClass41Array10[local221] = arg1.method5986(local10[local221]);
		}
		local10 = Static470.method4237(arg0, Static132.anInt2510);
		Static420.aClass41Array14 = new Class41[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static420.aClass41Array14[local252] = arg1.method5986(local10[local252]);
		}
		local10 = Static470.method4237(arg0, Static171.anInt5501);
		Static440.aClass41Array15 = new Class41[local10.length];
		for (@Pc(283) int local283 = 0; local283 < local10.length; local283++) {
			Static440.aClass41Array15[local283] = arg1.method5986(local10[local283]);
		}
		local10 = Static470.method4237(arg0, Static210.anInt3598);
		Static392.aClass41Array12 = new Class41[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static392.aClass41Array12[local310] = arg1.method5986(local10[local310]);
		}
		local10 = Static470.method4237(arg0, Static246.anInt4249);
		Static179.aClass41Array3 = new Class41[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static179.aClass41Array3[local337] = arg1.method5986(local10[local337]);
		}
		Static54.aClass41_2 = arg1.method5986(Static470.method4242(arg0, Static324.anInt5803, 0));
		Static446.aClass41_19 = arg1.method5986(Static470.method4242(arg0, Static184.anInt3248, 0));
		local10 = Static470.method4237(arg0, Static22.anInt422);
		Static417.aClass41Array13 = new Class41[local10.length];
		for (@Pc(384) int local384 = 0; local384 < local10.length; local384++) {
			Static417.aClass41Array13[local384] = arg1.method5986(local10[local384]);
		}
	}
}
