import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
	protected int anInt7671;

	@OriginalMember(owner = "client!cp", name = "D", descriptor = "F")
	protected float aFloat167;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	protected int anInt7667;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	private final int anInt7676;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	private final int anInt7665;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
	protected int anInt7674;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7671 = arg1;
		this.aFloat167 = arg5;
		this.anInt7667 = arg0;
		this.anInt7676 = arg3;
		this.anInt7665 = arg4;
		this.anInt7674 = arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
	public final int method5990() {
		return this.anInt7671;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
	public abstract void method5991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
	public final int method5994() {
		return this.anInt7665;
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)F")
	public final float method5996() {
		return this.aFloat167;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)I")
	public final int method5997() {
		return this.anInt7667;
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(B)I")
	public final int method5999() {
		return this.anInt7674;
	}

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "(B)I")
	public final int method6000() {
		return this.anInt7676;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IF)V")
	public abstract void method6001(@OriginalArg(1) float arg0);
}
