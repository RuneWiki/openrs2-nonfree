import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_183 = new Class274(5, -1);

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "Z")
	public static boolean aBoolean756 = false;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z")
	public static boolean method8560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!kk;B)V")
	public static void method8562(@OriginalArg(0) Class193 arg0) {
		Static407.aClass193_1 = arg0;
	}
}
