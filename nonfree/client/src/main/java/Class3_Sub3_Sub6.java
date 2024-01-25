import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public abstract class Class3_Sub3_Sub6 extends Class3_Sub3 {

	@OriginalMember(owner = "client!me", name = "v", descriptor = "[I")
	public static final int[] anIntArray351 = new int[120];

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	public final int anInt5706;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray351[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub3_Sub6(@OriginalArg(0) int arg0) {
		this.anInt5706 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4737();

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
	public abstract boolean method4739();
}
