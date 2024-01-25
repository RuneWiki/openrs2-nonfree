import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class258 {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "Lclient!ua;")
	public Class241 aClass241_14;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public int anInt7315 = 1190717;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	public int anInt7322 = -1;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public int anInt7325 = 16;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
	public boolean aBoolean800 = false;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Z")
	public boolean aBoolean801 = true;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public int anInt7326 = -1;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	public int anInt7323 = 127;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	public int anInt7324 = 128;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public int anInt7321 = 0;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
	public int anInt7327 = 8;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "Z")
	public boolean aBoolean802 = true;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	public int anInt7328 = -1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	public void method5723() {
		if (this.anInt7328 == -1) {
			this.anInt7328 = this.anInt7322;
		}
		this.anInt7327 = this.anInt7318 | this.anInt7327 << 8;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ug;)V")
	public void method5724(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5337();
			if (local9 == 0) {
				return;
			}
			this.method5725(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BILclient!ug;)V")
	private void method5725(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt7321 = Static240.method5210(arg1.method5345());
		} else if (arg0 == 2) {
			this.anInt7322 = arg1.method5337();
		} else if (arg0 == 3) {
			this.anInt7322 = arg1.method5335();
			if (this.anInt7322 == 65535) {
				this.anInt7322 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean801 = false;
		} else if (arg0 == 7) {
			this.anInt7326 = Static240.method5210(arg1.method5345());
		} else if (arg0 == 8) {
			this.aClass241_14.anInt6676 = this.anInt7318;
		} else if (arg0 == 9) {
			this.anInt7324 = arg1.method5335() << 0;
		} else if (arg0 == 10) {
			this.aBoolean802 = false;
		} else if (arg0 == 11) {
			this.anInt7327 = arg1.method5337();
		} else if (arg0 == 12) {
			this.aBoolean800 = true;
		} else if (arg0 == 13) {
			this.anInt7315 = arg1.method5345();
		} else if (arg0 == 14) {
			this.anInt7325 = arg1.method5337() << 0;
		} else if (arg0 == 15) {
			this.anInt7328 = arg1.method5335();
			if (this.anInt7328 == 65535) {
				this.anInt7328 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt7323 = arg1.method5337();
		}
	}
}
