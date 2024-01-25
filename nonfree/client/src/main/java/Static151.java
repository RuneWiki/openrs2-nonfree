import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "Lclient!af;")
	public static final Class10 aClass10_12 = new Class10(4);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
	public static void method2160(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static305.method4387(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!ae;)I")
	public static int method2162(@OriginalArg(1) Class8 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method273(Static517.anInt8622)) {
			local5++;
		}
		if (arg0.method273(Static477.anInt8199)) {
			local5++;
		}
		if (arg0.method273(Static572.anInt9467)) {
			local5++;
		}
		if (arg0.method273(Static323.anInt5423)) {
			local5++;
		}
		if (arg0.method273(Static540.anInt9108)) {
			local5++;
		}
		if (arg0.method273(Static419.anInt7282)) {
			local5++;
		}
		if (arg0.method273(Static195.anInt3357)) {
			local5++;
		}
		if (arg0.method273(Static453.anInt1589)) {
			local5++;
		}
		if (arg0.method273(Static608.anInt9870)) {
			local5++;
		}
		if (arg0.method273(Static641.anInt10368)) {
			local5++;
		}
		if (arg0.method273(Static423.anInt7315)) {
			local5++;
		}
		if (arg0.method273(Static390.anInt6563)) {
			local5++;
		}
		if (arg0.method273(Static154.anInt2564)) {
			local5++;
		}
		if (arg0.method273(Static445.anInt7485)) {
			local5++;
		}
		if (arg0.method273(Static414.anInt7227)) {
			local5++;
		}
		if (arg0.method273(Static170.anInt2857)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(FIFFILclient!nh;FIIFI)[B")
	public static byte[] method2163(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) Class71 arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static119.method1847(0, arg1, local15, arg3, arg0, arg4, arg5, arg2);
		return local15;
	}
}
