import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	static {
		new Class96("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(29) int[] local29 = this.method5872(2, arg0);
			@Pc(35) int[][] local35 = this.method5867(0, arg0);
			@Pc(41) int[][] local41 = this.method5867(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static410.anInt7198; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(99) int local99 = 4096 - local85;
					local45[local79] = local99 * local69[local79] + local57[local79] * local85 >> 12;
					local49[local79] = local73[local79] * local99 + local85 * local61[local79] >> 12;
					local53[local79] = local65[local79] * local85 + local77[local79] * local99 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[] local26 = this.method5872(0, arg0);
			@Pc(32) int[] local32 = this.method5872(1, arg0);
			@Pc(38) int[] local38 = this.method5872(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static410.anInt7198; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}
}
