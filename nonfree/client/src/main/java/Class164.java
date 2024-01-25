import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class164 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	public int anInt4596 = -1;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
	public int anInt4595 = -1;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public int anInt4598 = -1;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
	public int anInt4600 = -1;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
	public int anInt4609 = -1;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "[I")
	public int[] anIntArray347 = null;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
	public int anInt4612 = 0;

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
	public int anInt4610 = -1;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	public int anInt4599 = -1;

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	public int anInt4619 = -1;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
	public int anInt4618 = 0;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public int anInt4611 = -1;

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
	public int anInt4617 = -1;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
	public int anInt4615 = 0;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
	public int anInt4597 = 0;

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	public int anInt4608 = -1;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	public int anInt4604 = -1;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
	public int anInt4625 = -1;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	public int anInt4607 = -1;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
	public int anInt4606 = -1;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public int anInt4601 = 0;

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
	public int anInt4622 = -1;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
	public int anInt4613 = -1;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
	private int anInt4603 = 0;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
	public boolean aBoolean416 = true;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	public int anInt4602 = -1;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	public int anInt4605 = 0;

	@OriginalMember(owner = "client!mr", name = "S", descriptor = "I")
	public int anInt4634 = -1;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
	public int anInt4623 = 0;

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "I")
	public int anInt4629 = 0;

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
	public int anInt4620 = -1;

	@OriginalMember(owner = "client!mr", name = "R", descriptor = "I")
	public int anInt4633 = -1;

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "I")
	public int anInt4628 = 0;

	@OriginalMember(owner = "client!mr", name = "P", descriptor = "[I")
	public int[] anIntArray348 = null;

	@OriginalMember(owner = "client!mr", name = "V", descriptor = "I")
	public int anInt4636 = -1;

	@OriginalMember(owner = "client!mr", name = "Q", descriptor = "I")
	public int anInt4632 = 0;

	@OriginalMember(owner = "client!mr", name = "N", descriptor = "I")
	public int anInt4630 = -1;

	@OriginalMember(owner = "client!mr", name = "X", descriptor = "I")
	public int anInt4638 = -1;

	@OriginalMember(owner = "client!mr", name = "Y", descriptor = "I")
	public int anInt4639 = 0;

	@OriginalMember(owner = "client!mr", name = "W", descriptor = "I")
	public int anInt4637 = 0;

	@OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
	public int anInt4621 = -1;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	public boolean method3660(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4596) {
			return true;
		} else {
			if (this.anIntArray347 != null) {
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray347.length; local31++) {
					if (this.anIntArray347[local31] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!wm;)V")
	private void method3662(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt4596 = arg1.method2896();
			this.anInt4606 = arg1.method2896();
			if (this.anInt4606 == 65535) {
				this.anInt4606 = -1;
			}
			if (this.anInt4596 == 65535) {
				this.anInt4596 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt4611 = arg1.method2896();
		} else if (arg0 == 3) {
			this.anInt4595 = arg1.method2896();
			return;
		} else if (arg0 == 4) {
			this.anInt4610 = arg1.method2896();
			return;
		} else if (arg0 == 5) {
			this.anInt4620 = arg1.method2896();
			return;
		} else if (arg0 == 6) {
			this.anInt4636 = arg1.method2896();
			return;
		} else if (arg0 == 7) {
			this.anInt4598 = arg1.method2896();
			return;
		} else if (arg0 == 8) {
			this.anInt4609 = arg1.method2896();
			return;
		} else if (arg0 == 9) {
			this.anInt4599 = arg1.method2896();
			return;
		} else if (arg0 == 26) {
			this.anInt4601 = (short) (arg1.method2915() * 4);
			this.anInt4623 = (short) (arg1.method2915() * 4);
			return;
		} else {
			@Pc(137) int local137;
			@Pc(145) int local145;
			if (arg0 == 27) {
				if (this.anIntArrayArray41 == null) {
					this.anIntArrayArray41 = new int[12][];
				}
				local137 = arg1.method2915();
				this.anIntArrayArray41[local137] = new int[6];
				for (local145 = 0; local145 < 6; local145++) {
					this.anIntArrayArray41[local137][local145] = arg1.method2929();
				}
				return;
			}
			if (arg0 == 28) {
				this.anIntArray346 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray346[local137] = arg1.method2915();
					if (this.anIntArray346[local137] == 255) {
						this.anIntArray346[local137] = -1;
					}
				}
				return;
			}
			if (arg0 != 29) {
				if (arg0 == 30) {
					this.anInt4618 = arg1.method2896();
					return;
				}
				if (arg0 != 31) {
					if (arg0 == 32) {
						this.anInt4605 = arg1.method2896();
						return;
					}
					if (arg0 == 33) {
						this.anInt4597 = arg1.method2929();
						return;
					}
					if (arg0 == 34) {
						this.anInt4612 = arg1.method2915();
						return;
					}
					if (arg0 != 35) {
						if (arg0 == 36) {
							this.anInt4637 = arg1.method2929();
							return;
						}
						if (arg0 == 37) {
							this.anInt4622 = arg1.method2915();
							return;
						}
						if (arg0 == 38) {
							this.anInt4602 = arg1.method2896();
							return;
						}
						if (arg0 != 39) {
							if (arg0 == 40) {
								this.anInt4607 = arg1.method2896();
								return;
							}
							if (arg0 != 41) {
								if (arg0 == 42) {
									this.anInt4621 = arg1.method2896();
									return;
								}
								if (arg0 != 43) {
									if (arg0 == 44) {
										this.anInt4600 = arg1.method2896();
										return;
									}
									if (arg0 == 45) {
										this.anInt4633 = arg1.method2896();
										return;
									}
									if (arg0 == 46) {
										this.anInt4630 = arg1.method2896();
										return;
									}
									if (arg0 != 47) {
										if (arg0 == 48) {
											this.anInt4617 = arg1.method2896();
											return;
										}
										if (arg0 != 49) {
											if (arg0 == 50) {
												this.anInt4625 = arg1.method2896();
												return;
											}
											if (arg0 == 51) {
												this.anInt4638 = arg1.method2896();
											} else if (arg0 == 52) {
												local137 = arg1.method2915();
												this.anIntArray347 = new int[local137];
												this.anIntArray348 = new int[local137];
												for (local145 = 0; local145 < local137; local145++) {
													this.anIntArray347[local145] = arg1.method2896();
													@Pc(349) int local349 = arg1.method2915();
													this.anIntArray348[local145] = local349;
													this.anInt4603 += local349;
												}
												return;
											} else if (arg0 == 53) {
												this.aBoolean416 = false;
												return;
											} else if (arg0 == 54) {
												this.anInt4639 = arg1.method2915() << 6;
												this.anInt4615 = arg1.method2915() << 6;
												return;
											}
											return;
										}
										this.anInt4613 = arg1.method2896();
										return;
									}
									this.anInt4604 = arg1.method2896();
									return;
								}
								this.anInt4634 = arg1.method2896();
								return;
							}
							this.anInt4619 = arg1.method2896();
							return;
						}
						this.anInt4608 = arg1.method2896();
						return;
					}
					this.anInt4629 = arg1.method2896();
					return;
				}
				this.anInt4628 = arg1.method2915();
				return;
			}
			this.anInt4632 = arg1.method2915();
			return;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!wm;)V")
	public void method3663(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2915();
			if (local17 == 0) {
				return;
			}
			this.method3662(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)I")
	public int method3665() {
		if (this.anInt4596 != -1) {
			return this.anInt4596;
		} else if (this.anIntArray347 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) ((double) this.anInt4603 * Math.random());
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray348[local24]; local24++) {
				local22 -= this.anIntArray348[local24];
			}
			return this.anIntArray347[local24];
		}
	}
}
