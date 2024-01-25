import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "Lclient!vw;")
	public Class6_Sub15 aClass6_Sub15_8;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "Lclient!ao;")
	public Class6_Sub6 aClass6_Sub6_5;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
	public int anInt9957;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "Z")
	public volatile boolean aBoolean673 = true;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "([III)V")
	public abstract void method7933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "()Lclient!vw;")
	public abstract Class6_Sub15 method7934();

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "()I")
	public abstract int method7935();

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "([III)V")
	protected final void method7936(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean673) {
			this.method7933(arg0, arg1, arg2);
		} else {
			this.method7939(arg2);
		}
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "()Lclient!vw;")
	public abstract Class6_Sub15 method7937();

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "()I")
	public int method7938() {
		return 255;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public abstract void method7939(@OriginalArg(0) int arg0);
}
