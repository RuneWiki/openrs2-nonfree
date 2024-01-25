import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!re", name = "P", descriptor = "I")
	protected int anInt7470;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "[I")
	protected int[] anIntArray521;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	protected int anInt7472;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "I")
	private int anInt7473 = -1;

	static {
		new Class189("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583 && this.method5810()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = (Static286.anInt1445 == this.anInt7470 ? arg0 : this.anInt7470 * arg0 / Static286.anInt1445) * this.anInt7472;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt7472 == Static406.anInt6694) {
				for (local62 = 0; local62 < Static406.anInt6694; local62++) {
					local71 = this.anIntArray521[local52++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static406.anInt6694; local62++) {
					local71 = local62 * this.anInt7472 / Static406.anInt6694;
					@Pc(78) int local78 = this.anIntArray521[local52 + local71];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	@Override
	public final void method5893() {
		super.method5893();
		this.anIntArray521 = null;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(B)Z")
	protected final boolean method5810() {
		if (this.anIntArray521 != null) {
			return true;
		} else if (this.anInt7473 >= 0) {
			@Pc(35) Class264 local35 = Static24.anInt838 < 0 ? Static464.method5845(Static437.aClass32_87, this.anInt7473) : Static464.method5847(Static437.aClass32_87, Static24.anInt838, this.anInt7473);
			local35.method5850();
			this.anIntArray521 = local35.method5843();
			this.anInt7472 = local35.anInt7502;
			this.anInt7470 = local35.anInt7501;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public final void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7473 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I")
	@Override
	public final int method5900() {
		return this.anInt7473;
	}
}
