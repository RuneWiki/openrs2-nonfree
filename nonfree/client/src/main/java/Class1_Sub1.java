import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Lclient!jc;")
	public Class1_Sub9 aClass1_Sub9_5;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!ja;")
	public Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	public int anInt1860;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Z")
	public volatile boolean aBoolean63 = true;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lclient!ja;")
	public abstract Class1_Sub1 method1357();

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public abstract void method1358(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V")
	public abstract void method1359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
	public abstract int method1360();

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()I")
	public int method1361() {
		return 255;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "()Lclient!ja;")
	public abstract Class1_Sub1 method1362();

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "([III)V")
	protected final void method1363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean63) {
			this.method1359(arg0, arg1, arg2);
		} else {
			this.method1358(arg2);
		}
	}
}
