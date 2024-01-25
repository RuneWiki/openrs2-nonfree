import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
	private int anInt7043 = 4;

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
	private int anInt7041 = 4;

	static {
		new Class134("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(27) int local27 = Static217.anInt3574 / this.anInt7043;
			@Pc(32) int local32 = Static290.anInt4775 / this.anInt7041;
			@Pc(51) int[] local51;
			@Pc(41) int local41;
			if (local32 > 0) {
				local41 = arg0 % local32;
				local51 = this.method5472(Static290.anInt4775 * local41 / local32, 0);
			} else {
				local51 = this.method5472(0, 0);
			}
			for (local41 = 0; local41 < Static217.anInt3574; local41++) {
				if (local27 > 0) {
					@Pc(69) int local69 = local41 % local27;
					local18[local41] = local51[local69 * Static217.anInt3574 / local27];
				} else {
					local18[local41] = local51[0];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(25) int local25 = Static217.anInt3574 / this.anInt7043;
			@Pc(30) int local30 = Static290.anInt4775 / this.anInt7041;
			@Pc(40) int[][] local40;
			if (local30 <= 0) {
				local40 = this.method5474(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local30;
				local40 = this.method5474(0, Static290.anInt4775 * local46 / local30);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local40[2];
			@Pc(72) int[] local72 = local16[0];
			@Pc(76) int[] local76 = local16[1];
			@Pc(80) int[] local80 = local16[2];
			for (@Pc(82) int local82 = 0; local82 < Static217.anInt3574; local82++) {
				@Pc(99) int local99;
				if (local25 > 0) {
					@Pc(93) int local93 = local82 % local25;
					local99 = local93 * Static217.anInt3574 / local25;
				} else {
					local99 = 0;
				}
				local72[local82] = local60[local99];
				local76[local82] = local64[local99];
				local80[local82] = local68[local99];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7043 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt7041 = arg0.method3580();
		}
	}
}
