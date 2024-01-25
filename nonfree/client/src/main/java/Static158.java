import java.applet.Applet;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
	public static int anInt2782 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!cr;Ljava/awt/Frame;I)V")
	public static void method2320(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class278 local10 = arg0.method919(arg1);
			while (local10.anInt7757 == 0) {
				Static149.method2211(10L);
			}
			if (local10.anInt7757 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static149.method2211(100L);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;ZBLclient!pq;)Lclient!ps;")
	public static Class252 method2322(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class251 arg2) {
		@Pc(10) int local10 = arg2.method5863(arg0);
		if (local10 == -1) {
			return new Class252(0);
		}
		@Pc(32) int[] local32 = arg2.method5857(local10);
		@Pc(38) Class252 local38 = new Class252(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local40 < local38.anInt7034) {
				@Pc(56) Class6_Sub14 local56 = new Class6_Sub14(arg2.method5860(local10, local32[local42++]));
				@Pc(60) int local60 = local56.method6027();
				@Pc(64) int local64 = local56.method6006();
				@Pc(68) int local68 = local56.method6041();
				if (!arg1 && local68 == 1) {
					local38.anInt7034--;
				} else {
					local38.anIntArray566[local40] = local60;
					local38.anIntArray567[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}
}
