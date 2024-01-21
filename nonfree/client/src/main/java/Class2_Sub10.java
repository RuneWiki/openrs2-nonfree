import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!we;")
	public Class2_Sub19 aClass2_Sub19_5;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
	public int anInt4053;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!tf;")
	public Class2_Sub10 aClass2_Sub10_8;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
	public volatile boolean aBoolean162 = true;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()Lclient!tf;")
	public abstract Class2_Sub10 method2737();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()Lclient!tf;")
	public abstract Class2_Sub10 method2738();

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()I")
	public int method2739() {
		return 255;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
	protected final void method2740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean162) {
			this.method2742(arg0, arg1, arg2);
		} else {
			this.method2741(arg2);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public abstract void method2741(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V")
	public abstract void method2742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
	public abstract int method2743();
}
