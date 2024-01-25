import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class5_Sub6_Sub9 extends Class5_Sub6 {

	@OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
	private int anInt2109;

	@OriginalMember(owner = "client!eba", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!eba", name = "I", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!eba", name = "P", descriptor = "I")
	private int anInt2121;

	@OriginalMember(owner = "client!eba", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!eba", name = "T", descriptor = "I")
	private int anInt2124;

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "I")
	private int anInt2113 = 409;

	@OriginalMember(owner = "client!eba", name = "D", descriptor = "I")
	private int anInt2112 = 4;

	@OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
	private int anInt2111 = 1024;

	@OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
	private int anInt2114 = 8;

	@OriginalMember(owner = "client!eba", name = "M", descriptor = "I")
	private int anInt2119 = 81;

	@OriginalMember(owner = "client!eba", name = "K", descriptor = "I")
	private int anInt2117 = 1024;

	@OriginalMember(owner = "client!eba", name = "L", descriptor = "I")
	private int anInt2118 = 204;

	@OriginalMember(owner = "client!eba", name = "S", descriptor = "I")
	private int anInt2123 = 0;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2112 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt2114 = arg0.method3642();
		} else if (arg1 == 2) {
			this.anInt2113 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt2118 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt2111 = arg0.method3698();
		} else if (arg1 == 5) {
			this.anInt2123 = arg0.method3698();
		} else if (arg1 == 6) {
			this.anInt2119 = arg0.method3698();
		} else if (arg1 == 7) {
			this.anInt2117 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
	private void method1927() {
		@Pc(12) Random local12 = new Random((long) this.anInt2114);
		this.anInt2121 = this.anInt2119 / 2;
		this.anInt2124 = 4096 / this.anInt2114;
		this.anInt2109 = 4096 / this.anInt2112;
		@Pc(35) int local35 = this.anInt2109 / 2;
		this.anIntArrayArray14 = new int[this.anInt2114][this.anInt2112 + 1];
		@Pc(49) int local49 = this.anInt2124 / 2;
		this.anIntArrayArray15 = new int[this.anInt2114][this.anInt2112];
		this.anIntArray108 = new int[this.anInt2114 + 1];
		this.anIntArray108[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt2114; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt2124;
				local93 = (Static653.method8578(4096, local12) - 2048) * this.anInt2118 >> 12;
				@Pc(101) int local101 = local81 + (local49 * local93 >> 12);
				this.anIntArray108[local74] = local101 + this.anIntArray108[local74 - 1];
			}
			this.anIntArrayArray14[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt2112; local81++) {
				if (local81 > 0) {
					local93 = this.anInt2109;
					@Pc(141) int local141 = (Static653.method8578(4096, local12) - 2048) * this.anInt2113 >> 12;
					local93 += local141 * local35 >> 12;
					this.anIntArrayArray14[local74][local81] = local93 + this.anIntArrayArray14[local74][local81 - 1];
				}
				this.anIntArrayArray15[local74][local81] = this.anInt2117 > 0 ? 4096 - Static653.method8578(this.anInt2117, local12) : 4096;
			}
			this.anIntArrayArray14[local74][this.anInt2112] = 4096;
		}
		this.anIntArray108[this.anInt2114] = 4096;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.method1927();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt2123 + Static508.anIntArray471[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt2114 > local22 && local29 >= this.anIntArray108[local22]) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(77) boolean local77 = (local22 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray108[local22];
			@Pc(89) int local89 = this.anIntArray108[local22 - 1];
			if (this.anInt2121 + local89 < local29 && local29 < local82 - this.anInt2121) {
				for (@Pc(119) int local119 = 0; local119 < Static421.anInt7443; local119++) {
					@Pc(123) int local123 = 0;
					@Pc(132) int local132 = local77 ? this.anInt2111 : -this.anInt2111;
					@Pc(143) int local143;
					for (local143 = (this.anInt2109 * local132 >> 12) + Static207.anIntArray185[local119]; local143 < 0; local143 += 4096) {
					}
					while (local143 > 4096) {
						local143 -= 4096;
					}
					while (this.anInt2112 > local123 && this.anIntArrayArray14[local66][local123] <= local143) {
						local123++;
					}
					@Pc(183) int local183 = local123 - 1;
					@Pc(190) int local190 = this.anIntArrayArray14[local66][local183];
					@Pc(197) int local197 = this.anIntArrayArray14[local66][local123];
					if (local143 > this.anInt2121 + local190 && local197 - this.anInt2121 > local143) {
						local16[local119] = this.anIntArrayArray15[local66][local183];
					} else {
						local16[local119] = 0;
					}
				}
			} else {
				Static685.method8333(local16, 0, Static421.anInt7443, 0);
			}
		}
		return local16;
	}
}
