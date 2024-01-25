import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class196 {

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "Lclient!cf;")
	public Class46 aClass46_3;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	public int anInt5164;

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
	public int anInt5165;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
	public int anInt5166;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
	public int anInt5167;

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
	public int anInt5168;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	public int anInt5170;

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	private int anInt5174;

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "Lclient!wh;")
	private Class356 aClass356_23;

	@OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
	private int anInt5180;

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "I")
	private int anInt5183;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	private int anInt5150 = -1;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	public int anInt5152 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	private int anInt5154 = -1;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	public int anInt5162 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	public int anInt5160 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
	public int anInt5171 = 0;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "Z")
	public boolean aBoolean393 = true;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	public int anInt5161 = -1;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray23 = new String[5];

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
	public int anInt5179 = -1;

	@OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
	private int anInt5181 = -1;

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
	public int anInt5156 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
	private int anInt5177 = -1;

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
	private int anInt5172 = -1;

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
	public int anInt5176 = -1;

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	public int anInt5173 = -1;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Z")
	public boolean aBoolean394 = true;

	static {
		new Class37("", 76);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!io;B)V")
	private void method4328(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt5179 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt5176 = arg1.method4426();
		} else if (arg0 == 3) {
			this.aString57 = arg1.method4388();
		} else if (arg0 == 4) {
			this.anInt5165 = arg1.method4396();
		} else if (arg0 == 5) {
			this.anInt5161 = arg1.method4396();
		} else if (arg0 == 6) {
			this.anInt5171 = arg1.method4393();
		} else {
			@Pc(52) int local52;
			if (arg0 == 7) {
				local52 = arg1.method4393();
				if ((local52 & 0x1) == 0) {
					this.aBoolean393 = false;
				}
				if ((local52 & 0x2) == 2) {
					this.aBoolean392 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean394 = arg1.method4393() == 1;
			} else if (arg0 == 9) {
				this.anInt5150 = arg1.method4426();
				if (this.anInt5150 == 65535) {
					this.anInt5150 = -1;
				}
				this.anInt5154 = arg1.method4426();
				if (this.anInt5154 == 65535) {
					this.anInt5154 = -1;
				}
				this.anInt5157 = arg1.method4371();
				this.anInt5180 = arg1.method4371();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray23[arg0 - 10] = arg1.method4388();
			} else {
				@Pc(105) int local105;
				if (arg0 == 15) {
					local52 = arg1.method4393();
					this.anIntArray314 = new int[local52 * 2];
					for (local105 = 0; local105 < local52 * 2; local105++) {
						this.anIntArray314[local105] = arg1.method4391();
					}
					this.anInt5170 = arg1.method4371();
					this.anInt5168 = arg1.method4371();
				} else if (arg0 == 16) {
					this.aBoolean395 = false;
				} else if (arg0 == 17) {
					this.aString56 = arg1.method4388();
				} else if (arg0 == 18) {
					this.anInt5172 = arg1.method4426();
				} else if (arg0 == 19) {
					this.anInt5173 = arg1.method4426();
				} else if (arg0 == 20) {
					this.anInt5177 = arg1.method4426();
					if (this.anInt5177 == 65535) {
						this.anInt5177 = -1;
					}
					this.anInt5181 = arg1.method4426();
					if (this.anInt5181 == 65535) {
						this.anInt5181 = -1;
					}
					this.anInt5174 = arg1.method4371();
					this.anInt5183 = arg1.method4371();
				} else if (arg0 == 21) {
					this.anInt5166 = arg1.method4371();
				} else if (arg0 == 22) {
					this.anInt5167 = arg1.method4371();
				} else if (arg0 == 249) {
					local52 = arg1.method4393();
					if (this.aClass356_23 == null) {
						local105 = Static200.method3428(local52);
						this.aClass356_23 = new Class356(local105);
					}
					for (local105 = 0; local105 < local52; local105++) {
						@Pc(271) boolean local271 = arg1.method4393() == 1;
						@Pc(275) int local275 = arg1.method4396();
						@Pc(284) Class1 local284;
						if (local271) {
							local284 = new Class1_Sub26(arg1.method4388());
						} else {
							local284 = new Class1_Sub32(arg1.method4371());
						}
						this.aClass356_23.method7800((long) local275, local284);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method4329(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass356_23 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) this.aClass356_23.method7796((long) arg0);
			return local21 == null ? arg1 : local21.aString60;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!r;ZB)Lclient!f;")
	public Class10 method4331(@OriginalArg(0) Class12 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5176 : this.anInt5179;
		@Pc(18) int local18 = local11 | arg0.anInt7780 << 29;
		@Pc(27) Class10 local27 = (Class10) this.aClass46_3.aClass326_5.method7238((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass46_3.aClass111_11.method2434(local11)) {
			@Pc(47) Class318 local47 = Static604.method7062(this.aClass46_3.aClass111_11, local11, 0);
			if (local47 != null) {
				local27 = arg0.method6434(local47, true);
				this.aClass46_3.aClass326_5.method7236(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZLclient!ml;)Z")
	public boolean method4334(@OriginalArg(1) Interface15 arg0) {
		@Pc(21) int local21;
		if (this.anInt5154 == -1) {
			if (this.anInt5150 == -1) {
				return true;
			}
			local21 = arg0.method3531(this.anInt5150);
		} else {
			local21 = arg0.method3530(this.anInt5154);
		}
		if (this.anInt5157 > local21 || local21 > this.anInt5180) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt5181 == -1) {
			if (this.anInt5177 == -1) {
				return true;
			}
			local62 = arg0.method3531(this.anInt5177);
		} else {
			local62 = arg0.method3530(this.anInt5181);
		}
		return local62 >= this.anInt5174 && local62 <= this.anInt5183;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)I")
	public int method4335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass356_23 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub32 local21 = (Class1_Sub32) this.aClass356_23.method7796((long) arg1);
			return local21 == null ? arg0 : local21.anInt6144;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class10 method4336(@OriginalArg(1) Class12 arg0) {
		@Pc(22) Class10 local22 = (Class10) this.aClass46_3.aClass326_5.method7238((long) (this.anInt5172 | 0x20000 | arg0.anInt7780 << 29));
		if (local22 != null) {
			return local22;
		}
		this.aClass46_3.aClass111_11.method2434(this.anInt5172);
		@Pc(42) Class318 local42 = Static604.method7062(this.aClass46_3.aClass111_11, this.anInt5172, 0);
		if (local42 != null) {
			local22 = arg0.method6434(local42, true);
			this.aClass46_3.aClass326_5.method7236(local22, (long) (this.anInt5172 | 0x20000 | arg0.anInt7780 << 29));
		}
		return local22;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!io;)V")
	public void method4337(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method4393();
			if (local21 == 0) {
				return;
			}
			this.method4328(local21, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	public void method4338() {
		if (this.anIntArray314 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray314.length; local14 += 2) {
			if (this.anInt5160 > this.anIntArray314[local14]) {
				this.anInt5160 = this.anIntArray314[local14];
			} else if (this.anIntArray314[local14] > this.anInt5156) {
				this.anInt5156 = this.anIntArray314[local14];
			}
			if (this.anInt5152 > this.anIntArray314[local14 + 1]) {
				this.anInt5152 = this.anIntArray314[local14 + 1];
			} else if (this.anInt5162 < this.anIntArray314[local14 + 1]) {
				this.anInt5162 = this.anIntArray314[local14 + 1];
			}
		}
	}
}
