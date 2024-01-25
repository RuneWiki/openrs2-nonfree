import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public int anInt207 = -1;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public int anInt215 = 0;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public int anInt214 = -1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public int anInt204 = -1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public int anInt210 = -1;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public int anInt209 = -1;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public int anInt218 = -1;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	public int anInt222 = -1;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	public int anInt224 = -1;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt217 = -1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	public int anInt225 = 0;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public int anInt208 = -1;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
	public int anInt234 = -1;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public int anInt206 = 0;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	public int anInt230 = -1;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public int anInt212 = -1;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	public int anInt226 = -1;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	public int anInt240 = 0;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
	public int anInt239 = -1;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	public int anInt238 = -1;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
	public int anInt243 = 0;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	private int anInt216 = 0;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
	private int[] anIntArray42 = null;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	public int anInt235 = 0;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
	public int anInt237 = 0;

	@OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
	public int anInt245 = -1;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	public int anInt221 = -1;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt211 = -1;

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
	public int anInt242 = 0;

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
	public int anInt244 = -1;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	public int anInt220 = 0;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "[I")
	private int[] anIntArray43 = null;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
	public int anInt232 = -1;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
	public int anInt228 = 0;

	@OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
	public int anInt246 = -1;

	@OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
	public int anInt247 = -1;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
	public int anInt248 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!tq;)V")
	public void method244(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2380();
			if (local5 == 0) {
				return;
			}
			this.method245(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!tq;I)V")
	private void method245(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt245 = arg1.method2404();
			this.anInt226 = arg1.method2404();
			if (this.anInt245 == 65535) {
				this.anInt245 = -1;
			}
			if (this.anInt226 == 65535) {
				this.anInt226 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt248 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt224 = arg1.method2404();
			return;
		} else if (arg0 == 4) {
			this.anInt208 = arg1.method2404();
			return;
		} else if (arg0 == 5) {
			this.anInt238 = arg1.method2404();
			return;
		} else if (arg0 == 6) {
			this.anInt247 = arg1.method2404();
			return;
		} else if (arg0 == 7) {
			this.anInt211 = arg1.method2404();
			return;
		} else if (arg0 == 8) {
			this.anInt239 = arg1.method2404();
			return;
		} else if (arg0 == 9) {
			this.anInt234 = arg1.method2404();
			return;
		} else if (arg0 == 26) {
			this.anInt237 = (short) (arg1.method2380() * 4);
			this.anInt235 = (short) (arg1.method2380() * 4);
			return;
		} else {
			@Pc(292) int local292;
			@Pc(302) int local302;
			if (arg0 != 27) {
				if (arg0 != 28) {
					if (arg0 == 29) {
						this.anInt242 = arg1.method2380();
						return;
					}
					if (arg0 == 30) {
						this.anInt240 = arg1.method2404();
						return;
					}
					if (arg0 == 31) {
						this.anInt215 = arg1.method2380();
						return;
					}
					if (arg0 == 32) {
						this.anInt228 = arg1.method2404();
						return;
					}
					if (arg0 == 33) {
						this.anInt206 = arg1.method2396();
						return;
					}
					if (arg0 != 34) {
						if (arg0 == 35) {
							this.anInt243 = arg1.method2404();
							return;
						}
						if (arg0 != 36) {
							if (arg0 == 37) {
								this.anInt221 = arg1.method2380();
								return;
							}
							if (arg0 == 38) {
								this.anInt209 = arg1.method2404();
								return;
							}
							if (arg0 == 39) {
								this.anInt232 = arg1.method2404();
								return;
							}
							if (arg0 == 40) {
								this.anInt230 = arg1.method2404();
								return;
							}
							if (arg0 == 41) {
								this.anInt217 = arg1.method2404();
								return;
							}
							if (arg0 == 42) {
								this.anInt246 = arg1.method2404();
								return;
							}
							if (arg0 == 43) {
								arg1.method2404();
								return;
							}
							if (arg0 == 44) {
								this.anInt222 = arg1.method2404();
								return;
							}
							if (arg0 == 45) {
								this.anInt207 = arg1.method2404();
								return;
							}
							if (arg0 != 46) {
								if (arg0 == 47) {
									this.anInt218 = arg1.method2404();
									return;
								}
								if (arg0 != 48) {
									if (arg0 == 49) {
										this.anInt244 = arg1.method2404();
										return;
									}
									if (arg0 != 50) {
										if (arg0 == 51) {
											this.anInt204 = arg1.method2404();
											return;
										}
										if (arg0 == 52) {
											local292 = arg1.method2380();
											this.anIntArray42 = new int[local292];
											this.anIntArray43 = new int[local292];
											for (local302 = 0; local302 < local292; local302++) {
												this.anIntArray42[local302] = arg1.method2404();
												@Pc(315) int local315 = arg1.method2380();
												this.anIntArray43[local302] = local315;
												this.anInt216 += local315;
											}
										} else if (arg0 == 53) {
											this.aBoolean16 = false;
											return;
										}
										return;
									}
									this.anInt210 = arg1.method2404();
									return;
								}
								this.anInt214 = arg1.method2404();
								return;
							}
							this.anInt212 = arg1.method2404();
							return;
						}
						this.anInt220 = arg1.method2396();
						return;
					}
					this.anInt225 = arg1.method2380();
					return;
				}
				this.anIntArray44 = new int[12];
				for (local292 = 0; local292 < 12; local292++) {
					this.anIntArray44[local292] = arg1.method2380();
					if (this.anIntArray44[local292] == 255) {
						this.anIntArray44[local292] = -1;
					}
				}
				return;
			}
			if (this.anIntArrayArray6 == null) {
				this.anIntArrayArray6 = new int[12][];
			}
			local292 = arg1.method2380();
			this.anIntArrayArray6[local292] = new int[6];
			for (local302 = 0; local302 < 6; local302++) {
				this.anIntArrayArray6[local292][local302] = arg1.method2396();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
	public int method246() {
		if (this.anInt245 != -1) {
			return this.anInt245;
		} else if (this.anIntArray42 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) ((double) this.anInt216 * Math.random());
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray43[local32] <= local30; local32++) {
				local30 -= this.anIntArray43[local32];
			}
			return this.anIntArray42[local32];
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Z")
	public boolean method248(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt245) {
			return true;
		} else {
			if (this.anIntArray42 != null) {
				for (@Pc(38) int local38 = 0; local38 < this.anIntArray42.length; local38++) {
					if (arg0 == this.anIntArray42[local38]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method249() {
	}
}
