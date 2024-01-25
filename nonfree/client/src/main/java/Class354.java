import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class354 {

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Z")
	public boolean aBoolean707 = false;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
	public int anInt9475 = 64;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
	public int anInt9474 = 1;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "Z")
	public boolean aBoolean706 = false;

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
	public int anInt9478 = -1;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	public int anInt9477 = 64;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
	public int anInt9476 = 2;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!fca;IB)V")
	public void method8008(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method8009(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!fca;II)V")
	private void method8009(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt9478 = arg0.method4858();
			if (this.anInt9478 == 65535) {
				this.anInt9478 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt9477 = arg0.method4858() + 1;
			this.anInt9475 = arg0.method4858() + 1;
		} else if (arg1 == 3) {
			arg0.method4861();
			return;
		} else if (arg1 == 4) {
			this.anInt9476 = arg0.method4888();
			return;
		} else if (arg1 == 5) {
			this.anInt9474 = arg0.method4888();
			return;
		} else {
			if (arg1 == 6) {
				this.aBoolean707 = true;
			} else if (arg1 == 7) {
				this.aBoolean706 = true;
				return;
			}
			return;
		}
	}
}
