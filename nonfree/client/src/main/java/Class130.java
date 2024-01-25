import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class130 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
	public int anInt3441;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!ip;")
	public Class117 aClass117_5;

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public int anInt3442 = 16;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public int anInt3440 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Z")
	public boolean aBoolean220 = true;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
	public int anInt3444 = 8;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
	public int anInt3450 = 0;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
	public int anInt3452 = -1;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
	public int anInt3447 = 127;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
	public int anInt3445 = -1;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
	public int anInt3446 = 1190717;

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
	public int anInt3449 = 128;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
	public boolean aBoolean221 = true;

	static {
		new Class198("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!fh;)V")
	public void method2770(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5539();
			if (local9 == 0) {
				return;
			}
			this.method2774(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public void method2771() {
		this.anInt3444 = this.anInt3441 | this.anInt3444 << 8;
		if (this.anInt3440 == -1) {
			this.anInt3440 = this.anInt3445;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BILclient!fh;)V")
	private void method2774(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt3450 = Static289.method3588(arg1.method5541());
		} else if (arg0 == 2) {
			this.anInt3445 = arg1.method5539();
		} else if (arg0 == 3) {
			this.anInt3445 = arg1.method5598();
			if (this.anInt3445 == 65535) {
				this.anInt3445 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean220 = false;
		} else if (arg0 == 7) {
			this.anInt3452 = Static289.method3588(arg1.method5541());
		} else if (arg0 == 8) {
			this.aClass117_5.anInt3064 = this.anInt3441;
		} else if (arg0 == 9) {
			this.anInt3449 = arg1.method5598() << 0;
		} else if (arg0 == 10) {
			this.aBoolean221 = false;
		} else if (arg0 == 11) {
			this.anInt3444 = arg1.method5539();
		} else if (arg0 == 12) {
			this.aBoolean219 = true;
		} else if (arg0 == 13) {
			this.anInt3446 = arg1.method5541();
		} else if (arg0 == 14) {
			this.anInt3442 = arg1.method5539() << 0;
		} else if (arg0 == 15) {
			this.anInt3440 = arg1.method5598();
			if (this.anInt3440 == 65535) {
				this.anInt3440 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt3447 = arg1.method5539();
		}
	}
}
