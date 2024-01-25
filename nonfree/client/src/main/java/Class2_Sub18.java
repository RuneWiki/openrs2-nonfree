import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	public int anInt5485;

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "Lclient!gm;")
	public Class2_Sub18 aClass2_Sub18_7;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "Lclient!vg;")
	public Class2_Sub41 aClass2_Sub41_5;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
	public volatile boolean aBoolean475 = true;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
	public abstract int method4445();

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
	public abstract void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "([III)V")
	protected final void method4447(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean475) {
			this.method4446(arg0, arg1, arg2);
		} else {
			this.method4450(arg2);
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()Lclient!gm;")
	public abstract Class2_Sub18 method4448();

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()I")
	public int method4449() {
		return 255;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public abstract void method4450(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "()Lclient!gm;")
	public abstract Class2_Sub18 method4451();
}
