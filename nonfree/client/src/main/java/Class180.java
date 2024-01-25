import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class180 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray149;

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public int anInt5738 = -1;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public int anInt5729 = -1;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	public int anInt5751 = -1;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public int anInt5744 = -1;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	public int anInt5748 = -1;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public int anInt5743 = -1;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public int anInt5737 = 0;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public int anInt5733 = -1;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
	public int anInt5747 = -1;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	private int anInt5742 = 0;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
	public int anInt5746 = -1;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public int anInt5731 = -1;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "[I")
	public int[] anIntArray418 = null;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
	public int[] anIntArray419 = null;

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
	public int anInt5759 = -1;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public int anInt5728 = -1;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	public int anInt5745 = 0;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
	public int anInt5754 = -1;

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
	public int anInt5764 = -1;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
	public int anInt5761 = 0;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
	public int anInt5756 = 0;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	public int anInt5755 = -1;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
	public int anInt5763 = -1;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	public int anInt5767 = -1;

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
	public boolean aBoolean513 = true;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public int anInt5749 = 0;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public int anInt5735 = 0;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	public int anInt5762 = -1;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
	public int anInt5769 = 0;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
	public int anInt5757 = 0;

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
	public int anInt5770 = -1;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
	public int anInt5741 = 0;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
	public int anInt5768 = -1;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	public int anInt5750 = -1;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
	public int anInt5771 = -1;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
	public int anInt5766 = -1;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
	public int anInt5773 = -1;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	public int anInt5772 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public void method5094() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!dg;)V")
	private void method5099(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt5729 = arg1.method4464();
			this.anInt5750 = arg1.method4464();
			if (this.anInt5750 == 65535) {
				this.anInt5750 = -1;
			}
			if (this.anInt5729 == 65535) {
				this.anInt5729 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt5728 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt5754 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt5744 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt5746 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt5767 = arg1.method4464();
		} else if (arg0 == 7) {
			this.anInt5755 = arg1.method4464();
		} else if (arg0 == 8) {
			this.anInt5773 = arg1.method4464();
		} else if (arg0 == 9) {
			this.anInt5762 = arg1.method4464();
		} else if (arg0 == 26) {
			this.anInt5745 = (short) (arg1.method4421() * 4);
			this.anInt5735 = (short) (arg1.method4421() * 4);
		} else {
			@Pc(105) int local105;
			@Pc(338) int local338;
			if (arg0 == 27) {
				if (this.anIntArrayArray149 == null) {
					this.anIntArrayArray149 = new int[12][];
				}
				local105 = arg1.method4421();
				this.anIntArrayArray149[local105] = new int[6];
				for (local338 = 0; local338 < 6; local338++) {
					this.anIntArrayArray149[local105][local338] = arg1.method4460();
				}
			} else if (arg0 == 28) {
				this.anIntArray420 = new int[12];
				for (local105 = 0; local105 < 12; local105++) {
					this.anIntArray420[local105] = arg1.method4421();
					if (this.anIntArray420[local105] == 255) {
						this.anIntArray420[local105] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt5749 = arg1.method4421();
			} else if (arg0 == 30) {
				this.anInt5756 = arg1.method4464();
			} else if (arg0 == 31) {
				this.anInt5761 = arg1.method4421();
			} else if (arg0 == 32) {
				this.anInt5757 = arg1.method4464();
			} else if (arg0 == 33) {
				this.anInt5737 = arg1.method4460();
			} else if (arg0 == 34) {
				this.anInt5772 = arg1.method4421();
			} else if (arg0 == 35) {
				this.anInt5741 = arg1.method4464();
			} else if (arg0 == 36) {
				this.anInt5769 = arg1.method4460();
			} else if (arg0 == 37) {
				this.anInt5733 = arg1.method4421();
			} else if (arg0 == 38) {
				this.anInt5751 = arg1.method4464();
			} else if (arg0 == 39) {
				this.anInt5771 = arg1.method4464();
			} else if (arg0 == 40) {
				this.anInt5768 = arg1.method4464();
			} else if (arg0 == 41) {
				this.anInt5743 = arg1.method4464();
			} else if (arg0 == 42) {
				this.anInt5763 = arg1.method4464();
			} else if (arg0 == 43) {
				arg1.method4464();
			} else if (arg0 == 44) {
				this.anInt5764 = arg1.method4464();
			} else if (arg0 == 45) {
				this.anInt5759 = arg1.method4464();
			} else if (arg0 == 46) {
				this.anInt5738 = arg1.method4464();
			} else if (arg0 == 47) {
				this.anInt5748 = arg1.method4464();
			} else if (arg0 == 48) {
				this.anInt5747 = arg1.method4464();
			} else if (arg0 == 49) {
				this.anInt5731 = arg1.method4464();
			} else if (arg0 == 50) {
				this.anInt5770 = arg1.method4464();
			} else if (arg0 == 51) {
				this.anInt5766 = arg1.method4464();
			} else if (arg0 == 52) {
				local105 = arg1.method4421();
				this.anIntArray419 = new int[local105];
				this.anIntArray418 = new int[local105];
				for (local338 = 0; local338 < local105; local338++) {
					this.anIntArray419[local338] = arg1.method4464();
					@Pc(351) int local351 = arg1.method4421();
					this.anIntArray418[local338] = local351;
					this.anInt5742 += local351;
				}
			} else if (arg0 == 53) {
				this.aBoolean513 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dg;B)V")
	public void method5101(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4421();
			if (local11 == 0) {
				return;
			}
			this.method5099(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
	public int method5102() {
		if (this.anInt5729 != -1) {
			return this.anInt5729;
		} else if (this.anIntArray419 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt5742);
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray418[local31]; local31++) {
				local29 -= this.anIntArray418[local31];
			}
			return this.anIntArray419[local31];
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Z")
	public boolean method5103(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt5729 == arg0) {
			return true;
		} else {
			if (this.anIntArray419 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray419.length; local26++) {
					if (arg0 == this.anIntArray419[local26]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
