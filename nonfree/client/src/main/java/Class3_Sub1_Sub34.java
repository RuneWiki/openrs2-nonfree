import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sea", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!sea", name = "Q", descriptor = "I")
	private int anInt7755;

	@OriginalMember(owner = "client!sea", name = "V", descriptor = "I")
	private int anInt7759;

	@OriginalMember(owner = "client!sea", name = "Y", descriptor = "[I")
	private int[] anIntArray601;

	@OriginalMember(owner = "client!sea", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!sea", name = "jb", descriptor = "I")
	private int anInt7768;

	@OriginalMember(owner = "client!sea", name = "R", descriptor = "I")
	private int anInt7756 = 204;

	@OriginalMember(owner = "client!sea", name = "L", descriptor = "I")
	private int anInt7752 = 8;

	@OriginalMember(owner = "client!sea", name = "W", descriptor = "I")
	private int anInt7760 = 4;

	@OriginalMember(owner = "client!sea", name = "O", descriptor = "I")
	private int anInt7754 = 409;

	@OriginalMember(owner = "client!sea", name = "S", descriptor = "I")
	private int anInt7757 = 81;

	@OriginalMember(owner = "client!sea", name = "cb", descriptor = "I")
	private int anInt7763 = 1024;

	@OriginalMember(owner = "client!sea", name = "ib", descriptor = "I")
	private int anInt7767 = 1024;

	@OriginalMember(owner = "client!sea", name = "kb", descriptor = "I")
	private int anInt7769 = 0;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(19) int local19 = 0;
			@Pc(27) int local27;
			for (local27 = Static9.anIntArray15[arg0] + this.anInt7769; local27 < 0; local27 += 4096) {
			}
			while (local27 > 4096) {
				local27 -= 4096;
			}
			while (this.anInt7752 > local19 && this.anIntArray601[local19] <= local27) {
				local19++;
			}
			@Pc(65) int local65 = local19 - 1;
			@Pc(73) boolean local73 = (local19 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray601[local19];
			@Pc(85) int local85 = this.anIntArray601[local19 - 1];
			if (local85 + this.anInt7755 < local27 && local78 - this.anInt7755 > local27) {
				for (@Pc(111) int local111 = 0; local111 < Static206.anInt4182; local111++) {
					@Pc(122) int local122 = local73 ? this.anInt7767 : -this.anInt7767;
					@Pc(124) int local124 = 0;
					@Pc(136) int local136;
					for (local136 = Static329.anIntArray456[local111] + (local122 * this.anInt7759 >> 12); local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (local124 < this.anInt7760 && this.anIntArrayArray59[local65][local124] <= local136) {
						local124++;
					}
					@Pc(172) int local172 = local124 - 1;
					@Pc(179) int local179 = this.anIntArrayArray59[local65][local172];
					@Pc(186) int local186 = this.anIntArrayArray59[local65][local124];
					if (local136 > local179 + this.anInt7755 && local136 < local186 - this.anInt7755) {
						local13[local111] = this.anIntArrayArray60[local65][local172];
					} else {
						local13[local111] = 0;
					}
				}
			} else {
				Static604.method5915(local13, 0, Static206.anInt4182, 0);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7760 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt7752 = arg0.method3118();
		} else if (arg1 == 2) {
			this.anInt7754 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt7756 = arg0.method3109();
		} else if (arg1 == 4) {
			this.anInt7767 = arg0.method3109();
		} else if (arg1 == 5) {
			this.anInt7769 = arg0.method3109();
		} else if (arg1 == 6) {
			this.anInt7757 = arg0.method3109();
		} else if (arg1 == 7) {
			this.anInt7763 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.method6553();
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V")
	private void method6553() {
		@Pc(20) Random local20 = new Random((long) this.anInt7752);
		this.anInt7759 = 4096 / this.anInt7760;
		this.anInt7755 = this.anInt7757 / 2;
		this.anInt7768 = 4096 / this.anInt7752;
		@Pc(43) int local43 = this.anInt7759 / 2;
		this.anIntArrayArray60 = new int[this.anInt7752][this.anInt7760];
		this.anIntArrayArray59 = new int[this.anInt7752][this.anInt7760 + 1];
		this.anIntArray601 = new int[this.anInt7752 + 1];
		@Pc(71) int local71 = this.anInt7768 / 2;
		this.anIntArray601[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt7752; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt7768;
				local100 = (Static231.method3920(local20, 4096) - 2048) * this.anInt7756 >> 12;
				@Pc(108) int local108 = local88 + (local71 * local100 >> 12);
				this.anIntArray601[local78] = local108 + this.anIntArray601[local78 - 1];
			}
			this.anIntArrayArray59[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt7760; local88++) {
				if (local88 > 0) {
					local100 = this.anInt7759;
					@Pc(151) int local151 = (Static231.method3920(local20, 4096) - 2048) * this.anInt7754 >> 12;
					local100 += local43 * local151 >> 12;
					this.anIntArrayArray59[local78][local88] = local100 + this.anIntArrayArray59[local78][local88 - 1];
				}
				this.anIntArrayArray60[local78][local88] = this.anInt7763 <= 0 ? 4096 : 4096 - Static231.method3920(local20, this.anInt7763);
			}
			this.anIntArrayArray59[local78][this.anInt7760] = 4096;
		}
		this.anIntArray601[this.anInt7752] = 4096;
	}
}
