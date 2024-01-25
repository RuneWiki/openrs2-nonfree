import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "F")
	protected float aFloat125;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
	protected int anInt3866;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	private final int anInt3855;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	private final int anInt3857;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
	protected int anInt3860;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
	protected int anInt3856;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat125 = arg5;
		this.anInt3866 = arg1;
		this.anInt3855 = arg3;
		this.anInt3857 = arg4;
		this.anInt3860 = arg0;
		this.anInt3856 = arg2;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IF)V")
	public abstract void method3158(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)F")
	public final float method3159() {
		return this.aFloat125;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(Z)I")
	public final int method3160() {
		return this.anInt3860;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)I")
	public final int method3161() {
		return this.anInt3866;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)I")
	public final int method3162() {
		return this.anInt3857;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIB)V")
	public abstract void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
	public final int method3164() {
		return this.anInt3856;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
	public final int method3165() {
		return this.anInt3855;
	}
}
