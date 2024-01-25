import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	public static int anInt3975 = -1;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!tj;III)Lclient!ne;")
	public static Class4_Sub4_Sub11 method3608(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0.method5047(arg2, arg1));
		@Pc(56) Class4_Sub4_Sub11 local56 = new Class4_Sub4_Sub11(arg1, local14.method3446(), local14.method3446(), local14.method3418(), local14.method3418(), local14.method3440() == 1, local14.method3440(), local14.method3440());
		@Pc(60) int local60 = local14.method3440();
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			local56.aClass116_37.method3274(new Class4_Sub42(local14.method3440(), local14.method3401(), local14.method3401(), local14.method3401(), local14.method3401(), local14.method3401(), local14.method3401(), local14.method3401(), local14.method3401()));
		}
		local56.method3897();
		return local56;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)I")
	public static int method3609(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static208.method3879();
		for (@Pc(26) Class4_Sub13 local26 = arg0 ? (Class4_Sub13) Static108.aClass43_13.method1283() : (Class4_Sub13) Static108.aClass43_13.method1278(); local26 != null; local26 = (Class4_Sub13) Static108.aClass43_13.method1278()) {
			if (local8 > (local26.aLong45 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local26.aLong45 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local26.aLong223;
					Static328.anIntArray485[local50] = Static341.anIntArray9[local50];
					local26.method5687();
					return local50;
				}
				local26.method5687();
			}
		}
		return -1;
	}
}
