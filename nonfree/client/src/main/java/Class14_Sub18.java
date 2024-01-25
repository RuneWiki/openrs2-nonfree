import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class Class14_Sub18 extends Class14 {

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
	private final int anInt9683;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
	protected int anInt9684;

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
	protected int anInt9677;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
	private final int anInt9678;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	protected int anInt9679;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "F")
	protected float aFloat189;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class14_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9683 = arg3;
		this.anInt9684 = arg0;
		this.anInt9677 = arg2;
		this.anInt9678 = arg4;
		this.anInt9679 = arg1;
		this.aFloat189 = arg5;
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)F")
	public final float method8339() {
		return this.aFloat189;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(FI)V")
	public abstract void method8340(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)I")
	public final int method8341() {
		return this.anInt9677;
	}

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)I")
	public final int method8342() {
		return this.anInt9684;
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)I")
	public final int method8343() {
		return this.anInt9683;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)I")
	public final int method8344() {
		return this.anInt9679;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)I")
	public final int method8345() {
		return this.anInt9678;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIB)V")
	public abstract void method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
