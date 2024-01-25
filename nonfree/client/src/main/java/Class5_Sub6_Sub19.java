import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public final class Class5_Sub6_Sub19 extends Class5_Sub6 {

	@OriginalMember(owner = "client!jka", name = "C", descriptor = "I")
	private int anInt4397 = 4;

	@OriginalMember(owner = "client!jka", name = "A", descriptor = "I")
	private int anInt4395 = 4;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4397 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt4395 = arg0.method3642();
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(26) int local26 = Static421.anInt7443 / this.anInt4397;
			@Pc(31) int local31 = Static378.anInt6579 / this.anInt4395;
			@Pc(50) int[] local50;
			@Pc(40) int local40;
			if (local31 > 0) {
				local40 = arg0 % local31;
				local50 = this.method8117(local40 * Static378.anInt6579 / local31, 0);
			} else {
				local50 = this.method8117(0, 0);
			}
			for (local40 = 0; local40 < Static421.anInt7443; local40++) {
				if (local26 > 0) {
					@Pc(68) int local68 = local40 % local26;
					local17[local40] = local50[Static421.anInt7443 * local68 / local26];
				} else {
					local17[local40] = local50[0];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(25) int local25 = Static421.anInt7443 / this.anInt4397;
			@Pc(30) int local30 = Static378.anInt6579 / this.anInt4395;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method8116(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method8116(0, Static378.anInt6579 * local47 / local30);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static421.anInt7443; local83++) {
				@Pc(92) int local92;
				if (local25 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local25;
					local92 = Static421.anInt7443 * local98 / local25;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local11;
	}
}
