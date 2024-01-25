import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class155 {

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "F")
	public float aFloat147 = 1.0F;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "F")
	public float aFloat146 = 0.25F;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public final int anInt4775;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
	public final int anInt4774;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	public final int anInt4773;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Lclient!tb;")
	public final Class99 aClass99_3;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public final int anInt4777;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "F")
	public final float aFloat150;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	public final int anInt4778;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "F")
	public final float aFloat151;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	public final int anInt4770;

	static {
		new Class83("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
	public Class155() {
		this.anInt4775 = -50;
		this.anInt4774 = Static317.anInt5521;
		this.anInt4773 = Static65.anInt1369;
		this.aFloat149 = 0.69921875F;
		this.aClass99_3 = Static265.aClass99_5;
		this.anInt4777 = 0;
		this.aFloat150 = 1.1523438F;
		this.anInt4778 = -60;
		this.aFloat151 = 1.2F;
		this.anInt4770 = -50;
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!iv;)V")
	public Class155(@OriginalArg(0) Class4_Sub12 arg0) {
		@Pc(16) int local16 = arg0.method2490();
		if (Static323.aClass50_Sub1_1.method2854(Static177.anInt2973) && Static57.aClass19_7.method4260() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4773 = Static65.anInt1369;
			} else {
				this.anInt4773 = arg0.method2529();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat150 = 1.1523438F;
			} else {
				this.aFloat150 = (float) arg0.method2536() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat149 = 0.69921875F;
			} else {
				this.aFloat149 = (float) arg0.method2536() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat151 = 1.2F;
			} else {
				this.aFloat151 = (float) arg0.method2536() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2529();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2536();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2536();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2536();
			}
			this.aFloat149 = 0.69921875F;
			this.aFloat150 = 1.1523438F;
			this.anInt4773 = Static65.anInt1369;
			this.aFloat151 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4775 = -50;
			this.anInt4770 = -50;
			this.anInt4778 = -60;
		} else {
			this.anInt4770 = arg0.method2512();
			this.anInt4778 = arg0.method2512();
			this.anInt4775 = arg0.method2512();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4774 = Static317.anInt5521;
		} else {
			this.anInt4774 = arg0.method2529();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4777 = 0;
		} else {
			this.anInt4777 = arg0.method2536();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass99_3 = Static265.aClass99_5;
		} else {
			@Pc(219) int local219 = arg0.method2536();
			@Pc(223) int local223 = arg0.method2536();
			@Pc(227) int local227 = arg0.method2536();
			@Pc(231) int local231 = arg0.method2536();
			@Pc(235) int local235 = arg0.method2536();
			@Pc(239) int local239 = arg0.method2536();
			this.aClass99_3 = Static204.method3186(local235, local227, local239, local219, local231, local223);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!iv;)V")
	public void method3692(@OriginalArg(1) Class4_Sub12 arg0) {
		this.aFloat148 = (float) (arg0.method2490() * 8) / 255.0F;
		this.aFloat146 = (float) (arg0.method2490() * 8) / 255.0F;
		this.aFloat147 = (float) (arg0.method2490() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!mu;)Z")
	public boolean method3695(@OriginalArg(1) Class155 arg0) {
		return this.anInt4773 == arg0.anInt4773 && this.aFloat150 == arg0.aFloat150 && arg0.aFloat149 == this.aFloat149 && this.aFloat151 == arg0.aFloat151 && this.aFloat146 == arg0.aFloat146 && arg0.aFloat148 == this.aFloat148 && arg0.aFloat147 == this.aFloat147 && this.anInt4774 == arg0.anInt4774 && this.anInt4777 == arg0.anInt4777 && arg0.aClass99_3 == this.aClass99_3;
	}
}
