import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!dm;")
	public Class2_Sub12 aClass2_Sub12_5;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!j;")
	public Class2_Sub3 aClass2_Sub3_7;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	public int anInt4855;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Z")
	public volatile boolean aBoolean442 = true;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public abstract void method4473(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	public abstract int method4474();

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Lclient!j;")
	public abstract Class2_Sub3 method4475();

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()Lclient!j;")
	public abstract Class2_Sub3 method4476();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V")
	protected final void method4477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean442) {
			this.method4479(arg0, arg1, arg2);
		} else {
			this.method4473(arg2);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
	public int method4478() {
		return 255;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "([III)V")
	public abstract void method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
