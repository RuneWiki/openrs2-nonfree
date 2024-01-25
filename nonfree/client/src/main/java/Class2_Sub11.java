import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	private final int anInt9099;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	protected int anInt9089;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	private final int anInt9096;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	protected int anInt9095;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "F")
	protected float aFloat236;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	protected int anInt9094;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9099 = arg4;
		this.anInt9089 = arg2;
		this.anInt9096 = arg3;
		this.anInt9095 = arg1;
		this.aFloat236 = arg5;
		this.anInt9094 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
	public final int method7270() {
		return this.anInt9095;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
	public final int method7271() {
		return this.anInt9089;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)I")
	public final int method7274() {
		return this.anInt9099;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(FB)V")
	public abstract void method7275(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	public final int method7276() {
		return this.anInt9094;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I")
	public final int method7277() {
		return this.anInt9096;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public abstract void method7278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)F")
	public final float method7280() {
		return this.aFloat236;
	}
}
