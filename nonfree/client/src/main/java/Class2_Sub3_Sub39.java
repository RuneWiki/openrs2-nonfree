import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class2_Sub3_Sub39 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
	private int anInt4048;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
	private int anInt4059;

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
	private int anInt4062;

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	private int anInt4046;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	private int anInt4050;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
	private int anInt4053;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
	private int anInt4060;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	private int anInt4056;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
	private int anInt4055;

	@OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
	private int anInt4057;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	private void method3027() {
		@Pc(12) Random local12 = new Random((long) this.anInt4065);
		this.anInt4059 = this.anInt4046 / 2;
		this.anInt4048 = 4096 / this.anInt4055;
		@Pc(29) int local29 = this.anInt4048 / 2;
		this.anIntArrayArray36 = new int[this.anInt4065][this.anInt4055];
		this.anIntArrayArray37 = new int[this.anInt4065][this.anInt4055 + 1];
		this.anIntArray367 = new int[this.anInt4065 + 1];
		this.anInt4062 = 4096 / this.anInt4065;
		@Pc(63) int local63 = this.anInt4062 / 2;
		this.anIntArray367[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4065; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt4062;
				local98 = (Static108.method1830(4096, local12) - 2048) * this.anInt4053 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local63 >> 12);
				this.anIntArray367[local76] = local106 + this.anIntArray367[local76 - 1];
			}
			this.anIntArrayArray37[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt4055; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4048;
					@Pc(149) int local149 = (Static108.method1830(4096, local12) - 2048) * this.anInt4057 >> 12;
					local98 += local149 * local29 >> 12;
					this.anIntArrayArray37[local76][local86] = this.anIntArrayArray37[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray36[local76][local86] = this.anInt4060 <= 0 ? 4096 : 4096 - Static108.method1830(this.anInt4060, local12);
			}
			this.anIntArrayArray37[local76][this.anInt4055] = 4096;
		}
		this.anIntArray367[this.anInt4065] = 4096;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.method3027();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt4055 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt4065 = arg1.method2962();
		} else if (arg0 == 2) {
			this.anInt4057 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt4053 = arg1.method2933();
		} else if (arg0 == 4) {
			this.anInt4050 = arg1.method2933();
		} else if (arg0 == 5) {
			this.anInt4056 = arg1.method2933();
		} else if (arg0 == 6) {
			this.anInt4046 = arg1.method2933();
		} else if (arg0 == 7) {
			this.anInt4060 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt4056 + Static50.anIntArray106[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt4065 > local23 && local30 >= this.anIntArray367[local23]) {
				local23++;
			}
			@Pc(68) float local68 = (float) this.anIntArray367[local23 - 1];
			@Pc(74) float local74 = (float) this.anIntArray367[local23];
			if ((float) local30 > (float) this.anInt4059 + local68 && (float) local30 < local74 - (float) this.anInt4059) {
				for (@Pc(94) int local94 = 0; local94 < Static53.anInt1184; local94++) {
					@Pc(98) int local98 = 0;
					@Pc(112) int local112 = local23 % 2 == 0 ? this.anInt4050 : -this.anInt4050;
					@Pc(123) int local123;
					for (local123 = (this.anInt4048 * local112 >> 12) + Static43.anIntArray102[local94]; local123 < 0; local123 += 4096) {
					}
					while (local123 > 4096) {
						local123 -= 4096;
					}
					while (local98 < this.anInt4055 && this.anIntArrayArray37[local23 - 1][local98] <= local123) {
						local98++;
					}
					@Pc(170) float local170 = (float) this.anIntArrayArray37[local23 - 1][local98 - 1];
					@Pc(180) float local180 = (float) this.anIntArrayArray37[local23 - 1][local98];
					if (local170 + (float) this.anInt4059 < (float) local123 && (float) local123 < (float) -this.anInt4059 + local180) {
						local17[local94] = this.anIntArrayArray36[local23 - 1][local98 - 1];
					} else {
						local17[local94] = 0;
					}
				}
			} else {
				Static191.method1825(local17, 0, Static53.anInt1184, 0);
			}
		}
		return local17;
	}
}
