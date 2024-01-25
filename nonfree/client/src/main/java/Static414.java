import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!os", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public static int anInt7096;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt7098;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_59 = new Class181(39, -1);

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[Lclient!la;")
	public static final Class200[] aClass200Array1 = new Class200[14];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIB)I")
	public static int method6319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ee;I)V")
	public static void method6320(@OriginalArg(0) Class5_Sub12 arg0) {
		if (arg0.aByteArray104.length - arg0.anInt10154 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method8645();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray104.length - arg0.anInt10154 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method8631();
		if (arg0.aByteArray104.length - arg0.anInt10154 < local46 * 6) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < local46; local60++) {
			@Pc(66) int local66 = arg0.method8631();
			@Pc(70) int local70 = arg0.method8623();
			if (Static605.anIntArray802.length > local66 && Static361.aBooleanArray42[local66] && (Static398.aClass312_1.method7415(local66).aChar1 != '1' || local70 >= -1 && local70 <= 1)) {
				Static605.anIntArray802[local66] = local70;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
	public static boolean method6321() {
		Static198.aBoolean292 = true;
		Static115.anInt1789++;
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(CI)Z")
	public static boolean method6322(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
