import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
	public static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_12 = new Class44(15, 3);

	@OriginalMember(owner = "client!au", name = "s", descriptor = "I")
	public static int anInt462 = 104;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "S")
	public static short aShort4 = 256;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)V")
	public static void method486(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static563.anInt9769 != -1) {
				Static544.method7681(Static563.anInt9769);
			}
			for (@Pc(18) Class14_Sub32 local18 = (Class14_Sub32) Static547.aClass187_69.method4079(); local18 != null; local18 = (Class14_Sub32) Static547.aClass187_69.method4084()) {
				if (!local18.method9314()) {
					local18 = (Class14_Sub32) Static547.aClass187_69.method4079();
					if (local18 == null) {
						break;
					}
				}
				Static446.method6502(local18, true, false);
			}
			Static563.anInt9769 = -1;
			Static547.aClass187_69 = new Class187(8);
			Static160.method2609();
			Static563.anInt9769 = Static546.anInt9319;
			Static552.method7778(false);
			Static31.method720();
			Static632.method8837(Static563.anInt9769);
		}
		Static47.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIB)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static507.anInt8961 != 0) {
			if (arg1 < 0) {
				for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
					Static76.anIntArray127[local24] = arg0;
				}
			} else {
				Static76.anIntArray127[arg1] = arg0;
			}
		}
		Static558.aClass14_Sub5_Sub2_2.method3894(arg1, arg0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!ha;ILclient!mea;I)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(3) Class230 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 63; local15 >= 0; local15--) {
			@Pc(33) int local33 = (local15 & 0x3F) << 10 | 0x380 | 0x3F;
			Static479.method7114(true, false);
			@Pc(41) int local41 = Static659.anIntArray816[local33];
			Static349.method5327(true, false);
			arg1.aa(arg0, arg3 + ((63 - local15) * arg2.anInt6701 >> 6), arg2.anInt6703, (arg2.anInt6701 >> 6) + 1, local41, 0);
		}
	}
}
