import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class5_Sub3_Sub20 extends Class5_Sub3 {

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	private int anInt3445 = 0;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
	private int anInt3450 = 0;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	private int anInt3444 = 1365;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	private int anInt3448 = 20;

	static {
		new Class85("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			for (@Pc(22) int local22 = 0; local22 < Static7.anInt129; local22++) {
				@Pc(37) int local37 = (Static164.anIntArray337[local22] << 12) / this.anInt3444 + this.anInt3445;
				@Pc(50) int local50 = (Static345.anIntArray627[arg0] << 12) / this.anInt3444 + this.anInt3450;
				@Pc(56) int local56 = local37;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local37 * local37 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && local72 < this.anInt3448) {
					local58 = (local58 * local56 >> 12) * 2 + local50;
					local56 = local37 + local64 - local70;
					local72++;
					local64 = local56 * local56 >> 12;
					local70 = local58 * local58 >> 12;
				}
				local16[local22] = this.anInt3448 - 1 > local72 ? (local72 << 12) / this.anInt3448 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3444 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt3448 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt3445 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt3450 = arg0.method5106();
		}
	}
}
