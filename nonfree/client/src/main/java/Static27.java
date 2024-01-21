import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!db", name = "tc", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!db", name = "pc", descriptor = "Lclient!eh;")
	public static Class28 aClass28_297 = Static170.method3101("headicons_hint");

	@OriginalMember(owner = "client!db", name = "sc", descriptor = "Lclient!eh;")
	public static Class28 aClass28_298 = Static170.method3101("(U4");

	@OriginalMember(owner = "client!db", name = "Bc", descriptor = "Lclient!eh;")
	public static Class28 aClass28_299 = Static170.method3101("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!db", name = "Ec", descriptor = "[Lclient!lc;")
	public static Class3_Sub2_Sub1_Sub4[] aClass3_Sub2_Sub1_Sub4Array1 = new Class3_Sub2_Sub1_Sub4[4];

	@OriginalMember(owner = "client!db", name = "Gc", descriptor = "[I")
	public static int[] anIntArray175 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)Lclient!gf;")
	public static Class33 method739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class33 local15 = Static19.method576(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass33Array2 == null || local15.aClass33Array2.length <= arg1) {
			return null;
		} else {
			return local15.aClass33Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(Z)V")
	public static void method740() {
		while (true) {
			@Pc(9) Class23 local9 = Static69.aClass23_8;
			@Pc(16) Class3_Sub22 local16;
			synchronized (Static69.aClass23_8) {
				local16 = (Class3_Sub22) Static104.aClass23_10.method855();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass7_Sub1_16.method1043((int) local16.aLong144, local16.aClass34_4, false, local16.aByteArray39);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method741() {
		aClass28_297 = null;
		aClass3_Sub2_Sub1_Sub4Array1 = null;
		aClass28_298 = null;
		aClass28_299 = null;
		anIntArray175 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public static void method743(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub15 local15 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg0);
		if (local15 != null) {
			for (@Pc(20) int local20 = 0; local20 < local15.anIntArray473.length; local20++) {
				local15.anIntArray473[local20] = -1;
				local15.anIntArray474[local20] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(III)V")
	public static void method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass35_1 = null;
		}
	}
}
