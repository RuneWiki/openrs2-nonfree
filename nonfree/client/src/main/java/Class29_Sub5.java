import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public abstract class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public final int anInt7425;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
	protected final int anInt7422;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
	protected int anInt7421;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	protected int anInt7423;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IIII)V")
	protected Class29_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7425 = arg3;
		this.anInt7422 = arg1;
		this.anInt7421 = arg2;
		this.anInt7423 = arg0;
	}
}
