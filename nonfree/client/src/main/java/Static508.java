import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[Lclient!je;")
	public static Class183[] aClass183Array1;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
	public static final int[] anIntArray467 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7013(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local33++;
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(66) long local66 = arg0;
				arg0 /= 37L;
				local60.append(Static580.aCharArray12[(int) (local66 - arg0 * 37L)]);
			}
			return local60.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!gda;IZIIJII)V")
	public static void method7014(@OriginalArg(0) Class126 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) long arg2, @OriginalArg(6) int arg3) {
		Static680.anInt10888 = arg3;
		Static133.aLong77 = arg2;
		Static310.anInt5335 = 1;
		Static524.anInt8330 = arg1;
		Static27.aClass5_Sub4_Sub2_1 = null;
		Static342.aClass126_159 = arg0;
		Static12.anInt158 = 0;
		Static168.aBoolean240 = false;
		Static395.anInt6666 = 10000;
		Static180.anInt3389 = 0;
	}
}
