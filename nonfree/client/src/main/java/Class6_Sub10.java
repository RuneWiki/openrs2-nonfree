import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
	private final int anInt6346;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	protected int anInt6348;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
	private final int anInt6353;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "F")
	protected float aFloat129;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
	protected int anInt6349;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	protected int anInt6342;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6346 = arg4;
		this.anInt6348 = arg0;
		this.anInt6353 = arg3;
		this.aFloat129 = arg5;
		this.anInt6349 = arg2;
		this.anInt6342 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
	public final int method5312() {
		return this.anInt6348;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IBII)V")
	public abstract void method5313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)F")
	public final float method5314() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I")
	public final int method5316() {
		return this.anInt6353;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(FI)V")
	public abstract void method5317(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)I")
	public final int method5319() {
		return this.anInt6346;
	}

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)I")
	public final int method5320() {
		return this.anInt6349;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)I")
	public final int method5321() {
		return this.anInt6342;
	}
}
