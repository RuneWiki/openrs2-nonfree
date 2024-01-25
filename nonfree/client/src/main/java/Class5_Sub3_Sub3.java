import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5_Sub3_Sub3 extends Class5_Sub3 {

	@OriginalMember(owner = "client!b", name = "O", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "I")
	private int anInt365 = 2048;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	private int anInt364 = 10;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	private int anInt367 = 0;

	static {
		new Class85("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.method336();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(25) int local25 = Static345.anIntArray627[arg0];
			@Pc(35) int local35;
			if (this.anInt367 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt364; local35++) {
					if (local25 >= this.anIntArray54[local35] && local25 < this.anIntArray54[local35 + 1]) {
						if (local25 < this.anIntArray53[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static368.method5428(local17, 0, Static7.anInt129, local33);
			} else {
				for (@Pc(87) int local87 = 0; local87 < Static7.anInt129; local87++) {
					local35 = 0;
					@Pc(93) short local93 = 0;
					@Pc(97) int local97 = Static164.anIntArray337[local87];
					@Pc(100) int local100 = this.anInt367;
					if (local100 == 1) {
						local35 = local97;
					} else if (local100 == 2) {
						local35 = (local25 + local97 - 4096 >> 1) + 2048;
					} else if (local100 == 3) {
						local35 = (local97 - local25 >> 1) + 2048;
					}
					for (local100 = 0; local100 < this.anInt364; local100++) {
						if (this.anIntArray54[local100] <= local35 && this.anIntArray54[local100 + 1] > local35) {
							if (local35 < this.anIntArray53[local100]) {
								local93 = 4096;
							}
							break;
						}
					}
					local17[local87] = local93;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt364 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt365 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt367 = arg0.method5115();
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	private void method336() {
		this.anIntArray53 = new int[this.anInt364 + 1];
		this.anIntArray54 = new int[this.anInt364 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt364;
		@Pc(33) int local33 = local26 * this.anInt365 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt364; local35++) {
			this.anIntArray54[local35] = local21;
			this.anIntArray53[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray54[this.anInt364] = 4096;
		this.anIntArray53[this.anInt364] = this.anIntArray53[0] + 4096;
	}
}
