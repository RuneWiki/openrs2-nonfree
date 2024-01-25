import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
	private int anInt3603 = 32768;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		Static315.method7021();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int[] local29 = this.method7951(arg0, 1);
			@Pc(35) int[] local35 = this.method7951(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static153.anInt3070; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt3603 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static388.anIntArray472[local47] >> 12;
				@Pc(72) int local72 = Static561.anIntArray667[local47] * local56 >> 12;
				@Pc(81) int local81 = Static431.anInt7305 & local37 + (local64 >> 12);
				@Pc(90) int local90 = arg0 + (local72 >> 12) & Static28.anInt6368;
				@Pc(96) int[] local96 = this.method7951(local90, 0);
				local11[local37] = local96[local81];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(26) int[] local26 = this.method7951(arg0, 1);
			@Pc(32) int[] local32 = this.method7951(arg0, 2);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static153.anInt3070; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3603 >> 12;
				@Pc(75) int local75 = local67 * Static388.anIntArray472[local58] >> 12;
				@Pc(83) int local83 = local67 * Static561.anIntArray667[local58] >> 12;
				@Pc(91) int local91 = (local75 >> 12) + local46 & Static431.anInt7305;
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static28.anInt6368;
				@Pc(105) int[][] local105 = this.method7947(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3603 = arg0.method4294() << 4;
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}
}
