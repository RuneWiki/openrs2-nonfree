import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class4_Sub6_Sub12 extends Class4_Sub6 {

	@OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
	private int anInt2822 = 4096;

	@OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
	private int anInt2824 = 0;

	static {
		new Class83("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2824 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt2822 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt2824 <= local37 && this.anInt2822 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
