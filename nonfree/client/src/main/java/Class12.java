import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class12 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!an", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt330 = -1;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public int anInt335 = -1;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	public int anInt332 = 0;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public int anInt331 = -1;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	public int anInt327 = -1;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public int anInt333 = 0;

	@OriginalMember(owner = "client!an", name = "x", descriptor = "I")
	public int anInt342 = -1;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "I")
	public int anInt344 = 0;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "I")
	public int anInt340 = -1;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public int anInt324 = -1;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public int anInt341 = -1;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	public int anInt338 = 0;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public int anInt334 = -1;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt328 = -1;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	public int anInt329 = -1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	public int anInt322 = -1;

	@OriginalMember(owner = "client!an", name = "F", descriptor = "I")
	public int anInt348 = 0;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "I")
	public int anInt339 = 0;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "I")
	public int anInt351 = -1;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "I")
	public int anInt345 = 0;

	@OriginalMember(owner = "client!an", name = "C", descriptor = "I")
	public int anInt346 = -1;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	public int anInt336 = -1;

	@OriginalMember(owner = "client!an", name = "J", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!an", name = "G", descriptor = "I")
	public int anInt349 = -1;

	@OriginalMember(owner = "client!an", name = "L", descriptor = "I")
	public int anInt352 = -1;

	@OriginalMember(owner = "client!an", name = "O", descriptor = "I")
	public int anInt355 = 0;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "I")
	public int anInt326 = 0;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "I")
	public int anInt353 = 0;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	public int anInt337 = 0;

	@OriginalMember(owner = "client!an", name = "y", descriptor = "I")
	public int anInt343 = -1;

	@OriginalMember(owner = "client!an", name = "S", descriptor = "I")
	public int anInt358 = -1;

	@OriginalMember(owner = "client!an", name = "D", descriptor = "[I")
	public int[] anIntArray18 = null;

	@OriginalMember(owner = "client!an", name = "T", descriptor = "I")
	public int anInt359 = 0;

	@OriginalMember(owner = "client!an", name = "U", descriptor = "I")
	public int anInt360 = -1;

	@OriginalMember(owner = "client!an", name = "V", descriptor = "I")
	public int anInt361 = -1;

	@OriginalMember(owner = "client!an", name = "Y", descriptor = "I")
	public int anInt364 = -1;

	@OriginalMember(owner = "client!an", name = "Q", descriptor = "[I")
	public int[] anIntArray19 = null;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "I")
	public int anInt354 = -1;

	@OriginalMember(owner = "client!an", name = "Z", descriptor = "I")
	private int anInt365 = 0;

	@OriginalMember(owner = "client!an", name = "W", descriptor = "I")
	public int anInt362 = -1;

	@OriginalMember(owner = "client!an", name = "X", descriptor = "I")
	public int anInt363 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!md;)V")
	private void method222(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt358 = arg1.method3711();
			this.anInt346 = arg1.method3711();
			if (this.anInt346 == 65535) {
				this.anInt346 = -1;
			}
			if (this.anInt358 == 65535) {
				this.anInt358 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt335 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt364 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt322 = arg1.method3711();
		} else if (arg0 == 5) {
			this.anInt351 = arg1.method3711();
		} else if (arg0 == 6) {
			this.anInt334 = arg1.method3711();
		} else if (arg0 == 7) {
			this.anInt330 = arg1.method3711();
		} else if (arg0 == 8) {
			this.anInt361 = arg1.method3711();
		} else if (arg0 == 9) {
			this.anInt336 = arg1.method3711();
		} else if (arg0 == 26) {
			this.anInt332 = (short) (arg1.method3737() * 4);
			this.anInt348 = (short) (arg1.method3737() * 4);
		} else {
			@Pc(111) int local111;
			@Pc(119) int local119;
			if (arg0 == 27) {
				if (this.anIntArrayArray2 == null) {
					this.anIntArrayArray2 = new int[12][];
				}
				local111 = arg1.method3737();
				this.anIntArrayArray2[local111] = new int[6];
				for (local119 = 0; local119 < 6; local119++) {
					this.anIntArrayArray2[local111][local119] = arg1.method3701();
				}
			} else if (arg0 == 28) {
				this.anIntArray17 = new int[12];
				for (local111 = 0; local111 < 12; local111++) {
					this.anIntArray17[local111] = arg1.method3737();
					if (this.anIntArray17[local111] == 255) {
						this.anIntArray17[local111] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt338 = arg1.method3737();
			} else if (arg0 == 30) {
				this.anInt345 = arg1.method3711();
			} else if (arg0 == 31) {
				this.anInt359 = arg1.method3737();
			} else if (arg0 == 32) {
				this.anInt326 = arg1.method3711();
			} else if (arg0 == 33) {
				this.anInt337 = arg1.method3701();
			} else if (arg0 == 34) {
				this.anInt333 = arg1.method3737();
			} else if (arg0 == 35) {
				this.anInt353 = arg1.method3711();
			} else if (arg0 == 36) {
				this.anInt355 = arg1.method3701();
			} else if (arg0 == 37) {
				this.anInt349 = arg1.method3737();
			} else if (arg0 == 38) {
				this.anInt331 = arg1.method3711();
			} else if (arg0 == 39) {
				this.anInt342 = arg1.method3711();
			} else if (arg0 == 40) {
				this.anInt360 = arg1.method3711();
			} else if (arg0 == 41) {
				this.anInt363 = arg1.method3711();
			} else if (arg0 == 42) {
				this.anInt352 = arg1.method3711();
			} else if (arg0 == 43) {
				this.anInt329 = arg1.method3711();
			} else if (arg0 == 44) {
				this.anInt341 = arg1.method3711();
			} else if (arg0 == 45) {
				this.anInt354 = arg1.method3711();
			} else if (arg0 == 46) {
				this.anInt343 = arg1.method3711();
			} else if (arg0 == 47) {
				this.anInt324 = arg1.method3711();
			} else if (arg0 == 48) {
				this.anInt340 = arg1.method3711();
			} else if (arg0 == 49) {
				this.anInt327 = arg1.method3711();
			} else if (arg0 == 50) {
				this.anInt362 = arg1.method3711();
			} else if (arg0 == 51) {
				this.anInt328 = arg1.method3711();
			} else if (arg0 == 52) {
				local111 = arg1.method3737();
				this.anIntArray19 = new int[local111];
				this.anIntArray18 = new int[local111];
				for (local119 = 0; local119 < local111; local119++) {
					this.anIntArray19[local119] = arg1.method3711();
					@Pc(353) int local353 = arg1.method3737();
					this.anIntArray18[local119] = local353;
					this.anInt365 += local353;
				}
			} else if (arg0 == 53) {
				this.aBoolean32 = false;
			} else if (arg0 == 54) {
				this.anInt339 = arg1.method3737() << 6;
				this.anInt344 = arg1.method3737() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
	public int method223() {
		if (this.anInt358 != -1) {
			return this.anInt358;
		} else if (this.anIntArray19 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) ((double) this.anInt365 * Math.random());
			@Pc(31) int local31;
			for (local31 = 0; this.anIntArray18[local31] <= local29; local31++) {
				local29 -= this.anIntArray18[local31];
			}
			return this.anIntArray19[local31];
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!md;B)V")
	public void method224(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method222(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Z")
	public boolean method225(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt358) {
			return true;
		} else {
			if (this.anIntArray19 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray19.length; local27++) {
					if (arg0 == this.anIntArray19[local27]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
