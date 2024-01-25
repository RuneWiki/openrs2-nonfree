import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub5_Sub32 extends Class1_Sub5 {

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	private int anInt5866 = 4;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	private int anInt5867 = 4;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5866 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt5867 = arg0.method5720();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(20) int local20 = Static75.anInt1566 / this.anInt5866;
			@Pc(25) int local25 = Static129.anInt2574 / this.anInt5867;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local25 <= 0) {
				local38 = this.method5802(0, 0);
			} else {
				local44 = arg0 % local25;
				local38 = this.method5802(0, local44 * Static129.anInt2574 / local25);
			}
			for (local44 = 0; local44 < Static75.anInt1566; local44++) {
				if (local20 <= 0) {
					local11[local44] = local38[0];
				} else {
					@Pc(74) int local74 = local44 % local20;
					local11[local44] = local38[Static75.anInt1566 * local74 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(25) int local25 = Static75.anInt1566 / this.anInt5866;
			@Pc(30) int local30 = Static129.anInt2574 / this.anInt5867;
			@Pc(38) int[][] local38;
			if (local30 <= 0) {
				local38 = this.method5807(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local30;
				local38 = this.method5807(Static129.anInt2574 * local44 / local30, 0);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local38[2];
			@Pc(70) int[] local70 = local11[0];
			@Pc(74) int[] local74 = local11[1];
			@Pc(78) int[] local78 = local11[2];
			for (@Pc(80) int local80 = 0; local80 < Static75.anInt1566; local80++) {
				@Pc(86) int local86;
				if (local25 <= 0) {
					local86 = 0;
				} else {
					@Pc(92) int local92 = local80 % local25;
					local86 = Static75.anInt1566 * local92 / local25;
				}
				local70[local80] = local58[local86];
				local74[local80] = local62[local86];
				local78[local80] = local66[local86];
			}
		}
		return local11;
	}
}
