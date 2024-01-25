import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class12_Sub13 extends Class12 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public int anInt9310;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!ti;")
	public Class12_Sub29 aClass12_Sub29_5;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!ff;")
	public Class12_Sub13 aClass12_Sub13_8;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Z")
	public volatile boolean aBoolean658 = true;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
	public int method7671() {
		return 255;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
	public abstract int method7672();

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()Lclient!ff;")
	public abstract Class12_Sub13 method7673();

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lclient!ff;")
	public abstract Class12_Sub13 method7674();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public abstract void method7675(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
	public abstract void method7676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "([III)V")
	protected final void method7677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean658) {
			this.method7676(arg0, arg1, arg2);
		} else {
			this.method7675(arg2);
		}
	}
}
