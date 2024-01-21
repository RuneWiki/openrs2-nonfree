import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
	protected boolean aBoolean156;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "Lclient!j;")
	protected Class6_Sub4 aClass6_Sub4_3;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
	public int method1971() {
		return 255;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([III)I")
	public abstract int method1972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public abstract void method1973(@OriginalArg(0) int arg0);
}
