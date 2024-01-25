import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!en", name = "L", descriptor = "I")
	private int anInt1924 = 0;

	@OriginalMember(owner = "client!en", name = "P", descriptor = "I")
	private int anInt1927 = 1;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "I")
	private int anInt1928 = 0;

	static {
		new Class34("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(27) int local27 = Static266.anIntArray454[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static153.anInt3378; local35++) {
				@Pc(41) int local41 = Static107.anIntArray234[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt1924 == 0) {
					local61 = (local41 - local27) * this.anInt1927;
				} else {
					@Pc(73) int local73 = local33 * local33 + local47 * local47 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local73 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt1927) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt1928 == 0) {
					local61 = Static237.anIntArray440[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1928 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local19[local35] = local61;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		Static280.method4876();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1924 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt1928 = arg1.method4532();
		} else if (arg0 == 3) {
			this.anInt1927 = arg1.method4532();
		}
	}
}
