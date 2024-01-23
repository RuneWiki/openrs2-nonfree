import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	private int anInt951 = 409;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
	private int anInt950 = 0;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
	private int anInt955 = 8;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	private int anInt949 = 4;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	private int anInt958 = 1024;

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
	private int anInt953 = 81;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
	private int anInt962 = 204;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
	private int anInt961 = 1024;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(I)V")
	private void method699() {
		@Pc(12) Random local12 = new Random((long) this.anInt955);
		this.anIntArrayArray6 = new int[this.anInt955][this.anInt949 + 1];
		this.anIntArray56 = new int[this.anInt955 + 1];
		this.anInt957 = 4096 / this.anInt955;
		this.anIntArray56[0] = 0;
		this.anInt956 = 4096 / this.anInt949;
		@Pc(58) int local58 = this.anInt956 / 2;
		this.anInt963 = this.anInt953 / 2;
		this.anIntArrayArray7 = new int[this.anInt955][this.anInt949];
		@Pc(76) int local76 = this.anInt957 / 2;
		for (@Pc(78) int local78 = 0; local78 < this.anInt955; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt957;
				local100 = (Static108.method1839(local12, 4096) - 2048) * this.anInt962 >> 12;
				@Pc(108) int local108 = local88 + (local76 * local100 >> 12);
				this.anIntArray56[local78] = this.anIntArray56[local78 - 1] + local108;
			}
			this.anIntArrayArray6[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt949; local88++) {
				if (local88 > 0) {
					local100 = this.anInt956;
					@Pc(149) int local149 = (Static108.method1839(local12, 4096) - 2048) * this.anInt951 >> 12;
					local100 += local149 * local58 >> 12;
					this.anIntArrayArray6[local78][local88] = this.anIntArrayArray6[local78][local88 - 1] + local100;
				}
				this.anIntArrayArray7[local78][local88] = this.anInt961 > 0 ? 4096 - Static108.method1839(local12, this.anInt961) : 4096;
			}
			this.anIntArrayArray6[local78][this.anInt949] = 4096;
		}
		this.anIntArray56[this.anInt955] = 4096;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.method699();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt949 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt955 = arg0.method3793();
		} else if (arg1 == 2) {
			this.anInt951 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt962 = arg0.method3805();
		} else if (arg1 == 4) {
			this.anInt958 = arg0.method3805();
		} else if (arg1 == 5) {
			this.anInt950 = arg0.method3805();
		} else if (arg1 == 6) {
			this.anInt953 = arg0.method3805();
		} else if (arg1 == 7) {
			this.anInt961 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt950 + Static211.anIntArray334[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt955 && this.anIntArray56[local22] <= local29) {
				local22++;
			}
			@Pc(70) boolean local70 = (local22 & 0x1) == 0;
			@Pc(74) int local74 = local22 - 1;
			@Pc(79) int local79 = this.anIntArray56[local22];
			@Pc(86) int local86 = this.anIntArray56[local22 - 1];
			if (local86 + this.anInt963 < local29 && local79 - this.anInt963 > local29) {
				for (@Pc(105) int local105 = 0; local105 < Static157.anInt3431; local105++) {
					@Pc(109) int local109 = 0;
					@Pc(118) int local118 = local70 ? this.anInt958 : -this.anInt958;
					@Pc(129) int local129;
					for (local129 = (this.anInt956 * local118 >> 12) + Static73.anIntArray105[local105]; local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (local109 < this.anInt949 && local129 >= this.anIntArrayArray6[local74][local109]) {
						local109++;
					}
					@Pc(164) int local164 = this.anIntArrayArray6[local74][local109];
					@Pc(168) int local168 = local109 - 1;
					@Pc(175) int local175 = this.anIntArrayArray6[local74][local168];
					if (this.anInt963 + local175 < local129 && local129 < local164 - this.anInt963) {
						local12[local105] = this.anIntArrayArray7[local74][local168];
					} else {
						local12[local105] = 0;
					}
				}
			} else {
				Static233.method869(local12, 0, Static157.anInt3431, 0);
			}
		}
		return local12;
	}
}
