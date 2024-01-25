import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
	public int anInt9036;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "Lclient!im;")
	public Class4_Sub4 aClass4_Sub4_6;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "Lclient!oia;")
	public Class4_Sub3 aClass4_Sub3_9;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "Z")
	public volatile boolean aBoolean714 = true;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "()I")
	public abstract int method7714();

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	public abstract void method7715(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([III)V")
	protected final void method7716(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean714) {
			this.method7718(arg0, arg1, arg2);
		} else {
			this.method7715(arg2);
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "()I")
	public int method7717() {
		return 255;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "([III)V")
	public abstract void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "()Lclient!oia;")
	public abstract Class4_Sub3 method7719();

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "()Lclient!oia;")
	public abstract Class4_Sub3 method7720();
}
