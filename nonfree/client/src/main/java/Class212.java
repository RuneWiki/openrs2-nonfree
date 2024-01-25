import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class212 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public int anInt5972;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	public int anInt5975;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public int anInt5976;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "Lclient!qp;")
	public Class195 aClass195_4;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	public int anInt5978;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "I")
	public int anInt5989;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "I")
	private int anInt5991;

	@OriginalMember(owner = "client!so", name = "A", descriptor = "I")
	private int anInt5992;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Lclient!wb;")
	private Class243 aClass243_27;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!so", name = "S", descriptor = "I")
	public int anInt6003;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "I")
	public int anInt5982 = -1;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "I")
	public int anInt5985 = -1;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	private int anInt5984 = -1;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	private int anInt5988 = -1;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	private int anInt5981 = -1;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "Z")
	public boolean aBoolean438 = true;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "I")
	public int anInt5994 = -1;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public int anInt5980 = -1;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "Z")
	public boolean aBoolean439 = true;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	public int anInt5996 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	public int anInt5999 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	public int anInt5997 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	public int anInt5993 = 0;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "I")
	private int anInt5983 = -1;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	private int anInt5987 = -1;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
	public boolean aBoolean440 = false;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "I")
	public int anInt6004 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!so", name = "W", descriptor = "Z")
	public boolean aBoolean441 = true;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray36 = new String[5];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	public void method5238() {
		if (this.anIntArray522 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray522.length; local6 += 2) {
			if (this.anIntArray522[local6] < this.anInt5996) {
				this.anInt5996 = this.anIntArray522[local6];
			} else if (this.anIntArray522[local6] > this.anInt5999) {
				this.anInt5999 = this.anIntArray522[local6];
			}
			if (this.anInt6004 > this.anIntArray522[local6 + 1]) {
				this.anInt6004 = this.anIntArray522[local6 + 1];
			} else if (this.anIntArray522[local6 + 1] > this.anInt5997) {
				this.anInt5997 = this.anIntArray522[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method5239(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5994 = arg0.method5753();
		} else if (arg1 == 2) {
			this.anInt5982 = arg0.method5753();
		} else if (arg1 == 3) {
			this.aString58 = arg0.method5744();
		} else if (arg1 == 4) {
			this.anInt5972 = arg0.method5736();
		} else if (arg1 == 5) {
			this.anInt5980 = arg0.method5736();
			return;
		} else if (arg1 == 6) {
			this.anInt5993 = arg0.method5732();
			return;
		} else {
			@Pc(92) int local92;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean441 = arg0.method5732() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt5984 = arg0.method5753();
					if (this.anInt5984 == 65535) {
						this.anInt5984 = -1;
					}
					this.anInt5983 = arg0.method5753();
					if (this.anInt5983 == 65535) {
						this.anInt5983 = -1;
					}
					this.anInt5974 = arg0.method5776();
					this.anInt5991 = arg0.method5776();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray36[arg1 - 10] = arg0.method5744();
					return;
				}
				@Pc(100) int local100;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt5988 = arg0.method5753();
								return;
							}
							if (arg1 != 19) {
								if (arg1 == 20) {
									this.anInt5987 = arg0.method5753();
									if (this.anInt5987 == 65535) {
										this.anInt5987 = -1;
									}
									this.anInt5981 = arg0.method5753();
									if (this.anInt5981 == 65535) {
										this.anInt5981 = -1;
									}
									this.anInt6001 = arg0.method5776();
									this.anInt5992 = arg0.method5776();
									return;
								}
								if (arg1 != 21) {
									if (arg1 == 22) {
										this.anInt5978 = arg0.method5776();
									} else if (arg1 == 249) {
										local92 = arg0.method5732();
										if (this.aClass243_27 == null) {
											local100 = Static279.method4638(local92);
											this.aClass243_27 = new Class243(local100);
										}
										for (local100 = 0; local100 < local92; local100++) {
											@Pc(237) boolean local237 = arg0.method5732() == 1;
											@Pc(241) int local241 = arg0.method5736();
											@Pc(250) Class2 local250;
											if (local237) {
												local250 = new Class2_Sub31(arg0.method5744());
											} else {
												local250 = new Class2_Sub16(arg0.method5776());
											}
											this.aClass243_27.method5968((long) local241, local250);
										}
										return;
									}
									return;
								}
								this.anInt6003 = arg0.method5776();
								return;
							}
							this.anInt5985 = arg0.method5753();
							return;
						}
						this.aString56 = arg0.method5744();
						return;
					}
					this.aBoolean438 = false;
					return;
				}
				local92 = arg0.method5732();
				this.anIntArray522 = new int[local92 * 2];
				for (local100 = 0; local100 < local92 * 2; local100++) {
					this.anIntArray522[local100] = arg0.method5743();
				}
				this.anInt5975 = arg0.method5776();
				this.anInt5976 = arg0.method5776();
				return;
			}
			local92 = arg0.method5732();
			if ((local92 & 0x1) == 0) {
				this.aBoolean439 = false;
			}
			if ((local92 & 0x2) == 2) {
				this.aBoolean440 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method5241(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass243_27 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub31 local24 = (Class2_Sub31) this.aClass243_27.method5967((long) arg1);
			return local24 == null ? arg0 : local24.aString50;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!oj;IZ)Lclient!rg;")
	public Class27 method5243(@OriginalArg(0) Class48 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5982 : this.anInt5994;
		@Pc(18) int local18 = local11 | arg0.anInt3038 << 29;
		@Pc(33) Class27 local33 = (Class27) this.aClass195_4.aClass41_65.method823((long) local18);
		if (local33 != null) {
			return local33;
		} else if (this.aClass195_4.aClass83_104.method1958(local11)) {
			@Pc(53) Class128 local53 = Static399.method3370(this.aClass195_4.aClass83_104, local11, 0);
			if (local53 != null) {
				local33 = arg0.method2527(local53);
				this.aClass195_4.aClass41_65.method832((long) local18, local33);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!eh;)Z")
	public boolean method5244(@OriginalArg(1) Interface4 arg0) {
		@Pc(24) int local24;
		if (this.anInt5983 == -1) {
			if (this.anInt5984 == -1) {
				return true;
			}
			local24 = arg0.method2774(this.anInt5984);
		} else {
			local24 = arg0.method2775(this.anInt5983);
		}
		if (local24 < this.anInt5974 || local24 > this.anInt5991) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt5981 == -1) {
			if (this.anInt5987 == -1) {
				return true;
			}
			local67 = arg0.method2774(this.anInt5987);
		} else {
			local67 = arg0.method2775(this.anInt5981);
		}
		return this.anInt6001 <= local67 && this.anInt5992 >= local67;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!vt;B)V")
	public void method5245(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5732();
			if (local13 == 0) {
				return;
			}
			this.method5239(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!oj;)Lclient!rg;")
	public Class27 method5246(@OriginalArg(1) Class48 arg0) {
		@Pc(20) Class27 local20 = (Class27) this.aClass195_4.aClass41_65.method823((long) (this.anInt5988 | 0x20000 | arg0.anInt3038 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass195_4.aClass83_104.method1958(this.anInt5988);
		@Pc(48) Class128 local48 = Static399.method3370(this.aClass195_4.aClass83_104, this.anInt5988, 0);
		if (local48 != null) {
			local20 = arg0.method2527(local48);
			this.aClass195_4.aClass41_65.method832((long) (arg0.anInt3038 << 29 | 0x20000 | this.anInt5988), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)I")
	public int method5247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass243_27 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub16 local21 = (Class2_Sub16) this.aClass243_27.method5967((long) arg0);
			return local21 == null ? arg1 : local21.anInt2601;
		}
	}
}
