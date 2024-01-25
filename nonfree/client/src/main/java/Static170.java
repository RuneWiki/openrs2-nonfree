import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array2;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public static int anInt3067;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!of;")
	public static final Class188 aClass188_31 = new Class188(4);

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
	public static final byte[] aByteArray40 = new byte[520];

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public static int anInt3068 = 64;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!hw;I)V")
	public static void method2520(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method6174();
		Static300.aClass184Array1 = new Class184[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static300.aClass184Array1[local14] = new Class184();
			Static300.aClass184Array1[local14].anInt5127 = arg0.method6174();
			Static300.aClass184Array1[local14].aString42 = arg0.method6156();
		}
		Static418.anInt7172 = arg0.method6174();
		Static162.anInt2915 = arg0.method6174();
		Static220.anInt3718 = arg0.method6174();
		Static148.aClass65_Sub1Array2 = new Class65_Sub1[Static162.anInt2915 + 1 - Static418.anInt7172];
		for (@Pc(70) int local70 = 0; local70 < Static220.anInt3718; local70++) {
			@Pc(76) int local76 = arg0.method6174();
			@Pc(84) Class65_Sub1 local84 = Static148.aClass65_Sub1Array2[local76] = new Class65_Sub1();
			local84.anInt1472 = arg0.method6138();
			local84.anInt1477 = arg0.method6129();
			local84.anInt1486 = Static418.anInt7172 + local76;
			local84.aString11 = arg0.method6156();
			local84.aString10 = arg0.method6156();
		}
		Static305.anInt166 = arg0.method6129();
		Static381.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	public static int method2521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
