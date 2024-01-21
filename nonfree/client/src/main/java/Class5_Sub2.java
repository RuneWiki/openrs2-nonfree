import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!eb;")
	public Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt1630;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!va;")
	public Class5_Sub15 aClass5_Sub15_3;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Z")
	public volatile boolean aBoolean70 = true;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	public abstract int method1112();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([III)V")
	public abstract void method1113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()Lclient!eb;")
	public abstract Class5_Sub2 method1114();

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()Lclient!eb;")
	public abstract Class5_Sub2 method1115();

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()I")
	public int method1116() {
		return 255;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public abstract void method1117(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "([III)V")
	protected final void method1118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean70) {
			this.method1113(arg0, arg1, arg2);
		} else {
			this.method1117(arg2);
		}
	}
}
