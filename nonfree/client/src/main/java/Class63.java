import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class63 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
	public boolean aBoolean117 = true;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
	public final int anInt2624;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	public final int anInt2613;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
	public final int anInt2621;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public final int anInt2615;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public final int anInt2610;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2624 = arg5;
		this.anInt2625 = arg3;
		this.anInt2613 = arg4;
		this.anInt2621 = arg1;
		this.anInt2615 = arg2;
		this.anInt2610 = arg0;
		this.aBoolean117 = arg6;
	}
}
