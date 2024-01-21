import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt3686;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2178 = Static118.method2249("Username: ");

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2181 = Static118.method2249("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2179 = aClass65_2181;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2180 = aClass65_2178;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2182 = Static118.method2249("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	public static void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1677; local12++) {
			@Pc(18) Class54 local18 = local7.aClass54Array2[local12];
			if ((local18.aLong83 >> 29 & 0x3L) == 2L && local18.anInt2639 == arg1 && local18.anInt2632 == arg2) {
				Static90.method3298(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(JIB[I)Lclient!oc;")
	public static Class65 method2805(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(11) Class1_Sub2_Sub10 local11 = Static30.method579(arg2[0]);
			return local11.method889((int) arg0);
		} else if (arg1 == 1) {
			@Pc(27) Class1_Sub2_Sub2 local27 = Static40.method700((int) arg0);
			return local27.aClass65_229;
		} else if (arg1 == 5) {
			return Static134.method2558(arg0).method2488();
		} else if (arg1 == 6) {
			return Static30.method579(arg2[0]).method889((int) arg0);
		} else {
			return Static134.method2560(arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2806(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static16.aClass45_1);
		arg0.addMouseMotionListener(Static16.aClass45_1);
		arg0.addFocusListener(Static16.aClass45_1);
	}
}
