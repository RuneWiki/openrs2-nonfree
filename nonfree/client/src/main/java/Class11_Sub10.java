import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class Class11_Sub10 extends Class11 {

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!hb;")
	public Class11_Sub15 aClass11_Sub15_5;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Lclient!er;")
	public Class11_Sub10 aClass11_Sub10_7;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Z")
	public volatile boolean aBoolean308 = true;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
	public int method4054() {
		return 255;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([III)V")
	protected final void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean308) {
			this.method4057(arg0, arg1, arg2);
		} else {
			this.method4060(arg2);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()I")
	public abstract int method4056();

	@OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
	public abstract void method4057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!er", name = "c", descriptor = "()Lclient!er;")
	public abstract Class11_Sub10 method4058();

	@OriginalMember(owner = "client!er", name = "d", descriptor = "()Lclient!er;")
	public abstract Class11_Sub10 method4059();

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public abstract void method4060(@OriginalArg(0) int arg0);
}
