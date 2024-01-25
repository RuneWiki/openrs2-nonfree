import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class100 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	private int anInt2709;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public int anInt2710;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public int anInt2712;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "I")
	public int anInt2714;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "J")
	public long aLong102;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public int anInt2715;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public int anInt2716;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public int anInt2719;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	public int anInt2722;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public int anInt2713 = 0;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public int anInt2717 = 0;

	static {
		new Class309("game5", "Game 5", 4);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method2495(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2048(255);
			if (local17 == 0) {
				return;
			}
			this.method2498(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	public void method2496() {
		this.anInt2710 = Class3_Sub7_Sub17_Sub1.anIntArray548[this.anInt2709 << 3];
		@Pc(17) long local17 = (long) this.anInt2708;
		@Pc(21) long local21 = (long) this.anInt2722;
		@Pc(25) long local25 = (long) this.anInt2715;
		this.anInt2714 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt2711 == 0) {
			this.anInt2711 = 1;
		}
		if (this.anInt2712 == 0) {
			this.aLong102 = 2147483647L;
		} else if (this.anInt2712 == 1) {
			this.aLong102 = (long) (this.anInt2714 * 8 / this.anInt2711);
			this.aLong102 *= this.aLong102;
		} else if (this.anInt2712 == 2) {
			this.aLong102 = (long) (this.anInt2714 * 8 / this.anInt2711);
		}
		if (this.aBoolean174) {
			this.anInt2714 *= -1;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!ika;)V")
	private void method2498(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt2709 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			arg1.method2048(255);
		} else if (arg0 == 3) {
			this.anInt2708 = arg1.method2036();
			this.anInt2722 = arg1.method2036();
			this.anInt2715 = arg1.method2036();
		} else if (arg0 == 4) {
			this.anInt2712 = arg1.method2048(255);
			this.anInt2711 = arg1.method2036();
		} else if (arg0 == 6) {
			this.anInt2719 = arg1.method2048(255);
		} else if (arg0 == 8) {
			this.anInt2713 = 1;
		} else if (arg0 == 9) {
			this.anInt2717 = 1;
		} else if (arg0 == 10) {
			this.aBoolean174 = true;
		}
	}
}
