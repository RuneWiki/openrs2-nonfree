import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!mr;")
	public Class1_Sub31 aClass1_Sub31_5;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!uh;")
	public Class1_Sub7 aClass1_Sub7_7;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
	public int anInt5011;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
	public volatile boolean aBoolean477 = true;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)V")
	protected final void method4403(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean477) {
			this.method4404(arg0, arg1, arg2);
		} else {
			this.method4405(arg2);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "([III)V")
	public abstract void method4404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	public abstract void method4405(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
	public int method4406() {
		return 255;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()Lclient!uh;")
	public abstract Class1_Sub7 method4407();

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "()Lclient!uh;")
	public abstract Class1_Sub7 method4408();

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "()I")
	public abstract int method4409();
}
