import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class3_Sub9_Sub19 extends Class3_Sub9 {

	@OriginalMember(owner = "client!io", name = "E", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "I")
	private int anInt4568;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!io", name = "N", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "I")
	private int anInt4565 = 0;

	@OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
	private int anInt4576 = 204;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt4570 = 1024;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "I")
	private int anInt4569 = 409;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "I")
	private int anInt4571 = 4;

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	private int anInt4574 = 8;

	@OriginalMember(owner = "client!io", name = "V", descriptor = "I")
	private int anInt4580 = 81;

	@OriginalMember(owner = "client!io", name = "T", descriptor = "I")
	private int anInt4578 = 1024;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static147.anIntArray259[arg0] + this.anInt4565; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt4574 > local22 && local30 >= this.anIntArray414[local22]) {
				local22++;
			}
			@Pc(67) int local67 = local22 - 1;
			@Pc(75) boolean local75 = (local22 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray414[local22];
			@Pc(87) int local87 = this.anIntArray414[local22 - 1];
			if (local87 + this.anInt4568 < local30 && local30 < local80 - this.anInt4568) {
				for (@Pc(112) int local112 = 0; local112 < Static62.anInt1251; local112++) {
					@Pc(116) int local116 = 0;
					@Pc(125) int local125 = local75 ? this.anInt4578 : -this.anInt4578;
					@Pc(136) int local136;
					for (local136 = Static239.anIntArray394[local112] + (local125 * this.anInt4567 >> 12); local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (local116 < this.anInt4571 && this.anIntArrayArray26[local67][local116] <= local136) {
						local116++;
					}
					@Pc(175) int local175 = local116 - 1;
					@Pc(182) int local182 = this.anIntArrayArray26[local67][local116];
					@Pc(189) int local189 = this.anIntArrayArray26[local67][local175];
					if (local189 + this.anInt4568 < local136 && local182 - this.anInt4568 > local136) {
						local16[local112] = this.anIntArrayArray27[local67][local175];
					} else {
						local16[local112] = 0;
					}
				}
			} else {
				Static684.method5330(local16, 0, Static62.anInt1251, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.method4185();
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(B)V")
	private void method4185() {
		@Pc(12) Random local12 = new Random((long) this.anInt4574);
		this.anInt4568 = this.anInt4580 / 2;
		this.anInt4567 = 4096 / this.anInt4571;
		this.anInt4566 = 4096 / this.anInt4574;
		@Pc(43) int local43 = this.anInt4567 / 2;
		this.anIntArrayArray27 = new int[this.anInt4574][this.anInt4571];
		this.anIntArray414 = new int[this.anInt4574 + 1];
		@Pc(62) int local62 = this.anInt4566 / 2;
		this.anIntArrayArray26 = new int[this.anInt4574][this.anInt4571 + 1];
		this.anIntArray414[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt4574; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt4566;
				local97 = (Static371.method5392(local12, 4096) - 2048) * this.anInt4576 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local62 >> 12);
				this.anIntArray414[local78] = local105 + this.anIntArray414[local78 - 1];
			}
			this.anIntArrayArray26[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt4571; local85++) {
				if (local85 > 0) {
					local97 = this.anInt4567;
					@Pc(148) int local148 = (Static371.method5392(local12, 4096) - 2048) * this.anInt4569 >> 12;
					local97 += local148 * local43 >> 12;
					this.anIntArrayArray26[local78][local85] = this.anIntArrayArray26[local78][local85 - 1] + local97;
				}
				this.anIntArrayArray27[local78][local85] = this.anInt4570 <= 0 ? 4096 : 4096 - Static371.method5392(local12, this.anInt4570);
			}
			this.anIntArrayArray26[local78][this.anInt4571] = 4096;
		}
		this.anIntArray414[this.anInt4574] = 4096;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4571 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt4574 = arg0.method8632();
		} else if (arg1 == 2) {
			this.anInt4569 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt4576 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt4578 = arg0.method8593();
		} else if (arg1 == 5) {
			this.anInt4565 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt4580 = arg0.method8593();
		} else if (arg1 == 7) {
			this.anInt4570 = arg0.method8593();
		}
	}
}
