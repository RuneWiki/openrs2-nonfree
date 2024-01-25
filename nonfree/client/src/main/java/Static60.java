import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Lclient!rp;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_13 = new Class142("K", "T", "K", "K");

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "[I")
	public static final int[] anIntArray113 = new int[14];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)I")
	public static int method838() {
		return Static306.anInt5095;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLclient!wm;)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (Static256.aClass115_3 == null) {
			return;
		}
		try {
			Static256.aClass115_3.method2294(0L);
			Static256.aClass115_3.method2289(24, arg0, arg1.aByteArray38);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)Lclient!ti;")
	public static Class1_Sub3_Sub16 method840() {
		return Static430.aClass1_Sub3_Sub16_2;
	}
}
