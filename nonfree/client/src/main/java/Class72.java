import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class72 {

	@OriginalMember(owner = "client!im", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public int anInt2548 = 0;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public int anInt2556 = -1;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public int anInt2559 = -1;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	public int anInt2552 = -1;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	public int anInt2560 = -1;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	public int anInt2563 = 0;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	public int anInt2550 = -1;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	public int anInt2566 = -1;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public int anInt2561 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public int anInt2547 = -1;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	public int anInt2571 = -1;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public int anInt2551 = 0;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "I")
	public int anInt2565 = -1;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	public int anInt2562 = -1;

	@OriginalMember(owner = "client!im", name = "A", descriptor = "I")
	public int anInt2572 = 0;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "I")
	public int anInt2557 = 0;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "I")
	public int anInt2558 = -1;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "I")
	public int anInt2564 = -1;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public int anInt2549 = -1;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	public int anInt2554 = -1;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "I")
	public int anInt2569 = -1;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "I")
	public int anInt2578 = 0;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "I")
	public int anInt2568 = -1;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	public int anInt2576 = 0;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "I")
	public int anInt2567 = -1;

	@OriginalMember(owner = "client!im", name = "O", descriptor = "I")
	public int anInt2583 = -1;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "I")
	public int anInt2584 = -1;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "I")
	public int anInt2581 = 0;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public int anInt2553 = -1;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	public int anInt2577 = -1;

	@OriginalMember(owner = "client!im", name = "N", descriptor = "I")
	public int anInt2582 = -1;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	public int anInt2580 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public void method1998() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!p;I)V")
	private void method2000(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2564 = arg0.method1837();
			this.anInt2583 = arg0.method1837();
			if (this.anInt2564 == 65535) {
				this.anInt2564 = -1;
			}
			if (this.anInt2583 == 65535) {
				this.anInt2583 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2566 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt2569 = arg0.method1837();
		} else if (arg1 == 4) {
			this.anInt2565 = arg0.method1837();
		} else if (arg1 == 5) {
			this.anInt2550 = arg0.method1837();
		} else if (arg1 == 6) {
			this.anInt2556 = arg0.method1837();
		} else if (arg1 == 7) {
			this.anInt2582 = arg0.method1837();
		} else if (arg1 == 8) {
			this.anInt2559 = arg0.method1837();
		} else if (arg1 == 9) {
			this.anInt2549 = arg0.method1837();
		} else if (arg1 == 26) {
			this.anInt2557 = (short) (arg0.method1874() * 4);
			this.anInt2551 = (short) (arg0.method1874() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray22 == null) {
				this.anIntArrayArray22 = new int[12][];
			}
			@Pc(378) int local378 = arg0.method1874();
			this.anIntArrayArray22[local378] = new int[6];
			for (@Pc(386) int local386 = 0; local386 < 6; local386++) {
				this.anIntArrayArray22[local378][local386] = arg0.method1869();
			}
		} else if (arg1 == 29) {
			this.anInt2572 = arg0.method1874();
		} else if (arg1 == 30) {
			this.anInt2561 = arg0.method1837();
		} else if (arg1 == 31) {
			this.anInt2580 = arg0.method1874();
		} else if (arg1 == 32) {
			this.anInt2563 = arg0.method1837();
		} else if (arg1 == 33) {
			this.anInt2548 = arg0.method1869();
		} else if (arg1 == 34) {
			this.anInt2581 = arg0.method1874();
		} else if (arg1 == 35) {
			this.anInt2578 = arg0.method1837();
		} else if (arg1 == 36) {
			this.anInt2576 = arg0.method1869();
		} else if (arg1 == 37) {
			this.anInt2577 = arg0.method1874();
		} else if (arg1 == 38) {
			this.anInt2552 = arg0.method1837();
		} else if (arg1 == 39) {
			this.anInt2567 = arg0.method1837();
		} else if (arg1 == 40) {
			this.anInt2584 = arg0.method1837();
		} else if (arg1 == 41) {
			this.anInt2558 = arg0.method1837();
		} else if (arg1 == 42) {
			this.anInt2560 = arg0.method1837();
		} else if (arg1 == 43) {
			arg0.method1837();
		} else if (arg1 == 44) {
			arg0.method1837();
		} else if (arg1 == 45) {
			arg0.method1837();
		} else if (arg1 == 46) {
			this.anInt2547 = arg0.method1837();
		} else if (arg1 == 47) {
			this.anInt2568 = arg0.method1837();
		} else if (arg1 == 48) {
			this.anInt2553 = arg0.method1837();
		} else if (arg1 == 49) {
			this.anInt2571 = arg0.method1837();
		} else if (arg1 == 50) {
			this.anInt2562 = arg0.method1837();
		} else if (arg1 == 51) {
			this.anInt2554 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!p;B)V")
	public void method2002(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1874();
			if (local5 == 0) {
				return;
			}
			this.method2000(arg0, local5);
		}
	}
}
