import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class151 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public int anInt4472;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!tc;")
	public Class279 aClass279_5;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
	public boolean aBoolean312 = true;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "Z")
	public boolean aBoolean313 = false;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public int anInt4476 = 1190717;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public int anInt4480 = 8;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public int anInt4479 = -1;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt4474 = 64;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public int anInt4473 = 0;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	public int anInt4478 = -1;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public int anInt4482 = 127;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	public int anInt4485 = -1;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public int anInt4484 = 512;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public void method3897() {
		if (this.anInt4478 == -1) {
			this.anInt4478 = this.anInt4479;
		}
		this.anInt4480 = this.anInt4480 << 8 | this.anInt4472;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!ge;)V")
	public void method3898(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method3899(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method3899(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4473 = Static454.method6447(arg0.method3920());
		} else if (arg1 == 2) {
			this.anInt4479 = arg0.method3922();
		} else if (arg1 == 3) {
			this.anInt4479 = arg0.method3967();
			if (this.anInt4479 == 65535) {
				this.anInt4479 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean312 = false;
		} else if (arg1 == 7) {
			this.anInt4485 = Static454.method6447(arg0.method3920());
			return;
		} else if (arg1 == 8) {
			this.aClass279_5.anInt7798 = this.anInt4472;
			return;
		} else if (arg1 == 9) {
			this.anInt4484 = arg0.method3967() << 2;
			return;
		} else if (arg1 == 10) {
			this.aBoolean311 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt4480 = arg0.method3922();
			return;
		} else if (arg1 == 12) {
			this.aBoolean313 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt4476 = arg0.method3920();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt4474 = arg0.method3922() << 2;
			} else if (arg1 == 15) {
				this.anInt4478 = arg0.method3967();
				if (this.anInt4478 == 65535) {
					this.anInt4478 = -1;
					return;
				}
				return;
			} else if (arg1 == 16) {
				this.anInt4482 = arg0.method3922();
				return;
			}
			return;
		}
	}
}
