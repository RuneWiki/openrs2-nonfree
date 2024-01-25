import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class6_Sub5_Sub18 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
	private int anInt3372 = 204;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
	private int anInt3374 = 1;

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
	private int anInt3376 = 1;

	static {
		new Class267("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			for (@Pc(22) int local22 = 0; local22 < Static240.anInt4386; local22++) {
				@Pc(28) int local28 = Static80.anIntArray117[local22];
				@Pc(32) int local32 = Static247.anIntArray318[arg0];
				@Pc(39) int local39 = local28 * this.anInt3376 >> 12;
				@Pc(46) int local46 = local32 * this.anInt3374 >> 12;
				@Pc(56) int local56 = this.anInt3376 * (local28 % (4096 / this.anInt3376));
				@Pc(66) int local66 = this.anInt3374 * (local32 % (4096 / this.anInt3374));
				if (this.anInt3372 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt3372) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt3372 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt3376 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt3374 = arg1.method6433();
		} else if (arg0 == 2) {
			this.anInt3372 = arg1.method6485();
		}
	}
}
