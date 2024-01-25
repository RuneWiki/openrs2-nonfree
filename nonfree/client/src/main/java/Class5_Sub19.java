import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
	private final int anInt6290;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	private final int anInt6294;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	protected int anInt6293;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	protected int anInt6285;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	protected int anInt6291;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "F")
	protected float aFloat148;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6290 = arg4;
		this.anInt6294 = arg3;
		this.anInt6293 = arg2;
		this.anInt6285 = arg0;
		this.anInt6291 = arg1;
		this.aFloat148 = arg5;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)F")
	public final float method4974() {
		return this.aFloat148;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	public final int method4975() {
		return this.anInt6290;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
	public final int method4977() {
		return this.anInt6285;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	public final int method4979() {
		return this.anInt6293;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BF)V")
	public abstract void method4980(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
	public final int method4981() {
		return this.anInt6291;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	public final int method4982() {
		return this.anInt6294;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public abstract void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
