import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class135 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public int anInt3948 = 16;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public int anInt3944 = -1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt3942 = 128;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	public int anInt3941 = -1;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public int anInt3951 = -1;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public int anInt3953 = 8;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
	public boolean aBoolean281 = true;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt3954 = 0;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public int anInt3949 = 1190717;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!bk;BI)V")
	private void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3954 = Static244.method4161(arg1.method1843());
		} else if (arg2 == 2) {
			this.anInt3944 = arg1.method1832();
		} else if (arg2 == 3) {
			this.anInt3944 = arg1.method1845();
			if (this.anInt3944 == 65535) {
				this.anInt3944 = -1;
				return;
			}
		} else if (arg2 == 5) {
			this.aBoolean281 = false;
			return;
		} else if (arg2 == 7) {
			this.anInt3941 = Static244.method4161(arg1.method1843());
			return;
		} else if (arg2 == 8) {
			Static79.anInt1907 = arg0;
			return;
		} else if (arg2 == 9) {
			this.anInt3942 = arg1.method1845();
			return;
		} else if (arg2 == 10) {
			this.aBoolean282 = false;
			return;
		} else if (arg2 == 11) {
			this.anInt3953 = arg1.method1832();
			return;
		} else if (arg2 == 12) {
			this.aBoolean280 = true;
			return;
		} else {
			if (arg2 == 13) {
				this.anInt3949 = arg1.method1843();
			} else if (arg2 == 14) {
				this.anInt3948 = arg1.method1832();
				return;
			} else if (arg2 == 15) {
				this.anInt3951 = arg1.method1845();
				if (this.anInt3951 == 65535) {
					this.anInt3951 = -1;
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
	public void method3631(@OriginalArg(1) int arg0) {
		if (this.anInt3951 == -1) {
			this.anInt3951 = this.anInt3944;
		}
		this.anInt3953 = arg0 | this.anInt3953 << 8;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!bk;)V")
	public void method3632(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		while (true) {
			@Pc(16) int local16 = arg1.method1832();
			if (local16 == 0) {
				return;
			}
			this.method3629(arg0, arg1, local16);
		}
	}
}
