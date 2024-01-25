import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt5329;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_3 = new Class54();

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public static int anInt5330 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
	public static void method4467() {
		for (@Pc(1) int local1 = 0; local1 < Static113.aClass109Array1.length; local1++) {
			Static113.aClass109Array1[local1].method2655();
		}
		Static113.aClass109Array1 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
	public static boolean method4469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
