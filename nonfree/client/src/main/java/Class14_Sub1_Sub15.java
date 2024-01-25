import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class14_Sub1_Sub15 extends Class14_Sub1 {

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
	private int anInt3705;

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
	private int anInt3706;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!gt", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
	private int anInt3704 = 0;

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
	private int anInt3709 = 8;

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	private int anInt3708 = 4;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
	private int anInt3712 = 81;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
	private int anInt3715 = 1024;

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
	private int anInt3714 = 1024;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
	private int anInt3710 = 409;

	@OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
	private int anInt3719 = 204;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3708 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt3709 = arg0.method5866();
		} else if (arg1 == 2) {
			this.anInt3710 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt3719 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt3715 = arg0.method5900();
		} else if (arg1 == 5) {
			this.anInt3704 = arg0.method5900();
		} else if (arg1 == 6) {
			this.anInt3712 = arg0.method5900();
		} else if (arg1 == 7) {
			this.anInt3714 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)V")
	private void method3057() {
		@Pc(12) Random local12 = new Random((long) this.anInt3709);
		this.anInt3705 = 4096 / this.anInt3708;
		this.anInt3706 = this.anInt3712 / 2;
		this.anInt3703 = 4096 / this.anInt3709;
		@Pc(35) int local35 = this.anInt3705 / 2;
		this.anIntArray309 = new int[this.anInt3709 + 1];
		this.anIntArrayArray24 = new int[this.anInt3709][this.anInt3708];
		this.anIntArrayArray25 = new int[this.anInt3709][this.anInt3708 + 1];
		@Pc(71) int local71 = this.anInt3703 / 2;
		this.anIntArray309[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt3709; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt3703;
				local100 = (Static251.method3688(local12, 4096) - 2048) * this.anInt3719 >> 12;
				@Pc(108) int local108 = local88 + (local71 * local100 >> 12);
				this.anIntArray309[local78] = local108 + this.anIntArray309[local78 - 1];
			}
			this.anIntArrayArray25[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt3708; local88++) {
				if (local88 > 0) {
					local100 = this.anInt3705;
					@Pc(151) int local151 = (Static251.method3688(local12, 4096) - 2048) * this.anInt3710 >> 12;
					local100 += local35 * local151 >> 12;
					this.anIntArrayArray25[local78][local88] = local100 + this.anIntArrayArray25[local78][local88 - 1];
				}
				this.anIntArrayArray24[local78][local88] = this.anInt3714 <= 0 ? 4096 : 4096 - Static251.method3688(local12, this.anInt3714);
			}
			this.anIntArrayArray25[local78][this.anInt3708] = 4096;
		}
		this.anIntArray309[this.anInt3709] = 4096;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.method3057();
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt3704 + Static336.anIntArray458[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt3709 > local25 && local32 >= this.anIntArray309[local25]) {
				local25++;
			}
			@Pc(66) int local66 = local25 - 1;
			@Pc(77) boolean local77 = (local25 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray309[local25];
			@Pc(89) int local89 = this.anIntArray309[local25 - 1];
			if (this.anInt3706 + local89 < local32 && local82 - this.anInt3706 > local32) {
				for (@Pc(107) int local107 = 0; local107 < Static371.anInt6835; local107++) {
					@Pc(118) int local118 = local77 ? this.anInt3715 : -this.anInt3715;
					@Pc(120) int local120 = 0;
					@Pc(131) int local131;
					for (local131 = (local118 * this.anInt3705 >> 12) + Static160.anIntArray258[local107]; local131 < 0; local131 += 4096) {
					}
					while (local131 > 4096) {
						local131 -= 4096;
					}
					while (local120 < this.anInt3708 && local131 >= this.anIntArrayArray25[local66][local120]) {
						local120++;
					}
					@Pc(168) int local168 = local120 - 1;
					@Pc(175) int local175 = this.anIntArrayArray25[local66][local120];
					@Pc(182) int local182 = this.anIntArrayArray25[local66][local168];
					if (local182 + this.anInt3706 < local131 && local175 - this.anInt3706 > local131) {
						local11[local107] = this.anIntArrayArray24[local66][local168];
					} else {
						local11[local107] = 0;
					}
				}
			} else {
				Static681.method2479(local11, 0, Static371.anInt6835, 0);
			}
		}
		return local11;
	}
}
