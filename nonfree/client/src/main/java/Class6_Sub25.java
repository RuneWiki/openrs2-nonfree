import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "F")
	protected float aFloat172;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	private final int anInt8049;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	protected int anInt8055;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	protected int anInt8053;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	protected int anInt8056;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	private final int anInt8054;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat172 = arg5;
		this.anInt8049 = arg3;
		this.anInt8055 = arg0;
		this.anInt8053 = arg2;
		this.anInt8056 = arg1;
		this.anInt8054 = arg4;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	public final int method6398() {
		return this.anInt8049;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	public final int method6400() {
		return this.anInt8053;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)I")
	public final int method6402() {
		return this.anInt8056;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public abstract void method6404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)I")
	public final int method6405() {
		return this.anInt8055;
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)F")
	public final float method6407() {
		return this.aFloat172;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(FB)V")
	public abstract void method6408(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(Z)I")
	public final int method6409(@OriginalArg(0) boolean arg0) {
		return this.anInt8054;
	}
}
