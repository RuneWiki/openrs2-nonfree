import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public int anInt48 = 128;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	private int anInt53 = 0;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt49 = -1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Z")
	public boolean aBoolean9 = true;

	static {
		new Class142(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
		new Class142("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILclient!wm;)V")
	private void method44(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt53 = arg1.method2881();
			this.method46(this.anInt53);
		} else if (arg0 == 2) {
			this.anInt49 = arg1.method2896();
			if (this.anInt49 == 65535) {
				this.anInt49 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt48 = arg1.method2896() << 0;
		} else if (arg0 == 4) {
			this.aBoolean9 = false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	private void method46(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(53) double local53 = local14;
		if (local14 < local23) {
			local53 = local23;
		}
		if (local53 < local30) {
			local53 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local53 + local32) / 2.0D;
		if (local53 != local32) {
			if (local75 < 0.5D) {
				local69 = (local53 - local32) / (local32 + local53);
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local32) / (2.0D - local53 - local32);
			}
			if (local14 == local53) {
				local67 = (local23 - local30) / (local53 - local32);
			} else if (local23 == local53) {
				local67 = (local30 - local14) / (local53 - local32) + 2.0D;
			} else if (local30 == local53) {
				local67 = (local14 - local23) / (local53 - local32) + 4.0D;
			}
		}
		local67 /= 6.0D;
		this.anInt51 = (int) (local69 * 256.0D);
		this.anInt47 = (int) (local75 * 256.0D);
		if (this.anInt51 < 0) {
			this.anInt51 = 0;
		} else if (this.anInt51 > 255) {
			this.anInt51 = 255;
		}
		if (this.anInt47 < 0) {
			this.anInt47 = 0;
		} else if (this.anInt47 > 255) {
			this.anInt47 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt59 = (int) (local69 * (1.0D - local75) * 512.0D);
		} else {
			this.anInt59 = (int) (local75 * local69 * 512.0D);
		}
		if (this.anInt59 < 1) {
			this.anInt59 = 1;
		}
		this.anInt54 = (int) ((double) this.anInt59 * local67);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method48(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2915();
			if (local17 == 0) {
				return;
			}
			this.method44(local17, arg0);
		}
	}
}
