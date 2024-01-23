import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
	private int anInt193 = 0;

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
	private int anInt199 = 0;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
	private int anInt183 = 0;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIII)V")
	private void method145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 > arg0 ? arg2 : arg0;
		@Pc(23) int local23 = local8 < arg1 ? arg1 : local8;
		@Pc(34) int local34 = arg0 > arg2 ? arg2 : arg0;
		@Pc(54) int local54 = arg1 < local34 ? arg1 : local34;
		@Pc(58) int local58 = local23 - local54;
		if (local58 > 0) {
			@Pc(70) int local70 = (local23 - arg2 << 12) / local58;
			@Pc(79) int local79 = (local23 - arg1 << 12) / local58;
			@Pc(88) int local88 = (local23 - arg0 << 12) / local58;
			if (local23 == arg2) {
				this.anInt190 = arg0 == local54 ? local79 + 20480 : -local88 + 4096;
			} else if (arg0 == local23) {
				this.anInt190 = local54 == arg1 ? local70 + 4096 : -local79 + 12288;
			} else {
				this.anInt190 = local54 == arg2 ? local88 + 12288 : 20480 - local70;
			}
			this.anInt190 /= 6;
		} else {
			this.anInt190 = 0;
		}
		this.anInt191 = (local23 + local54) / 2;
		if (this.anInt191 > 0 && this.anInt191 < 4096) {
			this.anInt197 = (local58 << 12) / (this.anInt191 <= 2048 ? this.anInt191 * 2 : 8192 - (this.anInt191 * 2));
		} else {
			this.anInt197 = 0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(18) int[][] local18 = this.method4549(0, arg0);
			@Pc(22) int[] local22 = local18[0];
			@Pc(26) int[] local26 = local18[2];
			@Pc(30) int[] local30 = local7[0];
			@Pc(34) int[] local34 = local7[1];
			@Pc(38) int[] local38 = local18[1];
			@Pc(42) int[] local42 = local7[2];
			for (@Pc(44) int local44 = 0; local44 < Static68.anInt1753; local44++) {
				this.method145(local38[local44], local26[local44], local22[local44]);
				this.anInt191 += this.anInt183;
				for (this.anInt190 += this.anInt193; this.anInt190 < 0; this.anInt190 += 4096) {
				}
				while (this.anInt190 > 4096) {
					this.anInt190 -= 4096;
				}
				if (this.anInt191 < 0) {
					this.anInt191 = 0;
				}
				if (this.anInt191 > 4096) {
					this.anInt191 = 4096;
				}
				this.anInt197 += this.anInt199;
				if (this.anInt197 < 0) {
					this.anInt197 = 0;
				}
				if (this.anInt197 > 4096) {
					this.anInt197 = 4096;
				}
				this.method147(this.anInt190, this.anInt191, this.anInt197);
				local30[local44] = this.anInt198;
				local34[local44] = this.anInt192;
				local42[local44] = this.anInt186;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt193 = arg1.method3072();
		} else if (arg0 == 1) {
			this.anInt199 = (arg1.method3069() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt183 = (arg1.method3069() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIII)V")
	private void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg1 + arg2 - (arg1 * arg2 >> 12);
		if (local29 <= 0) {
			this.anInt198 = this.anInt192 = this.anInt186 = arg1;
			return;
		}
		@Pc(40) int local40 = arg1 + arg1 - local29;
		@Pc(44) int local44 = arg0 * 6;
		@Pc(53) int local53 = (local29 - local40 << 12) / local29;
		@Pc(61) int local61 = local29 * local53 >> 12;
		@Pc(65) int local65 = local44 >> 12;
		@Pc(72) int local72 = local44 - (local65 << 12);
		@Pc(78) int local78 = local61 * local72 >> 12;
		@Pc(83) int local83 = local29 - local78;
		@Pc(88) int local88 = local40 + local78;
		if (local65 == 0) {
			this.anInt198 = local29;
			this.anInt186 = local40;
			this.anInt192 = local88;
		} else if (local65 == 1) {
			this.anInt186 = local40;
			this.anInt192 = local29;
			this.anInt198 = local83;
		} else if (local65 == 2) {
			this.anInt192 = local29;
			this.anInt186 = local88;
			this.anInt198 = local40;
		} else if (local65 == 3) {
			this.anInt192 = local83;
			this.anInt198 = local40;
			this.anInt186 = local29;
		} else if (local65 == 4) {
			this.anInt186 = local29;
			this.anInt198 = local88;
			this.anInt192 = local40;
		} else if (local65 == 5) {
			this.anInt186 = local83;
			this.anInt192 = local40;
			this.anInt198 = local29;
		}
	}
}
