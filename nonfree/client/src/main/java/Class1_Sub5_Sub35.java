import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class1_Sub5_Sub35 extends Class1_Sub5 {

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
	private int anInt6066;

	@OriginalMember(owner = "client!tq", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!tq", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
	private int anInt6073;

	@OriginalMember(owner = "client!tq", name = "bb", descriptor = "I")
	private int anInt6076;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
	private int anInt6062 = 81;

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
	private int anInt6063 = 409;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
	private int anInt6065 = 1024;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
	private int anInt6068 = 1024;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
	private int anInt6067 = 4;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	private int anInt6064 = 204;

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
	private int anInt6072 = 0;

	@OriginalMember(owner = "client!tq", name = "hb", descriptor = "I")
	private int anInt6082 = 8;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6067 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt6082 = arg0.method5720();
		} else if (arg1 == 2) {
			this.anInt6063 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt6064 = arg0.method5715();
		} else if (arg1 == 4) {
			this.anInt6068 = arg0.method5715();
		} else if (arg1 == 5) {
			this.anInt6072 = arg0.method5715();
		} else if (arg1 == 6) {
			this.anInt6062 = arg0.method5715();
		} else if (arg1 == 7) {
			this.anInt6065 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V")
	private void method5261() {
		@Pc(12) Random local12 = new Random((long) this.anInt6082);
		this.anInt6066 = 4096 / this.anInt6067;
		this.anInt6073 = 4096 / this.anInt6082;
		this.anInt6076 = this.anInt6062 / 2;
		@Pc(35) int local35 = this.anInt6066 / 2;
		this.anIntArray583 = new int[this.anInt6082 + 1];
		this.anIntArrayArray49 = new int[this.anInt6082][this.anInt6067];
		this.anIntArrayArray48 = new int[this.anInt6082][this.anInt6067 + 1];
		@Pc(63) int local63 = this.anInt6073 / 2;
		this.anIntArray583[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt6082; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt6073;
				local100 = (Static304.method5274(local12, 4096) - 2048) * this.anInt6064 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local63 >> 12);
				this.anIntArray583[local78] = local108 + this.anIntArray583[local78 - 1];
			}
			this.anIntArrayArray48[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt6067; local88++) {
				if (local88 > 0) {
					local100 = this.anInt6066;
					@Pc(151) int local151 = (Static304.method5274(local12, 4096) - 2048) * this.anInt6063 >> 12;
					local100 += local35 * local151 >> 12;
					this.anIntArrayArray48[local78][local88] = local100 + this.anIntArrayArray48[local78][local88 - 1];
				}
				this.anIntArrayArray49[local78][local88] = this.anInt6065 <= 0 ? 4096 : 4096 - Static304.method5274(local12, this.anInt6065);
			}
			this.anIntArrayArray48[local78][this.anInt6067] = 4096;
		}
		this.anIntArray583[this.anInt6082] = 4096;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.method5261();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(21) int local21 = 0;
			@Pc(28) int local28;
			for (local28 = this.anInt6072 + Static191.anIntArray379[arg0]; local28 < 0; local28 += 4096) {
			}
			while (local28 > 4096) {
				local28 -= 4096;
			}
			while (this.anInt6082 > local21 && local28 >= this.anIntArray583[local21]) {
				local21++;
			}
			@Pc(61) int local61 = local21 - 1;
			@Pc(72) boolean local72 = (local21 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray583[local21];
			@Pc(84) int local84 = this.anIntArray583[local21 - 1];
			if (local28 > local84 + this.anInt6076 && local28 < local77 - this.anInt6076) {
				for (@Pc(99) int local99 = 0; local99 < Static75.anInt1566; local99++) {
					@Pc(103) int local103 = 0;
					@Pc(112) int local112 = local72 ? this.anInt6068 : -this.anInt6068;
					@Pc(123) int local123;
					for (local123 = (this.anInt6066 * local112 >> 12) + Static49.anIntArray492[local99]; local123 < 0; local123 += 4096) {
					}
					while (local123 > 4096) {
						local123 -= 4096;
					}
					while (this.anInt6067 > local103 && local123 >= this.anIntArrayArray48[local61][local103]) {
						local103++;
					}
					@Pc(166) int local166 = local103 - 1;
					@Pc(173) int local173 = this.anIntArrayArray48[local61][local103];
					@Pc(180) int local180 = this.anIntArrayArray48[local61][local166];
					if (local123 > this.anInt6076 + local180 && local173 - this.anInt6076 > local123) {
						local11[local99] = this.anIntArrayArray49[local61][local166];
					} else {
						local11[local99] = 0;
					}
				}
			} else {
				Static361.method1852(local11, 0, Static75.anInt1566, 0);
			}
		}
		return local11;
	}
}
