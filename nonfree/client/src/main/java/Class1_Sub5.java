import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	protected int anInt3991;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	protected int anInt3996;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	private final int anInt3994;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "F")
	protected float aFloat75;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	protected int anInt3998;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	private final int anInt3997;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt3991 = arg1;
		this.anInt3996 = arg2;
		this.anInt3994 = arg3;
		this.aFloat75 = arg5;
		this.anInt3998 = arg0;
		this.anInt3997 = arg4;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
	public final int method3325() {
		return this.anInt3996;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	public final int method3326() {
		return this.anInt3991;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)I")
	public final int method3327() {
		return this.anInt3994;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)F")
	public final float method3328() {
		return this.aFloat75;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BF)V")
	public abstract void method3329(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	public final int method3331() {
		return this.anInt3997;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIII)V")
	public abstract void method3332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)I")
	public final int method3333() {
		return this.anInt3998;
	}
}
