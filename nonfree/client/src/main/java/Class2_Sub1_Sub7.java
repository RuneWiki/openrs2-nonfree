import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	private int anInt1209 = 4096;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(36) int[] local36 = this.method6037(Static36.anInt893 & arg0 - 1, 0);
			@Pc(42) int[] local42 = this.method6037(arg0, 0);
			@Pc(52) int[] local52 = this.method6037(arg0 + 1 & Static36.anInt893, 0);
			for (@Pc(54) int local54 = 0; local54 < Static131.anInt2581; local54++) {
				@Pc(68) int local68 = (local52[local54] - local36[local54]) * this.anInt1209;
				@Pc(88) int local88 = this.anInt1209 * (local42[local54 + 1 & Static287.anInt5227] - local42[Static287.anInt5227 & local54 - 1]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local123 == 0 ? 0 : 16777216 / local123;
				local22[local54] = 4096 - local131;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1209 = arg1.method3711();
		}
	}
}
