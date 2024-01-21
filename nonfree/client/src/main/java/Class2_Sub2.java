import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Z")
	protected boolean aBoolean95;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Lclient!ud;")
	protected Class2_Sub12 aClass2_Sub12_3;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public abstract void method1197(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)I")
	public abstract int method1198(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	public int method1199() {
		return 255;
	}
}
