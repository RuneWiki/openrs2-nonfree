import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
	private int anInt3975 = 4096;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(30) int[] local30 = this.method3733(arg0 - 1 & Static148.anInt3213, 0);
			@Pc(36) int[] local36 = this.method3733(arg0, 0);
			@Pc(46) int[] local46 = this.method3733(Static148.anInt3213 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static157.anInt3431; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt3975;
				@Pc(82) int local82 = this.anInt3975 * (local36[local48 + 1 & Static74.anInt1679] - local36[local48 - 1 & Static74.anInt1679]);
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

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3975 = arg0.method3805();
		}
	}
}
