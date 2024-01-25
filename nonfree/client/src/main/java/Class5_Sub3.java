import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
	protected int anInt9992;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
	private final int anInt9996;

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
	private final int anInt10004;

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
	protected int anInt10002;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
	protected int anInt9999;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "F")
	protected float aFloat176;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9992 = arg1;
		this.anInt9996 = arg3;
		this.anInt10004 = arg4;
		this.anInt10002 = arg0;
		this.anInt9999 = arg2;
		this.aFloat176 = arg5;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	public final int method8313() {
		return this.anInt9992;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)F")
	public final float method8314() {
		return this.aFloat176;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIII)V")
	public abstract void method8316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)I")
	public final int method8317() {
		return this.anInt10002;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)I")
	public final int method8319() {
		return this.anInt9996;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IF)V")
	public abstract void method8321(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "(I)I")
	public final int method8322() {
		return this.anInt10004;
	}

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "(I)I")
	public final int method8323() {
		return this.anInt9999;
	}
}
