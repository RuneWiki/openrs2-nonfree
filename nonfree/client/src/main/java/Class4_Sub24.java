import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "F")
	protected float aFloat216;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	protected int anInt8752;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	protected int anInt8753;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	private final int anInt8757;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
	private final int anInt8760;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	protected int anInt8755;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat216 = arg5;
		this.anInt8752 = arg0;
		this.anInt8753 = arg1;
		this.anInt8757 = arg3;
		this.anInt8760 = arg4;
		this.anInt8755 = arg2;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	public final int method7142() {
		return this.anInt8755;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)F")
	public final float method7144() {
		return this.aFloat216;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)I")
	public final int method7145() {
		return this.anInt8752;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZ)V")
	public abstract void method7146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
	public final int method7147() {
		return this.anInt8753;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BF)V")
	public abstract void method7148(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I")
	public final int method7149() {
		return this.anInt8760;
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
	public final int method7151() {
		return this.anInt8757;
	}
}
