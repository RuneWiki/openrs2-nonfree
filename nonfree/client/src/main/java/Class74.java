import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class74 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public int anInt2384 = -1;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public int anInt2383 = 1;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Z")
	public boolean aBoolean189 = false;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt2389 = 64;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public int anInt2388 = 64;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public int anInt2387 = 2;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ek;IB)V")
	public void method1892(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method7004();
			if (local10 == 0) {
				return;
			}
			this.method1893(arg0, arg1, local10);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ek;BII)V")
	private void method1893(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2384 = arg0.method7054();
			if (this.anInt2384 == 65535) {
				this.anInt2384 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt2389 = arg0.method7054() + 1;
			this.anInt2388 = arg0.method7054() + 1;
		} else if (arg2 == 3) {
			arg0.method7011();
		} else if (arg2 == 4) {
			this.anInt2387 = arg0.method7004();
		} else if (arg2 == 5) {
			this.anInt2383 = arg0.method7004();
		} else if (arg2 == 6) {
			this.aBoolean190 = true;
		} else if (arg2 == 7) {
			this.aBoolean189 = true;
		}
	}
}
