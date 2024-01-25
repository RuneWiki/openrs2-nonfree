import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_47 = new Class305(82, 3);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZ)Z")
	public static boolean method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static37.aBoolean43 || !Static521.aBoolean738) {
			return false;
		} else if (Static383.anInt6814 < 100) {
			return false;
		} else if (Static380.method5646(arg0, arg3, arg1)) {
			@Pc(26) int local26 = arg3 << Static588.anInt9672;
			@Pc(30) int local30 = arg1 << Static588.anInt9672;
			if (Static421.method6265(arg2, Static671.anInt10769, local26, local30, Static495.aClass109Array4[arg0].method7695(arg1, arg3), Static671.anInt10769)) {
				Static291.anInt9486++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oq;Ljava/awt/Frame;I)V")
	public static void method4926(@OriginalArg(0) Class268 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(9) Class331 local9 = arg0.method6333(arg1);
			while (local9.anInt9108 == 0) {
				Static579.method8004(10L);
			}
			if (local9.anInt9108 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static579.method8004(100L);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIB)Z")
	public static boolean method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZIII)V")
	public static void method4929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static106.anInt2266 <= arg1 && arg1 <= Static669.anInt10712) {
			@Pc(23) int local23 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg2);
			@Pc(29) int local29 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg3);
			Static275.method4483(arg0, arg1, local29, local23);
		}
	}
}
