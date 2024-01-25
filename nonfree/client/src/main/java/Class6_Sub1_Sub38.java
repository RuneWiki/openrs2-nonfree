import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class6_Sub1_Sub38 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
	private int anInt10649;

	@OriginalMember(owner = "client!wia", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!wia", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!wia", name = "Y", descriptor = "[I")
	private int[] anIntArray569;

	@OriginalMember(owner = "client!wia", name = "Z", descriptor = "I")
	private int anInt10656;

	@OriginalMember(owner = "client!wia", name = "bb", descriptor = "I")
	private int anInt10658;

	@OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
	private int anInt10645 = 409;

	@OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
	private int anInt10647 = 0;

	@OriginalMember(owner = "client!wia", name = "T", descriptor = "I")
	private int anInt10653 = 8;

	@OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
	private int anInt10651 = 1024;

	@OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
	private int anInt10648 = 1024;

	@OriginalMember(owner = "client!wia", name = "cb", descriptor = "I")
	private int anInt10659 = 4;

	@OriginalMember(owner = "client!wia", name = "ab", descriptor = "I")
	private int anInt10657 = 204;

	@OriginalMember(owner = "client!wia", name = "X", descriptor = "I")
	private int anInt10655 = 81;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10659 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt10653 = arg1.method8246();
		} else if (arg0 == 2) {
			this.anInt10645 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt10657 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt10651 = arg1.method8220();
		} else if (arg0 == 5) {
			this.anInt10647 = arg1.method8220();
		} else if (arg0 == 6) {
			this.anInt10655 = arg1.method8220();
		} else if (arg0 == 7) {
			this.anInt10648 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt10647 + Static603.anIntArray549[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt10653 > local17 && local24 >= this.anIntArray569[local17]) {
				local17++;
			}
			@Pc(57) int local57 = local17 - 1;
			@Pc(68) boolean local68 = (local17 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray569[local17];
			@Pc(80) int local80 = this.anIntArray569[local17 - 1];
			if (local80 + this.anInt10656 < local24 && local24 < local73 - this.anInt10656) {
				for (@Pc(106) int local106 = 0; local106 < Static53.anInt1787; local106++) {
					@Pc(110) int local110 = 0;
					@Pc(119) int local119 = local68 ? this.anInt10651 : -this.anInt10651;
					@Pc(130) int local130;
					for (local130 = (this.anInt10649 * local119 >> 12) + Static12.anIntArray15[local106]; local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (local110 < this.anInt10659 && this.anIntArrayArray67[local57][local110] <= local130) {
						local110++;
					}
					@Pc(160) int local160 = local110 - 1;
					@Pc(167) int local167 = this.anIntArrayArray67[local57][local160];
					@Pc(174) int local174 = this.anIntArrayArray67[local57][local110];
					if (local167 + this.anInt10656 < local130 && local174 - this.anInt10656 > local130) {
						local11[local106] = this.anIntArrayArray66[local57][local160];
					} else {
						local11[local106] = 0;
					}
				}
			} else {
				Static653.method6539(local11, 0, Static53.anInt1787, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.method8696();
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)V")
	private void method8696() {
		@Pc(12) Random local12 = new Random((long) this.anInt10653);
		this.anInt10656 = this.anInt10655 / 2;
		this.anInt10649 = 4096 / this.anInt10659;
		this.anInt10658 = 4096 / this.anInt10653;
		@Pc(35) int local35 = this.anInt10649 / 2;
		this.anIntArrayArray67 = new int[this.anInt10653][this.anInt10659 + 1];
		this.anIntArray569 = new int[this.anInt10653 + 1];
		this.anIntArrayArray66 = new int[this.anInt10653][this.anInt10659];
		@Pc(63) int local63 = this.anInt10658 / 2;
		this.anIntArray569[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt10653; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt10658;
				local89 = (Static123.method2611(4096, local12) - 2048) * this.anInt10657 >> 12;
				@Pc(97) int local97 = local77 + (local89 * local63 >> 12);
				this.anIntArray569[local70] = local97 + this.anIntArray569[local70 - 1];
			}
			this.anIntArrayArray67[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt10659; local77++) {
				if (local77 > 0) {
					local89 = this.anInt10649;
					@Pc(140) int local140 = (Static123.method2611(4096, local12) - 2048) * this.anInt10645 >> 12;
					local89 += local35 * local140 >> 12;
					this.anIntArrayArray67[local70][local77] = local89 + this.anIntArrayArray67[local70][local77 - 1];
				}
				this.anIntArrayArray66[local70][local77] = this.anInt10648 <= 0 ? 4096 : 4096 - Static123.method2611(this.anInt10648, local12);
			}
			this.anIntArrayArray67[local70][this.anInt10659] = 4096;
		}
		this.anIntArray569[this.anInt10653] = 4096;
	}
}
