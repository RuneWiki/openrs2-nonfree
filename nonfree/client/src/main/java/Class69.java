import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class69 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	public int anInt2306 = 0;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt2307 = -1;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public int anInt2302 = -1;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!pg;I)V")
	public void method1861(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2142();
			if (local9 == 0) {
				return;
			}
			this.method1862(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBLclient!pg;)V")
	private void method1862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub17 arg2) {
		if (arg1 == 1) {
			this.anInt2306 = Static208.method2998(arg2.method2135());
		} else if (arg1 == 2) {
			this.anInt2302 = arg2.method2142();
		} else if (arg1 == 3) {
			this.anInt2302 = arg2.method2178();
			if (this.anInt2302 == 65535) {
				this.anInt2302 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean100 = false;
		} else if (arg1 == 7) {
			this.anInt2307 = Static208.method2998(arg2.method2135());
		} else if (arg1 == 8) {
			Static105.anInt2096 = arg0;
		} else if (arg1 == 9) {
			arg2.method2178();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg2.method2142();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					arg2.method2135();
				} else if (arg1 == 14) {
					arg2.method2142();
				}
			}
		}
	}
}
