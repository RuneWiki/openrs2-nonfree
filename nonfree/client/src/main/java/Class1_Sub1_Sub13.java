import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
	private int anInt1656 = 0;

	@OriginalMember(owner = "client!gf", name = "mb", descriptor = "I")
	private int anInt1659 = 2000;

	@OriginalMember(owner = "client!gf", name = "nb", descriptor = "I")
	private int anInt1660 = 4096;

	@OriginalMember(owner = "client!gf", name = "lb", descriptor = "I")
	private int anInt1658 = 0;

	@OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
	private int anInt1654 = 16;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1656 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt1659 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt1654 = arg1.method1738();
		} else if (arg0 == 3) {
			this.anInt1658 = arg1.method1753();
		} else if (arg0 == 4) {
			this.anInt1660 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(26) int local26 = this.anInt1660 >> 1;
			@Pc(33) int[][] local33 = super.aClass80_41.method2877();
			@Pc(40) Random local40 = new Random((long) this.anInt1656);
			for (@Pc(42) int local42 = 0; local42 < this.anInt1659; local42++) {
				@Pc(62) int local62 = this.anInt1660 > 0 ? this.anInt1658 + Static3.method61(local40, this.anInt1660) - local26 : this.anInt1658;
				@Pc(67) int local67 = Static3.method61(local40, Static176.anInt3921);
				@Pc(73) int local73 = local62 >> 4 & 0xFF;
				@Pc(78) int local78 = Static3.method61(local40, Static112.anInt2736);
				@Pc(89) int local89 = local67 + (this.anInt1654 * Static143.anIntArray158[local73] >> 12);
				@Pc(100) int local100 = (Static21.anIntArray66[local73] * this.anInt1654 >> 12) + local78;
				@Pc(105) int local105 = local100 - local78;
				@Pc(110) int local110 = local89 - local67;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(135) boolean local135 = local105 > local110;
					@Pc(139) int local139;
					@Pc(141) int local141;
					if (local135) {
						local139 = local67;
						local141 = local89;
						local89 = local100;
						local100 = local141;
						local67 = local78;
						local78 = local139;
					}
					if (local89 < local67) {
						local141 = local78;
						local78 = local100;
						local100 = local141;
						local139 = local67;
						local67 = local89;
						local89 = local139;
					}
					local139 = local78;
					local141 = local89 - local67;
					@Pc(176) int local176 = local100 - local78;
					@Pc(186) int local186 = 1024 - (Static3.method61(local40, 4096) >> 2);
					@Pc(191) int local191 = -local141 / 2;
					if (local176 < 0) {
						local176 = -local176;
					}
					@Pc(200) int local200 = 2048 / local141;
					@Pc(207) int local207 = local100 > local78 ? 1 : -1;
					for (@Pc(209) int local209 = local67; local209 < local89; local209++) {
						local191 += local176;
						@Pc(226) int local226 = local186 + (-local67 + local209) * local200 + 1024;
						@Pc(230) int local230 = Static70.anInt1730 & local209;
						@Pc(234) int local234 = local139 & Static134.anInt3338;
						if (local191 > 0) {
							local191 += -local141;
							local139 += local207;
						}
						if (local135) {
							local33[local234][local230] = local226;
						} else {
							local33[local230][local234] = local226;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		Static161.method2763();
	}
}
