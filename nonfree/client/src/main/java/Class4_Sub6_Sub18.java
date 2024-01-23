import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class4_Sub6_Sub18 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
	private int anInt2921 = 4096;

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
	private int anInt2919 = 4096;

	@OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
	private int anInt2922 = 4096;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2922 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt2919 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt2921 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(20) int[][] local20 = this.method4377(arg0, 0);
			@Pc(24) int[] local24 = local20[0];
			@Pc(28) int[] local28 = local7[0];
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local7[2];
			@Pc(40) int[] local40 = local20[2];
			@Pc(44) int[] local44 = local7[1];
			for (@Pc(46) int local46 = 0; local46 < Static2.anInt19; local46++) {
				@Pc(53) int local53 = local24[local46];
				@Pc(57) int local57 = local40[local46];
				@Pc(61) int local61 = local32[local46];
				if (local57 == local53 && local61 == local57) {
					local28[local46] = this.anInt2922 * local53 >> 12;
					local44[local46] = local57 * this.anInt2919 >> 12;
					local36[local46] = local61 * this.anInt2921 >> 12;
				} else {
					local28[local46] = this.anInt2922;
					local44[local46] = this.anInt2919;
					local36[local46] = this.anInt2921;
				}
			}
		}
		return local7;
	}
}
