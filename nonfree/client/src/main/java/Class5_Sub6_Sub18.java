import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class5_Sub6_Sub18 extends Class5_Sub6 {

	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	private int anInt4059 = 0;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "I")
	private int anInt4060 = 4096;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "I")
	private int anInt4062 = 2000;

	@OriginalMember(owner = "client!im", name = "N", descriptor = "I")
	private int anInt4065 = 16;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
	private int anInt4068 = 0;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		Static648.method8531();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4059 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt4062 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt4065 = arg0.method3642();
		} else if (arg1 == 3) {
			this.anInt4068 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt4060 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(25) int local25 = this.anInt4060 >> 1;
			@Pc(30) int[][] local30 = super.aClass296_41.method7190();
			@Pc(37) Random local37 = new Random((long) this.anInt4059);
			for (@Pc(39) int local39 = 0; local39 < this.anInt4062; local39++) {
				@Pc(64) int local64 = this.anInt4060 > 0 ? this.anInt4068 + Static653.method8578(this.anInt4060, local37) - local25 : this.anInt4068;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static653.method8578(Static421.anInt7443, local37);
				@Pc(80) int local80 = Static653.method8578(Static378.anInt6579, local37);
				@Pc(91) int local91 = (this.anInt4065 * Static24.anIntArray30[local70] >> 12) + local75;
				@Pc(103) int local103 = local80 + (Static377.anIntArray369[local70] * this.anInt4065 >> 12);
				@Pc(108) int local108 = local103 - local80;
				@Pc(112) int local112 = local91 - local75;
				if (local112 != 0 || local108 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local112 < 0) {
						local112 = -local112;
					}
					@Pc(146) boolean local146 = local108 > local112;
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local146) {
						local150 = local75;
						local75 = local80;
						local154 = local91;
						local80 = local150;
						local91 = local103;
						local103 = local154;
					}
					if (local91 < local75) {
						local150 = local75;
						local75 = local91;
						local154 = local80;
						local91 = local150;
						local80 = local103;
						local103 = local154;
					}
					local150 = local80;
					local154 = local91 - local75;
					@Pc(186) int local186 = local103 - local80;
					@Pc(191) int local191 = -local154 / 2;
					@Pc(195) int local195 = 2048 / local154;
					@Pc(205) int local205 = 1024 - (Static653.method8578(4096, local37) >> 2);
					if (local186 < 0) {
						local186 = -local186;
					}
					@Pc(221) int local221 = local80 >= local103 ? -1 : 1;
					for (@Pc(223) int local223 = local75; local223 < local91; local223++) {
						@Pc(236) int local236 = local195 * (local223 - local75) + local205 + 1024;
						@Pc(240) int local240 = Static575.anInt9380 & local223;
						@Pc(244) int local244 = local150 & Static442.anInt7781;
						local191 += local186;
						if (local146) {
							local30[local244][local240] = local236;
						} else {
							local30[local240][local244] = local236;
						}
						if (local191 > 0) {
							local191 += -local154;
							local150 += local221;
						}
					}
				}
			}
		}
		return local11;
	}
}
