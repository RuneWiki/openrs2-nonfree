import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class8_Sub2_Sub31 extends Class8_Sub2 {

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!rv", name = "P", descriptor = "I")
	private int anInt8842;

	@OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
	private int anInt8848;

	@OriginalMember(owner = "client!rv", name = "X", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!rv", name = "Y", descriptor = "I")
	private int anInt8849;

	@OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
	private int anInt8838 = 81;

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
	private int anInt8837 = 4;

	@OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
	private int anInt8841 = 8;

	@OriginalMember(owner = "client!rv", name = "R", descriptor = "I")
	private int anInt8844 = 204;

	@OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
	private int anInt8836 = 1024;

	@OriginalMember(owner = "client!rv", name = "S", descriptor = "I")
	private int anInt8845 = 1024;

	@OriginalMember(owner = "client!rv", name = "U", descriptor = "I")
	private int anInt8847 = 0;

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
	private int anInt8839 = 409;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8837 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt8841 = arg1.method8525();
		} else if (arg0 == 2) {
			this.anInt8839 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt8844 = arg1.method8578();
		} else if (arg0 == 4) {
			this.anInt8836 = arg1.method8578();
		} else if (arg0 == 5) {
			this.anInt8847 = arg1.method8578();
		} else if (arg0 == 6) {
			this.anInt8838 = arg1.method8578();
		} else if (arg0 == 7) {
			this.anInt8845 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.method7288();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt8847 + Static426.anIntArray424[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt8841 > local22 && local29 >= this.anIntArray495[local22]) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(71) boolean local71 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray495[local22];
			@Pc(83) int local83 = this.anIntArray495[local22 - 1];
			if (this.anInt8848 + local83 < local29 && local76 - this.anInt8848 > local29) {
				for (@Pc(109) int local109 = 0; local109 < Static538.anInt9297; local109++) {
					@Pc(113) int local113 = 0;
					@Pc(122) int local122 = local71 ? this.anInt8836 : -this.anInt8836;
					@Pc(133) int local133;
					for (local133 = Static93.anIntArray111[local109] + (this.anInt8842 * local122 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt8837 > local113 && local133 >= this.anIntArrayArray52[local63][local113]) {
						local113++;
					}
					@Pc(172) int local172 = local113 - 1;
					@Pc(179) int local179 = this.anIntArrayArray52[local63][local113];
					@Pc(186) int local186 = this.anIntArrayArray52[local63][local172];
					if (local133 > local186 + this.anInt8848 && local133 < local179 - this.anInt8848) {
						local11[local109] = this.anIntArrayArray51[local63][local172];
					} else {
						local11[local109] = 0;
					}
				}
			} else {
				Static649.method5534(local11, 0, Static538.anInt9297, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
	private void method7288() {
		@Pc(12) Random local12 = new Random((long) this.anInt8841);
		this.anInt8849 = 4096 / this.anInt8841;
		this.anInt8842 = 4096 / this.anInt8837;
		this.anInt8848 = this.anInt8838 / 2;
		@Pc(35) int local35 = this.anInt8842 / 2;
		this.anIntArray495 = new int[this.anInt8841 + 1];
		@Pc(47) int local47 = this.anInt8849 / 2;
		this.anIntArrayArray52 = new int[this.anInt8841][this.anInt8837 + 1];
		this.anIntArrayArray51 = new int[this.anInt8841][this.anInt8837];
		this.anIntArray495[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt8841; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt8849;
				local96 = (Static221.method4149(4096, local12) - 2048) * this.anInt8844 >> 12;
				@Pc(104) int local104 = local84 + (local47 * local96 >> 12);
				this.anIntArray495[local74] = local104 + this.anIntArray495[local74 - 1];
			}
			this.anIntArrayArray52[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt8837; local84++) {
				if (local84 > 0) {
					local96 = this.anInt8842;
					@Pc(147) int local147 = (Static221.method4149(4096, local12) - 2048) * this.anInt8839 >> 12;
					local96 += local147 * local35 >> 12;
					this.anIntArrayArray52[local74][local84] = this.anIntArrayArray52[local74][local84 - 1] + local96;
				}
				this.anIntArrayArray51[local74][local84] = this.anInt8845 <= 0 ? 4096 : 4096 - Static221.method4149(this.anInt8845, local12);
			}
			this.anIntArrayArray52[local74][this.anInt8837] = 4096;
		}
		this.anIntArray495[this.anInt8841] = 4096;
	}
}
