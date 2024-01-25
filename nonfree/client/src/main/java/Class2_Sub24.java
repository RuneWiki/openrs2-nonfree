import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	protected int anInt7449;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	protected int anInt7450;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private final int anInt7458;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	protected int anInt7460;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private final int anInt7448;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "F")
	protected float aFloat149;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7449 = arg0;
		this.anInt7450 = arg2;
		this.anInt7458 = arg3;
		this.anInt7460 = arg1;
		this.anInt7448 = arg4;
		this.aFloat149 = arg5;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	public final int method6299() {
		return this.anInt7449;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
	public final int method6301() {
		return this.anInt7450;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	public final int method6302() {
		return this.anInt7458;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
	public final int method6305() {
		return this.anInt7448;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)F")
	public final float method6307() {
		return this.aFloat149;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)I")
	public final int method6308() {
		return this.anInt7460;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBII)V")
	public abstract void method6309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IF)V")
	public abstract void method6310(@OriginalArg(1) float arg0);
}
