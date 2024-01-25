import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class179 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public int anInt4575;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public int anInt4576;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!nj;")
	private Class212 aClass212_18;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt4577;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt4578;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	private int anInt4591;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Lclient!rj;")
	public Class276 aClass276_1;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public int anInt4579 = -1;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
	public boolean aBoolean283 = true;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt4573 = -1;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public int anInt4584 = -1;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	private int anInt4569 = -1;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt4581 = -1;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public int anInt4588 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	private int anInt4594 = -1;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	public int anInt4593 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private int anInt4587 = -1;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt4568 = -1;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	public int anInt4595 = 0;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
	public int anInt4598 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
	public int anInt4597 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Z")
	public boolean aBoolean285 = false;

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	public boolean aBoolean284 = true;

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
	public int anInt4599 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILclient!dga;)V")
	private void method3961(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4581 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt4599 = arg1.method6006();
		} else if (arg0 == 3) {
			this.aString63 = arg1.method5991();
		} else if (arg0 == 4) {
			this.anInt4575 = arg1.method5988();
		} else if (arg0 == 5) {
			this.anInt4579 = arg1.method5988();
		} else if (arg0 == 6) {
			this.anInt4595 = arg1.method6041();
		} else {
			@Pc(66) int local66;
			if (arg0 == 7) {
				local66 = arg1.method6041();
				if ((local66 & 0x2) == 2) {
					this.aBoolean285 = true;
				}
				if ((local66 & 0x1) == 0) {
					this.aBoolean284 = false;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean283 = arg1.method6041() == 1;
			} else if (arg0 == 9) {
				this.anInt4569 = arg1.method6006();
				if (this.anInt4569 == 65535) {
					this.anInt4569 = -1;
				}
				this.anInt4573 = arg1.method6006();
				if (this.anInt4573 == 65535) {
					this.anInt4573 = -1;
				}
				this.anInt4574 = arg1.method6027();
				this.anInt4591 = arg1.method6027();
				return;
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(128) int local128;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean282 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 != 18) {
							if (arg0 == 19) {
								this.anInt4584 = arg1.method6006();
								return;
							}
							if (arg0 == 20) {
								this.anInt4568 = arg1.method6006();
								if (this.anInt4568 == 65535) {
									this.anInt4568 = -1;
								}
								this.anInt4587 = arg1.method6006();
								if (this.anInt4587 == 65535) {
									this.anInt4587 = -1;
								}
								this.anInt4577 = arg1.method6027();
								this.anInt4571 = arg1.method6027();
							} else if (arg0 == 21) {
								this.anInt4589 = arg1.method6027();
								return;
							} else if (arg0 == 22) {
								this.anInt4590 = arg1.method6027();
								return;
							} else if (arg0 == 249) {
								local66 = arg1.method6041();
								if (this.aClass212_18 == null) {
									local128 = Static516.method7313(local66);
									this.aClass212_18 = new Class212(local128);
								}
								for (local128 = 0; local128 < local66; local128++) {
									@Pc(242) boolean local242 = arg1.method6041() == 1;
									@Pc(246) int local246 = arg1.method5988();
									@Pc(255) Class6 local255;
									if (local242) {
										local255 = new Class6_Sub6(arg1.method5991());
									} else {
										local255 = new Class6_Sub9(arg1.method6027());
									}
									this.aClass212_18.method5104((long) local246, local255);
								}
								return;
							}
							return;
						}
						this.anInt4594 = arg1.method6006();
						return;
					}
					this.aString64 = arg1.method5991();
					return;
				}
				local66 = arg1.method6041();
				this.anIntArray449 = new int[local66 * 2];
				for (local128 = 0; local128 < local66 * 2; local128++) {
					this.anIntArray449[local128] = arg1.method6008();
				}
				this.anInt4586 = arg1.method6027();
				this.anInt4578 = arg1.method6027();
				return;
			} else {
				this.aStringArray18[arg0 - 10] = arg1.method5991();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!dd;)Z")
	public boolean method3962(@OriginalArg(1) Interface5 arg0) {
		@Pc(16) int local16;
		if (this.anInt4573 == -1) {
			if (this.anInt4569 == -1) {
				return true;
			}
			local16 = arg0.method495(this.anInt4569);
		} else {
			local16 = arg0.method494(this.anInt4573);
		}
		if (this.anInt4574 > local16 || this.anInt4591 < local16) {
			return false;
		}
		@Pc(63) int local63;
		if (this.anInt4587 == -1) {
			if (this.anInt4568 == -1) {
				return true;
			}
			local63 = arg0.method495(this.anInt4568);
		} else {
			local63 = arg0.method494(this.anInt4587);
		}
		return this.anInt4577 <= local63 && local63 <= this.anInt4571;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!oa;ZB)Lclient!xa;")
	public Class4 method3964(@OriginalArg(0) Class121 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt4599 : this.anInt4581;
		@Pc(26) int local26 = arg0.anInt8715 << 29 | local11;
		@Pc(35) Class4 local35 = (Class4) this.aClass276_1.aClass332_173.method7502((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass276_1.aClass251_126.method5859(local11)) {
			@Pc(55) Class196 local55 = Static589.method4745(this.aClass276_1.aClass251_126, local11, 0);
			if (local55 != null) {
				local35 = arg0.method7157(local55);
				this.aClass276_1.aClass332_173.method7498((long) local26, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!dga;)V")
	public void method3965(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6041();
			if (local11 == 0) {
				return;
			}
			this.method3961(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method3967() {
		if (this.anIntArray449 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray449.length; local10 += 2) {
			if (this.anIntArray449[local10] < this.anInt4598) {
				this.anInt4598 = this.anIntArray449[local10];
			} else if (this.anIntArray449[local10] > this.anInt4588) {
				this.anInt4588 = this.anIntArray449[local10];
			}
			if (this.anInt4597 > this.anIntArray449[local10 + 1]) {
				this.anInt4597 = this.anIntArray449[local10 + 1];
			} else if (this.anInt4593 < this.anIntArray449[local10 + 1]) {
				this.anInt4593 = this.anIntArray449[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method3968(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass212_18 == null) {
			return arg0;
		} else {
			@Pc(23) Class6_Sub6 local23 = (Class6_Sub6) this.aClass212_18.method5106((long) arg1);
			return local23 == null ? arg0 : local23.aString7;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!oa;B)Lclient!xa;")
	public Class4 method3969(@OriginalArg(0) Class121 arg0) {
		@Pc(20) Class4 local20 = (Class4) this.aClass276_1.aClass332_173.method7502((long) (this.anInt4594 | 0x20000 | arg0.anInt8715 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass276_1.aClass251_126.method5859(this.anInt4594);
		@Pc(40) Class196 local40 = Static589.method4745(this.aClass276_1.aClass251_126, this.anInt4594, 0);
		if (local40 != null) {
			local20 = arg0.method7157(local40);
			this.aClass276_1.aClass332_173.method7498((long) (arg0.anInt8715 << 29 | 0x20000 | this.anInt4594), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)I")
	public int method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass212_18 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub9 local16 = (Class6_Sub9) this.aClass212_18.method5106((long) arg1);
			return local16 == null ? arg0 : local16.anInt1006;
		}
	}
}
