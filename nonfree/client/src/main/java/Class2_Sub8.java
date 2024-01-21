import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!je", name = "C", descriptor = "Z")
	protected boolean aBoolean140;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "Lclient!id;")
	protected Class2_Sub9 aClass2_Sub9_3;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([III)I")
	public abstract int method1670(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public abstract void method1671(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()I")
	public int method1672() {
		return 255;
	}
}
