import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cm", name = "S", descriptor = "Lclient!vh;")
	public static Class250 aClass250_12;

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
	public static int anInt1111 = -60;

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_38 = new Class131(40, -1);

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_14 = new Class237(68, 16);

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_15 = new Class237(18, 5);

	@OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
	public static int anInt1123 = -1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method964(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 3);
		local8.method202();
		local8.aString1 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
	public static void method965() {
		@Pc(12) Class1_Sub27 local12 = (Class1_Sub27) Static384.aClass266_45.method6000();
		@Pc(23) boolean local23 = Static442.aClass219_14 != null || Static90.anInt1740 > 0;
		if (local23) {
			Static208.anInt3847 = 1;
		}
		if (Static40.aBoolean27 && Static102.aClass163_1.method3809(81) && Static82.anInt1627 > 2) {
			if (local23) {
				Static52.aClass1_Sub8_1 = (Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262.aClass1_262;
			} else {
				Static351.method4853((Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262.aClass1_262, local12.method4581(), local12.method4582());
			}
		} else if (local23) {
			Static52.aClass1_Sub8_1 = (Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262;
		} else {
			Static351.method4853((Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262, local12.method4581(), local12.method4582());
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZB)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) Class1_Sub45 local14 = Static193.method906(arg1, arg0);
		if (local14 != null) {
			local14.method6071();
		}
	}
}
