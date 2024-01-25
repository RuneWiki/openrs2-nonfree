import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	public static int anInt7677;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "[Lclient!ww;")
	public static Class367[] aClass367Array4 = new Class367[50];

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "[I")
	public static final int[] anIntArray439 = new int[5];

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
	public static int anInt7669 = 0;

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_125 = new Class287(51, -1);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Lclient!uf;")
	public static Class3_Sub7_Sub19 method5992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub7_Sub19 local15 = (Class3_Sub7_Sub19) Static250.aClass297_20.method6531((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class3_Sub7_Sub19(arg0, arg1);
			Static250.aClass297_20.method6537(local15.aLong262, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!pba;BI)V")
	public static void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray512[0];
		@Pc(15) int local15 = arg1.anIntArray513[0];
		if (local10 < 0 || local10 >= Static345.anInt6228 || local15 < 0 || local15 >= Static535.anInt9341 || (arg0 < 0 || Static345.anInt6228 <= arg0 || arg2 < 0 || Static535.anInt9341 <= arg2)) {
			return;
		}
		@Pc(73) int local73 = Static544.method7464(0, -4, arg0, 0, Static499.anIntArray272, 0, Static187.aClass220Array1[arg1.aByte117], Static59.anIntArray44, local10, arg2, true, local15, arg1.method6668(), 0);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg1.method5679(Static499.anIntArray272[local85], (byte) 2, Static59.anIntArray44[local85]);
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method5998(@OriginalArg(0) int arg0) {
		Static158.anInt3573 = arg0;
		Static372.anInt6490 = -1;
		Static438.anInt4270 = 3;
		Static21.anInt211 = 100;
	}
}
