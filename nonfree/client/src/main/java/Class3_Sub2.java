import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!ga;")
	protected Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Z")
	protected boolean aBoolean100;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)I")
	public abstract int method1378(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
	public int method1379() {
		return 255;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public abstract void method1380(@OriginalArg(0) int arg0);
}
