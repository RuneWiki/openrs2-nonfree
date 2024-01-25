import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public abstract class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
	public static final int[] anIntArray395 = new int[120];

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
	protected int anInt6726;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "F")
	protected float aFloat190;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	private final int anInt6730;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	protected int anInt6720;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
	private final int anInt6723;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	protected int anInt6729;

	static {
		@Pc(37) int local37 = 0;
		for (@Pc(39) int local39 = 0; local39 < 120; local39++) {
			@Pc(44) int local44 = local39 + 1;
			@Pc(57) int local57 = (int) ((double) local44 + Math.pow(2.0D, (double) local44 / 7.0D) * 300.0D);
			local37 += local57;
			anIntArray395[local39] = local37 / 4;
		}
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6726 = arg1;
		this.aFloat190 = arg5;
		this.anInt6730 = arg4;
		this.anInt6720 = arg0;
		this.anInt6723 = arg3;
		this.anInt6729 = arg2;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
	public final int method5624() {
		return this.anInt6723;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
	public final int method5626() {
		return this.anInt6730;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I")
	public final int method5627() {
		return this.anInt6720;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I")
	public final int method5628() {
		return this.anInt6726;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZII)V")
	public abstract void method5629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I")
	public final int method5630() {
		return this.anInt6729;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)F")
	public final float method5631() {
		return this.aFloat190;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BF)V")
	public abstract void method5632(@OriginalArg(1) float arg0);
}
