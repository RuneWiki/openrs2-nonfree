import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	private final int anInt7262;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	protected int anInt7256;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	protected int anInt7259;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	protected int anInt7261;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	private final int anInt7265;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "F")
	protected float aFloat106;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7262 = arg3;
		this.anInt7256 = arg2;
		this.anInt7259 = arg0;
		this.anInt7261 = arg1;
		this.anInt7265 = arg4;
		this.aFloat106 = arg5;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
	public abstract void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	public final int method5687() {
		return this.anInt7259;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BF)V")
	public abstract void method5688(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)I")
	public final int method5691() {
		return this.anInt7262;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I")
	public final int method5692() {
		return this.anInt7265;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)I")
	public final int method5693() {
		return this.anInt7256;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)F")
	public final float method5694() {
		return this.aFloat106;
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)I")
	public final int method5695() {
		return this.anInt7261;
	}
}
