import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class150 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	public boolean aBoolean268 = false;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public int anInt4051 = 64;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt4060 = -1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public int anInt4050 = 2;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt4055 = 1;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	public boolean aBoolean269 = false;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public int anInt4062 = 64;

	static {
		new Class267("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ae;II)V")
	private void method3361(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt4060 = arg1.method6485();
			if (this.anInt4060 == 65535) {
				this.anInt4060 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt4051 = arg1.method6485() + 1;
			this.anInt4062 = arg1.method6485() + 1;
		} else if (arg0 == 3) {
			arg1.method6438();
		} else if (arg0 == 4) {
			this.anInt4050 = arg1.method6433();
		} else if (arg0 == 5) {
			this.anInt4055 = arg1.method6433();
		} else if (arg0 == 6) {
			this.aBoolean268 = true;
		} else if (arg0 == 7) {
			this.aBoolean269 = true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ae;II)V")
	public void method3363(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method3361(local5, arg0, arg1);
		}
	}
}
