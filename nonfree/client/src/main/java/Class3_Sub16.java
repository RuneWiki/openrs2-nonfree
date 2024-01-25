import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "F")
	protected float aFloat107;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	private final int anInt5324;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	protected int anInt5325;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	protected int anInt5332;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	protected int anInt5326;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	private final int anInt5330;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat107 = arg5;
		this.anInt5324 = arg3;
		this.anInt5325 = arg0;
		this.anInt5332 = arg2;
		this.anInt5326 = arg1;
		this.anInt5330 = arg4;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	public final int method4776() {
		return this.anInt5330;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	public final int method4777() {
		return this.anInt5326;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I")
	public final int method4778() {
		return this.anInt5325;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(FI)V")
	public abstract void method4780(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I")
	public final int method4781() {
		return this.anInt5324;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I")
	public final int method4783() {
		return this.anInt5332;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIII)V")
	public abstract void method4784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)F")
	public final float method4785() {
		return this.aFloat107;
	}
}
