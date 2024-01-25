import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class36 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public int anInt662 = -1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public int anInt665 = -1;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public int anInt661 = 0;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
	public boolean aBoolean35 = true;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt672 = -1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt670 = 0;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	public int anInt676 = -1;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt667 = -1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public int anInt660 = -1;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public int anInt679 = 0;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public int anInt668 = 0;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public int anInt664 = -1;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt671 = 0;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
	public int anInt683 = -1;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public int anInt678 = 0;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	public int anInt685 = -1;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt675 = -1;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public int anInt673 = 0;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "[I")
	public int[] anIntArray63 = null;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt680 = -1;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	public int anInt691 = -1;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	public int anInt692 = 0;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	public int anInt693 = -1;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public int anInt682 = -1;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "[I")
	public int[] anIntArray66 = null;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public int anInt659 = -1;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	public int anInt688 = 0;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	public int anInt684 = -1;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
	public int anInt694 = -1;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
	public int anInt690 = 0;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt669 = 0;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
	public int anInt696 = -1;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	public int anInt697 = -1;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	public int anInt700 = -1;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
	public int anInt698 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	public boolean method617(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt682 == arg0) {
			return true;
		} else {
			if (this.anIntArray63 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray63.length; local25++) {
					if (this.anIntArray63[local25] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public int method618() {
		if (this.anInt682 != -1) {
			return this.anInt682;
		} else if (this.anIntArray63 == null) {
			return -1;
		} else {
			@Pc(37) int local37 = (int) ((double) this.anInt670 * Math.random());
			@Pc(39) int local39;
			for (local39 = 0; local37 >= this.anIntArray66[local39]; local39++) {
				local37 -= this.anIntArray66[local39];
			}
			return this.anIntArray63[local39];
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method620(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2739();
			if (local17 == 0) {
				return;
			}
			this.method621(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!rp;)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt682 = arg1.method2767();
			this.anInt663 = arg1.method2767();
			if (this.anInt682 == 65535) {
				this.anInt682 = -1;
			}
			if (this.anInt663 == 65535) {
				this.anInt663 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt686 = arg1.method2767();
		} else if (arg0 == 3) {
			this.anInt664 = arg1.method2767();
			return;
		} else if (arg0 == 4) {
			this.anInt697 = arg1.method2767();
			return;
		} else if (arg0 == 5) {
			this.anInt685 = arg1.method2767();
			return;
		} else if (arg0 == 6) {
			this.anInt684 = arg1.method2767();
			return;
		} else if (arg0 == 7) {
			this.anInt665 = arg1.method2767();
			return;
		} else if (arg0 == 8) {
			this.anInt659 = arg1.method2767();
			return;
		} else if (arg0 == 9) {
			this.anInt696 = arg1.method2767();
			return;
		} else if (arg0 == 26) {
			this.anInt678 = (short) (arg1.method2739() * 4);
			this.anInt673 = (short) (arg1.method2739() * 4);
			return;
		} else {
			@Pc(285) int local285;
			@Pc(295) int local295;
			if (arg0 != 27) {
				if (arg0 != 28) {
					if (arg0 == 29) {
						this.anInt688 = arg1.method2739();
						return;
					}
					if (arg0 != 30) {
						if (arg0 == 31) {
							this.anInt661 = arg1.method2739();
							return;
						}
						if (arg0 == 32) {
							this.anInt679 = arg1.method2767();
							return;
						}
						if (arg0 == 33) {
							this.anInt669 = arg1.method2740();
							return;
						}
						if (arg0 == 34) {
							this.anInt690 = arg1.method2739();
							return;
						}
						if (arg0 == 35) {
							this.anInt692 = arg1.method2767();
							return;
						}
						if (arg0 == 36) {
							this.anInt671 = arg1.method2740();
							return;
						}
						if (arg0 == 37) {
							this.anInt687 = arg1.method2739();
							return;
						}
						if (arg0 != 38) {
							if (arg0 == 39) {
								this.anInt660 = arg1.method2767();
								return;
							}
							if (arg0 == 40) {
								this.anInt693 = arg1.method2767();
								return;
							}
							if (arg0 == 41) {
								this.anInt662 = arg1.method2767();
								return;
							}
							if (arg0 != 42) {
								if (arg0 == 43) {
									this.anInt683 = arg1.method2767();
									return;
								}
								if (arg0 != 44) {
									if (arg0 == 45) {
										this.anInt672 = arg1.method2767();
										return;
									}
									if (arg0 == 46) {
										this.anInt666 = arg1.method2767();
										return;
									}
									if (arg0 == 47) {
										this.anInt698 = arg1.method2767();
										return;
									}
									if (arg0 != 48) {
										if (arg0 == 49) {
											this.anInt675 = arg1.method2767();
											return;
										}
										if (arg0 != 50) {
											if (arg0 == 51) {
												this.anInt691 = arg1.method2767();
												return;
											}
											if (arg0 == 52) {
												local285 = arg1.method2739();
												this.anIntArray63 = new int[local285];
												this.anIntArray66 = new int[local285];
												for (local295 = 0; local295 < local285; local295++) {
													this.anIntArray63[local295] = arg1.method2767();
													@Pc(308) int local308 = arg1.method2739();
													this.anIntArray66[local295] = local308;
													this.anInt670 += local308;
												}
											} else if (arg0 == 53) {
												this.aBoolean35 = false;
												return;
											}
											return;
										}
										this.anInt667 = arg1.method2767();
										return;
									}
									this.anInt676 = arg1.method2767();
									return;
								}
								this.anInt694 = arg1.method2767();
								return;
							}
							this.anInt700 = arg1.method2767();
							return;
						}
						this.anInt680 = arg1.method2767();
						return;
					}
					this.anInt668 = arg1.method2767();
					return;
				}
				this.anIntArray64 = new int[12];
				for (local285 = 0; local285 < 12; local285++) {
					this.anIntArray64[local285] = arg1.method2739();
					if (this.anIntArray64[local285] == 255) {
						this.anIntArray64[local285] = -1;
					}
				}
				return;
			}
			if (this.anIntArrayArray6 == null) {
				this.anIntArrayArray6 = new int[12][];
			}
			local285 = arg1.method2739();
			this.anIntArrayArray6[local285] = new int[6];
			for (local295 = 0; local295 < 6; local295++) {
				this.anIntArrayArray6[local285][local295] = arg1.method2740();
			}
			return;
		}
	}
}
