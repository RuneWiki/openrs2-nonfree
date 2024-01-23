import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	private int anInt1577 = 4096;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(30) int[] local30 = this.method4464(arg0 - 1 & Static202.anInt3956, 0);
			@Pc(36) int[] local36 = this.method4464(arg0, 0);
			@Pc(46) int[] local46 = this.method4464(Static202.anInt3956 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static6.anInt4960; local48++) {
				@Pc(74) int local74 = (local36[Static274.anInt5042 & local48 + 1] - local36[local48 - 1 & Static274.anInt5042]) * this.anInt1577;
				@Pc(78) int local78 = local74 >> 12;
				@Pc(90) int local90 = (local46[local48] - local30[local48]) * this.anInt1577;
				@Pc(94) int local94 = local90 >> 12;
				@Pc(100) int local100 = local78 * local78 >> 12;
				@Pc(106) int local106 = local94 * local94 >> 12;
				@Pc(120) int local120 = (int) (Math.sqrt((double) ((float) (local106 + local100 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local120 == 0 ? 0 : 16777216 / local120;
				local16[local48] = 4096 - local131;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1577 = arg0.method1879();
		}
	}
}
