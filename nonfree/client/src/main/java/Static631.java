import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static631 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_63 = new Class163();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public static int method8609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static527.aShortArrayArray30 == null ? 0 : Static527.aShortArrayArray30[arg0][arg1] & 0xFFFF;
	}
}
