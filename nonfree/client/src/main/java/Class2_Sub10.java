import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Z")
	protected boolean aBoolean149;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!e;")
	protected Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
	public int method1667() {
		return 255;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)I")
	public abstract int method1668(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public abstract void method1669(@OriginalArg(0) int arg0);
}
