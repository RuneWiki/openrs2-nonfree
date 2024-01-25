import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "F")
	protected float aFloat197;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	protected int anInt9871;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	protected int anInt9868;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
	private final int anInt9875;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	private final int anInt9873;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
	protected int anInt9869;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat197 = arg5;
		this.anInt9871 = arg0;
		this.anInt9868 = arg1;
		this.anInt9875 = arg3;
		this.anInt9873 = arg4;
		this.anInt9869 = arg2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
	public final int method8382() {
		return this.anInt9875;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I")
	public final int method8383() {
		return this.anInt9868;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I")
	public final int method8384() {
		return this.anInt9873;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
	public final int method8386() {
		return this.anInt9869;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)F")
	public final float method8387() {
		return this.aFloat197;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public abstract void method8388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(FB)V")
	public abstract void method8389(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
	public final int method8391() {
		return this.anInt9871;
	}
}
