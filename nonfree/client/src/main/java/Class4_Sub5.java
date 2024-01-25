import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	public final int anInt7598;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	protected final int anInt7596;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	protected int anInt7599;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	protected int anInt7597;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIII)V")
	protected Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7598 = arg3;
		this.anInt7596 = arg1;
		this.anInt7599 = arg2;
		this.anInt7597 = arg0;
	}
}
