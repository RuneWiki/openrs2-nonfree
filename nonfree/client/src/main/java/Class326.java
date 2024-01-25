import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class326 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
	public static final int[] anIntArray574 = new int[4096];

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt9373;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt9375;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt9383;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt9376 = 128;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt9381 = 128;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt9380;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray574[local4] = Static203.method3550(local4);
		}
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
	public Class326(@OriginalArg(0) int arg0) {
		this.anInt9380 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII)V")
	private Class326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9373 = arg4;
		this.anInt9383 = arg3;
		this.anInt9375 = arg5;
		this.anInt9381 = arg2;
		this.anInt9380 = arg0;
		this.anInt9376 = arg1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method7971(@OriginalArg(0) Class326 arg0) {
		this.anInt9373 = arg0.anInt9373;
		this.anInt9381 = arg0.anInt9381;
		this.anInt9376 = arg0.anInt9376;
		this.anInt9383 = arg0.anInt9383;
		this.anInt9375 = arg0.anInt9375;
		this.anInt9380 = arg0.anInt9380;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lclient!ti;")
	public Class326 method7973() {
		return new Class326(this.anInt9380, this.anInt9376, this.anInt9381, this.anInt9383, this.anInt9373, this.anInt9375);
	}
}
