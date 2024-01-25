import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 {

	@OriginalMember(owner = "client!bt", name = "P", descriptor = "[I")
	public static final int[] anIntArray54 = new int[99];

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
	private int anInt660 = 4096;

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 99; local18++) {
			@Pc(23) int local23 = local18 + 1;
			@Pc(36) int local36 = (int) ((double) local23 + Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D);
			local16 += local36;
			anIntArray54[local18] = local16 / 4;
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(30) int[] local30 = this.method6040(Static204.anInt3610 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method6040(arg0, 0);
			@Pc(46) int[] local46 = this.method6040(Static204.anInt3610 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static419.anInt6404; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt660;
				@Pc(82) int local82 = (local36[local48 + 1 & Static211.anInt3669] - local36[local48 - 1 & Static211.anInt3669]) * this.anInt660;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local127;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt660 = arg1.method5028();
		}
	}
}
