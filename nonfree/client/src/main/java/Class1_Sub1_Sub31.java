import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
	private int anInt3610 = 3216;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
	private int anInt3611 = 4096;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "[I")
	private final int[] anIntArray426 = new int[3];

	@OriginalMember(owner = "client!ra", name = "wb", descriptor = "I")
	private int anInt3618 = 3216;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3611 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt3610 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt3618 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.method2745();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(30) int local30 = Static179.anInt4027 * this.anInt3611 >> 12;
			@Pc(40) int[] local40 = this.method3303(arg0 - 1 & Static134.anInt3338, 0);
			@Pc(46) int[] local46 = this.method3303(arg0, 0);
			@Pc(58) int[] local58 = this.method3303(Static134.anInt3338 & arg0 + 1, 0);
			for (@Pc(60) int local60 = 0; local60 < Static176.anInt3921; local60++) {
				@Pc(75) int local75 = local30 * (local58[local60] - local40[local60]) >> 12;
				@Pc(96) int local96 = local30 * (local46[Static70.anInt1730 & local60 - 1] - local46[local60 + 1 & Static70.anInt1730]) >> 12;
				@Pc(100) int local100 = local96 >> 4;
				@Pc(104) int local104 = local75 >> 4;
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(140) int local140 = Class18_Sub3_Sub1.aByteArray46[(local104 * (local104 + 1) >> 1) + local100] & 0xFF;
				@Pc(146) int local146 = local140 * 4096 >> 8;
				@Pc(152) int local152 = local140 * local75 >> 8;
				@Pc(158) int local158 = local140 * local96 >> 8;
				@Pc(167) int local167 = this.anIntArray426[1] * local152 >> 12;
				@Pc(176) int local176 = this.anIntArray426[2] * local146 >> 12;
				@Pc(185) int local185 = this.anIntArray426[0] * local158 >> 12;
				local19[local60] = local176 + local185 + local167;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
	private void method2745() {
		@Pc(15) double local15 = Math.cos((double) ((float) this.anInt3618 / 4096.0F));
		this.anIntArray426[0] = (int) (Math.sin((double) ((float) this.anInt3610 / 4096.0F)) * 4096.0D * local15);
		this.anIntArray426[1] = (int) (local15 * Math.cos((double) ((float) this.anInt3610 / 4096.0F)) * 4096.0D);
		this.anIntArray426[2] = (int) (Math.sin((double) ((float) this.anInt3618 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray426[0] * this.anIntArray426[0] >> 12;
		@Pc(85) int local85 = this.anIntArray426[2] * this.anIntArray426[2] >> 12;
		@Pc(97) int local97 = this.anIntArray426[1] * this.anIntArray426[1] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local73 + local85 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray426[2] = (this.anIntArray426[2] << 12) / local110;
			this.anIntArray426[0] = (this.anIntArray426[0] << 12) / local110;
			this.anIntArray426[1] = (this.anIntArray426[1] << 12) / local110;
		}
	}
}
