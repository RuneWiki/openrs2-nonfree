import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!ig;")
	public Class1_Sub15 aClass1_Sub15_5;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!ge;")
	public Class1_Sub12 aClass1_Sub12_7;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public int anInt3825;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
	public volatile boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()I")
	public abstract int method3033();

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
	public int method3034() {
		return 255;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()Lclient!ge;")
	public abstract Class1_Sub12 method3035();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
	public abstract void method3036(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public abstract void method3037(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lclient!ge;")
	public abstract Class1_Sub12 method3038();

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "([III)V")
	protected final void method3039(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean173) {
			this.method3036(arg0, arg1, arg2);
		} else {
			this.method3037(arg2);
		}
	}
}
