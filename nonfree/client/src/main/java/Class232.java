import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class232 {

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
	public int anInt7439;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!wea;")
	public Class369 aClass369_4;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Z")
	public boolean aBoolean537 = true;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public int anInt7437 = 127;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public int anInt7436 = 64;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "Z")
	public boolean aBoolean538 = true;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
	public int anInt7445 = 8;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
	public int anInt7442 = 0;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public int anInt7448 = 512;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	public int anInt7449 = -1;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
	public int anInt7443 = -1;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	public int anInt7447 = 1190717;

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "Z")
	public boolean aBoolean540 = false;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	public void method6147() {
		this.anInt7445 = this.anInt7439 | this.anInt7445 << 8;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!ig;)V")
	private void method6148(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt7442 = Static617.method8373(arg1.method8560());
		} else if (arg0 == 2) {
			this.anInt7443 = arg1.method8525();
		} else if (arg0 == 3) {
			this.anInt7443 = arg1.method8578();
			if (this.anInt7443 == 65535) {
				this.anInt7443 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean537 = false;
		} else if (arg0 == 7) {
			this.anInt7449 = Static617.method8373(arg1.method8560());
		} else if (arg0 == 8) {
			this.aClass369_4.anInt10421 = this.anInt7439;
		} else if (arg0 == 9) {
			this.anInt7448 = arg1.method8578() << 2;
		} else if (arg0 == 10) {
			this.aBoolean538 = false;
		} else if (arg0 == 11) {
			this.anInt7445 = arg1.method8525();
		} else if (arg0 == 12) {
			this.aBoolean540 = true;
		} else if (arg0 == 13) {
			this.anInt7447 = arg1.method8560();
		} else if (arg0 == 14) {
			this.anInt7436 = arg1.method8525() << 2;
		} else if (arg0 == 16) {
			this.anInt7437 = arg1.method8525();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!ig;)V")
	public void method6150(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method6148(local5, arg0);
		}
	}
}
