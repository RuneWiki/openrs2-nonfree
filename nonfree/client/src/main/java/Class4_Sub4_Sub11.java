import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	private int anInt2824;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
	private int anInt2825;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	private int anInt2822 = 204;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt2823 = 409;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	private int anInt2830 = 8;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
	private int anInt2832 = 4;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	private int anInt2826 = 1024;

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
	private int anInt2836 = 81;

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
	private int anInt2834 = 0;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	private int anInt2818 = 1024;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
	private void method2521() {
		@Pc(12) Random local12 = new Random((long) this.anInt2830);
		this.anInt2824 = 4096 / this.anInt2830;
		this.anInt2825 = 4096 / this.anInt2832;
		this.anInt2835 = this.anInt2836 / 2;
		@Pc(35) int local35 = this.anInt2825 / 2;
		this.anIntArrayArray32 = new int[this.anInt2830][this.anInt2832 + 1];
		this.anIntArrayArray31 = new int[this.anInt2830][this.anInt2832];
		@Pc(56) int local56 = this.anInt2824 / 2;
		this.anIntArray260 = new int[this.anInt2830 + 1];
		this.anIntArray260[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt2830; local70++) {
			@Pc(80) int local80;
			@Pc(94) int local94;
			if (local70 > 0) {
				local80 = this.anInt2824;
				local94 = (Static130.method2621(local12, 4096) - 2048) * this.anInt2822 >> 12;
				@Pc(102) int local102 = local80 + (local56 * local94 >> 12);
				this.anIntArray260[local70] = this.anIntArray260[local70 - 1] + local102;
			}
			this.anIntArrayArray32[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt2832; local80++) {
				if (local80 > 0) {
					local94 = this.anInt2825;
					@Pc(143) int local143 = (Static130.method2621(local12, 4096) - 2048) * this.anInt2823 >> 12;
					local94 += local35 * local143 >> 12;
					this.anIntArrayArray32[local70][local80] = this.anIntArrayArray32[local70][local80 - 1] + local94;
				}
				this.anIntArrayArray31[local70][local80] = this.anInt2818 > 0 ? 4096 - Static130.method2621(local12, this.anInt2818) : 4096;
			}
			this.anIntArrayArray32[local70][this.anInt2832] = 4096;
		}
		this.anIntArray260[this.anInt2830] = 4096;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.method2521();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static64.anIntArray148[arg0] + this.anInt2834; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt2830 && this.anIntArray260[local22] <= local29) {
				local22++;
			}
			@Pc(62) int local62 = local22 - 1;
			@Pc(70) boolean local70 = (local22 & 0x1) == 0;
			@Pc(75) int local75 = this.anIntArray260[local22];
			@Pc(82) int local82 = this.anIntArray260[local22 - 1];
			if (local29 > this.anInt2835 + local82 && local75 - this.anInt2835 > local29) {
				for (@Pc(108) int local108 = 0; local108 < Static124.anInt3576; local108++) {
					@Pc(112) int local112 = 0;
					@Pc(121) int local121 = local70 ? this.anInt2826 : -this.anInt2826;
					@Pc(132) int local132;
					for (local132 = (local121 * this.anInt2825 >> 12) + Static149.anIntArray298[local108]; local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (local112 < this.anInt2832 && this.anIntArrayArray32[local62][local112] <= local132) {
						local112++;
					}
					@Pc(168) int local168 = local112 - 1;
					@Pc(175) int local175 = this.anIntArrayArray32[local62][local112];
					@Pc(182) int local182 = this.anIntArrayArray32[local62][local168];
					if (local182 + this.anInt2835 < local132 && local132 < local175 - this.anInt2835) {
						local16[local108] = this.anIntArrayArray31[local62][local168];
					} else {
						local16[local108] = 0;
					}
				}
			} else {
				Static363.method4758(local16, 0, Static124.anInt3576, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2832 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt2830 = arg1.method2380();
		} else if (arg0 == 2) {
			this.anInt2823 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt2822 = arg1.method2404();
		} else if (arg0 == 4) {
			this.anInt2826 = arg1.method2404();
		} else if (arg0 == 5) {
			this.anInt2834 = arg1.method2404();
		} else if (arg0 == 6) {
			this.anInt2836 = arg1.method2404();
		} else if (arg0 == 7) {
			this.anInt2818 = arg1.method2404();
		}
	}
}
