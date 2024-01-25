import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
	public static final int[] anIntArray103 = new int[99];

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	public final int anInt1805;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public final int anInt1808;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	public final int anInt1809;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Z")
	public final boolean aBoolean85;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	public final int anInt1804;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	public final int anInt1807;

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 99; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) (Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D + (double) local16);
			local9 += local29;
			anIntArray103[local11] = local9 / 4;
		}
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1805 = arg1;
		this.anInt1808 = arg0;
		this.anInt1809 = arg4;
		this.aBoolean85 = arg5;
		this.anInt1804 = arg3;
		this.anInt1807 = arg2;
	}
}
