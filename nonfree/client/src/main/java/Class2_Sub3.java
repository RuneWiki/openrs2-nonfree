import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!lb;")
	protected Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
	protected boolean aBoolean135;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([III)I")
	public abstract int method2057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	public int method2058() {
		return 255;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public abstract void method2059(@OriginalArg(0) int arg0);
}
