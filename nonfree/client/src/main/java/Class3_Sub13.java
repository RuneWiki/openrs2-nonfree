import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
	protected int anInt7099;

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
	protected int anInt7100;

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
	private final int anInt7101;

	@OriginalMember(owner = "client!uaa", name = "v", descriptor = "F")
	protected float aFloat139;

	@OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
	private final int anInt7093;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
	protected int anInt7095;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7099 = arg1;
		this.anInt7100 = arg2;
		this.anInt7101 = arg4;
		this.aFloat139 = arg5;
		this.anInt7093 = arg3;
		this.anInt7095 = arg0;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)I")
	public final int method5957() {
		return this.anInt7101;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)I")
	public final int method5958() {
		return this.anInt7095;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	public final int method5960() {
		return this.anInt7100;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)F")
	public final float method5961() {
		return this.aFloat139;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)I")
	public final int method5962() {
		return this.anInt7093;
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I")
	public final int method5963() {
		return this.anInt7099;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BIII)V")
	public abstract void method5964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IF)V")
	public abstract void method5965(@OriginalArg(1) float arg0);
}
