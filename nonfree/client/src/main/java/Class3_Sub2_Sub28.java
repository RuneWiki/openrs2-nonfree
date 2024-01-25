import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	private int anInt8799 = 4;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
	private int anInt8802 = 4;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt8802 = arg1.method5322(-108);
		} else if (arg0 == 1) {
			this.anInt8799 = arg1.method5322(-55);
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(30) int local30 = Static636.anInt10302 / this.anInt8802;
			@Pc(35) int local35 = Static443.anInt7682 / this.anInt8799;
			@Pc(51) int[][] local51;
			if (local35 > 0) {
				@Pc(41) int local41 = arg0 % local35;
				local51 = this.method9212(0, Static443.anInt7682 * local41 / local35);
			} else {
				local51 = this.method9212(0, 0);
			}
			@Pc(65) int[] local65 = local51[0];
			@Pc(69) int[] local69 = local51[1];
			@Pc(73) int[] local73 = local51[2];
			@Pc(77) int[] local77 = local13[0];
			@Pc(81) int[] local81 = local13[1];
			@Pc(85) int[] local85 = local13[2];
			for (@Pc(87) int local87 = 0; local87 < Static636.anInt10302; local87++) {
				@Pc(106) int local106;
				if (local30 > 0) {
					@Pc(100) int local100 = local87 % local30;
					local106 = local100 * Static636.anInt10302 / local30;
				} else {
					local106 = 0;
				}
				local77[local87] = local65[local106];
				local81[local87] = local69[local106];
				local85[local87] = local73[local106];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int local28 = Static636.anInt10302 / this.anInt8802;
			@Pc(33) int local33 = Static443.anInt7682 / this.anInt8799;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method9204(Static443.anInt7682 * local42 / local33, 0);
			} else {
				local52 = this.method9204(0, 0);
			}
			for (local42 = 0; local42 < Static636.anInt10302; local42++) {
				if (local28 <= 0) {
					local11[local42] = local52[0];
				} else {
					@Pc(85) int local85 = local42 % local28;
					local11[local42] = local52[local85 * Static636.anInt10302 / local28];
				}
			}
		}
		return local11;
	}
}
