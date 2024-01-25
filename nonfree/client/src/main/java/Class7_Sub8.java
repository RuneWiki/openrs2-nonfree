import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	public int anInt6140;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "Lclient!bs;")
	public Class7_Sub8 aClass7_Sub8_7;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "Lclient!wo;")
	public Class7_Sub31 aClass7_Sub31_5;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "Z")
	public volatile boolean aBoolean403 = true;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()Lclient!bs;")
	public abstract Class7_Sub8 method4866();

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "()I")
	public int method4867() {
		return 255;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([III)V")
	protected final void method4868(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean403) {
			this.method4871(arg0, arg1, arg2);
		} else {
			this.method4870(arg2);
		}
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "()I")
	public abstract int method4869();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public abstract void method4870(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "([III)V")
	public abstract void method4871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "()Lclient!bs;")
	public abstract Class7_Sub8 method4872();
}
