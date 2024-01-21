import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!rd;")
	protected Class1_Sub10 aClass1_Sub10_3;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "Z")
	protected boolean aBoolean144;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public abstract void method1785(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)I")
	public abstract int method1786(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
	public int method1787() {
		return 255;
	}
}
