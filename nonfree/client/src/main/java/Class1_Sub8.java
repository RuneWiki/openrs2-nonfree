import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public int anInt3931;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "Lclient!r;")
	public Class1_Sub20 aClass1_Sub20_5;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Lclient!qh;")
	public Class1_Sub8 aClass1_Sub8_8;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Z")
	public volatile boolean aBoolean147 = true;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()Lclient!qh;")
	public abstract Class1_Sub8 method2937();

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
	public abstract int method2938();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)V")
	protected final void method2939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean147) {
			this.method2941(arg0, arg1, arg2);
		} else {
			this.method2943(arg2);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()I")
	public int method2940() {
		return 255;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "([III)V")
	public abstract void method2941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()Lclient!qh;")
	public abstract Class1_Sub8 method2942();

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	public abstract void method2943(@OriginalArg(0) int arg0);
}
