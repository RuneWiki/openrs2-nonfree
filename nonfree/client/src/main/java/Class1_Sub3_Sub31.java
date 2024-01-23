import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
	private int anInt4557;

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!rl", name = "gb", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
	private int anInt4564 = 0;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
	private int anInt4556 = 81;

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
	private int anInt4560 = 4;

	@OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
	private int anInt4565 = 409;

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
	private int anInt4558 = 8;

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
	private int anInt4562 = 1024;

	@OriginalMember(owner = "client!rl", name = "nb", descriptor = "I")
	private int anInt4574 = 1024;

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
	private int anInt4570 = 204;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt4564 + Static132.anIntArray265[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt4558 > local23 && this.anIntArray406[local23] <= local30) {
				local23++;
			}
			@Pc(74) boolean local74 = (local23 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray406[local23];
			@Pc(83) int local83 = local23 - 1;
			@Pc(90) int local90 = this.anIntArray406[local23 - 1];
			if (local30 > this.anInt4559 + local90 && local30 < local79 - this.anInt4559) {
				for (@Pc(109) int local109 = 0; local109 < Static227.anInt4511; local109++) {
					@Pc(125) int local125 = local74 ? this.anInt4574 : -this.anInt4574;
					@Pc(127) int local127 = 0;
					@Pc(139) int local139;
					for (local139 = Static209.anIntArray377[local109] + (this.anInt4571 * local125 >> 12); local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (this.anInt4560 > local127 && local139 >= this.anIntArrayArray30[local83][local127]) {
						local127++;
					}
					@Pc(176) int local176 = local127 - 1;
					@Pc(183) int local183 = this.anIntArrayArray30[local83][local176];
					@Pc(190) int local190 = this.anIntArrayArray30[local83][local127];
					if (local139 > local183 + this.anInt4559 && local139 < local190 - this.anInt4559) {
						local17[local109] = this.anIntArrayArray29[local83][local176];
					} else {
						local17[local109] = 0;
					}
				}
			} else {
				Static304.method2610(local17, 0, Static227.anInt4511, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.method3599();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4560 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt4558 = arg0.method2690();
		} else if (arg1 == 2) {
			this.anInt4565 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt4570 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt4574 = arg0.method2691();
		} else if (arg1 == 5) {
			this.anInt4564 = arg0.method2691();
		} else if (arg1 == 6) {
			this.anInt4556 = arg0.method2691();
		} else if (arg1 == 7) {
			this.anInt4562 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
	private void method3599() {
		@Pc(12) Random local12 = new Random((long) this.anInt4558);
		this.anIntArray406 = new int[this.anInt4558 + 1];
		this.anIntArrayArray30 = new int[this.anInt4558][this.anInt4560 + 1];
		this.anInt4559 = this.anInt4556 / 2;
		this.anInt4571 = 4096 / this.anInt4560;
		this.anInt4557 = 4096 / this.anInt4558;
		this.anIntArrayArray29 = new int[this.anInt4558][this.anInt4560];
		@Pc(64) int local64 = this.anInt4571 / 2;
		@Pc(69) int local69 = this.anInt4557 / 2;
		this.anIntArray406[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4558; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt4557;
				local98 = (Static186.method3095(local12, 4096) - 2048) * this.anInt4570 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local69 >> 12);
				this.anIntArray406[local76] = this.anIntArray406[local76 - 1] + local106;
			}
			this.anIntArrayArray30[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt4560; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4571;
					@Pc(149) int local149 = (Static186.method3095(local12, 4096) - 2048) * this.anInt4565 >> 12;
					local98 += local64 * local149 >> 12;
					this.anIntArrayArray30[local76][local86] = this.anIntArrayArray30[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray29[local76][local86] = this.anInt4562 <= 0 ? 4096 : 4096 - Static186.method3095(local12, this.anInt4562);
			}
			this.anIntArrayArray30[local76][this.anInt4560] = 4096;
		}
		this.anIntArray406[this.anInt4558] = 4096;
	}
}
