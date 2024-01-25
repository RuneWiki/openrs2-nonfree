import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!mfa", name = "r", descriptor = "F")
	protected float aFloat202;

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
	protected int anInt10996;

	@OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
	protected int anInt11009;

	@OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
	private final int anInt11008;

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
	protected int anInt10998;

	@OriginalMember(owner = "client!mfa", name = "x", descriptor = "I")
	private final int anInt11004;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat202 = arg5;
		this.anInt10996 = arg1;
		this.anInt11009 = arg2;
		this.anInt11008 = arg4;
		this.anInt10998 = arg0;
		this.anInt11004 = arg3;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)F")
	public final float method9404() {
		return this.aFloat202;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)I")
	public final int method9405() {
		return this.anInt11008;
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)I")
	public final int method9406() {
		return this.anInt11009;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)I")
	public final int method9407() {
		return this.anInt11004;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)I")
	public final int method9410() {
		return this.anInt10996;
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(Z)I")
	public final int method9411() {
		return this.anInt10998;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)V")
	public abstract void method9412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IF)V")
	public abstract void method9415(@OriginalArg(1) float arg0);
}
