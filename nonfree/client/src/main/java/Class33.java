import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class33 {

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Z")
	public boolean aBoolean67 = true;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public int anInt945 = -1;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public int anInt948 = 0;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public int anInt946 = -1;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt944 = -1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public int anInt949 = -1;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	public int anInt950 = -1;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	public int anInt952 = -1;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt953 = -1;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
	private int[] anIntArray47 = null;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public int anInt947 = -1;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public int anInt955 = -1;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public int anInt965 = -1;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public int anInt964 = 0;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public int anInt961 = -1;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
	public int anInt969 = 0;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
	public int anInt972 = -1;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	public int anInt973 = -1;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public int anInt962 = -1;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
	public int anInt971 = -1;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	public int anInt968 = 0;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public int anInt954 = -1;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	public int anInt960 = -1;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	public int anInt975 = -1;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
	public int anInt978 = 0;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
	public int anInt970 = -1;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	public int anInt956 = -1;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
	public int anInt982 = -1;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	public int anInt967 = -1;

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
	public int anInt977 = 0;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
	public int anInt983 = -1;

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "[I")
	private int[] anIntArray49 = null;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
	private int anInt974 = 0;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	public int anInt984 = 0;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
	public int anInt985 = 0;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public int anInt980 = 0;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
	public int anInt981 = -1;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
	public int anInt986 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method879(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1832();
			if (local11 == 0) {
				return;
			}
			this.method886(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)I")
	public int method880() {
		if (this.anInt946 != -1) {
			return this.anInt946;
		} else if (this.anIntArray47 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) (Math.random() * (double) this.anInt974);
			@Pc(32) int local32;
			for (local32 = 0; local30 >= this.anIntArray49[local32]; local32++) {
				local30 -= this.anIntArray49[local32];
			}
			return this.anIntArray47[local32];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method881() {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Z")
	public boolean method885(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt946 == arg0) {
			return true;
		} else {
			if (this.anIntArray47 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray47.length; local29++) {
					if (this.anIntArray47[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!bk;)V")
	private void method886(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt946 = arg1.method1845();
			this.anInt947 = arg1.method1845();
			if (this.anInt946 == 65535) {
				this.anInt946 = -1;
			}
			if (this.anInt947 == 65535) {
				this.anInt947 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt973 = arg1.method1845();
		} else if (arg0 == 3) {
			this.anInt961 = arg1.method1845();
		} else if (arg0 == 4) {
			this.anInt952 = arg1.method1845();
		} else if (arg0 == 5) {
			this.anInt954 = arg1.method1845();
		} else if (arg0 == 6) {
			this.anInt950 = arg1.method1845();
		} else if (arg0 == 7) {
			this.anInt965 = arg1.method1845();
		} else if (arg0 == 8) {
			this.anInt971 = arg1.method1845();
		} else if (arg0 == 9) {
			this.anInt982 = arg1.method1845();
		} else if (arg0 == 26) {
			this.anInt978 = (short) (arg1.method1832() * 4);
			this.anInt969 = (short) (arg1.method1832() * 4);
		} else {
			@Pc(156) int local156;
			@Pc(386) int local386;
			if (arg0 == 27) {
				if (this.anIntArrayArray5 == null) {
					this.anIntArrayArray5 = new int[12][];
				}
				local156 = arg1.method1832();
				this.anIntArrayArray5[local156] = new int[6];
				for (local386 = 0; local386 < 6; local386++) {
					this.anIntArrayArray5[local156][local386] = arg1.method1834();
				}
			} else if (arg0 == 28) {
				this.anIntArray48 = new int[12];
				for (local156 = 0; local156 < 12; local156++) {
					this.anIntArray48[local156] = arg1.method1832();
					if (this.anIntArray48[local156] == 255) {
						this.anIntArray48[local156] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt980 = arg1.method1832();
			} else if (arg0 == 30) {
				this.anInt985 = arg1.method1845();
			} else if (arg0 == 31) {
				this.anInt977 = arg1.method1832();
			} else if (arg0 == 32) {
				this.anInt948 = arg1.method1845();
			} else if (arg0 == 33) {
				this.anInt968 = arg1.method1834();
			} else if (arg0 == 34) {
				this.anInt984 = arg1.method1832();
			} else if (arg0 == 35) {
				this.anInt964 = arg1.method1845();
			} else if (arg0 == 36) {
				this.anInt986 = arg1.method1834();
			} else if (arg0 == 37) {
				this.anInt944 = arg1.method1832();
			} else if (arg0 == 38) {
				this.anInt970 = arg1.method1845();
			} else if (arg0 == 39) {
				this.anInt983 = arg1.method1845();
			} else if (arg0 == 40) {
				this.anInt955 = arg1.method1845();
			} else if (arg0 == 41) {
				this.anInt960 = arg1.method1845();
			} else if (arg0 == 42) {
				this.anInt949 = arg1.method1845();
			} else if (arg0 == 43) {
				arg1.method1845();
			} else if (arg0 == 44) {
				this.anInt972 = arg1.method1845();
			} else if (arg0 == 45) {
				this.anInt981 = arg1.method1845();
			} else if (arg0 == 46) {
				this.anInt967 = arg1.method1845();
			} else if (arg0 == 47) {
				this.anInt975 = arg1.method1845();
			} else if (arg0 == 48) {
				this.anInt962 = arg1.method1845();
			} else if (arg0 == 49) {
				this.anInt956 = arg1.method1845();
			} else if (arg0 == 50) {
				this.anInt945 = arg1.method1845();
			} else if (arg0 == 51) {
				this.anInt953 = arg1.method1845();
			} else if (arg0 == 52) {
				local156 = arg1.method1832();
				this.anIntArray47 = new int[local156];
				this.anIntArray49 = new int[local156];
				for (local386 = 0; local386 < local156; local386++) {
					this.anIntArray47[local386] = arg1.method1845();
					@Pc(399) int local399 = arg1.method1832();
					this.anIntArray49[local386] = local399;
					this.anInt974 += local399;
				}
			} else if (arg0 == 53) {
				this.aBoolean67 = false;
			}
		}
	}
}
