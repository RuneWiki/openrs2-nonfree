import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
	private int anInt4569;

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!wa", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	private int anInt4562 = 8;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	private int anInt4565 = 1024;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	private int anInt4558 = 1024;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
	private int anInt4564 = 409;

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
	private int anInt4568 = 204;

	@OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
	private int anInt4573 = 4;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
	private int anInt4566 = 81;

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
	private int anInt4576 = 0;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.method3354();
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	private void method3354() {
		@Pc(14) Random local14 = new Random((long) this.anInt4562);
		this.anInt4569 = 4096 / this.anInt4573;
		this.anIntArrayArray77 = new int[this.anInt4562][this.anInt4573];
		this.anInt4574 = 4096 / this.anInt4562;
		@Pc(42) int local42 = this.anInt4569 / 2;
		this.anInt4571 = this.anInt4566 / 2;
		this.anIntArrayArray76 = new int[this.anInt4562][this.anInt4573 + 1];
		@Pc(62) int local62 = this.anInt4574 / 2;
		this.anIntArray614 = new int[this.anInt4562 + 1];
		this.anIntArray614[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4562; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt4574;
				local98 = (Static199.method3113(4096, local14) - 2048) * this.anInt4568 >> 12;
				@Pc(106) int local106 = local86 + (local62 * local98 >> 12);
				this.anIntArray614[local76] = local106 + this.anIntArray614[local76 - 1];
			}
			this.anIntArrayArray76[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt4573; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4569;
					@Pc(146) int local146 = (Static199.method3113(4096, local14) - 2048) * this.anInt4564 >> 12;
					local98 += local42 * local146 >> 12;
					this.anIntArrayArray76[local76][local86] = local98 + this.anIntArrayArray76[local76][local86 - 1];
				}
				this.anIntArrayArray77[local76][local86] = this.anInt4558 > 0 ? 4096 - Static199.method3113(this.anInt4558, local14) : 4096;
			}
			this.anIntArrayArray76[local76][this.anInt4573] = 4096;
		}
		this.anIntArray614[this.anInt4562] = 4096;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4573 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt4562 = arg0.method895();
		} else if (arg1 == 2) {
			this.anInt4564 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt4568 = arg0.method946();
		} else if (arg1 == 4) {
			this.anInt4565 = arg0.method946();
		} else if (arg1 == 5) {
			this.anInt4576 = arg0.method946();
		} else if (arg1 == 6) {
			this.anInt4566 = arg0.method946();
		} else if (arg1 == 7) {
			this.anInt4558 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt4576 + Static128.anIntArray362[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt4562 > local23 && local30 >= this.anIntArray614[local23]) {
				local23++;
			}
			@Pc(65) int local65 = local23 - 1;
			@Pc(76) boolean local76 = (local23 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray614[local23];
			@Pc(88) int local88 = this.anIntArray614[local23 - 1];
			if (local30 > local88 + this.anInt4571 && local81 - this.anInt4571 > local30) {
				for (@Pc(112) int local112 = 0; local112 < Static105.anInt2391; local112++) {
					@Pc(123) int local123 = local76 ? this.anInt4565 : -this.anInt4565;
					@Pc(125) int local125 = 0;
					@Pc(136) int local136;
					for (local136 = (local123 * this.anInt4569 >> 12) + Static63.anIntArray182[local112]; local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (this.anInt4573 > local125 && local136 >= this.anIntArrayArray76[local65][local125]) {
						local125++;
					}
					@Pc(171) int local171 = this.anIntArrayArray76[local65][local125];
					@Pc(175) int local175 = local125 - 1;
					@Pc(182) int local182 = this.anIntArrayArray76[local65][local175];
					if (local182 + this.anInt4571 < local136 && local171 - this.anInt4571 > local136) {
						local17[local112] = this.anIntArrayArray77[local65][local175];
					} else {
						local17[local112] = 0;
					}
				}
			} else {
				Static221.method34(local17, 0, Static105.anInt2391, 0);
			}
		}
		return local17;
	}
}
