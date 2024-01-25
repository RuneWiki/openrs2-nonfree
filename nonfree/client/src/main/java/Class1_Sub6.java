import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!vb;")
	public Class1_Sub6 aClass1_Sub6_7;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!lu;")
	public Class1_Sub25 aClass1_Sub25_5;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
	public volatile boolean aBoolean726 = true;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
	public abstract int method5165();

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public abstract void method5166(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()Lclient!vb;")
	public abstract Class1_Sub6 method5167();

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!vb;")
	public abstract Class1_Sub6 method5168();

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()I")
	public int method5169() {
		return 255;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([III)V")
	protected final void method5170(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean726) {
			this.method5171(arg0, arg1, arg2);
		} else {
			this.method5166(arg2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "([III)V")
	public abstract void method5171(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
