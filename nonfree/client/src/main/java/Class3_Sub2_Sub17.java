import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
	private int anInt5981;

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
	private int anInt5982;

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ku", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!ku", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
	private int anInt5976 = 0;

	@OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
	private int anInt5984 = 1024;

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
	private int anInt5979 = 8;

	@OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
	private int anInt5977 = 409;

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
	private int anInt5986 = 204;

	@OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
	private int anInt5988 = 1024;

	@OriginalMember(owner = "client!ku", name = "T", descriptor = "I")
	private int anInt5990 = 4;

	@OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
	private int anInt5991 = 81;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)V")
	private void method5034() {
		@Pc(12) Random local12 = new Random((long) this.anInt5979);
		this.anInt5982 = 4096 / this.anInt5990;
		this.anInt5981 = 4096 / this.anInt5979;
		this.anInt5989 = this.anInt5991 / 2;
		@Pc(35) int local35 = this.anInt5982 / 2;
		this.anIntArrayArray63 = new int[this.anInt5979][this.anInt5990 + 1];
		this.anIntArray385 = new int[this.anInt5979 + 1];
		@Pc(56) int local56 = this.anInt5981 / 2;
		this.anIntArrayArray62 = new int[this.anInt5979][this.anInt5990];
		this.anIntArray385[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt5979; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt5981;
				local89 = (Static610.method8052(4096, local12) - 2048) * this.anInt5986 >> 12;
				@Pc(97) int local97 = local77 + (local89 * local56 >> 12);
				this.anIntArray385[local70] = local97 + this.anIntArray385[local70 - 1];
			}
			this.anIntArrayArray63[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt5990; local77++) {
				if (local77 > 0) {
					local89 = this.anInt5982;
					@Pc(140) int local140 = (Static610.method8052(4096, local12) - 2048) * this.anInt5977 >> 12;
					local89 += local140 * local35 >> 12;
					this.anIntArrayArray63[local70][local77] = local89 + this.anIntArrayArray63[local70][local77 - 1];
				}
				this.anIntArrayArray62[local70][local77] = this.anInt5988 <= 0 ? 4096 : 4096 - Static610.method8052(this.anInt5988, local12);
			}
			this.anIntArrayArray63[local70][this.anInt5990] = 4096;
		}
		this.anIntArray385[this.anInt5979] = 4096;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt5976 + Static201.anIntArray251[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt5979 > local22 && local29 >= this.anIntArray385[local22]) {
				local22++;
			}
			@Pc(60) int local60 = local22 - 1;
			@Pc(71) boolean local71 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray385[local22];
			@Pc(83) int local83 = this.anIntArray385[local22 - 1];
			if (local29 > this.anInt5989 + local83 && local76 - this.anInt5989 > local29) {
				for (@Pc(97) int local97 = 0; local97 < Static30.anInt908; local97++) {
					@Pc(101) int local101 = 0;
					@Pc(110) int local110 = local71 ? this.anInt5984 : -this.anInt5984;
					@Pc(121) int local121;
					for (local121 = (local110 * this.anInt5982 >> 12) + Static26.anIntArray20[local97]; local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (this.anInt5990 > local101 && local121 >= this.anIntArrayArray63[local60][local101]) {
						local101++;
					}
					@Pc(161) int local161 = local101 - 1;
					@Pc(168) int local168 = this.anIntArrayArray63[local60][local101];
					@Pc(175) int local175 = this.anIntArrayArray63[local60][local161];
					if (local175 + this.anInt5989 < local121 && local121 < local168 - this.anInt5989) {
						local11[local97] = this.anIntArrayArray62[local60][local161];
					} else {
						local11[local97] = 0;
					}
				}
			} else {
				Static689.method8056(local11, 0, Static30.anInt908, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5990 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt5979 = arg0.method4888();
		} else if (arg1 == 2) {
			this.anInt5977 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt5986 = arg0.method4858();
		} else if (arg1 == 4) {
			this.anInt5984 = arg0.method4858();
		} else if (arg1 == 5) {
			this.anInt5976 = arg0.method4858();
		} else if (arg1 == 6) {
			this.anInt5991 = arg0.method4858();
		} else if (arg1 == 7) {
			this.anInt5988 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.method5034();
	}
}
