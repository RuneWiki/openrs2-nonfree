import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_36 = new Class45(103, -1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method2320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)Z")
	public static boolean method2322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static387.aByteArrayArrayArray18[1][arg1][arg0] & 0x2) != 0;
	}
}
