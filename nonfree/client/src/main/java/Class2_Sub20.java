import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	protected int anInt7272;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	private final int anInt7284;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	protected int anInt7279;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "F")
	protected float aFloat104;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	private final int anInt7276;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	protected int anInt7282;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7272 = arg0;
		this.anInt7284 = arg3;
		this.anInt7279 = arg2;
		this.aFloat104 = arg5;
		this.anInt7276 = arg4;
		this.anInt7282 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
	public final int method5735() {
		return this.anInt7276;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)F")
	public final float method5737() {
		return this.aFloat104;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IF)V")
	public abstract void method5738(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
	public final int method5739() {
		return this.anInt7282;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	public final int method5740() {
		return this.anInt7272;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
	public final int method5741() {
		return this.anInt7279;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIB)V")
	public abstract void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
	public final int method5743() {
		return this.anInt7284;
	}
}
