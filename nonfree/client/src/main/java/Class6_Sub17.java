import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
	protected int anInt10094;

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "F")
	protected float aFloat195;

	@OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
	private final int anInt10091;

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
	protected int anInt10088;

	@OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
	private final int anInt10095;

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
	protected int anInt10089;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt10094 = arg0;
		this.aFloat195 = arg5;
		this.anInt10091 = arg4;
		this.anInt10088 = arg1;
		this.anInt10095 = arg3;
		this.anInt10089 = arg2;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)I")
	public final int method8518() {
		return this.anInt10094;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I")
	public final int method8519() {
		return this.anInt10091;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)I")
	public final int method8520() {
		return this.anInt10095;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)I")
	public final int method8521() {
		return this.anInt10089;
	}

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "(I)I")
	public final int method8522() {
		return this.anInt10088;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IF)V")
	public abstract void method8523(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "(I)F")
	public final float method8524() {
		return this.aFloat195;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(IIII)V")
	public abstract void method8526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
