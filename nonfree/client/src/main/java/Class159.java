import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class159 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt5797 = 16;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public int anInt5800 = 128;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public int anInt5803 = 0;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public int anInt5801 = -1;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public int anInt5804 = 8;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
	public int anInt5805 = 1190717;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
	public boolean aBoolean304 = true;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public int anInt5807 = -1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!im;II)V")
	public void method4507(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method2655();
			if (local15 == 0) {
				return;
			}
			this.method4510(arg1, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!im;I)V")
	private void method4510(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5803 = Static190.method3396(arg1.method2634());
		} else if (arg2 == 2) {
			this.anInt5801 = arg1.method2655();
		} else if (arg2 == 3) {
			this.anInt5801 = arg1.method2652();
			if (this.anInt5801 == 65535) {
				this.anInt5801 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean303 = false;
		} else if (arg2 == 7) {
			this.anInt5807 = Static190.method3396(arg1.method2634());
		} else if (arg2 == 8) {
			Static247.anInt5416 = arg0;
		} else if (arg2 == 9) {
			this.anInt5800 = arg1.method2652();
		} else if (arg2 == 10) {
			this.aBoolean304 = false;
		} else if (arg2 == 11) {
			this.anInt5804 = arg1.method2655();
		} else if (arg2 == 12) {
			this.aBoolean305 = true;
		} else if (arg2 == 13) {
			this.anInt5805 = arg1.method2634();
		} else if (arg2 == 14) {
			this.anInt5797 = arg1.method2655();
		}
	}
}
