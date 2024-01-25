import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!at", name = "k", descriptor = "[I")
	public static final int[] anIntArray19 = new int[32];

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	public final int anInt305;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "I")
	public final int anInt306;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray19[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(II)V")
	public Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt305 = arg0;
		this.anInt306 = arg1;
	}
}
