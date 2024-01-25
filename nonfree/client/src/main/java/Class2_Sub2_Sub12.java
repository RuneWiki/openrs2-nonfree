import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!et", name = "J", descriptor = "[I")
	protected int[] anIntArray456;

	@OriginalMember(owner = "client!et", name = "P", descriptor = "I")
	protected int anInt5361;

	@OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
	protected int anInt5362;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "I")
	private int anInt5364 = -1;

	static {
		new Class231("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	@Override
	public final void method6272() {
		super.method6272();
		this.anIntArray456 = null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180 && this.method4271()) {
			@Pc(32) int[] local32 = local20[0];
			@Pc(36) int[] local36 = local20[1];
			@Pc(40) int[] local40 = local20[2];
			@Pc(60) int local60 = (Static271.anInt4925 == this.anInt5361 ? arg0 : arg0 * this.anInt5361 / Static271.anInt4925) * this.anInt5362;
			@Pc(70) int local70;
			@Pc(79) int local79;
			if (Static398.anInt6955 == this.anInt5362) {
				for (local70 = 0; local70 < Static398.anInt6955; local70++) {
					local79 = this.anIntArray456[local60++];
					local40[local70] = (local79 & 0xFF) << 4;
					local36[local70] = local79 >> 4 & 0xFF0;
					local32[local70] = local79 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static398.anInt6955; local70++) {
					local79 = this.anInt5362 * local70 / Static398.anInt6955;
					@Pc(87) int local87 = this.anIntArray456[local60 + local79];
					local40[local70] = (local87 & 0xFF) << 4;
					local36[local70] = local87 >> 4 & 0xFF0;
					local32[local70] = local87 >> 12 & 0xFF0;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public final void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5364 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)Z")
	protected final boolean method4271() {
		if (this.anIntArray456 != null) {
			return true;
		} else if (this.anInt5364 >= 0) {
			@Pc(29) Class190 local29 = Static342.anInt6096 < 0 ? Static470.method4239(Static259.aClass171_60, this.anInt5364) : Static470.method4242(Static259.aClass171_60, Static342.anInt6096, this.anInt5364);
			local29.method4236();
			this.anIntArray456 = local29.method4234();
			this.anInt5361 = local29.anInt5313;
			this.anInt5362 = local29.anInt5312;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Z)I")
	@Override
	public final int method6268() {
		return this.anInt5364;
	}
}
