import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
	protected int anInt9268;

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
	private final int anInt9261;

	@OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
	protected int anInt9267;

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
	protected int anInt9262;

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
	private final int anInt9270;

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "F")
	protected float aFloat149;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9268 = arg2;
		this.anInt9261 = arg4;
		this.anInt9267 = arg1;
		this.anInt9262 = arg0;
		this.anInt9270 = arg3;
		this.aFloat149 = arg5;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V")
	public abstract void method8165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(FI)V")
	public abstract void method8167(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)F")
	public final float method8169() {
		return this.aFloat149;
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)I")
	public final int method8170() {
		return this.anInt9261;
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)I")
	public final int method8171() {
		return this.anInt9262;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)I")
	public final int method8172() {
		return this.anInt9268;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	public final int method8173() {
		return this.anInt9270;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)I")
	public final int method8174() {
		return this.anInt9267;
	}
}
