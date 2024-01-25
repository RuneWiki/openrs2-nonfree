import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class233 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
	public int anInt7434 = 2;

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "Z")
	public boolean aBoolean556 = false;

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
	public int anInt7439 = 64;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	public int anInt7435 = -1;

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
	public int anInt7438 = 1;

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
	public int anInt7440 = 64;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILclient!ps;B)V")
	private void method6262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub29 arg2) {
		if (arg1 == 1) {
			this.anInt7435 = arg2.method5229();
			if (this.anInt7435 == 65535) {
				this.anInt7435 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt7439 = arg2.method5229() + 1;
			this.anInt7440 = arg2.method5229() + 1;
			return;
		} else if (arg1 == 3) {
			arg2.method5179();
			return;
		} else if (arg1 == 4) {
			this.anInt7434 = arg2.method5170();
		} else {
			if (arg1 == 5) {
				this.anInt7438 = arg2.method5170();
			} else if (arg1 == 6) {
				this.aBoolean558 = true;
				return;
			} else if (arg1 == 7) {
				this.aBoolean556 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZILclient!ps;)V")
	public void method6263(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5170();
			if (local5 == 0) {
				return;
			}
			this.method6262(arg0, local5, arg1);
		}
	}
}
