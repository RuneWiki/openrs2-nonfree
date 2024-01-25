import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class189 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!qda;")
	private Class295 aClass295_2;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
	private int anInt5125;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!af;")
	private Class6_Sub2_Sub1_Sub1 aClass6_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Lclient!dp;")
	private final Class82 aClass82_7 = new Class82();

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!dp;")
	private final Class82 aClass82_8 = new Class82();

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Lclient!dp;")
	private final Class82 aClass82_9 = new Class82();

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!dp;")
	private final Class82 aClass82_10 = new Class82();

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_76 = new Class6_Sub15(4);

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "B")
	private byte aByte78 = 0;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public volatile int anInt5126 = 0;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
	public volatile int anInt5127 = 0;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_77 = new Class6_Sub15(8);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
	public boolean method4677() {
		return this.method4679() >= 20;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
	public boolean method4678() {
		@Pc(13) int local13;
		if (this.aClass295_2 != null) {
			@Pc(7) long local7 = Static549.method7758();
			local13 = (int) (local7 - this.aLong164);
			this.aLong164 = local7;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt5125 += local13;
			if (this.anInt5125 > 30000) {
				try {
					this.aClass295_2.method7199();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass295_2 = null;
			}
		}
		if (this.aClass295_2 == null) {
			return this.method4684() == 0 && this.method4679() == 0;
		}
		try {
			this.aClass295_2.method7191();
			for (@Pc(89) Class6_Sub2_Sub1_Sub1 local89 = (Class6_Sub2_Sub1_Sub1) this.aClass82_7.method2071(); local89 != null; local89 = (Class6_Sub2_Sub1_Sub1) this.aClass82_7.method2078()) {
				this.aClass6_Sub15_76.anInt3174 = 0;
				this.aClass6_Sub15_76.method3016(1);
				this.aClass6_Sub15_76.method3009((int) local89.aLong317);
				this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
				this.aClass82_8.method2076(local89);
			}
			for (@Pc(139) Class6_Sub2_Sub1_Sub1 local139 = (Class6_Sub2_Sub1_Sub1) this.aClass82_9.method2071(); local139 != null; local139 = (Class6_Sub2_Sub1_Sub1) this.aClass82_9.method2078()) {
				this.aClass6_Sub15_76.anInt3174 = 0;
				this.aClass6_Sub15_76.method3016(0);
				this.aClass6_Sub15_76.method3009((int) local139.aLong317);
				this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
				this.aClass82_10.method2076(local139);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(196) int local196 = this.aClass295_2.method7196();
				if (local196 < 0) {
					throw new IOException();
				}
				if (local196 == 0) {
					break;
				}
				this.anInt5125 = 0;
				@Pc(209) byte local209 = 0;
				if (this.aClass6_Sub2_Sub1_Sub1_2 == null) {
					local209 = 8;
				} else if (this.aClass6_Sub2_Sub1_Sub1_2.anInt176 == 0) {
					local209 = 1;
				}
				@Pc(240) int local240;
				@Pc(247) int local247;
				@Pc(290) int local290;
				if (local209 <= 0) {
					local240 = this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.aByteArray20.length - this.aClass6_Sub2_Sub1_Sub1_2.aByte1;
					local247 = 512 - this.aClass6_Sub2_Sub1_Sub1_2.anInt176;
					if (local247 > local240 - this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174) {
						local247 = local240 - this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174;
					}
					if (local247 > local196) {
						local247 = local196;
					}
					this.aClass295_2.method7192(local247, this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174, this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.aByteArray20);
					if (this.aByte78 != 0) {
						for (local290 = 0; local290 < local247; local290++) {
							this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.aByteArray20[this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174 + local290] = (byte) (this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.aByteArray20[this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174 + local290] ^ this.aByte78);
						}
					}
					this.aClass6_Sub2_Sub1_Sub1_2.anInt176 += local247;
					this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174 += local247;
					if (local240 == this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.anInt3174) {
						this.aClass6_Sub2_Sub1_Sub1_2.method8464();
						this.aClass6_Sub2_Sub1_Sub1_2.aBoolean259 = false;
						this.aClass6_Sub2_Sub1_Sub1_2 = null;
					} else if (this.aClass6_Sub2_Sub1_Sub1_2.anInt176 == 512) {
						this.aClass6_Sub2_Sub1_Sub1_2.anInt176 = 0;
					}
				} else {
					local240 = local209 - this.aClass6_Sub15_77.anInt3174;
					if (local196 < local240) {
						local240 = local196;
					}
					this.aClass295_2.method7192(local240, this.aClass6_Sub15_77.anInt3174, this.aClass6_Sub15_77.aByteArray20);
					if (this.aByte78 != 0) {
						for (local247 = 0; local247 < local240; local247++) {
							this.aClass6_Sub15_77.aByteArray20[local247 + this.aClass6_Sub15_77.anInt3174] ^= this.aByte78;
						}
					}
					this.aClass6_Sub15_77.anInt3174 += local240;
					if (local209 <= this.aClass6_Sub15_77.anInt3174) {
						if (this.aClass6_Sub2_Sub1_Sub1_2 == null) {
							this.aClass6_Sub15_77.anInt3174 = 0;
							local247 = this.aClass6_Sub15_77.method3030();
							local290 = this.aClass6_Sub15_77.method3018();
							@Pc(486) int local486 = this.aClass6_Sub15_77.method3030();
							@Pc(491) int local491 = this.aClass6_Sub15_77.method3015();
							@Pc(495) int local495 = local486 & 0x7F;
							@Pc(504) boolean local504 = (local486 & 0x80) != 0;
							@Pc(511) long local511 = (long) (local290 + (local247 << 16));
							@Pc(521) Class6_Sub2_Sub1_Sub1 local521;
							if (local504) {
								for (local521 = (Class6_Sub2_Sub1_Sub1) this.aClass82_10.method2071(); local521 != null && local511 != local521.aLong317; local521 = (Class6_Sub2_Sub1_Sub1) this.aClass82_10.method2078()) {
								}
							} else {
								for (local521 = (Class6_Sub2_Sub1_Sub1) this.aClass82_8.method2071(); local521 != null && local511 != local521.aLong317; local521 = (Class6_Sub2_Sub1_Sub1) this.aClass82_8.method2078()) {
								}
							}
							if (local521 == null) {
								throw new IOException();
							}
							this.aClass6_Sub2_Sub1_Sub1_2 = local521;
							@Pc(601) int local601 = local495 == 0 ? 5 : 9;
							this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6 = new Class6_Sub15(local601 + local491 + this.aClass6_Sub2_Sub1_Sub1_2.aByte1);
							this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.method3016(local495);
							this.aClass6_Sub2_Sub1_Sub1_2.aClass6_Sub15_6.method3029(local491);
							this.aClass6_Sub15_77.anInt3174 = 0;
							this.aClass6_Sub2_Sub1_Sub1_2.anInt176 = 8;
						} else if (this.aClass6_Sub2_Sub1_Sub1_2.anInt176 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub15_77.aByteArray20[0] == -1) {
							this.aClass6_Sub2_Sub1_Sub1_2.anInt176 = 1;
							this.aClass6_Sub15_77.anInt3174 = 0;
						} else {
							this.aClass6_Sub2_Sub1_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(695) IOException local695) {
			try {
				this.aClass295_2.method7199();
			} catch (@Pc(701) Exception local701) {
			}
			this.anInt5126++;
			this.aClass295_2 = null;
			this.anInt5127 = -2;
			return this.method4684() == 0 && this.method4679() == 0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)I")
	private int method4679() {
		return this.aClass82_9.method2074() + this.aClass82_10.method2074();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!qda;I)V")
	public void method4680(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class295 arg1) {
		if (this.aClass295_2 != null) {
			try {
				this.aClass295_2.method7199();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass295_2 = null;
		}
		this.aClass295_2 = arg1;
		this.method4682();
		this.method4683(arg0);
		this.aClass6_Sub15_77.anInt3174 = 0;
		this.aClass6_Sub2_Sub1_Sub1_2 = null;
		while (true) {
			@Pc(48) Class6_Sub2_Sub1_Sub1 local48 = (Class6_Sub2_Sub1_Sub1) this.aClass82_8.method2077();
			if (local48 == null) {
				while (true) {
					local48 = (Class6_Sub2_Sub1_Sub1) this.aClass82_10.method2077();
					if (local48 == null) {
						if (this.aByte78 != 0) {
							try {
								this.aClass6_Sub15_76.anInt3174 = 0;
								this.aClass6_Sub15_76.method3016(4);
								this.aClass6_Sub15_76.method3016(this.aByte78);
								this.aClass6_Sub15_76.method3040(0);
								this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
							} catch (@Pc(119) IOException local119) {
								try {
									this.aClass295_2.method7199();
								} catch (@Pc(125) Exception local125) {
								}
								this.aClass295_2 = null;
								this.anInt5126++;
								this.anInt5127 = -2;
							}
						}
						this.anInt5125 = 0;
						this.aLong164 = Static549.method7758();
						return;
					}
					this.aClass82_9.method2076(local48);
				}
			}
			this.aClass82_7.method2076(local48);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public void method4681() {
		if (this.aClass295_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_76.anInt3174 = 0;
			this.aClass6_Sub15_76.method3016(7);
			this.aClass6_Sub15_76.method3009(0);
			this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass295_2.method7199();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt5127 = -2;
			this.anInt5126++;
			this.aClass295_2 = null;
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)V")
	private void method4682() {
		if (this.aClass295_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_76.anInt3174 = 0;
			this.aClass6_Sub15_76.method3016(6);
			this.aClass6_Sub15_76.method3009(3);
			this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass295_2.method7199();
			} catch (@Pc(39) Exception local39) {
			}
			this.aClass295_2 = null;
			this.anInt5126++;
			this.anInt5127 = -2;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
	public void method4683(@OriginalArg(0) boolean arg0) {
		if (this.aClass295_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_76.anInt3174 = 0;
			this.aClass6_Sub15_76.method3016(arg0 ? 2 : 3);
			this.aClass6_Sub15_76.method3009(0);
			this.aClass295_2.method7198(4, this.aClass6_Sub15_76.aByteArray20);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass295_2.method7199();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5126++;
			this.anInt5127 = -2;
			this.aClass295_2 = null;
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
	public int method4684() {
		return this.aClass82_7.method2074() + this.aClass82_8.method2074();
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Z")
	public boolean method4685() {
		return this.method4684() >= 20;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
	public void method4686() {
		if (this.aClass295_2 != null) {
			this.aClass295_2.method7193();
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	public void method4687() {
		if (this.aClass295_2 != null) {
			this.aClass295_2.method7199();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIBIZ)Lclient!af;")
	public Class6_Sub2_Sub1_Sub1 method4688(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(14) Class6_Sub2_Sub1_Sub1 local14 = new Class6_Sub2_Sub1_Sub1();
		local14.aLong317 = local10;
		local14.aByte1 = arg0;
		local14.aBoolean257 = arg3;
		if (arg3) {
			if (this.method4684() >= 20) {
				throw new RuntimeException();
			}
			this.aClass82_7.method2076(local14);
		} else if (this.method4679() < 20) {
			this.aClass82_9.method2076(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method4689() {
		try {
			this.aClass295_2.method7199();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt5126++;
		this.aByte78 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt5127 = -1;
		this.aClass295_2 = null;
	}
}
