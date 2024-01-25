import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
	public static int anInt4795;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "Lclient!sda;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[2];

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)Lclient!kda;")
	public static Class183 method4322() {
		try {
			return (Class183) Class.forName("Class183_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class183_Sub2();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!hga;ILjava/awt/Frame;)V")
	public static void method4323(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(13) Class304 local13 = arg0.method3572(arg1);
			while (local13.anInt8838 == 0) {
				Static258.method4293(10L);
			}
			if (local13.anInt8838 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static258.method4293(100L);
		}
	}
}
