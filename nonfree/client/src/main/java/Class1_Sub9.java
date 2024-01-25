import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!hf;")
	public Class1_Sub9 aClass1_Sub9_8;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public int anInt5897;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!wl;")
	public Class1_Sub28 aClass1_Sub28_5;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
	public volatile boolean aBoolean492 = true;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lclient!hf;")
	public abstract Class1_Sub9 method4591();

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
	public abstract void method4592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "([III)V")
	protected final void method4593(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean492) {
			this.method4592(arg0, arg1, arg2);
		} else {
			this.method4597(arg2);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()I")
	public int method4594() {
		return 255;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()Lclient!hf;")
	public abstract Class1_Sub9 method4595();

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "()I")
	public abstract int method4596();

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public abstract void method4597(@OriginalArg(0) int arg0);
}
