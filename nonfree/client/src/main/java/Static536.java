import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!ma;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!eq;")
	public static Class97 aClass97_133;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array12;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	public static final int[] anIntArray624 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7483(@OriginalArg(0) Class87 arg0) {
		if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != Static376.anInt6732 && (Static440.aClass217ArrayArrayArray3 != null && Static517.method7258(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, arg0))) {
			Static376.anInt6732 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method7484() {
		Static177.aStringArray9 = new String[500];
		Static581.anInt9556 = Static240.aClass114_19.anInt3638 + Static240.aClass114_19.anInt3631 + 2;
		Static60.anInt1261 = Static305.aClass114_29.anInt3631 + Static305.aClass114_29.anInt3638 + 2;
		for (@Pc(25) int local25 = 0; local25 < Static177.aStringArray9.length; local25++) {
			Static177.aStringArray9[local25] = "";
		}
		Static576.method8008(Static628.aClass369_1.method8475(Static377.anInt6756));
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method7485(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg0[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg2 + arg1;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg1; local35 < local31; local35++) {
				@Pc(40) String local40 = arg0[local35];
				if (local40 == null) {
					local33 += 4;
				} else {
					local33 += local40.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local33);
			for (@Pc(69) int local69 = arg1; local69 < local31; local69++) {
				@Pc(74) String local74 = arg0[local69];
				if (local74 == null) {
					local62.append("null");
				} else {
					local62.append(local74);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)I")
	public static int method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class353.anIntArray682[arg3 * 8192 / arg1] >> 1;
		return ((65536 - local21) * arg0 >> 16) + (local21 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZII)V")
	public static void method7488(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static581.aClass222_41.method5468((long) arg2) != null) {
			return;
		}
		if (Static67.aBoolean116) {
			@Pc(24) Class2_Sub29 local24 = new Class2_Sub29(arg2, new Class52_Sub1(4096, Static312.aClass97_78, arg2), arg1, arg0);
			local24.aClass52_Sub1_1.method1231(Static390.aStringArray24[Static377.anInt6756]);
			Static581.aClass222_41.method5476(local24, (long) arg2);
		} else {
			Static171.method3176(arg0, arg2);
		}
	}
}
