import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class311 {

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
	public int[] anIntArray609;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "[I")
	public int[] anIntArray610;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "[Lclient!bca;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public int anInt9381 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public int anInt9376 = 0;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public int anInt9383 = -1;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
	public int[] anIntArray611 = null;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public int anInt9379 = 0;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	public int anInt9393 = -1;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public int anInt9388 = -1;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	public int anInt9382 = -1;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public int anInt9390 = -1;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public int anInt9386 = -1;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public int anInt9392 = -1;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
	public int anInt9399 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public int anInt9384 = 0;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public int anInt9387 = 0;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt9385 = -1;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "[I")
	public int[] anIntArray612 = null;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public int anInt9389 = -1;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	public int anInt9402 = 0;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	public int anInt9396 = -1;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
	public int anInt9404 = -1;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	public int anInt9395 = 0;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	public int anInt9397 = -1;

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	public int anInt9407 = 0;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
	public int anInt9405 = -1;

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
	public int anInt9410 = -1;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
	public int anInt9409 = 0;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public int anInt9380 = -1;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
	private int anInt9398 = 0;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
	public boolean aBoolean669 = true;

	@OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
	public int anInt9415 = 0;

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
	public int anInt9406 = -1;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	public int anInt9401 = -1;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
	private final int anInt9408 = -1;

	@OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
	public int anInt9416 = -1;

	@OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
	public int anInt9414 = -1;

	@OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
	public int anInt9413 = 0;

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
	public int anInt9412 = -1;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	public int anInt9394 = -1;

	@OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
	public int anInt9419 = -1;

	@OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
	public int anInt9418 = -1;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	public int anInt9403 = 0;

	@OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
	public int anInt9422 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ha;I)[Lclient!bca;")
	public Class30[] method7835(@OriginalArg(0) Class20 arg0) {
		if (this.aClass30Array1 != null && this.anInt9408 == arg0.anInt8557) {
			return this.aClass30Array1;
		} else if (this.anIntArrayArray52 == null) {
			return null;
		} else {
			this.aClass30Array1 = new Class30[this.anIntArrayArray52.length];
			for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray52.length; local33++) {
				@Pc(37) int local37 = 0;
				@Pc(39) int local39 = 0;
				@Pc(41) int local41 = 0;
				@Pc(43) int local43 = 0;
				@Pc(45) int local45 = 0;
				@Pc(47) int local47 = 0;
				if (this.anIntArrayArray52[local33] != null) {
					local39 = this.anIntArrayArray52[local33][1];
					local41 = this.anIntArrayArray52[local33][2];
					local43 = this.anIntArrayArray52[local33][3] << 3;
					local37 = this.anIntArrayArray52[local33][0];
					local45 = this.anIntArrayArray52[local33][4] << 3;
					local47 = this.anIntArrayArray52[local33][5] << 3;
				}
				if (local37 != 0 || local39 != 0 || local41 != 0 || local43 != 0 || local45 != 0 || local47 != 0) {
					@Pc(123) Class30 local123 = this.aClass30Array1[local33] = arg0.method7257();
					if (local47 != 0) {
						local123.method4663(local47);
					}
					if (local43 != 0) {
						local123.method4655(local43);
					}
					if (local45 != 0) {
						local123.method4651(local45);
					}
					local123.method4646(local37, local39, local41);
				}
			}
			return this.aClass30Array1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method7837(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method7839(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
	public int method7838() {
		if (this.anInt9388 != -1) {
			return this.anInt9388;
		} else if (this.anIntArray611 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) ((double) this.anInt9398 * Math.random());
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray612[local24]; local24++) {
				local22 -= this.anIntArray612[local24];
			}
			return this.anIntArray611[local24];
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!cea;II)V")
	private void method7839(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9388 = arg0.method8326();
			this.anInt9416 = arg0.method8326();
			if (this.anInt9416 == 65535) {
				this.anInt9416 = -1;
			}
			if (this.anInt9388 == 65535) {
				this.anInt9388 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt9406 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt9394 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt9422 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt9412 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt9389 = arg0.method8326();
		} else if (arg1 == 7) {
			this.anInt9390 = arg0.method8326();
		} else if (arg1 == 8) {
			this.anInt9385 = arg0.method8326();
		} else if (arg1 == 9) {
			this.anInt9414 = arg0.method8326();
		} else if (arg1 == 26) {
			this.anInt9399 = (short) (arg0.method8383() * 4);
			this.anInt9407 = (short) (arg0.method8383() * 4);
		} else {
			@Pc(111) int local111;
			@Pc(119) int local119;
			if (arg1 == 27) {
				if (this.anIntArrayArray52 == null) {
					this.anIntArrayArray52 = new int[12][];
				}
				local111 = arg0.method8383();
				this.anIntArrayArray52[local111] = new int[6];
				for (local119 = 0; local119 < 6; local119++) {
					this.anIntArrayArray52[local111][local119] = arg0.method8368();
				}
			} else if (arg1 == 28) {
				this.anIntArray609 = new int[12];
				for (local111 = 0; local111 < 12; local111++) {
					this.anIntArray609[local111] = arg0.method8383();
					if (this.anIntArray609[local111] == 255) {
						this.anIntArray609[local111] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt9413 = arg0.method8383();
			} else if (arg1 == 30) {
				this.anInt9387 = arg0.method8326();
			} else if (arg1 == 31) {
				this.anInt9376 = arg0.method8383();
			} else if (arg1 == 32) {
				this.anInt9402 = arg0.method8326();
			} else if (arg1 == 33) {
				this.anInt9415 = arg0.method8368();
			} else if (arg1 == 34) {
				this.anInt9403 = arg0.method8383();
			} else if (arg1 == 35) {
				this.anInt9379 = arg0.method8326();
			} else if (arg1 == 36) {
				this.anInt9395 = arg0.method8368();
			} else if (arg1 == 37) {
				this.anInt9410 = arg0.method8383();
			} else if (arg1 == 38) {
				this.anInt9386 = arg0.method8326();
			} else if (arg1 == 39) {
				this.anInt9392 = arg0.method8326();
			} else if (arg1 == 40) {
				this.anInt9405 = arg0.method8326();
			} else if (arg1 == 41) {
				this.anInt9404 = arg0.method8326();
			} else if (arg1 == 42) {
				this.anInt9419 = arg0.method8326();
			} else if (arg1 == 43) {
				this.anInt9382 = arg0.method8326();
			} else if (arg1 == 44) {
				this.anInt9393 = arg0.method8326();
			} else if (arg1 == 45) {
				this.anInt9397 = arg0.method8326();
			} else if (arg1 == 46) {
				this.anInt9381 = arg0.method8326();
			} else if (arg1 == 47) {
				this.anInt9396 = arg0.method8326();
			} else if (arg1 == 48) {
				this.anInt9380 = arg0.method8326();
			} else if (arg1 == 49) {
				this.anInt9383 = arg0.method8326();
			} else if (arg1 == 50) {
				this.anInt9401 = arg0.method8326();
			} else if (arg1 == 51) {
				this.anInt9418 = arg0.method8326();
			} else if (arg1 == 52) {
				local111 = arg0.method8383();
				this.anIntArray611 = new int[local111];
				this.anIntArray612 = new int[local111];
				for (local119 = 0; local119 < local111; local119++) {
					this.anIntArray611[local119] = arg0.method8326();
					@Pc(346) int local346 = arg0.method8383();
					this.anIntArray612[local119] = local346;
					this.anInt9398 += local346;
				}
			} else if (arg1 == 53) {
				this.aBoolean669 = false;
			} else if (arg1 == 54) {
				this.anInt9384 = arg0.method8383() << 6;
				this.anInt9409 = arg0.method8383() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray610 == null) {
					this.anIntArray610 = new int[12];
				}
				local111 = arg0.method8383();
				this.anIntArray610[local111] = arg0.method8326();
			} else if (arg1 == 56) {
				if (this.anIntArrayArray51 == null) {
					this.anIntArrayArray51 = new int[12][];
				}
				local111 = arg0.method8383();
				this.anIntArrayArray51[local111] = new int[3];
				for (local119 = 0; local119 < 3; local119++) {
					this.anIntArrayArray51[local111][local119] = arg0.method8368();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public boolean method7840(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt9388) {
			return true;
		} else {
			if (this.anIntArray611 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray611.length; local34++) {
					if (arg0 == this.anIntArray611[local34]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
