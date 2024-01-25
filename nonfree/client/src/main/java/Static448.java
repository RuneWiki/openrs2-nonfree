import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "Lclient!vba;")
	public static Class5_Sub3_Sub20 aClass5_Sub3_Sub20_4;

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "Lclient!iea;")
	public static final Class162 aClass162_5 = new Class162();

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!wm;Lclient!eka;Lclient!wm;ILclient!wm;Lclient!nr;)Z")
	public static boolean method6481(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class5_Sub17_Sub1 arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(4) Class390 arg3, @OriginalArg(5) Class255 arg4) {
		Static306.aClass390_78 = arg3;
		Static326.anIntArray343 = new int[16];
		Static43.aClass390_6 = arg2;
		Static174.aClass390_40 = arg0;
		Static386.aClass5_Sub17_Sub1_2 = arg1;
		Static327.aClass255_2 = arg4;
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			Static326.anIntArray343[local18] = 255;
		}
		return true;
	}
}
