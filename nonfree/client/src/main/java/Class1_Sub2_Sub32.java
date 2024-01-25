import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
	private int anInt6238 = 32768;

	static {
		new Class96("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(3, false);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		Static4.method126();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6238 = arg0.method4498() << 4;
		} else if (arg1 == 1) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[] local26 = this.method5872(1, arg0);
			@Pc(32) int[] local32 = this.method5872(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static410.anInt7198; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt6238 * local32[local34] >> 12;
				@Pc(61) int local61 = Static108.anIntArray110[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static129.anIntArray174[local44] >> 12;
				@Pc(78) int local78 = local34 + (local61 >> 12) & Static301.anInt5026;
				@Pc(87) int local87 = arg0 + (local69 >> 12) & Static421.anInt7373;
				@Pc(93) int[] local93 = this.method5872(0, local87);
				local16[local34] = local93[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(21) int[] local21 = this.method5872(1, arg0);
			@Pc(27) int[] local27 = this.method5872(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static410.anInt7198; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt6238 >> 12;
				@Pc(70) int local70 = Static108.anIntArray110[local53] * local62 >> 12;
				@Pc(78) int local78 = local62 * Static129.anIntArray174[local53] >> 12;
				@Pc(86) int local86 = (local70 >> 12) + local41 & Static301.anInt5026;
				@Pc(95) int local95 = arg0 + (local78 >> 12) & Static421.anInt7373;
				@Pc(101) int[][] local101 = this.method5867(0, local95);
				local31[local41] = local101[0][local86];
				local35[local41] = local101[1][local86];
				local39[local41] = local101[2][local86];
			}
		}
		return local11;
	}
}
