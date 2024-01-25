import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class101 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
	public int anInt2706;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public int anInt2709;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	public int anInt2717;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
	public int anInt2718;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	public int anInt2713 = 128;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
	public int anInt2720 = 128;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	public int anInt2712;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
	public Class101(@OriginalArg(0) int arg0) {
		this.anInt2712 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIII)V")
	private Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2713 = arg1;
		this.anInt2712 = arg0;
		this.anInt2720 = arg2;
		this.anInt2717 = arg3;
		this.anInt2721 = arg5;
		this.anInt2706 = arg4;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!gt;)V")
	public void method2018(@OriginalArg(1) Class101 arg0) {
		this.anInt2721 = arg0.anInt2721;
		this.anInt2713 = arg0.anInt2713;
		this.anInt2720 = arg0.anInt2720;
		this.anInt2717 = arg0.anInt2717;
		this.anInt2706 = arg0.anInt2706;
		this.anInt2712 = arg0.anInt2712;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Lclient!gt;")
	public Class101 method2022() {
		return new Class101(this.anInt2712, this.anInt2713, this.anInt2720, this.anInt2717, this.anInt2706, this.anInt2721);
	}
}
