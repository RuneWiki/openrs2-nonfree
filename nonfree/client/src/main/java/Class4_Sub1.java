import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!md;")
	public Class4_Sub1 aClass4_Sub1_7;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!ie;")
	public Class4_Sub6 aClass4_Sub6_5;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public int anInt2138;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
	public volatile boolean aBoolean107 = true;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()Lclient!md;")
	public abstract Class4_Sub1 method1532();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V")
	public abstract void method1533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public abstract void method1534(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	public abstract int method1535();

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()Lclient!md;")
	public abstract Class4_Sub1 method1536();

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()I")
	public int method1537() {
		return 255;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "([III)V")
	protected final void method1538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean107) {
			this.method1533(arg0, arg1, arg2);
		} else {
			this.method1534(arg2);
		}
	}
}
