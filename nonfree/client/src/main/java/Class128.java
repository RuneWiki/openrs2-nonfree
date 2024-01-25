import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class128 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt3541;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!md;")
	public Class209 aClass209_2;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public int anInt3547 = 127;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Z")
	public boolean aBoolean275 = true;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt3538 = 1190717;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt3540 = -1;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt3546 = -1;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt3548 = 512;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
	public int anInt3549 = 8;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
	public boolean aBoolean277 = false;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt3539 = 64;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public int anInt3545 = -1;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
	public boolean aBoolean276 = true;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public int anInt3550 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method3111() {
		this.anInt3549 = this.anInt3549 << 8 | this.anInt3541;
		if (this.anInt3545 == -1) {
			this.anInt3545 = this.anInt3546;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method3112(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3550 = Static286.method8368(arg0.method6506());
		} else if (arg1 == 2) {
			this.anInt3546 = arg0.method6538();
		} else if (arg1 == 3) {
			this.anInt3546 = arg0.method6535();
			if (this.anInt3546 == 65535) {
				this.anInt3546 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean276 = false;
		} else if (arg1 == 7) {
			this.anInt3540 = Static286.method8368(arg0.method6506());
		} else if (arg1 == 8) {
			this.aClass209_2.anInt6577 = this.anInt3541;
		} else if (arg1 == 9) {
			this.anInt3548 = arg0.method6535() << 2;
		} else if (arg1 == 10) {
			this.aBoolean275 = false;
		} else if (arg1 == 11) {
			this.anInt3549 = arg0.method6538();
		} else if (arg1 == 12) {
			this.aBoolean277 = true;
		} else if (arg1 == 13) {
			this.anInt3538 = arg0.method6506();
		} else if (arg1 == 14) {
			this.anInt3539 = arg0.method6538() << 2;
		} else if (arg1 == 15) {
			this.anInt3545 = arg0.method6535();
			if (this.anInt3545 == 65535) {
				this.anInt3545 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt3547 = arg0.method6538();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method3116(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method6538();
			if (local8 == 0) {
				return;
			}
			this.method3112(arg0, local8);
		}
	}
}
