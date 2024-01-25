import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
	private int anInt1863;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!dq", name = "V", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!dq", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	private int anInt1867 = 409;

	@OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
	private int anInt1864 = 8;

	@OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
	private int anInt1872 = 1024;

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
	private int anInt1871 = 81;

	@OriginalMember(owner = "client!dq", name = "Z", descriptor = "I")
	private int anInt1876 = 204;

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
	private int anInt1873 = 1024;

	@OriginalMember(owner = "client!dq", name = "ab", descriptor = "I")
	private int anInt1877 = 4;

	@OriginalMember(owner = "client!dq", name = "X", descriptor = "I")
	private int anInt1875 = 0;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.method1415();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	private void method1415() {
		@Pc(23) Random local23 = new Random((long) this.anInt1864);
		this.anInt1863 = 4096 / this.anInt1877;
		this.anInt1865 = 4096 / this.anInt1864;
		this.anInt1869 = this.anInt1871 / 2;
		@Pc(46) int local46 = this.anInt1863 / 2;
		@Pc(51) int local51 = this.anInt1865 / 2;
		this.anIntArrayArray15 = new int[this.anInt1864][this.anInt1877 + 1];
		this.anIntArrayArray16 = new int[this.anInt1864][this.anInt1877];
		this.anIntArray117 = new int[this.anInt1864 + 1];
		this.anIntArray117[0] = 0;
		for (@Pc(81) int local81 = 0; local81 < this.anInt1864; local81++) {
			@Pc(91) int local91;
			@Pc(103) int local103;
			if (local81 > 0) {
				local91 = this.anInt1865;
				local103 = (Static346.method4895(local23, 4096) - 2048) * this.anInt1876 >> 12;
				@Pc(111) int local111 = local91 + (local103 * local51 >> 12);
				this.anIntArray117[local81] = local111 + this.anIntArray117[local81 - 1];
			}
			this.anIntArrayArray15[local81][0] = 0;
			for (local91 = 0; local91 < this.anInt1877; local91++) {
				if (local91 > 0) {
					local103 = this.anInt1863;
					@Pc(154) int local154 = (Static346.method4895(local23, 4096) - 2048) * this.anInt1867 >> 12;
					local103 += local154 * local46 >> 12;
					this.anIntArrayArray15[local81][local91] = this.anIntArrayArray15[local81][local91 - 1] + local103;
				}
				this.anIntArrayArray16[local81][local91] = this.anInt1873 <= 0 ? 4096 : 4096 - Static346.method4895(local23, this.anInt1873);
			}
			this.anIntArrayArray15[local81][this.anInt1877] = 4096;
		}
		this.anIntArray117[this.anInt1864] = 4096;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt1877 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt1864 = arg1.method4864();
		} else if (arg0 == 2) {
			this.anInt1867 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt1876 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt1872 = arg1.method4877();
		} else if (arg0 == 5) {
			this.anInt1875 = arg1.method4877();
		} else if (arg0 == 6) {
			this.anInt1871 = arg1.method4877();
		} else if (arg0 == 7) {
			this.anInt1873 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static293.anIntArray461[arg0] + this.anInt1875; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1864 > local22 && this.anIntArray117[local22] <= local29) {
				local22++;
			}
			@Pc(60) int local60 = local22 - 1;
			@Pc(68) boolean local68 = (local22 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray117[local22];
			@Pc(80) int local80 = this.anIntArray117[local22 - 1];
			if (local80 + this.anInt1869 < local29 && local29 < local73 - this.anInt1869) {
				for (@Pc(103) int local103 = 0; local103 < Static350.anInt6330; local103++) {
					@Pc(114) int local114 = local68 ? this.anInt1872 : -this.anInt1872;
					@Pc(116) int local116 = 0;
					@Pc(128) int local128;
					for (local128 = Static197.anIntArray566[local103] + (this.anInt1863 * local114 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt1877 > local116 && local128 >= this.anIntArrayArray15[local60][local116]) {
						local116++;
					}
					@Pc(163) int local163 = local116 - 1;
					@Pc(170) int local170 = this.anIntArrayArray15[local60][local116];
					@Pc(177) int local177 = this.anIntArrayArray15[local60][local163];
					if (local177 + this.anInt1869 < local128 && local128 < local170 - this.anInt1869) {
						local16[local103] = this.anIntArrayArray16[local60][local163];
					} else {
						local16[local103] = 0;
					}
				}
			} else {
				Static457.method1217(local16, 0, Static350.anInt6330, 0);
			}
		}
		return local16;
	}
}
