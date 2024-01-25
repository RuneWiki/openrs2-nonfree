import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_6 = new Class275(7, 2);

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
	public static boolean aBoolean681 = false;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!gba;ILclient!bh;IIILclient!qca;Lclient!ha;)V")
	public static void method6695(@OriginalArg(1) Class3_Sub22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class269 arg6, @OriginalArg(8) Class33 arg7) {
		@Pc(18) int local18 = arg5 - arg4 / 2 - 5;
		@Pc(22) int local22 = arg3 + 2;
		if (arg6.anInt8141 != 0) {
			arg7.method6209(local22, arg4 + 10, arg3 + 1 - (-(arg1 * arg2.method732()) - -local22), local18, arg6.anInt8141);
		}
		if (arg6.anInt8142 != 0) {
			arg7.method6156(arg4 + 10, local18, arg3 + arg2.method732() * arg1 + 1 - local22, arg6.anInt8142, local22);
		}
		@Pc(80) int local80 = arg6.anInt8166;
		if (arg0.aBoolean356 && arg6.anInt8153 != -1) {
			local80 = arg6.anInt8153;
		}
		for (@Pc(92) int local92 = 0; local92 < arg1; local92++) {
			@Pc(98) String local98 = Static346.aStringArray28[local92];
			if (local92 < arg1 - 1) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg2.method730(arg7, local98, arg5, arg3, local80);
			arg3 += arg2.method732();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lclient!rl;")
	public static Class291 method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class291 local12 = new Class291();
		local12.anInt8721 = -1;
		local12.anInt8730 = arg1 + 6;
		local12.anInt8717 = arg0 + 1 + 5;
		local12.anInt8715 = -1;
		local12.anIntArrayArray89 = new int[local12.anInt8717][local12.anInt8730];
		local12.method7196();
		return local12;
	}
}
