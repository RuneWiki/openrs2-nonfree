import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_133 = new Class275();

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_85 = new Class160(7, 6);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(JI)V")
	public static void method5424(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
	public static byte[] method5425(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg1;
			return Static177.method2708(arg0, local22);
		} else if (arg1 instanceof Class286) {
			@Pc(34) Class286 local34 = (Class286) arg1;
			return local34.method6533(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public static void method5426() {
		if (Static35.anIntArray47 != null && Static205.anIntArray395 != null) {
			return;
		}
		Static35.anIntArray47 = new int[256];
		Static205.anIntArray395 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static35.anIntArray47[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static205.anIntArray395[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
