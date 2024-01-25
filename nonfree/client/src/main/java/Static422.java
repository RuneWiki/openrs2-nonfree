import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qfa", name = "bb", descriptor = "I")
	public static int anInt7485;

	@OriginalMember(owner = "client!qfa", name = "db", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_94 = new Class316(40, 8);

	@OriginalMember(owner = "client!qfa", name = "fb", descriptor = "Lclient!iv;")
	public static final Class150 aClass150_7 = new Class150();

	@OriginalMember(owner = "client!qfa", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
	public static boolean method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static165.method2642(arg0, arg1) | (arg0 & 0x70000) != 0 || Static404.method5832(arg0, arg1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(JI)V")
	public static void method5976(@OriginalArg(0) long arg0) {
		if (Static113.aClass133ArrayArrayArray1 != null) {
			if (Static60.anInt1008 == 1 || Static60.anInt1008 == 5) {
				Static358.method5361(arg0);
			} else if (Static60.anInt1008 == 4) {
				Static558.method7764(arg0);
			}
		}
		Static314.method4915(Static554.aClass90_12, (long) Static363.anInt6671);
		if (Static152.anInt1936 != -1) {
			Static473.method6556(Static152.anInt1936);
		}
		for (@Pc(40) int local40 = 0; local40 < Static97.anInt1562; local40++) {
			if (Static543.aBooleanArray30[local40]) {
				Static366.aBooleanArray23[local40] = true;
			}
			Static100.aBooleanArray7[local40] = Static543.aBooleanArray30[local40];
			Static543.aBooleanArray30[local40] = false;
		}
		Static54.anInt963 = Static363.anInt6671;
		if (Static554.aClass90_12.method7480()) {
			Static17.aBoolean16 = true;
		}
		if (Static152.anInt1936 != -1) {
			Static97.anInt1562 = 0;
			Static146.method2357();
		}
		Static554.aClass90_12.F();
		Static354.method5328(Static554.aClass90_12);
		@Pc(94) int local94 = Static553.method7712();
		if (local94 == -1) {
			local94 = Static427.anInt7590;
		}
		if (local94 == -1) {
			local94 = Static269.anInt4756;
		}
		Static28.method408(local94);
		Static287.method4369(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911, Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913, Static415.anInt7409);
		Static415.anInt7409 = 0;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)Z")
	public static boolean method5978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!pj;Z)V")
	public static void method5979(@OriginalArg(0) Class248 arg0) {
		Static400.aClass248_70 = arg0;
	}
}
