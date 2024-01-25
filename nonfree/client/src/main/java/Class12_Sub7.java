import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	protected int anInt6110;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	private final int anInt6102;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
	protected float aFloat127;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
	protected int anInt6116;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	private final int anInt6107;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
	protected int anInt6115;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIF)V")
	public Class12_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6110 = arg2;
		this.anInt6102 = arg3;
		this.aFloat127 = arg5;
		this.anInt6116 = arg1;
		this.anInt6107 = arg4;
		this.anInt6115 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
	public final int method5117() {
		return this.anInt6110;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)I")
	public final int method5118() {
		return this.anInt6107;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBI)V")
	public abstract void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
	public final int method5120() {
		return this.anInt6116;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FB)V")
	public abstract void method5121(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)I")
	public final int method5123() {
		return this.anInt6102;
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)I")
	public final int method5124() {
		return this.anInt6115;
	}

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "(I)F")
	public final float method5125() {
		return this.aFloat127;
	}
}
