import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	private final int anInt3781;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	protected int anInt3782;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
	protected int anInt3780;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
	protected int anInt3784;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private final int anInt3788;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "F")
	protected float aFloat65;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt3781 = arg4;
		this.anInt3782 = arg2;
		this.anInt3780 = arg1;
		this.anInt3784 = arg0;
		this.anInt3788 = arg3;
		this.aFloat65 = arg5;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IF)V")
	public abstract void method3179(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I")
	public final int method3180() {
		return this.anInt3788;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I")
	public final int method3181() {
		return this.anInt3782;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
	public final int method3182() {
		return this.anInt3784;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)F")
	public final float method3183() {
		return this.aFloat65;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)I")
	public final int method3184() {
		return this.anInt3781;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public abstract void method3185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)I")
	public final int method3186() {
		return this.anInt3780;
	}
}
