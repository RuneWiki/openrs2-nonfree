import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class120 {

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	public int anInt2867 = -1;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt2875 = 0;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt2876 = -1;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private int anInt2880 = 0;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
	public int anInt2884 = -1;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	public int anInt2882 = -1;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public int anInt2872 = 0;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public int anInt2870 = -1;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public int anInt2883 = 0;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
	public int anInt2894 = 0;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public int anInt2879 = 0;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public int anInt2873 = -1;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
	public int anInt2893 = -1;

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
	public int anInt2902 = -1;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
	public int anInt2898 = 0;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	public int anInt2887 = -1;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	public int[] anIntArray329 = null;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt2885 = -1;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	public int anInt2886 = -1;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
	public int anInt2890 = 0;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	public int anInt2889 = 0;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	public int anInt2868 = -1;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
	public int anInt2891 = -1;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
	public int anInt2897 = -1;

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "[I")
	public int[] anIntArray331 = null;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
	public int anInt2896 = -1;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public int anInt2899 = 0;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public int anInt2874 = -1;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
	public int anInt2900 = -1;

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
	public int anInt2904 = -1;

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
	public int anInt2905 = -1;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	public int anInt2871 = -1;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	public int anInt2895 = -1;

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
	public int anInt2907 = -1;

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
	public int anInt2892 = 0;

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
	public int anInt2906 = -1;

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
	public int anInt2903 = -1;

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
	public int anInt2908 = 0;

	@OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
	public int anInt2909 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Z")
	public boolean method2395(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt2886 == arg0) {
			return true;
		} else {
			if (this.anIntArray331 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray331.length; local29++) {
					if (this.anIntArray331[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
	public int method2397() {
		if (this.anInt2886 != -1) {
			return this.anInt2886;
		} else if (this.anIntArray331 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) ((double) this.anInt2880 * Math.random());
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray329[local31]; local31++) {
				local29 -= this.anIntArray329[local31];
			}
			return this.anIntArray331[local31];
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method2398(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method2399(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!dga;II)V")
	private void method2399(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2886 = arg0.method6006();
			this.anInt2903 = arg0.method6006();
			if (this.anInt2903 == 65535) {
				this.anInt2903 = -1;
			}
			if (this.anInt2886 == 65535) {
				this.anInt2886 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt2909 = arg0.method6006();
			return;
		} else if (arg1 == 3) {
			this.anInt2867 = arg0.method6006();
			return;
		} else if (arg1 == 4) {
			this.anInt2902 = arg0.method6006();
		} else if (arg1 == 5) {
			this.anInt2870 = arg0.method6006();
			return;
		} else if (arg1 == 6) {
			this.anInt2874 = arg0.method6006();
			return;
		} else if (arg1 == 7) {
			this.anInt2905 = arg0.method6006();
			return;
		} else if (arg1 == 8) {
			this.anInt2882 = arg0.method6006();
			return;
		} else if (arg1 == 9) {
			this.anInt2904 = arg0.method6006();
			return;
		} else if (arg1 == 26) {
			this.anInt2894 = (short) (arg0.method6041() * 4);
			this.anInt2899 = (short) (arg0.method6041() * 4);
			return;
		} else {
			@Pc(128) int local128;
			@Pc(364) int local364;
			if (arg1 != 27) {
				if (arg1 == 28) {
					this.anIntArray330 = new int[12];
					for (local128 = 0; local128 < 12; local128++) {
						this.anIntArray330[local128] = arg0.method6041();
						if (this.anIntArray330[local128] == 255) {
							this.anIntArray330[local128] = -1;
						}
					}
					return;
				}
				if (arg1 == 29) {
					this.anInt2889 = arg0.method6041();
					return;
				}
				if (arg1 != 30) {
					if (arg1 == 31) {
						this.anInt2883 = arg0.method6041();
						return;
					}
					if (arg1 == 32) {
						this.anInt2865 = arg0.method6006();
						return;
					}
					if (arg1 == 33) {
						this.anInt2892 = arg0.method6008();
						return;
					}
					if (arg1 == 34) {
						this.anInt2898 = arg0.method6041();
						return;
					}
					if (arg1 == 35) {
						this.anInt2872 = arg0.method6006();
						return;
					}
					if (arg1 == 36) {
						this.anInt2879 = arg0.method6008();
						return;
					}
					if (arg1 == 37) {
						this.anInt2900 = arg0.method6041();
						return;
					}
					if (arg1 == 38) {
						this.anInt2873 = arg0.method6006();
						return;
					}
					if (arg1 == 39) {
						this.anInt2884 = arg0.method6006();
						return;
					}
					if (arg1 == 40) {
						this.anInt2893 = arg0.method6006();
						return;
					}
					if (arg1 == 41) {
						this.anInt2868 = arg0.method6006();
						return;
					}
					if (arg1 != 42) {
						if (arg1 == 43) {
							this.anInt2897 = arg0.method6006();
							return;
						}
						if (arg1 != 44) {
							if (arg1 == 45) {
								this.anInt2876 = arg0.method6006();
								return;
							}
							if (arg1 != 46) {
								if (arg1 == 47) {
									this.anInt2891 = arg0.method6006();
									return;
								}
								if (arg1 != 48) {
									if (arg1 == 49) {
										this.anInt2895 = arg0.method6006();
										return;
									}
									if (arg1 == 50) {
										this.anInt2906 = arg0.method6006();
										return;
									}
									if (arg1 == 51) {
										this.anInt2907 = arg0.method6006();
										return;
									}
									if (arg1 == 52) {
										local128 = arg0.method6041();
										this.anIntArray329 = new int[local128];
										this.anIntArray331 = new int[local128];
										for (local364 = 0; local364 < local128; local364++) {
											this.anIntArray331[local364] = arg0.method6006();
											@Pc(377) int local377 = arg0.method6041();
											this.anIntArray329[local364] = local377;
											this.anInt2880 += local377;
										}
									} else if (arg1 == 53) {
										this.aBoolean191 = false;
										return;
									} else if (arg1 == 54) {
										this.anInt2890 = arg0.method6041() << 6;
										this.anInt2875 = arg0.method6041() << 6;
										return;
									}
									return;
								}
								this.anInt2887 = arg0.method6006();
								return;
							}
							this.anInt2871 = arg0.method6006();
							return;
						}
						this.anInt2896 = arg0.method6006();
						return;
					}
					this.anInt2885 = arg0.method6006();
					return;
				}
				this.anInt2908 = arg0.method6006();
				return;
			}
			if (this.anIntArrayArray38 == null) {
				this.anIntArrayArray38 = new int[12][];
			}
			local128 = arg0.method6041();
			this.anIntArrayArray38[local128] = new int[6];
			for (local364 = 0; local364 < 6; local364++) {
				this.anIntArrayArray38[local128][local364] = arg0.method6008();
			}
			return;
		}
	}
}
