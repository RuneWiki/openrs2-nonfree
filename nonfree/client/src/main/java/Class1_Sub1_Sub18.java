import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
	private int anInt3573 = 4096;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(30) int[] local30 = this.method6013(arg0 - 1 & Static279.anInt5435, 0);
			@Pc(36) int[] local36 = this.method6013(arg0, 0);
			@Pc(46) int[] local46 = this.method6013(arg0 + 1 & Static279.anInt5435, 0);
			for (@Pc(48) int local48 = 0; local48 < Static85.anInt1910; local48++) {
				@Pc(62) int local62 = this.anInt3573 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = (local36[Static346.anInt6542 & local48 + 1] - local36[Static346.anInt6542 & local48 - 1]) * this.anInt3573;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local124;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3573 = arg1.method2161();
		}
	}
}
