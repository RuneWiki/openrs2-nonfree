import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array4;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array4;

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Lclient!qc;")
	public static Class90 aClass90_13 = new Class90(16);

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "Lclient!oj;")
	public static Class84 aClass84_24 = new Class84(64);

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
	public static int anInt2937 = -1;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lclient!qc;")
	public static Class90 aClass90_14 = new Class90(512);

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
	public static int anInt2938 = 0;

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lclient!qc;")
	public static Class90 aClass90_15 = new Class90(4096);

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method2380() {
		Static203.aClass1_Sub12_Sub3_2.method2626();
		Static218.aClass86_68 = null;
		Static19.anInt400 = 1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wb;B)V")
	public static void method2381(@OriginalArg(0) Class1_Sub29 arg0) {
		Static63.method973(arg0, 200000);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[Lclient!sf;I)V")
	public static void method2383(@OriginalArg(1) int arg0, @OriginalArg(2) Class106[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(23) int local23 = arg0 + 1;
		@Pc(27) Class106 local27 = arg1[local19];
		@Pc(31) int local31 = arg2 - 1;
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local27;
		while (local23 > local31) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(65) int local65;
			@Pc(60) int local60;
			do {
				local23--;
				for (local48 = 0; local48 < 4; local48++) {
					if (Static221.anIntArray497[local48] == 2) {
						local60 = local27.anInt3930;
						local65 = arg1[local23].anInt3930;
					} else if (Static221.anIntArray497[local48] == 1) {
						local60 = local27.anInt3932;
						if (local60 == -1 && Static175.anIntArray396[local48] == 1) {
							local60 = 2001;
						}
						local65 = arg1[local23].anInt3932;
						if (local65 == -1 && Static175.anIntArray396[local48] == 1) {
							local65 = 2001;
						}
					} else if (Static221.anIntArray497[local48] == 3) {
						local60 = local27.aBoolean184 ? 1 : 0;
						local65 = arg1[local23].aBoolean184 ? 1 : 0;
					} else {
						local65 = arg1[local23].anInt3934;
						local60 = local27.anInt3934;
					}
					if (local60 != local65) {
						if ((Static175.anIntArray396[local48] != 1 || local65 <= local60) && (Static175.anIntArray396[local48] != 0 || local65 >= local60)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local31++;
				for (local48 = 0; local48 < 4; local48++) {
					if (Static221.anIntArray497[local48] == 2) {
						local60 = local27.anInt3930;
						local65 = arg1[local31].anInt3930;
					} else if (Static221.anIntArray497[local48] == 1) {
						local65 = arg1[local31].anInt3932;
						local60 = local27.anInt3932;
						if (local60 == -1 && Static175.anIntArray396[local48] == 1) {
							local60 = 2001;
						}
						if (local65 == -1 && Static175.anIntArray396[local48] == 1) {
							local65 = 2001;
						}
					} else if (Static221.anIntArray497[local48] == 3) {
						local60 = local27.aBoolean184 ? 1 : 0;
						local65 = arg1[local31].aBoolean184 ? 1 : 0;
					} else {
						local65 = arg1[local31].anInt3934;
						local60 = local27.anInt3934;
					}
					if (local65 != local60) {
						if ((Static175.anIntArray396[local48] != 1 || local65 >= local60) && (Static175.anIntArray396[local48] != 0 || local65 <= local60)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local23 > local31) {
				@Pc(334) Class106 local334 = arg1[local31];
				arg1[local31] = arg1[local23];
				arg1[local23] = local334;
			}
		}
		method2383(local23, arg1, arg2);
		method2383(arg0, arg1, local23 + 1);
	}
}
