import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public static int anInt6785;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_158 = new Class81(93, 8);

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_36 = new Class326(4);

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public static int anInt6784 = 1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
	public static int method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static105.anIntArrayArray12 == null ? 0 : Static105.anIntArrayArray12[arg0][arg1] & 0xFFFFFF;
	}
}
