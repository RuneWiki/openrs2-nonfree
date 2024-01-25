import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_33 = new Class202("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(Z)V")
	public static void method896() {
		if (Static336.anIntArray502 != null && Static314.anIntArray485 != null) {
			return;
		}
		Static336.anIntArray502 = new int[256];
		Static314.anIntArray485 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static336.anIntArray502[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static314.anIntArray485[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)Lclient!ls;")
	public static Class178_Sub1 method897() {
		return Static386.aClass178_Sub1Array2.length > Static152.anInt8128 ? Static386.aClass178_Sub1Array2[Static152.anInt8128++] : null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method898(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static501.method7369(local13) : local13;
		} else if (arg0 instanceof Class38) {
			@Pc(32) Class38 local32 = (Class38) arg0;
			return local32.method1198();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
