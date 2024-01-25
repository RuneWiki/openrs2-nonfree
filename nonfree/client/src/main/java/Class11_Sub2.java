import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	protected final int anInt7824;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	protected int anInt7829;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	protected int anInt7825;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public final int anInt7828;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7824 = arg1;
		this.anInt7829 = arg2;
		this.anInt7825 = arg0;
		this.anInt7828 = arg3;
	}
}
