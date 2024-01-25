import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt6248;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Lclient!ti;")
	public Class4_Sub15 aClass4_Sub15_8;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Lclient!aw;")
	public Class4_Sub4 aClass4_Sub4_5;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Z")
	public volatile boolean aBoolean569 = true;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([III)V")
	public abstract void method4855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
	public int method4856() {
		return 255;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "()Lclient!ti;")
	public abstract Class4_Sub15 method4857();

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "([III)V")
	protected final void method4858(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean569) {
			this.method4855(arg0, arg1, arg2);
		} else {
			this.method4861(arg2);
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "()I")
	public abstract int method4859();

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "()Lclient!ti;")
	public abstract Class4_Sub15 method4860();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public abstract void method4861(@OriginalArg(0) int arg0);
}
