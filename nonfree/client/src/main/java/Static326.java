import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_161 = new Class160(86, 5);

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public static void method5100(@OriginalArg(0) int arg0) {
		Static19.anInt249 = -1;
		Static97.anInt1683 = arg0;
		Static644.anInt10590 = -1;
		Static23.method331();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([Lclient!fia;I)V")
	public static void method5101(@OriginalArg(0) Class45[] arg0) {
		Static365.anInt6219 = arg0.length;
		Static399.aClass45Array24 = new Class45[Static365.anInt6219 + 10];
		Static16.anIntArray22 = new int[Static365.anInt6219 + 10];
		Static691.method86(arg0, 0, Static399.aClass45Array24, 0, Static365.anInt6219);
		for (@Pc(31) int local31 = 0; local31 < Static365.anInt6219; local31++) {
			Static16.anIntArray22[local31] = Static399.aClass45Array24[local31].method7504();
		}
		for (@Pc(49) int local49 = Static365.anInt6219; local49 < Static399.aClass45Array24.length; local49++) {
			Static16.anIntArray22[local49] = 12;
		}
	}
}
