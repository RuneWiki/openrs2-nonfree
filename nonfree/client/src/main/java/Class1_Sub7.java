import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	protected int anInt6540;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	private final int anInt6550;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	protected int anInt6546;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
	protected int anInt6545;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "F")
	protected float aFloat76;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private final int anInt6536;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6540 = arg2;
		this.anInt6550 = arg4;
		this.anInt6546 = arg1;
		this.anInt6545 = arg0;
		this.aFloat76 = arg5;
		this.anInt6536 = arg3;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
	public final int method5113() {
		return this.anInt6545;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)I")
	public final int method5114() {
		return this.anInt6546;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIZ)V")
	public abstract void method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IF)V")
	public abstract void method5116(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
	public final int method5117() {
		return this.anInt6540;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)I")
	public final int method5120() {
		return this.anInt6536;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	public final int method5122() {
		return this.anInt6550;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)F")
	public final float method5124() {
		return this.aFloat76;
	}
}
