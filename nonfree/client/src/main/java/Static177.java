import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "Lclient!ul;")
	public static Class246 aClass246_107;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "Lclient!ya;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_81 = new Class7("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_82 = new Class7("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Lclient!su;")
	public static final Class227 aClass227_2 = new Class227();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)B")
	public static byte method2836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!kk;ZI)V")
	public static void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class21 local9 = arg2.method5982();
		@Pc(19) int local19 = arg2.anInt7319 - arg2.aClass98_7.anInt2738 & 0x3FFF;
		if (arg3 == -1) {
			if (local19 != 0 || arg2.anInt7328 > 25) {
				if (arg0 < 0 && local9.anInt614 != -1) {
					arg2.anInt7338 = local9.anInt614;
				} else if (arg0 <= 0 || local9.anInt595 == -1) {
					arg2.anInt7338 = local9.anInt619;
				} else {
					arg2.anInt7338 = local9.anInt595;
				}
				arg2.aBoolean505 = false;
			} else if (!arg2.aBoolean505 || !local9.method574(arg2.anInt7338)) {
				arg2.anInt7338 = local9.method573();
				arg2.aBoolean505 = arg2.anInt7338 != -1;
			}
		} else if (arg2.anInt7372 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(201) int local201 = Static7.anIntArray17[arg1] - arg2.aClass98_7.anInt2738 & 0x3FFF;
			arg2.aBoolean505 = false;
			if (arg3 == 2 && local9.anInt620 != -1) {
				if (local201 > 2048 && local201 <= 6144 && local9.anInt629 != -1) {
					arg2.anInt7338 = local9.anInt629;
				} else if (local201 >= 10240 && local201 < 14336 && local9.anInt609 != -1) {
					arg2.anInt7338 = local9.anInt609;
				} else if (local201 <= 6144 || local201 >= 10240 || local9.anInt628 == -1) {
					arg2.anInt7338 = local9.anInt620;
				} else {
					arg2.anInt7338 = local9.anInt628;
				}
			} else if (arg3 == 0 && local9.anInt611 != -1) {
				if (local201 > 2048 && local201 <= 6144 && local9.anInt607 != -1) {
					arg2.anInt7338 = local9.anInt607;
				} else if (local201 >= 10240 && local201 < 14336 && local9.anInt599 != -1) {
					arg2.anInt7338 = local9.anInt599;
				} else if (local201 <= 6144 || local201 >= 10240 || local9.anInt603 == -1) {
					arg2.anInt7338 = local9.anInt611;
				} else {
					arg2.anInt7338 = local9.anInt603;
				}
			} else if (local201 > 2048 && local201 <= 6144 && local9.anInt621 != -1) {
				arg2.anInt7338 = local9.anInt621;
			} else if (local201 >= 10240 && local201 < 14336 && local9.anInt631 != -1) {
				arg2.anInt7338 = local9.anInt631;
			} else if (local201 <= 6144 || local201 >= 10240 || local9.anInt594 == -1) {
				arg2.anInt7338 = local9.anInt619;
			} else {
				arg2.anInt7338 = local9.anInt594;
			}
		} else if (local19 == 0 && arg2.anInt7328 <= 25) {
			arg2.aBoolean505 = false;
			if (arg3 == 2 && local9.anInt620 != -1) {
				arg2.anInt7338 = local9.anInt620;
			} else if (arg3 == 0 && local9.anInt611 != -1) {
				arg2.anInt7338 = local9.anInt611;
			} else {
				arg2.anInt7338 = local9.anInt619;
			}
		} else {
			arg2.aBoolean505 = false;
			if (arg3 == 2 && local9.anInt620 != -1) {
				if (arg0 < 0 && local9.anInt622 != -1) {
					arg2.anInt7338 = local9.anInt622;
				} else if (arg0 <= 0 || local9.anInt639 == -1) {
					arg2.anInt7338 = local9.anInt620;
				} else {
					arg2.anInt7338 = local9.anInt639;
				}
			} else if (arg3 == 0 && local9.anInt611 != -1) {
				if (arg0 < 0 && local9.anInt616 != -1) {
					arg2.anInt7338 = local9.anInt616;
				} else if (arg0 <= 0 || local9.anInt612 == -1) {
					arg2.anInt7338 = local9.anInt611;
				} else {
					arg2.anInt7338 = local9.anInt612;
				}
			} else if (arg0 < 0 && local9.anInt632 != -1) {
				arg2.anInt7338 = local9.anInt632;
			} else if (arg0 <= 0 || local9.anInt606 == -1) {
				arg2.anInt7338 = local9.anInt619;
			} else {
				arg2.anInt7338 = local9.anInt606;
			}
		}
	}
}
