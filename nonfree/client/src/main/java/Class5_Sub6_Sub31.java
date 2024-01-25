import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class5_Sub6_Sub31 extends Class5_Sub6 {

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	private int anInt7855 = 32768;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7855 = arg0.method3698() << 4;
		} else if (arg1 == 1) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(29) int[] local29 = this.method8117(arg0, 1);
			@Pc(35) int[] local35 = this.method8117(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static421.anInt7443; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt7855 * local35[local37] >> 12;
				@Pc(64) int local64 = Static24.anIntArray30[local47] * local56 >> 12;
				@Pc(72) int local72 = Static377.anIntArray369[local47] * local56 >> 12;
				@Pc(80) int local80 = Static575.anInt9380 & (local64 >> 12) + local37;
				@Pc(88) int local88 = arg0 + (local72 >> 12) & Static442.anInt7781;
				@Pc(94) int[] local94 = this.method8117(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		Static648.method8531();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(26) int[] local26 = this.method8117(arg0, 1);
			@Pc(32) int[] local32 = this.method8117(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static421.anInt7443; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt7855 * local32[local46] >> 12;
				@Pc(75) int local75 = Static24.anIntArray30[local58] * local67 >> 12;
				@Pc(83) int local83 = Static377.anIntArray369[local58] * local67 >> 12;
				@Pc(91) int local91 = Static575.anInt9380 & (local75 >> 12) + local46;
				@Pc(99) int local99 = Static442.anInt7781 & arg0 + (local83 >> 12);
				@Pc(105) int[][] local105 = this.method8116(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}
}
