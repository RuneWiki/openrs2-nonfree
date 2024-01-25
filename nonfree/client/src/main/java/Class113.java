import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class113 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!kb;")
	public Class124 aClass124_4;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "I")
	public int anInt3385;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public int anInt3373 = 8;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Z")
	public boolean aBoolean283 = false;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "Z")
	public boolean aBoolean284 = true;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "I")
	public int anInt3375 = -1;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public int anInt3378 = -1;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "I")
	public int anInt3381 = 0;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt3374 = 128;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public int anInt3376 = 1190717;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "Z")
	public boolean aBoolean285 = true;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "I")
	public int anInt3384 = 127;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public int anInt3372 = -1;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "I")
	public int anInt3383 = 16;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
	public void method2818() {
		this.anInt3373 = this.anInt3373 << 8 | this.anInt3385;
		if (this.anInt3375 == -1) {
			this.anInt3375 = this.anInt3378;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!iv;I)V")
	private void method2819(@OriginalArg(1) Class4_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3381 = Static219.method5061(arg0.method2493());
		} else if (arg1 == 2) {
			this.anInt3378 = arg0.method2490();
			return;
		} else if (arg1 == 3) {
			this.anInt3378 = arg0.method2536();
			if (this.anInt3378 == 65535) {
				this.anInt3378 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean285 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt3372 = Static219.method5061(arg0.method2493());
			return;
		} else if (arg1 == 8) {
			this.aClass124_4.anInt3849 = this.anInt3385;
			return;
		} else if (arg1 == 9) {
			this.anInt3374 = arg0.method2536() << 0;
			return;
		} else if (arg1 == 10) {
			this.aBoolean284 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt3373 = arg0.method2490();
			return;
		} else if (arg1 == 12) {
			this.aBoolean283 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt3376 = arg0.method2493();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt3383 = arg0.method2490();
			} else if (arg1 == 15) {
				this.anInt3375 = arg0.method2536();
				if (this.anInt3375 == 65535) {
					this.anInt3375 = -1;
					return;
				}
			} else if (arg1 == 16) {
				this.anInt3384 = arg0.method2490();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!iv;)V")
	public void method2822(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method2819(arg0, local5);
		}
	}
}
