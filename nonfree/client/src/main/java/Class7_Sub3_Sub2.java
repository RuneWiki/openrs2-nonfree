import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class7_Sub3_Sub2 extends Class7_Sub3 {

	@OriginalMember(owner = "client!at", name = "H", descriptor = "I")
	private int anInt261 = 4;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "I")
	private int anInt262 = 4;

	static {
		new Class55("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class55("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt261 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt262 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(25) int local25 = Static58.anInt1052 / this.anInt261;
			@Pc(30) int local30 = Static383.anInt6175 / this.anInt262;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method5597(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method5597(0, local47 * Static383.anInt6175 / local30);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static58.anInt1052; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = local95 * Static58.anInt1052 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(25) int local25 = Static58.anInt1052 / this.anInt261;
			@Pc(30) int local30 = Static383.anInt6175 / this.anInt262;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method5591(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method5591(0, local47 * Static383.anInt6175 / local30);
			}
			for (local47 = 0; local47 < Static58.anInt1052; local47++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local47 % local25;
					local16[local47] = local41[local67 * Static58.anInt1052 / local25];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}
}
