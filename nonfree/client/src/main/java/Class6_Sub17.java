import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!jn;")
	public Class6_Sub17 aClass6_Sub17_9;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!vw;")
	public Class6_Sub54 aClass6_Sub54_6;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public int anInt9308;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Z")
	public volatile boolean aBoolean693 = true;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([III)V")
	public abstract void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()Lclient!jn;")
	public abstract Class6_Sub17 method8140();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "()I")
	public abstract int method8141();

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "()I")
	public int method8142() {
		return 255;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "()Lclient!jn;")
	public abstract Class6_Sub17 method8143();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public abstract void method8144(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([III)V")
	protected final void method8145(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean693) {
			this.method8139(arg0, arg1, arg2);
		} else {
			this.method8144(arg2);
		}
	}
}
