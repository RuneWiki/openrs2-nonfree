import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	private int anInt3603;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!nc", name = "kb", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "I")
	private int anInt3618;

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "I")
	private int anInt3621;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	private int anInt3607 = 81;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	private int anInt3609 = 1024;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	private int anInt3605 = 8;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
	private int anInt3610 = 0;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
	private int anInt3619 = 4;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
	private int anInt3616 = 204;

	@OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
	private int anInt3620 = 409;

	@OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
	private int anInt3617 = 1024;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3619 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt3605 = arg0.method4261();
		} else if (arg1 == 2) {
			this.anInt3620 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt3616 = arg0.method4242();
		} else if (arg1 == 4) {
			this.anInt3617 = arg0.method4242();
		} else if (arg1 == 5) {
			this.anInt3610 = arg0.method4242();
		} else if (arg1 == 6) {
			this.anInt3607 = arg0.method4242();
		} else if (arg1 == 7) {
			this.anInt3609 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(29) int local29;
			for (local29 = Static234.anIntArray435[arg0] + this.anInt3610; local29 < 0; local29 += 4096) {
			}
			@Pc(36) int local36 = 0;
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt3605 > local36 && local29 >= this.anIntArray295[local36]) {
				local36++;
			}
			@Pc(67) int local67 = local36 - 1;
			@Pc(72) int local72 = this.anIntArray295[local36];
			@Pc(80) boolean local80 = (local36 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray295[local36 - 1];
			if (local29 > this.anInt3618 + local87 && local29 < local72 - this.anInt3618) {
				for (@Pc(110) int local110 = 0; local110 < Static114.anInt1359; local110++) {
					@Pc(115) int local115 = 0;
					@Pc(124) int local124 = local80 ? this.anInt3617 : -this.anInt3617;
					@Pc(135) int local135;
					for (local135 = (local124 * this.anInt3621 >> 12) + Static281.anIntArray506[local110]; local135 < 0; local135 += 4096) {
					}
					while (local135 > 4096) {
						local135 -= 4096;
					}
					while (this.anInt3619 > local115 && this.anIntArrayArray32[local67][local115] <= local135) {
						local115++;
					}
					@Pc(178) int local178 = this.anIntArrayArray32[local67][local115];
					@Pc(182) int local182 = local115 - 1;
					@Pc(189) int local189 = this.anIntArrayArray32[local67][local182];
					if (local189 + this.anInt3618 < local135 && local178 - this.anInt3618 > local135) {
						local17[local110] = this.anIntArrayArray31[local67][local182];
					} else {
						local17[local110] = 0;
					}
				}
			} else {
				Static301.method301(local17, 0, Static114.anInt1359, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.method2929();
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
	private void method2929() {
		@Pc(12) Random local12 = new Random((long) this.anInt3605);
		this.anInt3621 = 4096 / this.anInt3619;
		this.anIntArrayArray31 = new int[this.anInt3605][this.anInt3619];
		@Pc(30) int local30 = this.anInt3621 / 2;
		this.anInt3618 = this.anInt3607 / 2;
		this.anInt3603 = 4096 / this.anInt3605;
		this.anIntArrayArray32 = new int[this.anInt3605][this.anInt3619 + 1];
		this.anIntArray295 = new int[this.anInt3605 + 1];
		this.anIntArray295[0] = 0;
		@Pc(68) int local68 = this.anInt3603 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3605; local70++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local70 > 0) {
				local83 = this.anInt3603;
				local95 = (Static21.method459(4096, local12) - 2048) * this.anInt3616 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local68 >> 12);
				this.anIntArray295[local70] = local103 + this.anIntArray295[local70 - 1];
			}
			this.anIntArrayArray32[local70][0] = 0;
			for (local83 = 0; local83 < this.anInt3619; local83++) {
				if (local83 > 0) {
					local95 = this.anInt3621;
					@Pc(146) int local146 = (Static21.method459(4096, local12) - 2048) * this.anInt3620 >> 12;
					local95 += local30 * local146 >> 12;
					this.anIntArrayArray32[local70][local83] = local95 + this.anIntArrayArray32[local70][local83 - 1];
				}
				this.anIntArrayArray31[local70][local83] = this.anInt3609 > 0 ? 4096 - Static21.method459(this.anInt3609, local12) : 4096;
			}
			this.anIntArrayArray32[local70][this.anInt3619] = 4096;
		}
		this.anIntArray295[this.anInt3605] = 4096;
	}
}
