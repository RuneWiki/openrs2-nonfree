import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!sca", name = "w", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_12 = new Class368(2, 7);

	@OriginalMember(owner = "client!sca", name = "I", descriptor = "Lclient!in;")
	public static final Class169 aClass169_119 = new Class169(74, 0);

	@OriginalMember(owner = "client!sca", name = "J", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_51 = new Class341(10, 0);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BLclient!cea;Ljava/awt/Frame;)V")
	public static void method4062(@OriginalArg(1) Class48 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(14) Class268 local14 = arg0.method1309(arg1);
			while (local14.anInt8008 == 0) {
				Static650.method9565(10L);
			}
			if (local14.anInt8008 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static650.method9565(100L);
		}
	}

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)I")
	public static int method4065() {
		if (Static183.aBoolean305) {
			return 6;
		} else if (Static577.aClass2_Sub1_Sub13_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static577.aClass2_Sub1_Sub13_4.anInt6866;
			if (Static290.method6760(local19)) {
				return 1;
			} else if (Static87.method1543(local19)) {
				return 2;
			} else if (Static190.method3693(local19)) {
				return 3;
			} else if (Static377.method6405(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
