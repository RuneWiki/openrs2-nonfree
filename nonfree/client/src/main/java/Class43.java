import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class Class43 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	protected final int anInt7283;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
	public final int anInt7285;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public final int anInt7284;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7283 = arg2;
		this.anInt7285 = arg1;
		this.anInt7284 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
	public abstract void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)V")
	public abstract void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)V")
	public abstract void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
