import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
	protected int anInt9578;

	@OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
	private final int anInt9581;

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
	protected int anInt9576;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "F")
	protected float aFloat203;

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
	protected int anInt9575;

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
	private final int anInt9573;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9578 = arg2;
		this.anInt9581 = arg4;
		this.anInt9576 = arg1;
		this.aFloat203 = arg5;
		this.anInt9575 = arg0;
		this.anInt9573 = arg3;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)I")
	public final int method8377() {
		return this.anInt9581;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I")
	public final int method8378() {
		return this.anInt9573;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBII)V")
	public abstract void method8379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)I")
	public final int method8380() {
		return this.anInt9576;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)F")
	public final float method8381() {
		return this.aFloat203;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FB)V")
	public abstract void method8382(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(B)I")
	public final int method8383() {
		return this.anInt9578;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)I")
	public final int method8384() {
		return this.anInt9575;
	}
}
