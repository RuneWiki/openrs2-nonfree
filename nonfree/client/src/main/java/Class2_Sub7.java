import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	protected int anInt3739;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "F")
	protected float aFloat123;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	private final int anInt3742;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	protected int anInt3741;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	private final int anInt3738;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	protected int anInt3740;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt3739 = arg1;
		this.aFloat123 = arg5;
		this.anInt3742 = arg4;
		this.anInt3741 = arg0;
		this.anInt3738 = arg3;
		this.anInt3740 = arg2;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
	public final int method2991() {
		return this.anInt3741;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	public final int method2992() {
		return this.anInt3738;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I")
	public final int method2993() {
		return this.anInt3742;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)F")
	public final float method2994() {
		return this.aFloat123;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IF)V")
	public abstract void method2995(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)I")
	public final int method2996() {
		return this.anInt3739;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(B)I")
	public final int method2997() {
		return this.anInt3740;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BIII)V")
	public abstract void method2998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
