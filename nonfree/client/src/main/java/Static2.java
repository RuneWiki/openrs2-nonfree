import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public static int anInt7 = 104;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
	public static final int[] anIntArray1 = new int[4096];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ph;Lclient!rv;Lclient!ph;Lclient!ph;)Z")
	public static boolean method4(@OriginalArg(1) Class187 arg0, @OriginalArg(2) Class10_Sub7_Sub4 arg1, @OriginalArg(3) Class187 arg2, @OriginalArg(4) Class187 arg3) {
		Static226.aClass187_75 = arg2;
		Static92.aClass187_38 = arg3;
		Static114.aClass10_Sub7_Sub4_1 = arg1;
		Static93.aClass187_133 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ms;B)V")
	public static void method6(@OriginalArg(0) Class24_Sub3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt6285 - Static400.anInt6752;
		@Pc(20) int local20 = arg0.anInt6283 * 128 + arg0.method4919() * 64;
		@Pc(31) int local31 = arg0.anInt6246 * 128 + arg0.method4919() * 64;
		arg0.anInt7092 += (local20 - arg0.anInt7092) / local9;
		arg0.anInt6290 = 0;
		arg0.anInt7094 += (local31 - arg0.anInt7094) / local9;
		if (arg0.anInt6255 == 0) {
			arg0.method4920(8192);
		}
		if (arg0.anInt6255 == 1) {
			arg0.method4920(12288);
		}
		if (arg0.anInt6255 == 2) {
			arg0.method4920(0);
		}
		if (arg0.anInt6255 == 3) {
			arg0.method4920(4096);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)B")
	public static byte method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
