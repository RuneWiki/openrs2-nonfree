import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	public int anInt9645;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!gu;")
	public Class5_Sub16 aClass5_Sub16_9;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Lclient!ni;")
	public Class5_Sub11 aClass5_Sub11_6;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Z")
	public volatile boolean aBoolean774 = true;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()Lclient!gu;")
	public abstract Class5_Sub16 method8281();

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "([III)V")
	public abstract void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "()Lclient!gu;")
	public abstract Class5_Sub16 method8283();

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "()I")
	public int method8284() {
		return 255;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "([III)V")
	protected final void method8285(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean774) {
			this.method8282(arg0, arg1, arg2);
		} else {
			this.method8286(arg2);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public abstract void method8286(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "()I")
	public abstract int method8287();
}
