import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIILclient!ns;)V")
	public static void method7888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub1_Sub3 arg3) {
		@Pc(14) Class389 local14 = arg3.method4317();
		@Pc(23) int local23 = arg3.anInt5092 - arg3.lb.anInt10072 & 0x3FFF;
		if (arg0 == -1) {
			if (local23 != 0 || arg3.anInt5079 > 25) {
				if (arg1 < 0 && local14.anInt10699 != -1) {
					arg3.anInt5112 = local14.anInt10699;
					arg3.aBoolean331 = false;
				} else if (arg1 <= 0 || local14.anInt10719 == -1) {
					arg3.anInt5112 = local14.anInt10731;
				} else {
					arg3.anInt5112 = local14.anInt10719;
				}
				arg3.aBoolean331 = false;
			} else if (!arg3.aBoolean331 || !local14.method9073(arg3.anInt5112)) {
				arg3.anInt5112 = local14.method9070();
				arg3.aBoolean331 = arg3.anInt5112 != -1;
			}
		} else if (arg3.anInt5066 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(49) int local49 = Static411.anIntArray441[arg2] - arg3.lb.anInt10072 & 0x3FFF;
			arg3.aBoolean331 = false;
			if (arg0 == 2 && local14.anInt10709 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local14.anInt10714 != -1) {
					arg3.anInt5112 = local14.anInt10714;
				} else if (local49 >= 10240 && local49 < 14336 && local14.anInt10688 != -1) {
					arg3.anInt5112 = local14.anInt10688;
				} else if (local49 <= 6144 || local49 >= 10240 || local14.anInt10722 == -1) {
					arg3.anInt5112 = local14.anInt10709;
				} else {
					arg3.anInt5112 = local14.anInt10722;
				}
			} else if (arg0 == 0 && local14.anInt10710 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local14.anInt10730 != -1) {
					arg3.anInt5112 = local14.anInt10730;
				} else if (local49 >= 10240 && local49 < 14336 && local14.anInt10723 != -1) {
					arg3.anInt5112 = local14.anInt10723;
				} else if (local49 <= 6144 || local49 >= 10240 || local14.anInt10697 == -1) {
					arg3.anInt5112 = local14.anInt10710;
				} else {
					arg3.anInt5112 = local14.anInt10697;
				}
			} else if (local49 > 2048 && local49 <= 6144 && local14.anInt10706 != -1) {
				arg3.anInt5112 = local14.anInt10706;
			} else if (local49 >= 10240 && local49 < 14336 && local14.anInt10698 != -1) {
				arg3.anInt5112 = local14.anInt10698;
			} else if (local49 <= 6144 || local49 >= 10240 || local14.anInt10715 == -1) {
				arg3.anInt5112 = local14.anInt10731;
			} else {
				arg3.anInt5112 = local14.anInt10715;
			}
		} else if (local23 == 0 && arg3.anInt5079 <= 25) {
			arg3.aBoolean331 = false;
			if (arg0 == 2 && local14.anInt10709 != -1) {
				arg3.anInt5112 = local14.anInt10709;
			} else if (arg0 == 0 && local14.anInt10710 != -1) {
				arg3.anInt5112 = local14.anInt10710;
			} else {
				arg3.anInt5112 = local14.anInt10731;
			}
		} else {
			if (arg0 == 2 && local14.anInt10709 != -1) {
				if (arg1 < 0 && local14.anInt10718 != -1) {
					arg3.anInt5112 = local14.anInt10718;
				} else if (arg1 <= 0 || local14.anInt10708 == -1) {
					arg3.anInt5112 = local14.anInt10709;
				} else {
					arg3.anInt5112 = local14.anInt10708;
				}
			} else if (arg0 == 0 && local14.anInt10710 != -1) {
				if (arg1 < 0 && local14.anInt10733 != -1) {
					arg3.anInt5112 = local14.anInt10733;
				} else if (arg1 <= 0 || local14.anInt10712 == -1) {
					arg3.anInt5112 = local14.anInt10710;
				} else {
					arg3.anInt5112 = local14.anInt10712;
				}
			} else if (arg1 < 0 && local14.anInt10692 != -1) {
				arg3.anInt5112 = local14.anInt10692;
			} else if (arg1 <= 0 || local14.anInt10728 == -1) {
				arg3.anInt5112 = local14.anInt10731;
			} else {
				arg3.anInt5112 = local14.anInt10728;
			}
			arg3.aBoolean331 = false;
		}
	}
}
