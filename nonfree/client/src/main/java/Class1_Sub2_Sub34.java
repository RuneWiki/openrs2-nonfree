import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
	private int anInt6515 = 4;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
	private int anInt6510 = 4;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(25) int local25 = Static410.anInt7198 / this.anInt6515;
			@Pc(30) int local30 = Static214.anInt6457 / this.anInt6510;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method5867(0, local39 * Static214.anInt6457 / local30);
			} else {
				local49 = this.method5867(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static410.anInt7198; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = Static410.anInt7198 * local95 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6515 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt6510 = arg0.method4548();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(25) int local25 = Static410.anInt7198 / this.anInt6515;
			@Pc(30) int local30 = Static214.anInt6457 / this.anInt6510;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method5872(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method5872(0, local47 * Static214.anInt6457 / local30);
			}
			for (local47 = 0; local47 < Static410.anInt7198; local47++) {
				if (local25 <= 0) {
					local16[local47] = local41[0];
				} else {
					@Pc(75) int local75 = local47 % local25;
					local16[local47] = local41[local75 * Static410.anInt7198 / local25];
				}
			}
		}
		return local16;
	}
}
