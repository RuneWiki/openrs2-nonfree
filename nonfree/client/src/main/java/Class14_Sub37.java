import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class Class14_Sub37 extends Class14 {

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "F")
	protected float aFloat234;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	protected int anInt9452;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	private final int anInt9458;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	protected int anInt9457;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
	private final int anInt9464;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	protected int anInt9465;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIF)V")
	public Class14_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat234 = arg5;
		this.anInt9452 = arg1;
		this.anInt9458 = arg4;
		this.anInt9457 = arg0;
		this.anInt9464 = arg3;
		this.anInt9465 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
	public final int method7819() {
		return this.anInt9464;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I")
	public final int method7820() {
		return this.anInt9458;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIB)V")
	public abstract void method7821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)I")
	public final int method7823() {
		return this.anInt9452;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)F")
	public final float method7825() {
		return this.aFloat234;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	public final int method7826() {
		return this.anInt9465;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	public final int method7827() {
		return this.anInt9457;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(FI)V")
	public abstract void method7829(@OriginalArg(0) float arg0);
}
