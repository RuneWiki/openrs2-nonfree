import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
	public static int anInt5372;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_120 = new Class180(17, -1);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLclient!fg;)V")
	public static void method4915(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		if (arg1.aBoolean246) {
			if (arg1.anInt3183 < 0 || Static235.method3935(arg1.anInt3183, arg1.anInt3182)) {
				if (arg0) {
					Static58.method1277(arg1.anInt3184, arg1.anInt3188, (Class138) null, arg1.anInt3177, arg1.anInt3189);
				} else {
					Static545.method6696(arg1.anInt3188, arg1.anInt3182, arg1.anInt3178, arg1.anInt3183, arg1.anInt3189, -1, arg1.anInt3184, arg1.anInt3177);
				}
				arg1.method9380();
			}
		} else if (arg1.aBoolean247 && arg1.anInt3189 >= 1 && arg1.anInt3188 >= 1 && arg1.anInt3189 <= Static158.anInt927 - 2 && arg1.anInt3188 <= Static515.anInt8292 - 2 && (arg1.anInt3179 < 0 || Static235.method3935(arg1.anInt3179, arg1.anInt3190))) {
			if (arg0) {
				Static58.method1277(arg1.anInt3184, arg1.anInt3188, arg1.aClass138_2, arg1.anInt3177, arg1.anInt3189);
			} else {
				Static545.method6696(arg1.anInt3188, arg1.anInt3190, arg1.anInt3181, arg1.anInt3179, arg1.anInt3189, -1, arg1.anInt3184, arg1.anInt3177);
			}
			arg1.aBoolean247 = false;
			if (!arg0 && arg1.anInt3183 == arg1.anInt3179 && arg1.anInt3183 == -1) {
				arg1.method9380();
			} else if (!arg0 && arg1.anInt3183 == arg1.anInt3179 && arg1.anInt3181 == arg1.anInt3178 && arg1.anInt3190 == arg1.anInt3182) {
				arg1.method9380();
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[B)Lclient!vr;")
	public static Class33 method4918(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(18) Image local18 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(23) MediaTracker local23 = new MediaTracker(Static200.aClient1);
				local23.addImage(local18, 0);
				local23.waitForAll();
				@Pc(33) int local33 = local18.getWidth(Static200.aClient1);
				@Pc(37) int local37 = local18.getHeight(Static200.aClient1);
				if (!local23.isErrorAny() && local33 >= 0 && local37 >= 0) {
					@Pc(57) int[] local57 = new int[local37 * local33];
					@Pc(69) PixelGrabber local69 = new PixelGrabber(local18, 0, 0, local33, local37, local57, 0, local33);
					local69.grabPixels();
					return Static674.aClass13_22.method8479(local33, local57, local37, local33);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}
}
