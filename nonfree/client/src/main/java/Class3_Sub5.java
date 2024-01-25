import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
	protected int anInt8419;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	protected int anInt8410;

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "F")
	protected float aFloat129;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
	private final int anInt8418;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
	private final int anInt8409;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
	protected int anInt8408;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt8419 = arg2;
		this.anInt8410 = arg0;
		this.aFloat129 = arg5;
		this.anInt8418 = arg3;
		this.anInt8409 = arg4;
		this.anInt8408 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(FI)V")
	public abstract void method7171(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)I")
	public final int method7172() {
		return this.anInt8409;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)I")
	public final int method7173() {
		return this.anInt8418;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	public final int method7174() {
		return this.anInt8410;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	public final int method7175() {
		return this.anInt8408;
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)F")
	public final float method7176() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)I")
	public final int method7177() {
		return this.anInt8419;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIII)V")
	public abstract void method7178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
