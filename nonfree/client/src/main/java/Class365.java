import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class365 {

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!wu", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray203;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	public int anInt9724 = -1;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	public int anInt9728 = -1;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public int anInt9725 = -1;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
	public int anInt9738 = 0;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	public int anInt9721 = 0;

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
	public int anInt9736 = -1;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	public int anInt9739 = -1;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	public int anInt9734 = -1;

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
	public int anInt9741 = -1;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	public int anInt9735 = 0;

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
	public int anInt9747 = -1;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public int anInt9742 = -1;

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
	public int anInt9746 = -1;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "Z")
	public boolean aBoolean767 = true;

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "I")
	public int anInt9749 = 0;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public int anInt9733 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public int anInt9718 = -1;

	@OriginalMember(owner = "client!wu", name = "M", descriptor = "I")
	public int anInt9753 = 0;

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
	private int anInt9750 = 0;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
	public int anInt9720 = 0;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public int anInt9722 = -1;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
	public int anInt9727 = -1;

	@OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
	public int anInt9755 = -1;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	public int anInt9723 = 0;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
	public int anInt9743 = 0;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
	public int anInt9740 = 0;

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
	public int anInt9744 = -1;

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
	public int anInt9751 = 0;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	public int anInt9730 = -1;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
	public int anInt9726 = -1;

	@OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
	public int anInt9752 = -1;

	@OriginalMember(owner = "client!wu", name = "U", descriptor = "I")
	public int anInt9759 = -1;

	@OriginalMember(owner = "client!wu", name = "O", descriptor = "[I")
	public int[] anIntArray642 = null;

	@OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
	public int anInt9757 = -1;

	@OriginalMember(owner = "client!wu", name = "T", descriptor = "I")
	public int anInt9758 = -1;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	public int anInt9729 = -1;

	@OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
	public int anInt9754 = 0;

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "[I")
	public int[] anIntArray643 = null;

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
	public int anInt9756 = -1;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
	public int anInt9731 = 0;

	@OriginalMember(owner = "client!wu", name = "W", descriptor = "I")
	public int anInt9761 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!np;II)V")
	private void method7939(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9741 = arg0.method5198();
			this.anInt9724 = arg0.method5198();
			if (this.anInt9724 == 65535) {
				this.anInt9724 = -1;
			}
			if (this.anInt9741 == 65535) {
				this.anInt9741 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt9747 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt9730 = arg0.method5198();
			return;
		} else if (arg1 == 4) {
			this.anInt9729 = arg0.method5198();
			return;
		} else if (arg1 == 5) {
			this.anInt9728 = arg0.method5198();
			return;
		} else if (arg1 == 6) {
			this.anInt9746 = arg0.method5198();
			return;
		} else if (arg1 == 7) {
			this.anInt9727 = arg0.method5198();
			return;
		} else if (arg1 == 8) {
			this.anInt9761 = arg0.method5198();
			return;
		} else if (arg1 == 9) {
			this.anInt9733 = arg0.method5198();
			return;
		} else if (arg1 == 26) {
			this.anInt9753 = (short) (arg0.method5175() * 4);
			this.anInt9743 = (short) (arg0.method5175() * 4);
			return;
		} else {
			@Pc(313) int local313;
			@Pc(323) int local323;
			if (arg1 != 27) {
				if (arg1 != 28) {
					if (arg1 == 29) {
						this.anInt9738 = arg0.method5175();
						return;
					}
					if (arg1 == 30) {
						this.anInt9720 = arg0.method5198();
						return;
					}
					if (arg1 == 31) {
						this.anInt9740 = arg0.method5175();
						return;
					}
					if (arg1 != 32) {
						if (arg1 == 33) {
							this.anInt9754 = arg0.method5231();
							return;
						}
						if (arg1 == 34) {
							this.anInt9723 = arg0.method5175();
							return;
						}
						if (arg1 == 35) {
							this.anInt9749 = arg0.method5198();
							return;
						}
						if (arg1 == 36) {
							this.anInt9721 = arg0.method5231();
							return;
						}
						if (arg1 == 37) {
							this.anInt9718 = arg0.method5175();
							return;
						}
						if (arg1 == 38) {
							this.anInt9755 = arg0.method5198();
							return;
						}
						if (arg1 == 39) {
							this.anInt9739 = arg0.method5198();
							return;
						}
						if (arg1 != 40) {
							if (arg1 == 41) {
								this.anInt9758 = arg0.method5198();
								return;
							}
							if (arg1 == 42) {
								this.anInt9756 = arg0.method5198();
								return;
							}
							if (arg1 == 43) {
								this.anInt9725 = arg0.method5198();
								return;
							}
							if (arg1 != 44) {
								if (arg1 == 45) {
									this.anInt9759 = arg0.method5198();
									return;
								}
								if (arg1 != 46) {
									if (arg1 == 47) {
										this.anInt9722 = arg0.method5198();
										return;
									}
									if (arg1 == 48) {
										this.anInt9757 = arg0.method5198();
										return;
									}
									if (arg1 == 49) {
										this.anInt9742 = arg0.method5198();
										return;
									}
									if (arg1 != 50) {
										if (arg1 == 51) {
											this.anInt9726 = arg0.method5198();
											return;
										}
										if (arg1 == 52) {
											local313 = arg0.method5175();
											this.anIntArray642 = new int[local313];
											this.anIntArray643 = new int[local313];
											for (local323 = 0; local323 < local313; local323++) {
												this.anIntArray643[local323] = arg0.method5198();
												@Pc(336) int local336 = arg0.method5175();
												this.anIntArray642[local323] = local336;
												this.anInt9750 += local336;
											}
										} else if (arg1 == 53) {
											this.aBoolean767 = false;
											return;
										} else if (arg1 == 54) {
											this.anInt9751 = arg0.method5175() << 6;
											this.anInt9731 = arg0.method5175() << 6;
											return;
										}
										return;
									}
									this.anInt9744 = arg0.method5198();
									return;
								}
								this.anInt9734 = arg0.method5198();
								return;
							}
							this.anInt9752 = arg0.method5198();
							return;
						}
						this.anInt9736 = arg0.method5198();
						return;
					}
					this.anInt9735 = arg0.method5198();
					return;
				}
				this.anIntArray641 = new int[12];
				for (local313 = 0; local313 < 12; local313++) {
					this.anIntArray641[local313] = arg0.method5175();
					if (this.anIntArray641[local313] == 255) {
						this.anIntArray641[local313] = -1;
					}
				}
				return;
			}
			if (this.anIntArrayArray203 == null) {
				this.anIntArrayArray203 = new int[12][];
			}
			local313 = arg0.method5175();
			this.anIntArrayArray203[local313] = new int[6];
			for (local323 = 0; local323 < 6; local323++) {
				this.anIntArrayArray203[local313][local323] = arg0.method5231();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Z")
	public boolean method7940(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt9741 == arg0) {
			return true;
		} else {
			if (this.anIntArray643 != null) {
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray643.length; local33++) {
					if (this.anIntArray643[local33] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	public int method7941() {
		if (this.anInt9741 != -1) {
			return this.anInt9741;
		} else if (this.anIntArray643 == null) {
			return -1;
		} else {
			@Pc(24) int local24 = (int) ((double) this.anInt9750 * Math.random());
			@Pc(26) int local26;
			for (local26 = 0; this.anIntArray642[local26] <= local24; local26++) {
				local24 -= this.anIntArray642[local26];
			}
			return this.anIntArray643[local26];
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!np;B)V")
	public void method7942(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method7939(arg0, local9);
		}
	}
}
