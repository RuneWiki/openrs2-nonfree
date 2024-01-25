import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
	protected int anInt6242;

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
	private final int anInt6243;

	@OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
	protected int anInt6244;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
	private final int anInt6235;

	@OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
	protected int anInt6245;

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "F")
	protected float aFloat266;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6242 = arg1;
		this.anInt6243 = arg4;
		this.anInt6244 = arg2;
		this.anInt6235 = arg3;
		this.anInt6245 = arg0;
		this.aFloat266 = arg5;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I")
	public final int method5183() {
		return this.anInt6244;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)F")
	public final float method5184() {
		return this.aFloat266;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)I")
	public final int method5185() {
		return this.anInt6243;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IF)V")
	public abstract void method5187(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIB)V")
	public abstract void method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "(I)I")
	public final int method5189() {
		return this.anInt6245;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I")
	public final int method5190() {
		return this.anInt6242;
	}

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "(I)I")
	public final int method5191() {
		return this.anInt6235;
	}
}
