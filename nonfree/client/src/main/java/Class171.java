import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class171 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	public int anInt5078 = 0;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public int anInt5080 = -1;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public int anInt5092 = -1;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	public int anInt5084 = 0;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public int anInt5091 = 0;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	public int anInt5095 = -1;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	public int anInt5098 = 0;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public int anInt5083 = -1;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public int anInt5086 = 0;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public int anInt5081 = -1;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
	public int anInt5094 = -1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public int anInt5077 = -1;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
	public int anInt5099 = -1;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
	public int anInt5093 = 0;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public int anInt5079 = -1;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public int anInt5082 = -1;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
	public int anInt5101 = -1;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	public int anInt5108 = -1;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
	public int anInt5107 = -1;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "Z")
	public boolean aBoolean431 = true;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public int anInt5090 = -1;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public int anInt5087 = -1;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	public int anInt5103 = 0;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "[I")
	public int[] anIntArray313 = null;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
	public int anInt5106 = -1;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public int anInt5089 = 0;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	public int anInt5105 = 0;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	public int anInt5114 = -1;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
	public int anInt5115 = -1;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
	public int anInt5100 = -1;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
	public int anInt5097 = 0;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
	public int[] anIntArray312 = null;

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
	public int anInt5110 = 0;

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
	public int anInt5104 = -1;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	public int anInt5102 = 0;

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
	public int anInt5116 = -1;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	public int anInt5111 = -1;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	public int anInt5113 = -1;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
	public int anInt5118 = -1;

	@OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
	private int anInt5119 = 0;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
	public int anInt5117 = -1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!fd;)V")
	public void method4286(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6538();
			if (local3 == 0) {
				return;
			}
			this.method4290(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	public int method4287() {
		if (this.anInt5095 != -1) {
			return this.anInt5095;
		} else if (this.anIntArray312 == null) {
			return -1;
		} else {
			@Pc(26) int local26 = (int) (Math.random() * (double) this.anInt5119);
			@Pc(28) int local28;
			for (local28 = 0; this.anIntArray313[local28] <= local26; local28++) {
				local26 -= this.anIntArray313[local28];
			}
			return this.anIntArray312[local28];
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Z")
	public boolean method4289(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt5095 == arg0) {
			return true;
		} else {
			if (this.anIntArray312 != null) {
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray312.length; local31++) {
					if (arg0 == this.anIntArray312[local31]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLclient!fd;)V")
	private void method4290(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt5095 = arg1.method6535();
			this.anInt5101 = arg1.method6535();
			if (this.anInt5101 == 65535) {
				this.anInt5101 = -1;
			}
			if (this.anInt5095 == 65535) {
				this.anInt5095 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt5115 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt5080 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt5104 = arg1.method6535();
		} else if (arg0 == 5) {
			this.anInt5117 = arg1.method6535();
		} else if (arg0 == 6) {
			this.anInt5079 = arg1.method6535();
		} else if (arg0 == 7) {
			this.anInt5082 = arg1.method6535();
		} else if (arg0 == 8) {
			this.anInt5113 = arg1.method6535();
		} else if (arg0 == 9) {
			this.anInt5094 = arg1.method6535();
		} else if (arg0 == 26) {
			this.anInt5097 = (short) (arg1.method6538() * 4);
			this.anInt5084 = (short) (arg1.method6538() * 4);
		} else {
			@Pc(300) int local300;
			@Pc(310) int local310;
			if (arg0 == 27) {
				if (this.anIntArrayArray39 == null) {
					this.anIntArrayArray39 = new int[12][];
				}
				local300 = arg1.method6538();
				this.anIntArrayArray39[local300] = new int[6];
				for (local310 = 0; local310 < 6; local310++) {
					this.anIntArrayArray39[local300][local310] = arg1.method6525();
				}
			} else if (arg0 == 28) {
				this.anIntArray311 = new int[12];
				for (local300 = 0; local300 < 12; local300++) {
					this.anIntArray311[local300] = arg1.method6538();
					if (this.anIntArray311[local300] == 255) {
						this.anIntArray311[local300] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt5103 = arg1.method6538();
			} else if (arg0 == 30) {
				this.anInt5089 = arg1.method6535();
			} else if (arg0 == 31) {
				this.anInt5078 = arg1.method6538();
			} else if (arg0 == 32) {
				this.anInt5086 = arg1.method6535();
			} else if (arg0 == 33) {
				this.anInt5105 = arg1.method6525();
			} else if (arg0 == 34) {
				this.anInt5093 = arg1.method6538();
			} else if (arg0 == 35) {
				this.anInt5102 = arg1.method6535();
			} else if (arg0 == 36) {
				this.anInt5091 = arg1.method6525();
			} else if (arg0 == 37) {
				this.anInt5100 = arg1.method6538();
			} else if (arg0 == 38) {
				this.anInt5077 = arg1.method6535();
			} else if (arg0 == 39) {
				this.anInt5118 = arg1.method6535();
			} else if (arg0 == 40) {
				this.anInt5106 = arg1.method6535();
			} else if (arg0 == 41) {
				this.anInt5092 = arg1.method6535();
			} else if (arg0 == 42) {
				this.anInt5087 = arg1.method6535();
			} else if (arg0 == 43) {
				this.anInt5099 = arg1.method6535();
			} else if (arg0 == 44) {
				this.anInt5090 = arg1.method6535();
			} else if (arg0 == 45) {
				this.anInt5108 = arg1.method6535();
			} else if (arg0 == 46) {
				this.anInt5114 = arg1.method6535();
			} else if (arg0 == 47) {
				this.anInt5116 = arg1.method6535();
			} else if (arg0 == 48) {
				this.anInt5081 = arg1.method6535();
			} else if (arg0 == 49) {
				this.anInt5083 = arg1.method6535();
			} else if (arg0 == 50) {
				this.anInt5107 = arg1.method6535();
			} else if (arg0 == 51) {
				this.anInt5111 = arg1.method6535();
			} else if (arg0 == 52) {
				local300 = arg1.method6538();
				this.anIntArray313 = new int[local300];
				this.anIntArray312 = new int[local300];
				for (local310 = 0; local310 < local300; local310++) {
					this.anIntArray312[local310] = arg1.method6535();
					@Pc(322) int local322 = arg1.method6538();
					this.anIntArray313[local310] = local322;
					this.anInt5119 += local322;
				}
			} else if (arg0 == 53) {
				this.aBoolean431 = false;
			} else if (arg0 == 54) {
				this.anInt5098 = arg1.method6538() << 6;
				this.anInt5110 = arg1.method6538() << 6;
			}
		}
	}
}
