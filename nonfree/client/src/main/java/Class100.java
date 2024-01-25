import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class100 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!kl;")
	public Class134 aClass134_4;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public int anInt2427 = 8;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt2428 = 16;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt2426 = 128;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public int anInt2429 = -1;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public int anInt2432 = 1190717;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public int anInt2431 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public int anInt2436 = 127;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt2437 = -1;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public int anInt2439 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!rp;)V")
	public void method2049(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2739();
			if (local12 == 0) {
				return;
			}
			this.method2051(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	public void method2050() {
		if (this.anInt2439 == -1) {
			this.anInt2439 = this.anInt2437;
		}
		this.anInt2427 = this.anInt2433 | this.anInt2427 << 8;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!rp;I)V")
	private void method2051(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2431 = Static287.method4510(arg1.method2786());
		} else if (arg0 == 2) {
			this.anInt2437 = arg1.method2739();
		} else if (arg0 == 3) {
			this.anInt2437 = arg1.method2767();
			if (this.anInt2437 == 65535) {
				this.anInt2437 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean185 = false;
		} else if (arg0 == 7) {
			this.anInt2429 = Static287.method4510(arg1.method2786());
		} else if (arg0 == 8) {
			this.aClass134_4.anInt3294 = this.anInt2433;
		} else if (arg0 == 9) {
			this.anInt2426 = arg1.method2767();
		} else if (arg0 == 10) {
			this.aBoolean184 = false;
		} else if (arg0 == 11) {
			this.anInt2427 = arg1.method2739();
		} else if (arg0 == 12) {
			this.aBoolean186 = true;
		} else if (arg0 == 13) {
			this.anInt2432 = arg1.method2786();
		} else if (arg0 == 14) {
			this.anInt2428 = arg1.method2739();
		} else if (arg0 == 15) {
			this.anInt2439 = arg1.method2767();
			if (this.anInt2439 == 65535) {
				this.anInt2439 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt2436 = arg1.method2739();
		}
	}
}
