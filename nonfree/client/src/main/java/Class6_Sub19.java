import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Lclient!wi;")
	public Class6_Sub19 aClass6_Sub19_8;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Lclient!cu;")
	public Class6_Sub12 aClass6_Sub12_5;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public int anInt9409;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
	public volatile boolean aBoolean660 = true;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lclient!wi;")
	public abstract Class6_Sub19 method7694();

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
	public abstract int method7695();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([III)V")
	protected final void method7696(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean660) {
			this.method7698(arg0, arg1, arg2);
		} else {
			this.method7697(arg2);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public abstract void method7697(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "([III)V")
	public abstract void method7698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "()I")
	public int method7699() {
		return 255;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "()Lclient!wi;")
	public abstract Class6_Sub19 method7700();
}
