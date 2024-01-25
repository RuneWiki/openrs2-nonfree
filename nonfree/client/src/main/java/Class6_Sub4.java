import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt7166;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!kc;")
	public Class6_Sub17 aClass6_Sub17_5;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!cb;")
	public Class6_Sub4 aClass6_Sub4_8;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
	public volatile boolean aBoolean457 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V")
	public abstract void method5898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public abstract void method5899(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	public abstract int method5900();

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lclient!cb;")
	public abstract Class6_Sub4 method5901();

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	public int method5902() {
		return 255;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([III)V")
	protected final void method5903(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean457) {
			this.method5898(arg0, arg1, arg2);
		} else {
			this.method5899(arg2);
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()Lclient!cb;")
	public abstract Class6_Sub4 method5904();
}
