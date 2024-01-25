import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!za", name = "l", descriptor = "I")
	public static int anInt10895;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!cc;")
	public static final Class54 aClass54_4 = Static121.method2237();

	@OriginalMember(owner = "client!za", name = "o", descriptor = "I")
	public static int anInt10897 = -1;

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)V")
	public static void method9054() {
		@Pc(1) Class340 local1 = Static483.aClass340_45;
		synchronized (Static483.aClass340_45) {
			Static483.aClass340_45.method7996(5);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZI)V")
	public static void method9055(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(5, (long) arg0);
		local9.method7288();
	}
}
