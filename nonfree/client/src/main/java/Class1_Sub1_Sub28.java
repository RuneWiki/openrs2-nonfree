import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
	private int anInt2813;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
	private int anInt2815;

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
	private int anInt2818;

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	private int anInt2812;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
	private int anInt2817;

	@OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
	private int anInt2825;

	@OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
	private int anInt2821;

	@OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
	private int anInt2822;

	@OriginalMember(owner = "client!lf", name = "Ub", descriptor = "I")
	private int anInt2827;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.method2019();
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	private void method2019() {
		@Pc(12) Random local12 = new Random((long) this.anInt2827);
		this.anInt2821 = this.anInt2825 * this.anInt2814;
		this.anIntArrayArray22 = new int[this.anInt2821][2];
		@Pc(30) int local30 = 4096 / this.anInt2814;
		this.anInt2815 = local30 >> 1;
		@Pc(43) int local43 = this.anInt2817 * this.anInt2815 >> 12;
		@Pc(48) int local48 = 4096 / this.anInt2825;
		this.anInt2818 = local48 >> 1;
		@Pc(61) int local61 = this.anInt2818 * this.anInt2817 >> 12;
		for (@Pc(63) int local63 = 0; local63 < this.anInt2825; local63++) {
			@Pc(69) int local69 = local48 * local63;
			for (@Pc(71) int local71 = 0; local71 < this.anInt2814; local71++) {
				@Pc(80) int local80 = local71 + local63 * this.anInt2814;
				@Pc(91) int local91 = local43 * (Static164.method2805(8192, local12) - 4096) >> 12;
				@Pc(102) int local102 = (Static164.method2805(8192, local12) - 4096) * local61 >> 12;
				this.anIntArrayArray22[local80][0] = local71 * local30 + local91;
				this.anIntArrayArray22[local80][1] = local69 + local102;
			}
		}
		this.anInt2813 = this.anInt2814 > this.anInt2825 ? this.anInt2814 : this.anInt2825;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(24) int local24 = Static18.anIntArray101[arg0];
			@Pc(27) int local27 = this.anInt2812;
			@Pc(45) int local45;
			if (local27 == 2) {
				for (local27 = 0; local27 < Static65.anInt1933; local27++) {
					local45 = Static106.anIntArray284[local27];
					@Pc(52) int[] local52 = this.method2021(local24, 2, local45);
					local16[local27] = local52[1] - local52[0];
				}
			} else if (local27 == 1) {
				for (local27 = 0; local27 < Static65.anInt1933; local27++) {
					local45 = Static106.anIntArray284[local27];
					local16[local27] = this.method2021(local24, 2, local45)[1];
				}
			} else {
				for (local27 = 0; local27 < Static65.anInt1933; local27++) {
					local45 = Static106.anIntArray284[local27];
					local16[local27] = this.method2021(local24, 1, local45)[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBII)[I")
	private int[] method2021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int[] local4 = new int[arg1];
		for (@Pc(6) int local6 = 0; local6 < arg1; local6++) {
			local4[local6] = Integer.MAX_VALUE;
		}
		arg0 += this.anInt2818;
		arg2 += this.anInt2815;
		@Pc(37) int local37 = -1;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(50) int local50 = this.anInt2825 * arg0 >> 12;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(63) int local63 = arg2 * this.anInt2814 >> 12;
		@Pc(65) int local65 = Integer.MAX_VALUE;
		@Pc(67) int local67 = -1;
		@Pc(80) int local80 = this.anInt2814 <= 2 ? this.anInt2814 - 1 : 2;
		@Pc(82) int local82 = Integer.MAX_VALUE;
		@Pc(93) int local93 = this.anInt2825 > 2 ? 2 : this.anInt2825 - 1;
		@Pc(101) int local101;
		@Pc(107) int local107;
		@Pc(119) int local119;
		@Pc(155) int local155;
		@Pc(162) int local162;
		for (@Pc(96) int local96 = -local80; local96 <= local80; local96++) {
			for (local101 = -local93; local101 <= local93; local101++) {
				local107 = local63 + local96;
				if (local107 < 0) {
					local107 += this.anInt2814;
				}
				local119 = local50 + local101;
				if (this.anInt2814 <= local107) {
					local107 -= this.anInt2814;
				}
				if (local119 < 0) {
					local119 += this.anInt2825;
				}
				if (local119 >= this.anInt2825) {
					local119 -= this.anInt2825;
				}
				local155 = local107 + this.anInt2814 * local119;
				local162 = this.anIntArrayArray22[local155][0];
				@Pc(169) int local169 = this.anIntArrayArray22[local155][1];
				@Pc(174) int local174 = arg0 - local169;
				@Pc(179) int local179 = arg2 - local162;
				if (local174 < 0) {
					local174 = -local174;
				}
				if (local174 > 2048) {
					local174 = 4096 - local174;
				}
				if (local179 < 0) {
					local179 = -local179;
				}
				if (local179 > 2048) {
					local179 = 4096 - local179;
				}
				@Pc(215) int local215 = local174 * local174 + local179 * local179 >> 12;
				if (local215 < local65) {
					if (local67 == -1) {
						local82 = local215;
						local67 = local155;
					} else {
						local67 = local37;
						local82 = local65;
					}
					local65 = local215;
					local37 = local155;
				} else if (local67 == local37 && local155 != local67 || local215 < local82 && local37 != local155) {
					local82 = local215;
					local67 = local155;
				}
			}
		}
		local101 = arg2 - this.anIntArrayArray22[local37][0];
		if (local101 < 0) {
			local101 = -local101;
		}
		if (local101 > 2048) {
			local101 = 4096 - local101;
		}
		local119 = arg2 - this.anIntArrayArray22[local67][0];
		local155 = arg0 - this.anIntArrayArray22[local67][1];
		if (local155 < 0) {
			local155 = -local155;
		}
		if (local119 < 0) {
			local119 = -local119;
		}
		if (local119 > 2048) {
			local119 = 4096 - local119;
		}
		local107 = arg0 - this.anIntArrayArray22[local37][1];
		if (local155 > 2048) {
			local155 = 4096 - local155;
		}
		if (local107 < 0) {
			local107 = -local107;
		}
		if (local107 > 2048) {
			local107 = 4096 - local107;
		}
		local162 = this.anInt2822;
		if (local162 == 1) {
			local65 = (int) Math.sqrt((double) (local107 * local107 + local101 * local101));
			local82 = (int) Math.sqrt((double) (local119 * local119 + local155 * local155));
		} else if (local162 == 2) {
			local65 = Math.max(local101, local107);
			local82 = Math.max(local119, local155);
		} else {
			local82 = local155 * local155 + local119 * local119;
			local65 = local101 * local101 + local107 * local107;
		}
		if (arg1 > 1) {
			local4[1] = local82 * this.anInt2813;
		}
		local4[0] = local65 * this.anInt2813;
		return local4;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2814 = this.anInt2825 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt2827 = arg1.method1607();
		} else if (arg0 == 2) {
			this.anInt2817 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt2812 = arg1.method1607();
		} else if (arg0 == 4) {
			this.anInt2822 = arg1.method1607();
		} else if (arg0 == 5) {
			this.anInt2814 = arg1.method1607();
		} else if (arg0 == 6) {
			this.anInt2825 = arg1.method1607();
		}
	}
}
