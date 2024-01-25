import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class79 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public int anInt2609 = -1;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	public int anInt2610 = 64;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
	public int anInt2608 = 64;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	public int anInt2612 = 1;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
	public int anInt2611 = 2;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!bt;I)V")
	public void method2153(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method6053();
			if (local5 == 0) {
				return;
			}
			this.method2155(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILclient!bt;I)V")
	private void method2155(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2609 = arg1.method6004();
			if (this.anInt2609 == 65535) {
				this.anInt2609 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt2608 = arg1.method6004() + 1;
			this.anInt2610 = arg1.method6004() + 1;
		} else if (arg2 == 3) {
			arg1.method6011();
		} else if (arg2 == 4) {
			this.anInt2611 = arg1.method6053();
		} else if (arg2 == 5) {
			this.anInt2612 = arg1.method6053();
		} else if (arg2 == 6) {
			this.aBoolean201 = true;
		} else if (arg2 == 7) {
			this.aBoolean202 = true;
		}
	}
}
