import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_10;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_548 = Static38.method736("Offline");

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt991 = 127;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZILclient!wc;)V")
	public static void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub1_Sub18 arg3) {
		if (Static57.anInt1480 >= 50 || anInt991 == 0 || (arg3.anIntArray293 == null || arg2 >= arg3.anIntArray293.length)) {
			return;
		}
		@Pc(29) int local29 = arg3.anIntArray293[arg2];
		if (local29 == 0) {
			return;
		}
		@Pc(41) int local41 = local29 >> 4 & 0x7;
		@Pc(45) int local45 = local29 >> 8;
		Static30.anIntArray100[Static57.anInt1480] = local45;
		@Pc(55) int local55 = (arg0 - 64) / 128;
		Static107.anIntArray270[Static57.anInt1480] = local41;
		@Pc(74) int local74 = (arg1 - 64) / 128;
		@Pc(78) int local78 = local29 & 0xF;
		Static32.anIntArray105[Static57.anInt1480] = 0;
		Static86.aClass50Array10[Static57.anInt1480] = null;
		Static70.anIntArray215[Static57.anInt1480] = (local74 << 8) + (local55 << 16) + local78;
		Static57.anInt1480++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method717() {
		aClass5_Sub1_Sub10_Sub1_10 = null;
		aClass71_548 = null;
	}
}
