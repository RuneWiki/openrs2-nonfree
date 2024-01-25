import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!js;")
	public static Class128 aClass128_6;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ie;")
	public static final Class103 aClass103_2 = new Class103();

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "J")
	public static long aLong203 = 0L;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_136 = new Class205(64, 12);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method5459() {
		if (Static82.aBoolean110) {
			return;
		}
		Static285.aBoolean378 = true;
		if (Static207.aBoolean371) {
			Static1.aFloat80 = (int) Static1.aFloat80 + 47 & 0xFFFFFFF0;
		} else {
			Static283.aFloat70 += (12.0F - Static283.aFloat70) / 2.0F;
		}
		Static82.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method5463(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static27.method496(local13) : local13;
		} else if (arg0 instanceof Class82) {
			@Pc(27) Class82 local27 = (Class82) arg0;
			return local27.method2416();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
