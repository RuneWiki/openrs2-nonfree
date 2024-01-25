import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class4_Sub2_Sub15 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!jt", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!jt", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!jt", name = "ab", descriptor = "I")
	private int anInt4645;

	@OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
	private int anInt4631 = 204;

	@OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
	private int anInt4638 = 0;

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
	private int anInt4630 = 81;

	@OriginalMember(owner = "client!jt", name = "X", descriptor = "I")
	private int anInt4642 = 409;

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
	private int anInt4634 = 4;

	@OriginalMember(owner = "client!jt", name = "W", descriptor = "I")
	private int anInt4641 = 8;

	@OriginalMember(owner = "client!jt", name = "V", descriptor = "I")
	private int anInt4640 = 1024;

	@OriginalMember(owner = "client!jt", name = "Y", descriptor = "I")
	private int anInt4643 = 1024;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.method4168();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = Static429.anIntArray465[arg0] + this.anInt4638; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (this.anInt4641 > local24 && this.anIntArray353[local24] <= local31) {
				local24++;
			}
			@Pc(59) int local59 = local24 - 1;
			@Pc(67) boolean local67 = (local24 & 0x1) == 0;
			@Pc(72) int local72 = this.anIntArray353[local24];
			@Pc(79) int local79 = this.anIntArray353[local24 - 1];
			if (this.anInt4637 + local79 < local31 && local72 - this.anInt4637 > local31) {
				for (@Pc(102) int local102 = 0; local102 < Static269.anInt4330; local102++) {
					@Pc(106) int local106 = 0;
					@Pc(115) int local115 = local67 ? this.anInt4643 : -this.anInt4643;
					@Pc(126) int local126;
					for (local126 = Static312.anIntArray370[local102] + (this.anInt4645 * local115 >> 12); local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (local106 < this.anInt4634 && this.anIntArrayArray27[local59][local106] <= local126) {
						local106++;
					}
					@Pc(164) int local164 = local106 - 1;
					@Pc(171) int local171 = this.anIntArrayArray27[local59][local164];
					@Pc(178) int local178 = this.anIntArrayArray27[local59][local106];
					if (local171 + this.anInt4637 < local126 && local178 - this.anInt4637 > local126) {
						local18[local102] = this.anIntArrayArray26[local59][local164];
					} else {
						local18[local102] = 0;
					}
				}
			} else {
				Static685.method6467(local18, 0, Static269.anInt4330, 0);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4634 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt4641 = arg1.method8865();
		} else if (arg0 == 2) {
			this.anInt4642 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt4631 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt4643 = arg1.method8859();
		} else if (arg0 == 5) {
			this.anInt4638 = arg1.method8859();
		} else if (arg0 == 6) {
			this.anInt4630 = arg1.method8859();
		} else if (arg0 == 7) {
			this.anInt4640 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(Z)V")
	private void method4168() {
		@Pc(12) Random local12 = new Random((long) this.anInt4641);
		this.anInt4645 = 4096 / this.anInt4634;
		this.anInt4633 = 4096 / this.anInt4641;
		this.anInt4637 = this.anInt4630 / 2;
		@Pc(41) int local41 = this.anInt4645 / 2;
		this.anIntArray353 = new int[this.anInt4641 + 1];
		@Pc(53) int local53 = this.anInt4633 / 2;
		this.anIntArrayArray26 = new int[this.anInt4641][this.anInt4634];
		this.anIntArrayArray27 = new int[this.anInt4641][this.anInt4634 + 1];
		this.anIntArray353[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4641; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt4633;
				local98 = (Static149.method2598(local12, 4096) - 2048) * this.anInt4631 >> 12;
				@Pc(106) int local106 = local86 + (local53 * local98 >> 12);
				this.anIntArray353[local76] = this.anIntArray353[local76 - 1] + local106;
			}
			this.anIntArrayArray27[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt4634; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4645;
					@Pc(146) int local146 = (Static149.method2598(local12, 4096) - 2048) * this.anInt4642 >> 12;
					local98 += local146 * local41 >> 12;
					this.anIntArrayArray27[local76][local86] = local98 + this.anIntArrayArray27[local76][local86 - 1];
				}
				this.anIntArrayArray26[local76][local86] = this.anInt4640 > 0 ? 4096 - Static149.method2598(local12, this.anInt4640) : 4096;
			}
			this.anIntArrayArray27[local76][this.anInt4634] = 4096;
		}
		this.anIntArray353[this.anInt4641] = 4096;
	}
}
