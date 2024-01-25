import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class113 {

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public int anInt3832;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Lclient!vv;")
	public Class339 aClass339_3;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public int anInt3826 = 0;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public int anInt3827 = -1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public int anInt3834 = -1;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public int anInt3835 = 64;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
	public boolean aBoolean318 = true;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public int anInt3837 = 127;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Z")
	public boolean aBoolean317 = true;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public int anInt3833 = 512;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	public int anInt3825 = 1190717;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt3829 = -1;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public int anInt3843 = 8;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method3387(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4966();
			if (local14 == 0) {
				return;
			}
			this.method3392(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public void method3391() {
		this.anInt3843 = this.anInt3832 | this.anInt3843 << 8;
		if (this.anInt3834 == -1) {
			this.anInt3834 = this.anInt3829;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLclient!iaa;)V")
	private void method3392(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt3826 = Static469.method7231(arg1.method4949());
		} else if (arg0 == 2) {
			this.anInt3829 = arg1.method4966();
			return;
		} else if (arg0 == 3) {
			this.anInt3829 = arg1.method4999();
			if (this.anInt3829 == 65535) {
				this.anInt3829 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean317 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt3827 = Static469.method7231(arg1.method4949());
			return;
		} else if (arg0 == 8) {
			this.aClass339_3.anInt9499 = this.anInt3832;
			return;
		} else if (arg0 == 9) {
			this.anInt3833 = arg1.method4999() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean318 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt3843 = arg1.method4966();
			return;
		} else if (arg0 == 12) {
			this.aBoolean319 = true;
			return;
		} else {
			if (arg0 == 13) {
				this.anInt3825 = arg1.method4949();
			} else if (arg0 == 14) {
				this.anInt3835 = arg1.method4966() << 2;
				return;
			} else if (arg0 == 15) {
				this.anInt3834 = arg1.method4999();
				if (this.anInt3834 == 65535) {
					this.anInt3834 = -1;
					return;
				}
				return;
			} else if (arg0 == 16) {
				this.anInt3837 = arg1.method4966();
				return;
			}
			return;
		}
	}
}
