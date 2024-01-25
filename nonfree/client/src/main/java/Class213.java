import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class213 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
	public boolean aBoolean475 = true;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public int anInt6542 = -1;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public int anInt6547 = 128;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Z")
	public boolean aBoolean476 = true;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public int anInt6546 = 16;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public int anInt6539 = -1;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public int anInt6553 = 1190717;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt6554 = -1;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public int anInt6551 = 8;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public int anInt6543 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ap;)V")
	public void method5572(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method2772();
			if (local12 == 0) {
				return;
			}
			this.method5574(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public void method5573(@OriginalArg(1) int arg0) {
		if (this.anInt6542 == -1) {
			this.anInt6542 = this.anInt6539;
		}
		this.anInt6551 = this.anInt6551 << 8 | arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILclient!ap;)V")
	private void method5574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub3 arg2) {
		if (arg0 == 1) {
			this.anInt6543 = Static102.method2041(arg2.method2791());
		} else if (arg0 == 2) {
			this.anInt6539 = arg2.method2772();
		} else if (arg0 == 3) {
			this.anInt6539 = arg2.method2764();
			if (this.anInt6539 == 65535) {
				this.anInt6539 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean476 = false;
		} else if (arg0 == 7) {
			this.anInt6554 = Static102.method2041(arg2.method2791());
		} else if (arg0 == 8) {
			Static84.anInt2185 = arg1;
		} else if (arg0 == 9) {
			this.anInt6547 = arg2.method2764();
		} else if (arg0 == 10) {
			this.aBoolean475 = false;
		} else if (arg0 == 11) {
			this.anInt6551 = arg2.method2772();
		} else if (arg0 == 12) {
			this.aBoolean477 = true;
		} else if (arg0 == 13) {
			this.anInt6553 = arg2.method2791();
		} else if (arg0 == 14) {
			this.anInt6546 = arg2.method2772();
		} else if (arg0 == 15) {
			this.anInt6542 = arg2.method2764();
			if (this.anInt6542 == 65535) {
				this.anInt6542 = -1;
			}
		}
	}
}
