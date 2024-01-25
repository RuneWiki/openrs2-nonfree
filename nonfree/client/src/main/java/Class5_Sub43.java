import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	protected int anInt9633;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private final int anInt9630;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	protected int anInt9632;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	private final int anInt9638;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "F")
	protected float aFloat185;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	protected int anInt9640;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9633 = arg1;
		this.anInt9630 = arg4;
		this.anInt9632 = arg2;
		this.anInt9638 = arg3;
		this.aFloat185 = arg5;
		this.anInt9640 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)F")
	public final float method8250() {
		return this.aFloat185;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	public final int method8251() {
		return this.anInt9640;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V")
	public abstract void method8252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	public final int method8253() {
		return this.anInt9630;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
	public final int method8254() {
		return this.anInt9638;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	public final int method8255() {
		return this.anInt9632;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FB)V")
	public abstract void method8256(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
	public final int method8257() {
		return this.anInt9633;
	}
}
