import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
	protected int anInt9273;

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
	protected int anInt9262;

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "F")
	protected float aFloat262;

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
	private final int anInt9264;

	@OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
	private final int anInt9271;

	@OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
	protected int anInt9263;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9273 = arg0;
		this.anInt9262 = arg1;
		this.aFloat262 = arg5;
		this.anInt9264 = arg3;
		this.anInt9271 = arg4;
		this.anInt9263 = arg2;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	public final int method7687() {
		return this.anInt9271;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IF)V")
	public abstract void method7688(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)F")
	public final float method7689() {
		return this.aFloat262;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIBI)V")
	public abstract void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)I")
	public final int method7691() {
		return this.anInt9264;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)I")
	public final int method7693() {
		return this.anInt9263;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I")
	public final int method7694() {
		return this.anInt9273;
	}

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "(I)I")
	public final int method7696() {
		return this.anInt9262;
	}
}
