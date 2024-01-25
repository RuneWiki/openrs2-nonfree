import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class143 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
	public static final int[] anIntArray347 = new int[32];

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public final int anInt4099;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public final int anInt4094;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public final int anInt4100;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public final int anInt4098;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray347[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIII)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4099 = arg1;
		this.anInt4094 = arg2;
		this.anInt4100 = arg3;
		this.anInt4098 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!ih;")
	public Class143 method3513(@OriginalArg(1) int arg0) {
		return new Class143(this.anInt4098, arg0, this.anInt4094, this.anInt4100);
	}
}
