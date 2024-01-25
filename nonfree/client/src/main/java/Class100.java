import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class100 {

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
	public static final int[] anIntArray137 = new int[4096];

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	private int anInt2652;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2656;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public int anInt2657;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2662;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public int anInt2665;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "J")
	public long aLong80;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public int anInt2666;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public int anInt2667;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt2668;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	public int anInt2655 = 0;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public int anInt2654 = 0;

	static {
		for (@Pc(55) int local55 = 0; local55 < 4096; local55++) {
			anIntArray137[local55] = Static173.method3341(local55);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!jc;I)V")
	private void method2607(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2652 = arg0.method3018();
		} else if (arg1 == 2) {
			arg0.method3030();
		} else if (arg1 == 3) {
			this.anInt2666 = arg0.method3015();
			this.anInt2665 = arg0.method3015();
			this.anInt2667 = arg0.method3015();
		} else if (arg1 == 4) {
			this.anInt2668 = arg0.method3030();
			this.anInt2662 = arg0.method3015();
		} else if (arg1 == 6) {
			this.anInt2656 = arg0.method3030();
		} else if (arg1 == 8) {
			this.anInt2654 = 1;
		} else if (arg1 == 9) {
			this.anInt2655 = 1;
		} else if (arg1 == 10) {
			this.aBoolean209 = true;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public void method2608() {
		this.anInt2661 = Class6_Sub2_Sub12.anIntArray292[this.anInt2652 << 3];
		@Pc(17) long local17 = (long) this.anInt2666;
		@Pc(29) long local29 = (long) this.anInt2665;
		@Pc(33) long local33 = (long) this.anInt2667;
		this.anInt2660 = (int) Math.sqrt((double) (local17 * local17 + local29 * local29 + local33 * local33));
		if (this.anInt2662 == 0) {
			this.anInt2662 = 1;
		}
		if (this.anInt2668 == 0) {
			this.aLong80 = 2147483647L;
		} else if (this.anInt2668 == 1) {
			this.aLong80 = (long) (this.anInt2660 * 8 / this.anInt2662);
			this.aLong80 *= this.aLong80;
		} else if (this.anInt2668 == 2) {
			this.aLong80 = (long) (this.anInt2660 * 8 / this.anInt2662);
		}
		if (this.aBoolean209) {
			this.anInt2660 *= -1;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!jc;)V")
	public void method2611(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method2607(arg0, local5);
		}
	}
}
