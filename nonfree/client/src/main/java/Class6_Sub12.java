import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!em;")
	public Class6_Sub11 aClass6_Sub11_5;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public int anInt6244;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!wm;")
	public Class6_Sub12 aClass6_Sub12_7;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
	public volatile boolean aBoolean416 = true;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()Lclient!wm;")
	public abstract Class6_Sub12 method5652();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([III)V")
	protected final void method5653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean416) {
			this.method5657(arg0, arg1, arg2);
		} else {
			this.method5654(arg2);
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
	public abstract void method5654(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()Lclient!wm;")
	public abstract Class6_Sub12 method5655();

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()I")
	public abstract int method5656();

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "([III)V")
	public abstract void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()I")
	public int method5658() {
		return 255;
	}
}
