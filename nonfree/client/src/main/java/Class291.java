import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class291 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Z")
	public boolean aBoolean616 = false;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	public int anInt8273 = 64;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public int anInt8275 = -1;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public int anInt8276 = 2;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "Z")
	public boolean aBoolean617 = false;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	public int anInt8269 = 64;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
	public int anInt8278 = 1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!ud;II)V")
	public void method6944(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method6904();
			if (local13 == 0) {
				return;
			}
			this.method6945(arg1, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!ud;II)V")
	private void method6945(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt8275 = arg1.method6884();
			if (this.anInt8275 == 65535) {
				this.anInt8275 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt8273 = arg1.method6884() + 1;
			this.anInt8269 = arg1.method6884() + 1;
		} else if (arg2 == 3) {
			arg1.method6908();
		} else if (arg2 == 4) {
			this.anInt8276 = arg1.method6904();
		} else if (arg2 == 5) {
			this.anInt8278 = arg1.method6904();
		} else if (arg2 == 6) {
			this.aBoolean616 = true;
		} else if (arg2 == 7) {
			this.aBoolean617 = true;
		}
	}
}
