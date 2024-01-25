import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!in;")
	public static Class169 aClass169_210;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!in;")
	public static final Class169 aClass169_209 = new Class169(63, 6);

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public static void method7662() {
		Static543.method8321();
		Static183.aBoolean305 = false;
		Static427.method7014(Static22.anInt384, Static297.anInt5412, Static537.anInt9380, Static304.anInt10368);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method7663() {
		@Pc(7) Class182 local7 = null;
		try {
			@Pc(13) Class268 local13 = Static96.aClass48_5.method1306("");
			while (local13.anInt8008 == 0) {
				Static650.method9565(1L);
			}
			if (local13.anInt8008 == 1) {
				local7 = (Class182) local13.anObject19;
				@Pc(35) Class2_Sub8 local35 = Static230.aClass2_Sub54_15.method9554();
				local7.method4767(local35.lb, local35.anInt5725, 0);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method4769();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}
}
