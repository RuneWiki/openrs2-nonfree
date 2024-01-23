import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "[I")
	private int[] anIntArray204 = new int[3];

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	private int anInt2328 = 4096;

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "I")
	private int anInt2335 = 3216;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
	private int anInt2334 = 3216;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	private void method2013() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2334 / 4096.0F));
		this.anIntArray204[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt2335 / 4096.0F)));
		this.anIntArray204[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2335 / 4096.0F)));
		this.anIntArray204[2] = (int) (Math.sin((double) ((float) this.anInt2334 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray204[1] * this.anIntArray204[1] >> 12;
		@Pc(89) int local89 = this.anIntArray204[2] * this.anIntArray204[2] >> 12;
		@Pc(101) int local101 = this.anIntArray204[0] * this.anIntArray204[0] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local89 + local69 + local101 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray204[0] = (this.anIntArray204[0] << 12) / local114;
			this.anIntArray204[1] = (this.anIntArray204[1] << 12) / local114;
			this.anIntArray204[2] = (this.anIntArray204[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(31) int local31 = Static157.anInt1467 * this.anInt2328 >> 12;
			@Pc(41) int[] local41 = this.method4750(arg0 - 1 & Static171.anInt3359, 0);
			@Pc(47) int[] local47 = this.method4750(arg0, 0);
			@Pc(57) int[] local57 = this.method4750(Static171.anInt3359 & arg0 + 1, 0);
			for (@Pc(59) int local59 = 0; local59 < Static182.anInt3492; local59++) {
				@Pc(79) int local79 = (local57[local59] - local41[local59]) * local31 >> 12;
				@Pc(100) int local100 = local31 * (local47[Static61.anInt1166 & local59 - 1] - local47[Static61.anInt1166 & local59 + 1]) >> 12;
				@Pc(104) int local104 = local79 >> 4;
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(123) int local123 = local100 >> 4;
				if (local123 < 0) {
					local123 = -local123;
				}
				if (local123 > 255) {
					local123 = 255;
				}
				@Pc(148) int local148 = Class70.aByteArray27[((local104 + 1) * local104 >> 1) + local123] & 0xFF;
				@Pc(154) int local154 = local148 * 4096 >> 8;
				@Pc(163) int local163 = this.anIntArray204[2] * local154 >> 12;
				@Pc(169) int local169 = local148 * local100 >> 8;
				@Pc(178) int local178 = this.anIntArray204[0] * local169 >> 12;
				@Pc(184) int local184 = local79 * local148 >> 8;
				@Pc(193) int local193 = local184 * this.anIntArray204[1] >> 12;
				local19[local59] = local178 + local193 + local163;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2328 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt2335 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt2334 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.method2013();
	}
}
