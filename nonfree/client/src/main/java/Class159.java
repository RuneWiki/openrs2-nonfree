import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class159 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public int anInt4605;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public int anInt4614;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public int anInt4611;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public int anInt4608;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean316 = arg6;
		this.anInt4605 = arg5;
		this.anInt4614 = arg1;
		this.anInt4612 = arg3;
		this.anInt4611 = arg0;
		this.anInt4608 = arg4;
		this.anInt4610 = arg2;
	}
}
