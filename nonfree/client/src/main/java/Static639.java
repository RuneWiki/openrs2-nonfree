import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vja", name = "B", descriptor = "I")
	public static int anInt10150 = 0;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IILclient!vq;)V")
	public static void method8891(@OriginalArg(1) int arg0, @OriginalArg(2) Class372 arg1) {
		if (Static199.anInt3915 >= 50 || (arg1 == null || arg1.anIntArrayArray65 == null || arg0 >= arg1.anIntArrayArray65.length || arg1.anIntArrayArray65[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray65[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray65[arg0].length > 1) {
			local65 = (int) (Math.random() * (double) arg1.anIntArrayArray65[arg0].length);
			if (local65 > 0) {
				local40 = arg1.anIntArrayArray65[arg0][local65];
			}
		}
		local65 = 256;
		if (arg1.anIntArray904 != null && arg1.anIntArray899 != null) {
			local65 = Static665.method9178(arg1.anIntArray904[arg0], arg1.anIntArray899[arg0]);
		}
		if (arg1.aBoolean773) {
			Static264.method4359(false, 0, local46, local40, 255, local65);
		} else {
			Static291.method4560(255, local40, 0, local46, local65);
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V")
	public static void method8892() {
		if (Static631.aClass13_17 != null) {
			Static631.aClass13_17.method8459();
			Static503.aClass69_10 = null;
			Static631.aClass13_17 = null;
		}
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(III)Z")
	public static boolean method8893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static53.method1175(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static631.method8808(arg0, arg1) | Static673.method9356(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static568.method8029(arg1, arg0) | Static127.method2387(arg1, arg0));
		} else {
			return false;
		}
	}
}
