import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
	public static final int[] anIntArray33 = new int[32];

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public final int anInt241;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	public final int anInt240;

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray33[local16] = local14 - 1;
			local14 += local14;
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt241 = arg0;
		this.anInt240 = arg1;
	}
}
