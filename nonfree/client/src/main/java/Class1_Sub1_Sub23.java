import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
	private int anInt3051;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
	private int anInt3058;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
	private int anInt3061;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
	private int anInt3049 = 81;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
	private int anInt3050 = 204;

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
	private int anInt3055 = 8;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
	private int anInt3060 = 1024;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
	private int anInt3053 = 409;

	@OriginalMember(owner = "client!oe", name = "sb", descriptor = "I")
	private int anInt3065 = 4;

	@OriginalMember(owner = "client!oe", name = "tb", descriptor = "I")
	private int anInt3066 = 1024;

	@OriginalMember(owner = "client!oe", name = "pb", descriptor = "I")
	private int anInt3063 = 0;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(22) int local22;
			for (local22 = this.anInt3063 + Static187.anIntArray362[arg0]; local22 < 0; local22 += 4096) {
			}
			while (local22 > 4096) {
				local22 -= 4096;
			}
			@Pc(38) int local38;
			for (local38 = 0; this.anInt3055 > local38 && local22 >= this.anIntArray249[local38]; local38++) {
			}
			@Pc(59) int local59 = local38 - 1;
			@Pc(70) boolean local70 = (local38 & 0x1) == 0;
			@Pc(75) int local75 = this.anIntArray249[local38];
			@Pc(82) int local82 = this.anIntArray249[local38 - 1];
			if (local22 > local82 + this.anInt3058 && local22 < local75 - this.anInt3058) {
				for (@Pc(96) int local96 = 0; local96 < Static115.anInt2578; local96++) {
					@Pc(100) int local100 = 0;
					@Pc(109) int local109 = local70 ? this.anInt3060 : -this.anInt3060;
					@Pc(121) int local121;
					for (local121 = Static45.anIntArray97[local96] + (this.anInt3061 * local109 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (local100 < this.anInt3065 && local121 >= this.anIntArrayArray26[local59][local100]) {
						local100++;
					}
					@Pc(156) int local156 = local100 - 1;
					@Pc(163) int local163 = this.anIntArrayArray26[local59][local100];
					@Pc(170) int local170 = this.anIntArrayArray26[local59][local156];
					if (local170 + this.anInt3058 < local121 && local121 < local163 - this.anInt3058) {
						local11[local96] = this.anIntArrayArray25[local59][local156];
					} else {
						local11[local96] = 0;
					}
				}
			} else {
				Static214.method349(local11, 0, Static115.anInt2578, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.method2385();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3065 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt3055 = arg0.method2771();
		} else if (arg1 == 2) {
			this.anInt3053 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt3050 = arg0.method2765();
		} else if (arg1 == 4) {
			this.anInt3060 = arg0.method2765();
		} else if (arg1 == 5) {
			this.anInt3063 = arg0.method2765();
		} else if (arg1 == 6) {
			this.anInt3049 = arg0.method2765();
		} else if (arg1 == 7) {
			this.anInt3066 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	private void method2385() {
		@Pc(12) Random local12 = new Random((long) this.anInt3055);
		this.anInt3051 = 4096 / this.anInt3055;
		@Pc(23) int local23 = this.anInt3051 / 2;
		this.anIntArray249 = new int[this.anInt3055 + 1];
		this.anIntArrayArray25 = new int[this.anInt3055][this.anInt3065];
		this.anIntArrayArray26 = new int[this.anInt3055][this.anInt3065 + 1];
		this.anInt3061 = 4096 / this.anInt3065;
		this.anInt3058 = this.anInt3049 / 2;
		this.anIntArray249[0] = 0;
		@Pc(68) int local68 = this.anInt3061 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3055; local70++) {
			@Pc(80) int local80;
			@Pc(94) int local94;
			if (local70 > 0) {
				local80 = this.anInt3051;
				local94 = (Static132.method2265(4096, local12) - 2048) * this.anInt3050 >> 12;
				@Pc(102) int local102 = local80 + (local94 * local23 >> 12);
				this.anIntArray249[local70] = local102 + this.anIntArray249[local70 - 1];
			}
			this.anIntArrayArray26[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt3065; local80++) {
				if (local80 > 0) {
					local94 = this.anInt3061;
					@Pc(145) int local145 = (Static132.method2265(4096, local12) - 2048) * this.anInt3053 >> 12;
					local94 += local68 * local145 >> 12;
					this.anIntArrayArray26[local70][local80] = this.anIntArrayArray26[local70][local80 - 1] + local94;
				}
				this.anIntArrayArray25[local70][local80] = this.anInt3066 > 0 ? 4096 - Static132.method2265(this.anInt3066, local12) : 4096;
			}
			this.anIntArrayArray26[local70][this.anInt3065] = 4096;
		}
		this.anIntArray249[this.anInt3055] = 4096;
	}
}
