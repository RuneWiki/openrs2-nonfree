import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class59 {

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt2720 = 0;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public int anInt2726 = -1;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt2728 = -1;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt2722 = 0;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public int anInt2732 = 0;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public int anInt2739 = -1;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public int anInt2741 = -1;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public int anInt2730 = -1;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public int anInt2727 = -1;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public int anInt2742 = 0;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt2729 = -1;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public int anInt2725 = -1;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public int anInt2731 = 0;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public int anInt2735 = -1;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	public int anInt2736 = -1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public int anInt2719 = 0;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public int anInt2745 = 0;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	public int anInt2749 = -1;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public int anInt2737 = -1;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	public int anInt2748 = -1;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	public int anInt2754 = -1;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "I")
	public int anInt2747 = -1;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	public int anInt2750 = -1;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	public int anInt2756 = -1;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "I")
	public int anInt2752 = -1;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public int anInt2751 = -1;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	public int anInt2757 = 0;

	@OriginalMember(owner = "client!id", name = "M", descriptor = "I")
	public int anInt2753 = 0;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public int anInt2733 = 0;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public int anInt2744 = -1;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	public int anInt2755 = -1;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	public int anInt2758 = -1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ql;I)V")
	private void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2744 = arg1.method1764();
			this.anInt2747 = arg1.method1764();
			if (this.anInt2747 == 65535) {
				this.anInt2747 = -1;
			}
			if (this.anInt2744 == 65535) {
				this.anInt2744 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt2758 = arg1.method1764();
		} else if (arg0 == 3) {
			this.anInt2756 = arg1.method1764();
			return;
		} else if (arg0 == 4) {
			this.anInt2739 = arg1.method1764();
			return;
		} else if (arg0 == 5) {
			this.anInt2750 = arg1.method1764();
			return;
		} else if (arg0 == 6) {
			this.anInt2726 = arg1.method1764();
			return;
		} else if (arg0 == 7) {
			this.anInt2729 = arg1.method1764();
			return;
		} else if (arg0 == 8) {
			this.anInt2741 = arg1.method1764();
			return;
		} else if (arg0 == 9) {
			this.anInt2725 = arg1.method1764();
			return;
		} else if (arg0 == 26) {
			this.anInt2733 = (short) (arg1.method1772() * 4);
			this.anInt2731 = (short) (arg1.method1772() * 4);
			return;
		} else if (arg0 == 27) {
			if (this.anIntArrayArray18 == null) {
				this.anIntArrayArray18 = new int[12][];
			}
			@Pc(137) int local137 = arg1.method1772();
			this.anIntArrayArray18[local137] = new int[6];
			for (@Pc(145) int local145 = 0; local145 < 6; local145++) {
				this.anIntArrayArray18[local137][local145] = arg1.method1798();
			}
			return;
		} else if (arg0 == 29) {
			this.anInt2745 = arg1.method1772();
			return;
		} else if (arg0 == 30) {
			this.anInt2719 = arg1.method1764();
			return;
		} else if (arg0 == 31) {
			this.anInt2722 = arg1.method1772();
			return;
		} else if (arg0 == 32) {
			this.anInt2720 = arg1.method1764();
			return;
		} else if (arg0 == 33) {
			this.anInt2757 = arg1.method1798();
			return;
		} else if (arg0 == 34) {
			this.anInt2742 = arg1.method1772();
			return;
		} else if (arg0 == 35) {
			this.anInt2732 = arg1.method1764();
			return;
		} else if (arg0 == 36) {
			this.anInt2753 = arg1.method1798();
			return;
		} else if (arg0 == 37) {
			this.anInt2735 = arg1.method1772();
			return;
		} else if (arg0 == 38) {
			this.anInt2749 = arg1.method1764();
			return;
		} else if (arg0 == 39) {
			this.anInt2751 = arg1.method1764();
			return;
		} else if (arg0 == 40) {
			this.anInt2755 = arg1.method1764();
			return;
		} else if (arg0 == 41) {
			this.anInt2728 = arg1.method1764();
			return;
		} else if (arg0 == 42) {
			this.anInt2737 = arg1.method1764();
			return;
		} else if (arg0 == 43) {
			arg1.method1764();
			return;
		} else if (arg0 == 44) {
			arg1.method1764();
			return;
		} else if (arg0 == 45) {
			arg1.method1764();
			return;
		} else if (arg0 == 46) {
			this.anInt2748 = arg1.method1764();
			return;
		} else if (arg0 == 47) {
			this.anInt2727 = arg1.method1764();
			return;
		} else if (arg0 == 48) {
			this.anInt2754 = arg1.method1764();
			return;
		} else {
			if (arg0 == 49) {
				this.anInt2730 = arg1.method1764();
			} else if (arg0 == 50) {
				this.anInt2736 = arg1.method1764();
				return;
			} else if (arg0 == 51) {
				this.anInt2752 = arg1.method1764();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ql;)V")
	public void method2098(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1772();
			if (local9 == 0) {
				return;
			}
			this.method2094(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	public void method2099() {
	}
}
