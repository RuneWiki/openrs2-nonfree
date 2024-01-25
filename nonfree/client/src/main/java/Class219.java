import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class219 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!cq;")
	public Class43 aClass43_6;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public int anInt6164;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public int anInt6157 = -1;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public int anInt6163 = 16;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt6161 = 0;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt6162 = -1;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public int anInt6170 = 127;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public int anInt6168 = 128;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public int anInt6165 = 8;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public int anInt6166 = -1;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public int anInt6169 = 1190717;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!nn;)V")
	public void method4866(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2502();
			if (local5 == 0) {
				return;
			}
			this.method4871(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method4868() {
		if (this.anInt6162 == -1) {
			this.anInt6162 = this.anInt6166;
		}
		this.anInt6165 = this.anInt6165 << 8 | this.anInt6164;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILclient!nn;)V")
	private void method4871(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6161 = Static184.method2430(arg1.method2507());
		} else if (arg0 == 2) {
			this.anInt6166 = arg1.method2502();
		} else if (arg0 == 3) {
			this.anInt6166 = arg1.method2485();
			if (this.anInt6166 == 65535) {
				this.anInt6166 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean398 = false;
		} else if (arg0 == 7) {
			this.anInt6157 = Static184.method2430(arg1.method2507());
			return;
		} else if (arg0 == 8) {
			this.aClass43_6.anInt1129 = this.anInt6164;
			return;
		} else if (arg0 == 9) {
			this.anInt6168 = arg1.method2485() << 0;
			return;
		} else if (arg0 == 10) {
			this.aBoolean399 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt6165 = arg1.method2502();
			return;
		} else if (arg0 == 12) {
			this.aBoolean400 = true;
			return;
		} else {
			if (arg0 == 13) {
				this.anInt6169 = arg1.method2507();
			} else if (arg0 == 14) {
				this.anInt6163 = arg1.method2502() << 0;
				return;
			} else if (arg0 == 15) {
				this.anInt6162 = arg1.method2485();
				if (this.anInt6162 == 65535) {
					this.anInt6162 = -1;
					return;
				}
				return;
			} else if (arg0 == 16) {
				this.anInt6170 = arg1.method2502();
				return;
			}
			return;
		}
	}
}
