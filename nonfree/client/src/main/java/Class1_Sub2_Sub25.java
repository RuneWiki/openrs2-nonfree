import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
	private int anInt3155;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	private int anInt3158;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
	private int anInt3161;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
	private int anInt3154;

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
	private int anInt3169;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
	private void method2329() {
		@Pc(12) Random local12 = new Random((long) this.anInt3155);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray306[local14] = -1;
		}
		for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
			@Pc(51) int local51;
			do {
				local51 = Static152.method1616(255, local12);
			} while (this.anIntArray306[local51] != -1);
			this.anIntArray306[local51 + 255] = this.anIntArray306[local51] = local40;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(25) int local25 = this.anInt3161 << 12;
			@Pc(30) int local30 = this.anInt3169 << 12;
			@Pc(37) int local37 = Static160.anIntArray399[arg0] * this.anInt3169;
			for (@Pc(39) int local39 = 0; local39 < Static22.anInt596; local39++) {
				@Pc(43) int local43 = 0;
				@Pc(50) int local50 = this.anInt3161 * Static167.anIntArray417[local39];
				for (@Pc(52) int local52 = 0; local52 < this.anInt3154; local52++) {
					@Pc(59) int local59 = this.anIntArray304[local52];
					@Pc(64) int local64 = this.anIntArray305[local52];
					@Pc(88) int local88 = this.method2333(local37 * local59 >> 12, local59 * local50 >> 12, local30 * local59 >> 12, local25 * local59 >> 12);
					local43 += local88 * local64 >> 12;
				}
				if (this.aBoolean127) {
					local43 = (local43 >> 1) + 2048;
				}
				local16[local39] = local43;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.method2329();
		this.method2330();
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
	private void method2330() {
		@Pc(39) int local39;
		if (this.anInt3158 > 0) {
			this.anIntArray305 = new int[this.anInt3154];
			this.anIntArray304 = new int[this.anInt3154];
			for (local39 = 0; local39 < this.anInt3154; local39++) {
				this.anIntArray305[local39] = (int) (Math.pow((double) (this.anInt3158 / 4096), (double) local39) * 4096.0D);
				this.anIntArray304[local39] = (int) (Math.pow(2.0D, (double) local39) * 4096.0D);
			}
		} else if (this.anIntArray305 != null && this.anIntArray305.length == this.anInt3154) {
			this.anIntArray304 = new int[this.anInt3154];
			for (local39 = 0; local39 < this.anInt3154; local39++) {
				this.anIntArray304[local39] = (int) (Math.pow(2.0D, (double) local39) * 4096.0D);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZI)I")
	private int method2333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xFFFFF000;
		@Pc(11) int local11 = arg1 - local7;
		@Pc(21) int local21 = local7 >> 12;
		@Pc(25) int local25 = arg0 & 0xFFFFF000;
		@Pc(29) int local29 = arg3 & 0xFFFFF000;
		@Pc(33) int local33 = local21 + 1;
		@Pc(37) int local37 = arg2 & 0xFFFFF000;
		if (local33 >= local29 >> 12) {
			local33 = 0;
		}
		@Pc(48) int local48 = arg0 - local25;
		local33 &= 0xFF;
		local25 >>= 0xC;
		@Pc(60) int local60 = local25 + 1;
		local25 &= 0xFF;
		@Pc(76) int local76 = this.anIntArray306[local33 + this.anIntArray306[local25]] % 4;
		if (local60 >= local37 >> 12) {
			local60 = 0;
		}
		local60 &= 0xFF;
		@Pc(103) int local103 = this.anIntArray306[this.anIntArray306[local60] + local33] % 4;
		local7 = local21 & 0xFF;
		@Pc(119) int local119 = this.anIntArray306[this.anIntArray306[local25] + local7] % 4;
		@Pc(131) int local131 = this.anIntArray306[this.anIntArray306[local60] + local7] % 4;
		@Pc(139) int local139 = Static123.method2499(local48, local11, Static182.anIntArrayArray40[local119]);
		@Pc(149) int local149 = Static123.method2499(local48, local11 - 4096, Static182.anIntArrayArray40[local76]);
		@Pc(159) int local159 = Static123.method2499(local48 - 4096, local11, Static182.anIntArrayArray40[local131]);
		@Pc(171) int local171 = Static123.method2499(local48 - 4096, local11 + -4096, Static182.anIntArrayArray40[local103]);
		@Pc(175) int local175 = Static107.method2255(local11);
		@Pc(179) int local179 = Static107.method2255(local48);
		@Pc(185) int local185 = Static129.method3397(local175, local149, local139);
		@Pc(191) int local191 = Static129.method3397(local175, local171, local159);
		return Static129.method3397(local179, local191, local185);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean127 = arg1.method1234() == 1;
		} else if (arg0 == 1) {
			this.anInt3154 = arg1.method1234();
		} else if (arg0 == 2) {
			this.anInt3158 = arg1.method1279();
			if (this.anInt3158 < 0) {
				this.anIntArray305 = new int[this.anInt3154];
				for (@Pc(74) int local74 = 0; local74 < this.anInt3154; local74++) {
					this.anIntArray305[local74] = arg1.method1279();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3161 = this.anInt3169 = arg1.method1234();
		} else if (arg0 == 4) {
			this.anInt3155 = arg1.method1234();
		} else if (arg0 == 5) {
			this.anInt3161 = arg1.method1234();
		} else if (arg0 == 6) {
			this.anInt3169 = arg1.method1234();
		}
	}
}
