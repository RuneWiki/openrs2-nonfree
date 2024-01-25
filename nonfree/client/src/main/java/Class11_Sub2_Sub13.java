import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class11_Sub2_Sub13 extends Class11_Sub2 {

	@OriginalMember(owner = "client!il", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	private int anInt2424;

	@OriginalMember(owner = "client!il", name = "K", descriptor = "I")
	private int anInt2428;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "I")
	private int anInt2430;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	private int anInt2432 = 81;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "I")
	private int anInt2426 = 1024;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	private int anInt2427 = 8;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	private int anInt2423 = 4;

	@OriginalMember(owner = "client!il", name = "W", descriptor = "I")
	private int anInt2438 = 0;

	@OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
	private int anInt2439 = 204;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "I")
	private int anInt2435 = 409;

	@OriginalMember(owner = "client!il", name = "ab", descriptor = "I")
	private int anInt2440 = 1024;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt2438 + Static155.anIntArray196[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt2427 > local17 && this.anIntArray170[local17] <= local24) {
				local17++;
			}
			@Pc(56) int local56 = local17 - 1;
			@Pc(67) boolean local67 = (local17 & 0x1) == 0;
			@Pc(72) int local72 = this.anIntArray170[local17];
			@Pc(79) int local79 = this.anIntArray170[local17 - 1];
			if (this.anInt2424 + local79 < local24 && local72 - this.anInt2424 > local24) {
				for (@Pc(101) int local101 = 0; local101 < Static339.anInt6549; local101++) {
					@Pc(112) int local112 = local67 ? this.anInt2440 : -this.anInt2440;
					@Pc(114) int local114 = 0;
					@Pc(126) int local126;
					for (local126 = Static73.anIntArray91[local101] + (this.anInt2430 * local112 >> 12); local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (local114 < this.anInt2423 && this.anIntArrayArray21[local56][local114] <= local126) {
						local114++;
					}
					@Pc(163) int local163 = local114 - 1;
					@Pc(170) int local170 = this.anIntArrayArray21[local56][local163];
					@Pc(177) int local177 = this.anIntArrayArray21[local56][local114];
					if (local170 + this.anInt2424 < local126 && local126 < local177 - this.anInt2424) {
						local11[local101] = this.anIntArrayArray22[local56][local163];
					} else {
						local11[local101] = 0;
					}
				}
			} else {
				Static363.method1670(local11, 0, Static339.anInt6549, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	private void method2021() {
		@Pc(12) Random local12 = new Random((long) this.anInt2427);
		this.anInt2430 = 4096 / this.anInt2423;
		this.anInt2428 = 4096 / this.anInt2427;
		this.anInt2424 = this.anInt2432 / 2;
		@Pc(35) int local35 = this.anInt2430 / 2;
		this.anIntArray170 = new int[this.anInt2427 + 1];
		this.anIntArrayArray22 = new int[this.anInt2427][this.anInt2423];
		this.anIntArrayArray21 = new int[this.anInt2427][this.anInt2423 + 1];
		@Pc(67) int local67 = this.anInt2428 / 2;
		this.anIntArray170[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt2427; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt2428;
				local96 = (Static331.method5444(4096, local12) - 2048) * this.anInt2439 >> 12;
				@Pc(104) int local104 = local84 + (local96 * local67 >> 12);
				this.anIntArray170[local74] = this.anIntArray170[local74 - 1] + local104;
			}
			this.anIntArrayArray21[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt2423; local84++) {
				if (local84 > 0) {
					local96 = this.anInt2430;
					@Pc(148) int local148 = (Static331.method5444(4096, local12) - 2048) * this.anInt2435 >> 12;
					local96 += local148 * local35 >> 12;
					this.anIntArrayArray21[local74][local84] = this.anIntArrayArray21[local74][local84 - 1] + local96;
				}
				this.anIntArrayArray22[local74][local84] = this.anInt2426 <= 0 ? 4096 : 4096 - Static331.method5444(this.anInt2426, local12);
			}
			this.anIntArrayArray21[local74][this.anInt2423] = 4096;
		}
		this.anIntArray170[this.anInt2427] = 4096;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2423 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt2427 = arg0.method5185();
		} else if (arg1 == 2) {
			this.anInt2435 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt2439 = arg0.method5187();
		} else if (arg1 == 4) {
			this.anInt2440 = arg0.method5187();
		} else if (arg1 == 5) {
			this.anInt2438 = arg0.method5187();
		} else if (arg1 == 6) {
			this.anInt2432 = arg0.method5187();
		} else if (arg1 == 7) {
			this.anInt2426 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method2021();
	}
}
