import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!it", name = "l", descriptor = "[I")
	public static final int[] anIntArray291 = new int[32];

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
	public final int[] anIntArray292;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
	public final int[] anIntArray290;

	static {
		@Pc(15) int local15 = 2;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			anIntArray291[local17] = local15 - 1;
			local15 += local15;
		}
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II[I[I)V")
	public Class119_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray292 = arg2;
		this.anIntArray290 = arg3;
	}
}
