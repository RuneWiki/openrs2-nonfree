import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	static {
		new Class93("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(25) int[] local25 = this.method5876(0, arg0);
			@Pc(31) int[] local31 = this.method5876(1, arg0);
			@Pc(37) int[] local37 = this.method5876(2, arg0);
			for (@Pc(39) int local39 = 0; local39 < Static339.anInt6735; local39++) {
				@Pc(45) int local45 = local37[local39];
				if (local45 == 4096) {
					local15[local39] = local25[local39];
				} else if (local45 == 0) {
					local15[local39] = local31[local39];
				} else {
					local15[local39] = (4096 - local45) * local31[local39] + local45 * local25[local39] >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[] local29 = this.method5876(2, arg0);
			@Pc(35) int[][] local35 = this.method5887(arg0, 0);
			@Pc(41) int[][] local41 = this.method5887(arg0, 1);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static339.anInt6735; local79++) {
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
					@Pc(117) int local117 = 4096 - local85;
					local45[local79] = local117 * local69[local79] + local57[local79] * local85 >> 12;
					local49[local79] = local61[local79] * local85 + local73[local79] * local117 >> 12;
					local53[local79] = local85 * local65[local79] + local77[local79] * local117 >> 12;
				}
			}
		}
		return local19;
	}
}
