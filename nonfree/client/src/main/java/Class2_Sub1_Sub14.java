import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
	private int anInt1954 = 3216;

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "[I")
	private int[] anIntArray195 = new int[3];

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
	private int anInt1956 = 3216;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt1949 = 4096;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.method1381();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(30) int local30 = this.anInt1949 * Static39.anInt1065 >> 12;
			@Pc(40) int[] local40 = this.method3203(Static195.anInt4423 & arg0 - 1, 0);
			@Pc(46) int[] local46 = this.method3203(arg0, 0);
			@Pc(56) int[] local56 = this.method3203(Static195.anInt4423 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static62.anInt1675; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[Static41.anInt1259 & local58 - 1] - local46[local58 + 1 & Static41.anInt1259]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(112) int local112 = local73 >> 4;
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				@Pc(138) int local138 = Class60.aByteArray54[((local112 + 1) * local112 >> 1) + local98] & 0xFF;
				@Pc(144) int local144 = local138 * 4096 >> 8;
				@Pc(153) int local153 = this.anIntArray195[2] * local144 >> 12;
				@Pc(159) int local159 = local94 * local138 >> 8;
				@Pc(168) int local168 = this.anIntArray195[0] * local159 >> 12;
				@Pc(174) int local174 = local73 * local138 >> 8;
				@Pc(183) int local183 = this.anIntArray195[1] * local174 >> 12;
				local19[local58] = local168 + local183 + local153;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1949 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt1956 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt1954 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	private void method1381() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1954 / 4096.0F));
		this.anIntArray195[0] = (int) (local11 * Math.sin((double) ((float) this.anInt1956 / 4096.0F)) * 4096.0D);
		this.anIntArray195[1] = (int) (Math.cos((double) ((float) this.anInt1956 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray195[2] = (int) (Math.sin((double) ((float) this.anInt1954 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray195[1] * this.anIntArray195[1] >> 12;
		@Pc(81) int local81 = this.anIntArray195[0] * this.anIntArray195[0] >> 12;
		@Pc(93) int local93 = this.anIntArray195[2] * this.anIntArray195[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray195[0] = (this.anIntArray195[0] << 12) / local107;
			this.anIntArray195[2] = (this.anIntArray195[2] << 12) / local107;
			this.anIntArray195[1] = (this.anIntArray195[1] << 12) / local107;
		}
	}
}
