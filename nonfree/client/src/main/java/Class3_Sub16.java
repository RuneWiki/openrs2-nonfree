import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	protected int anInt7559;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	private final int anInt7555;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
	protected int anInt7550;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
	private final int anInt7549;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
	protected int anInt7551;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "F")
	protected float aFloat142;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7559 = arg2;
		this.anInt7555 = arg4;
		this.anInt7550 = arg1;
		this.anInt7549 = arg3;
		this.anInt7551 = arg0;
		this.aFloat142 = arg5;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I")
	public final int method6320() {
		return this.anInt7559;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FB)V")
	public abstract void method6321(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)I")
	public final int method6322() {
		return this.anInt7550;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)I")
	public final int method6323() {
		return this.anInt7551;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)I")
	public final int method6324() {
		return this.anInt7549;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
	public final int method6325() {
		return this.anInt7555;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)F")
	public final float method6326() {
		return this.aFloat142;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBII)V")
	public abstract void method6327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
