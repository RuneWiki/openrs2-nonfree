import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
	protected int anInt8924;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "F")
	protected float aFloat204;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
	protected int anInt8935;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	private final int anInt8930;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	protected int anInt8928;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	private final int anInt8926;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt8924 = arg1;
		this.aFloat204 = arg5;
		this.anInt8935 = arg2;
		this.anInt8930 = arg4;
		this.anInt8928 = arg0;
		this.anInt8926 = arg3;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IF)V")
	public abstract void method7625(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)F")
	public final float method7626() {
		return this.aFloat204;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I")
	public final int method7627() {
		return this.anInt8928;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)I")
	public final int method7628() {
		return this.anInt8935;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BIII)V")
	public abstract void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)I")
	public final int method7630() {
		return this.anInt8924;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)I")
	public final int method7632() {
		return this.anInt8926;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)I")
	public final int method7633() {
		return this.anInt8930;
	}
}
