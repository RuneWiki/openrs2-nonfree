import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "I")
	public static int anInt9125;

	@OriginalMember(owner = "client!rfa", name = "I", descriptor = "Lclient!vt;")
	public static final Class381 aClass381_5 = new Class381();

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)Lclient!vi;")
	public static Class2_Sub52 method7980() {
		return Static468.anInt8411 == 0 ? new Class2_Sub52() : Static7.aClass2_Sub52Array1[--Static468.anInt8411];
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!nfa;)V")
	public static void method7981(@OriginalArg(0) Class15_Sub3 arg0) {
		Static64.aClass101_1.H(arg0.anInt11022, arg0.anInt11029 + (arg0.method9430() >> 1), arg0.anInt11024, Static396.anIntArray349);
		arg0.anInt11025 = Static396.anIntArray349[0];
		arg0.anInt11027 = Static396.anIntArray349[1];
		arg0.anInt11023 = Static396.anIntArray349[2];
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[Lclient!mq;)V")
	public static void method7982(@OriginalArg(1) Class71[] arg0) {
		Static40.anInt824 = arg0.length;
		Static277.anIntArray597 = new int[Static40.anInt824 + 10];
		Static251.aClass71Array25 = new Class71[Static40.anInt824 + 10];
		Static679.method4131(arg0, 0, Static251.aClass71Array25, 0, Static40.anInt824);
		for (@Pc(26) int local26 = 0; local26 < Static40.anInt824; local26++) {
			Static277.anIntArray597[local26] = Static251.aClass71Array25[local26].method7711();
		}
		for (@Pc(41) int local41 = Static40.anInt824; local41 < Static251.aClass71Array25.length; local41++) {
			Static277.anIntArray597[local41] = 12;
		}
	}
}
