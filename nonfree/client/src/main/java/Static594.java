import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!eq;")
	public static Class97 aClass97_144;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt9789;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray95 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public static int anInt9790 = -1;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Lclient!jp;")
	public static Class2_Sub5_Sub10 method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub5_Sub10 local15 = (Class2_Sub5_Sub10) Static250.aClass222_32.method5468((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class2_Sub5_Sub10(arg1, arg0);
			Static250.aClass222_32.method5476(local15, local15.aLong287);
		}
		return local15;
	}
}
