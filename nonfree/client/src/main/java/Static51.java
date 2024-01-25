import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public static int anInt1242;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_45 = new Class175("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_41 = new Class92(78, -1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBILclient!mv;)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub3_Sub1 arg2) {
		if (arg2.anInt6092 == arg1 && arg1 != -1) {
			@Pc(91) Class96 local91 = Static196.aClass30_2.method942(arg1);
			@Pc(94) int local94 = local91.anInt3320;
			if (local94 == 1) {
				arg2.anInt6083 = arg0;
				arg2.anInt6082 = 0;
				arg2.anInt6121 = 0;
				arg2.lb = 0;
				arg2.anInt6127 = 1;
				Static86.method1483(arg2.anInt6053, arg2.anInt6082, arg2.aByte77, arg2.anInt6055, local91, arg2 == Static113.aClass1_Sub3_Sub3_Sub1_4);
			}
			if (local94 == 2) {
				arg2.anInt6121 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt6092 == -1 || Static196.aClass30_2.method942(arg1).anInt3323 >= Static196.aClass30_2.method942(arg2.anInt6092).anInt3323) {
			arg2.anInt6092 = arg1;
			arg2.lb = 0;
			arg2.anInt6127 = 1;
			arg2.anInt6083 = arg0;
			arg2.anInt6082 = 0;
			arg2.anInt6121 = 0;
			arg2.anInt6136 = arg2.anInt6133;
			if (arg2.anInt6092 == -1) {
				return;
			}
			Static86.method1483(arg2.anInt6053, arg2.anInt6082, arg2.aByte77, arg2.anInt6055, Static196.aClass30_2.method942(arg2.anInt6092), arg2 == Static113.aClass1_Sub3_Sub3_Sub1_4);
		}
	}
}
