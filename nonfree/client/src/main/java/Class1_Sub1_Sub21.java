import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	private int anInt3453 = 3072;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	private int anInt3456 = 2048;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
	private int anInt3457 = 1024;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(23) int[] local23 = this.method4716(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static62.anInt1350; local25++) {
				local13[local25] = this.anInt3457 + (local23[local25] * this.anInt3456 >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(28) int[][] local28 = this.method4715(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[2];
			@Pc(40) int[] local40 = local28[1];
			@Pc(44) int[] local44 = local17[1];
			@Pc(48) int[] local48 = local17[2];
			@Pc(52) int[] local52 = local17[0];
			for (@Pc(54) int local54 = 0; local54 < Static62.anInt1350; local54++) {
				local52[local54] = (this.anInt3456 * local32[local54] >> 12) + this.anInt3457;
				local44[local54] = (this.anInt3456 * local40[local54] >> 12) + this.anInt3457;
				local48[local54] = this.anInt3457 + (this.anInt3456 * local36[local54] >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.anInt3456 = this.anInt3453 - this.anInt3457;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3457 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt3453 = arg0.method2244();
		} else if (arg1 == 2) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}
}
