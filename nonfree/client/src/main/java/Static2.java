import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_1 = new Class7(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!wq;I)V")
	public static void method64(@OriginalArg(1) int arg0, @OriginalArg(2) Class31_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt7365 && arg0 != -1) {
			@Pc(12) Class223 local12 = Static293.aClass127_1.method2975(arg0);
			@Pc(15) int local15 = local12.anInt6050;
			if (local15 == 1) {
				arg1.anInt7350 = 0;
				arg1.anInt7323 = arg2;
				arg1.anInt7354 = 0;
				arg1.anInt7317 = 1;
				arg1.anInt7320 = 0;
				Static172.method2762(local12, arg1.anInt7300, false, arg1.anInt7350, arg1.aByte100, arg1.anInt7298);
			}
			if (local15 == 2) {
				arg1.anInt7354 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt7365 == -1 || Static293.aClass127_1.method2975(arg0).anInt6039 >= Static293.aClass127_1.method2975(arg1.anInt7365).anInt6039) {
			arg1.anInt7317 = 1;
			arg1.anInt7354 = 0;
			arg1.anInt7365 = arg0;
			arg1.anInt7379 = arg1.anInt7378;
			arg1.anInt7350 = 0;
			arg1.anInt7323 = arg2;
			arg1.anInt7320 = 0;
			if (arg1.anInt7365 != -1) {
				Static172.method2762(Static293.aClass127_1.method2975(arg1.anInt7365), arg1.anInt7300, false, arg1.anInt7350, arg1.aByte100, arg1.anInt7298);
			}
		}
	}
}
