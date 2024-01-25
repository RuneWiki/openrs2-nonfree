import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_43 = new Class376(70, -1);

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt3010 = -1;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
	public static final boolean aBoolean238 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
	public static int method2755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte local15;
		if (arg0 > 20000) {
			local15 = 4;
			Static650.method8525();
		} else if (arg0 > 10000) {
			Static627.method8276();
			local15 = 3;
		} else if (arg0 <= 5000) {
			local15 = 1;
			Static53.method1374();
		} else {
			Static638.method8379();
			local15 = 2;
		}
		if (arg1 != Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402()) {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, arg1);
			Static422.method6016(false, arg1);
		}
		Static57.method6341();
		return local15;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z")
	public static boolean method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;)V")
	public static void method2758(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static593.aBoolean703 = arg1;
		Static69.aString16 = arg2;
		Static33.aString9 = arg0;
		if (!Static593.aBoolean703 && (Static69.aString16.equals("") || Static33.aString9.equals(""))) {
			Static582.method7836(3);
			return;
		}
		if (Static490.anInt8296 != 1) {
			Static680.anInt10366 = -1;
			Static568.anInt9067 = 0;
		}
		Static5.aBoolean10 = false;
		Static582.method7836(-3);
		Static216.anInt3999 = 1;
		Static454.anInt7767 = 0;
		Static72.anInt1667 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!kka;Z)I")
	public static int method2759(@OriginalArg(0) Class3_Sub17_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method4905(2);
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else if (local15 == 1) {
			local19 = arg0.method4905(5);
		} else if (local15 == 2) {
			local19 = arg0.method4905(8);
		} else {
			local19 = arg0.method4905(11);
		}
		return local19;
	}
}
