import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class345 {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	public int anInt9265;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!mga;")
	public Class206 aClass206_6;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public int anInt9270 = -1;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	public int anInt9268 = -1;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
	public boolean aBoolean715 = true;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public int anInt9272 = 64;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Z")
	public boolean aBoolean716 = true;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public int anInt9273 = 8;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public int anInt9274 = 127;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public int anInt9279 = 0;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	public int anInt9269 = -1;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public int anInt9266 = 1190717;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public int anInt9276 = 512;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Z")
	public boolean aBoolean717 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!ji;I)V")
	private void method7580(@OriginalArg(1) Class6_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9279 = Static94.method1700(arg0.method6031());
		} else if (arg1 == 2) {
			this.anInt9268 = arg0.method6069();
		} else if (arg1 == 3) {
			this.anInt9268 = arg0.method6003();
			if (this.anInt9268 == 65535) {
				this.anInt9268 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean715 = false;
		} else if (arg1 == 7) {
			this.anInt9270 = Static94.method1700(arg0.method6031());
		} else if (arg1 == 8) {
			this.aClass206_6.anInt5693 = this.anInt9265;
		} else if (arg1 == 9) {
			this.anInt9276 = arg0.method6003() << 2;
		} else if (arg1 == 10) {
			this.aBoolean716 = false;
		} else if (arg1 == 11) {
			this.anInt9273 = arg0.method6069();
		} else if (arg1 == 12) {
			this.aBoolean717 = true;
		} else if (arg1 == 13) {
			this.anInt9266 = arg0.method6031();
		} else if (arg1 == 14) {
			this.anInt9272 = arg0.method6069() << 2;
		} else if (arg1 == 15) {
			this.anInt9269 = arg0.method6003();
			if (this.anInt9269 == 65535) {
				this.anInt9269 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt9274 = arg0.method6069();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!ji;)V")
	public void method7581(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method7580(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method7585() {
		this.anInt9273 = this.anInt9265 | this.anInt9273 << 8;
		if (this.anInt9269 == -1) {
			this.anInt9269 = this.anInt9268;
		}
	}
}
