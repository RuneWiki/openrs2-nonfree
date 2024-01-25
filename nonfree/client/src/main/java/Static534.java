import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
	public static int anInt552;

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_3 = new Class361(7, 2);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!pda;)I")
	public static int method549(@OriginalArg(1) Class5_Sub5_Sub18 arg0) {
		@Pc(7) String local7 = Static223.method3186(arg0);
		return Static594.aClass224_12.method5250(local7, Static494.aClass134Array13);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public static void method550() {
		Static60.aClass57_1.L(Static141.anInt4797, Static637.aClass5_Sub20_31.aClass24_Sub22_1.method6758() == 1 ? Static432.anInt7421 + 256 << 2 : -1, 0);
	}
}
