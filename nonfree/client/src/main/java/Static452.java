import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qc", name = "Bb", descriptor = "Z")
	public static boolean aBoolean540;

	@OriginalMember(owner = "client!qc", name = "Eb", descriptor = "Lclient!mr;")
	public static Class226 aClass226_6;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_245 = new Class288(81, 7);

	@OriginalMember(owner = "client!qc", name = "mb", descriptor = "[I")
	public static final int[] anIntArray525 = new int[1];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6135(@OriginalArg(0) Class95 arg0) {
		if (Static500.aBoolean612) {
			Static482.method6496(arg0);
		} else {
			Static247.method3406(arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method6139(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static19.method404(local13) : local13;
		} else if (arg1 instanceof Class119) {
			@Pc(27) Class119 local27 = (Class119) arg1;
			return local27.method7514();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JJ)J")
	public static long method6141(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method6142(@OriginalArg(1) Canvas arg0) {
		@Pc(12) Dimension local12 = arg0.getSize();
		Static15.method230(local12.width, local12.height);
		if (Static491.anInt8078 == 1) {
			Static361.aClass95_9.method6984(arg0, Static61.anInt1162, Static158.anInt2827);
		} else {
			Static361.aClass95_9.method6984(arg0, Static325.anInt5186, Static482.anInt7691);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IB)V")
	public static void method6143() {
		Static575.aClass32_82.method634(5);
	}
}
