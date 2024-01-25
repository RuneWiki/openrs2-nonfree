import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class5_Sub33 extends Class5 {

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[16384];

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "[F")
	public static final float[] aFloatArray49 = new float[16384];

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	private final int anInt5701;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
	private final int anInt5688;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	private final int anInt5695;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	public final int anInt5698;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public final int anInt5699;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	private final int anInt5700;

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
	private final int anInt5693;

	static {
		@Pc(70) double local70 = 3.834951969714103E-4D;
		for (@Pc(72) int local72 = 0; local72 < 16384; local72++) {
			aFloatArray49[local72] = (float) Math.sin((double) local72 * local70);
			aFloatArray48[local72] = (float) Math.cos((double) local72 * local70);
		}
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5701 = arg4;
		this.anInt5688 = arg3;
		this.anInt5695 = arg0;
		this.anInt5698 = arg6;
		this.anInt5692 = arg5;
		this.anInt5699 = arg8;
		this.anInt5690 = arg7;
		this.anInt5700 = arg2;
		this.anInt5693 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III[I)V")
	public void method5105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt5698 - this.anInt5700;
		arg2[1] = arg0 + this.anInt5692 - this.anInt5693;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[II)V")
	public void method5106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt5695;
		arg2[2] = this.anInt5700 + arg1 - this.anInt5698;
		arg2[1] = arg0 + this.anInt5693 - this.anInt5692;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Z")
	public boolean method5107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt5695 && arg2 >= this.anInt5693 && this.anInt5688 >= arg2 && this.anInt5700 <= arg1 && this.anInt5701 >= arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)Z")
	public boolean method5108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5692 <= arg1 && this.anInt5690 >= arg1 && arg0 >= this.anInt5698 && this.anInt5699 >= arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)Z")
	public boolean method5109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5693 && arg1 <= this.anInt5688 && this.anInt5700 <= arg0 && arg0 <= this.anInt5701;
	}
}
