import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_14 = new Class243(80, 2);

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt1158 = 104;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public static void method1117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static106.method1964(arg1)) {
			Static211.method6679(arg0, Static235.aClass310ArrayArray2[arg1]);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lba;)V")
	public static void method1118(@OriginalArg(0) Class1_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort127; local2 <= arg0.aShort125; local2++) {
			for (@Pc(6) int local6 = arg0.aShort128; local6 <= arg0.aShort126; local6++) {
				@Pc(16) Class262 local16 = Static399.aClass262ArrayArrayArray2[arg0.aByte90][local2][local6];
				if (local16 != null) {
					@Pc(21) Class187 local21 = local16.aClass187_3;
					@Pc(23) Class187 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass187_3 = local21.aClass187_1;
							} else {
								local23.aClass187_1 = local21.aClass187_1;
							}
							local21.method4694();
							break;
						}
						local23 = local21;
						local21 = local21.aClass187_1;
					}
					local16.aByte99 = 0;
					for (@Pc(56) Class187 local56 = local16.aClass187_3; local56 != null; local56 = local56.aClass187_1) {
						local16.aByte99 = (byte) (local16.aByte99 | local56.anInt5462);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method1120() {
		Static348.aClass127_35.method3204();
		Static391.aClass127_38.method3204();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B)[B")
	public static byte[] method1121(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static553.method3373(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)Z")
	public static boolean method1122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!wca;Lclient!qa;I)V")
	public static void method1123(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(35) boolean local35 = Static464.aClass115_1.method2977(arg1, arg0.anInt9224, arg0.anInt9153, arg0.anInt9169 | 0xFF000000, arg0.anInt9185, arg0.anInt9152, arg0.aBoolean660 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null) == null;
		if (local35) {
			Static435.aClass249_62.method6523(new Class2_Sub45(arg0.anInt9224, arg0.anInt9153, arg0.anInt9185, arg0.anInt9169 | 0xFF000000, arg0.anInt9152, arg0.aBoolean660));
			Static273.method4342(arg0);
		}
	}
}
