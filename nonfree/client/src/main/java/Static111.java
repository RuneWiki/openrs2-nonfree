import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[Lclient!sia;")
	public static Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_62;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt1795;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
	public static final int[] anIntArray97 = new int[8];

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_8 = new Class226(6, 8);

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_33 = new Class156(17, -2);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
	public static boolean method1653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static294.method4655(arg0, arg1) & Static528.method7230(arg0, arg1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method1655() {
		@Pc(7) Class223 local7 = null;
		try {
			@Pc(21) Class361 local21 = Static681.aClass349_6.method7731("");
			while (local21.anInt9720 == 0) {
				Static620.method7045(-4, 1L);
			}
			if (local21.anInt9720 == 1) {
				local7 = (Class223) local21.anObject20;
				@Pc(49) Class5_Sub36 local49 = Static577.aClass5_Sub19_25.method2547();
				local7.method5093(local49.anInt8456, 0, local49.aByteArray89);
			}
		} catch (@Pc(59) Exception local59) {
		}
		try {
			if (local7 != null) {
				local7.method5092();
			}
		} catch (@Pc(66) Exception local66) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)Z")
	public static boolean method1656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static157.method2868(arg1, arg0) || Static90.method1399(arg1, arg0);
	}
}
