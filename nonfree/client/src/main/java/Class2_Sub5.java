import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!at", name = "v", descriptor = "I")
	private final int anInt1755;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "F")
	protected float aFloat30;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "I")
	protected int anInt1745;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "I")
	protected int anInt1758;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "I")
	private final int anInt1752;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "I")
	protected int anInt1751;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt1755 = arg4;
		this.aFloat30 = arg5;
		this.anInt1745 = arg2;
		this.anInt1758 = arg1;
		this.anInt1752 = arg3;
		this.anInt1751 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I")
	public final int method1662() {
		return this.anInt1745;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IF)V")
	public abstract void method1663(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)F")
	public final float method1665() {
		return this.aFloat30;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
	public final int method1666() {
		return this.anInt1752;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)V")
	public abstract void method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I")
	public final int method1669() {
		return this.anInt1755;
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "(I)I")
	public final int method1671() {
		return this.anInt1758;
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "(I)I")
	public final int method1672() {
		return this.anInt1751;
	}
}
