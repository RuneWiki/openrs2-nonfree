import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
	private final int anInt9335;

	@OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
	protected int anInt9340;

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
	private final int anInt9333;

	@OriginalMember(owner = "client!tw", name = "u", descriptor = "F")
	protected float aFloat235;

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
	protected int anInt9332;

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
	protected int anInt9334;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9335 = arg4;
		this.anInt9340 = arg2;
		this.anInt9333 = arg3;
		this.aFloat235 = arg5;
		this.anInt9332 = arg1;
		this.anInt9334 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIB)V")
	public abstract void method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I")
	public final int method7608() {
		return this.anInt9340;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(Z)I")
	public final int method7609() {
		return this.anInt9334;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)I")
	public final int method7610() {
		return this.anInt9333;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FB)V")
	public abstract void method7611(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I")
	public final int method7612() {
		return this.anInt9332;
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)I")
	public final int method7613() {
		return this.anInt9335;
	}

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "(I)F")
	public final float method7615() {
		return this.aFloat235;
	}
}
