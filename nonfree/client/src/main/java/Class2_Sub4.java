import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	protected boolean aBoolean105;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!k;")
	protected Class2_Sub8 aClass2_Sub8_3;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public abstract void method1655(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)I")
	public abstract int method1656(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
	public int method1657() {
		return 255;
	}
}
