import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!fn;")
	public Class1_Sub15 aClass1_Sub15_5;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!tf;")
	public Class1_Sub1 aClass1_Sub1_7;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public int anInt5884;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
	public volatile boolean aBoolean566 = true;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
	public abstract void method5028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()Lclient!tf;")
	public abstract Class1_Sub1 method5029();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
	public int method5030() {
		return 255;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()I")
	public abstract int method5031();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V")
	protected final void method5032(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean566) {
			this.method5028(arg0, arg1, arg2);
		} else {
			this.method5034(arg2);
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()Lclient!tf;")
	public abstract Class1_Sub1 method5033();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public abstract void method5034(@OriginalArg(0) int arg0);
}
