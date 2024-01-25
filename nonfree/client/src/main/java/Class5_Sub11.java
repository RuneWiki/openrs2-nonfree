import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
	private final int anInt9389;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	private final int anInt9386;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "F")
	protected float aFloat177;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	protected int anInt9385;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	protected int anInt9393;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
	protected int anInt9394;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9389 = arg4;
		this.anInt9386 = arg3;
		this.aFloat177 = arg5;
		this.anInt9385 = arg2;
		this.anInt9393 = arg1;
		this.anInt9394 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIB)V")
	public abstract void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZF)V")
	public abstract void method8095(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)I")
	public final int method8096() {
		return this.anInt9393;
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(B)I")
	public final int method8098() {
		return this.anInt9385;
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(B)I")
	public final int method8099() {
		return this.anInt9386;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)F")
	public final float method8101() {
		return this.aFloat177;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
	public final int method8102() {
		return this.anInt9389;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
	public final int method8103() {
		return this.anInt9394;
	}
}
