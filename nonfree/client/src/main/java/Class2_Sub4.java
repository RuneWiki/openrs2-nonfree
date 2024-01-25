import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	protected int anInt9751;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	private final int anInt9760;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	protected int anInt9749;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	protected int anInt9753;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "F")
	protected float aFloat219;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	private final int anInt9759;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9751 = arg2;
		this.anInt9760 = arg3;
		this.anInt9749 = arg1;
		this.anInt9753 = arg0;
		this.aFloat219 = arg5;
		this.anInt9759 = arg4;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	public abstract void method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(FI)V")
	public abstract void method8149(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	public final int method8150() {
		return this.anInt9753;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public final int method8151() {
		return this.anInt9751;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
	public final int method8152() {
		return this.anInt9759;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I")
	public final int method8154() {
		return this.anInt9760;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)F")
	public final float method8156() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
	public final int method8158() {
		return this.anInt9749;
	}
}
