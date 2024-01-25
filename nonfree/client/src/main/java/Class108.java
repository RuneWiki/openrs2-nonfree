import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class108 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!gi;")
	private Class71_Sub1 aClass71_Sub1_6;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!gi;")
	public final Class71_Sub1 aClass71_Sub1_5 = new Class71_Sub1();

	static {
		new Class21("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class108() {
		this.aClass71_Sub1_5.aClass71_Sub1_9 = this.aClass71_Sub1_5;
		this.aClass71_Sub1_5.aClass71_Sub1_10 = this.aClass71_Sub1_5;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!gi;)V")
	public void method3010(@OriginalArg(1) Class71_Sub1 arg0) {
		if (arg0.aClass71_Sub1_10 != null) {
			arg0.method3038();
		}
		arg0.aClass71_Sub1_9 = this.aClass71_Sub1_5;
		arg0.aClass71_Sub1_10 = this.aClass71_Sub1_5.aClass71_Sub1_10;
		arg0.aClass71_Sub1_10.aClass71_Sub1_9 = arg0;
		arg0.aClass71_Sub1_9.aClass71_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public void method3012() {
		while (true) {
			@Pc(9) Class71_Sub1 local9 = this.aClass71_Sub1_5.aClass71_Sub1_9;
			if (this.aClass71_Sub1_5 == local9) {
				this.aClass71_Sub1_6 = null;
				return;
			}
			local9.method3038();
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)Lclient!gi;")
	public Class71_Sub1 method3014() {
		@Pc(13) Class71_Sub1 local13 = this.aClass71_Sub1_6;
		if (this.aClass71_Sub1_5 == local13) {
			this.aClass71_Sub1_6 = null;
			return null;
		} else {
			this.aClass71_Sub1_6 = local13.aClass71_Sub1_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I")
	public int method3016() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class71_Sub1 local16 = this.aClass71_Sub1_5.aClass71_Sub1_9; local16 != this.aClass71_Sub1_5; local16 = local16.aClass71_Sub1_9) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Lclient!gi;")
	public Class71_Sub1 method3018() {
		@Pc(12) Class71_Sub1 local12 = this.aClass71_Sub1_5.aClass71_Sub1_9;
		if (local12 == this.aClass71_Sub1_5) {
			this.aClass71_Sub1_6 = null;
			return null;
		} else {
			this.aClass71_Sub1_6 = local12.aClass71_Sub1_9;
			return local12;
		}
	}
}
