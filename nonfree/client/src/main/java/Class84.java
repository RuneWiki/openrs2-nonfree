import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class84 {

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	private int anInt2310;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!ml;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!op;")
	private Class2_Sub5_Sub12_Sub2 aClass2_Sub5_Sub12_Sub2_1;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!vv;")
	private final Class261 aClass261_2 = new Class261();

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!vv;")
	private final Class261 aClass261_3 = new Class261();

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!vv;")
	private final Class261 aClass261_4 = new Class261();

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!vv;")
	private final Class261 aClass261_5 = new Class261();

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!sv;")
	private final Class2_Sub13 aClass2_Sub13_2 = new Class2_Sub13(4);

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
	public volatile int anInt2311 = 0;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public volatile int anInt2312 = 0;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!sv;")
	private final Class2_Sub13 aClass2_Sub13_3 = new Class2_Sub13(8);

	static {
		new Class134(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	public boolean method1899() {
		return this.method1908() >= 20;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method1900() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_2.anInt4347 = 0;
			this.aClass2_Sub13_2.method3602(7);
			this.aClass2_Sub13_2.method3566(0);
			this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass160_1.method3202();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass160_1 = null;
			this.anInt2311++;
			this.anInt2312 = -2;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method1901() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method3202();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Z")
	public boolean method1902() {
		if (this.aClass160_1 != null) {
			@Pc(7) long local7 = Static110.method1702();
			@Pc(14) int local14 = (int) (local7 - this.aLong79);
			this.aLong79 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt2310 += local14;
			if (this.anInt2310 > 30000) {
				try {
					this.aClass160_1.method3202();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass160_1 = null;
			}
		}
		if (this.aClass160_1 == null) {
			return this.method1907() == 0 && this.method1908() == 0;
		}
		try {
			this.aClass160_1.method3206();
			for (@Pc(86) Class2_Sub5_Sub12_Sub2 local86 = (Class2_Sub5_Sub12_Sub2) this.aClass261_2.method5489(); local86 != null; local86 = (Class2_Sub5_Sub12_Sub2) this.aClass261_2.method5490()) {
				this.aClass2_Sub13_2.anInt4347 = 0;
				this.aClass2_Sub13_2.method3602(1);
				this.aClass2_Sub13_2.method3566((int) local86.aLong220);
				this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
				this.aClass261_3.method5487(local86);
			}
			for (@Pc(132) Class2_Sub5_Sub12_Sub2 local132 = (Class2_Sub5_Sub12_Sub2) this.aClass261_4.method5489(); local132 != null; local132 = (Class2_Sub5_Sub12_Sub2) this.aClass261_4.method5490()) {
				this.aClass2_Sub13_2.anInt4347 = 0;
				this.aClass2_Sub13_2.method3602(0);
				this.aClass2_Sub13_2.method3566((int) local132.aLong220);
				this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
				this.aClass261_5.method5487(local132);
			}
			for (@Pc(174) int local174 = 0; local174 < 100; local174++) {
				@Pc(181) int local181 = this.aClass160_1.method3211();
				if (local181 < 0) {
					throw new IOException();
				}
				if (local181 == 0) {
					break;
				}
				this.anInt2310 = 0;
				@Pc(200) byte local200 = 0;
				if (this.aClass2_Sub5_Sub12_Sub2_1 == null) {
					local200 = 8;
				} else if (this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 == 0) {
					local200 = 1;
				}
				@Pc(226) int local226;
				@Pc(233) int local233;
				@Pc(277) int local277;
				if (local200 <= 0) {
					local226 = this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.aByteArray52.length - this.aClass2_Sub5_Sub12_Sub2_1.aByte55;
					local233 = 512 - this.aClass2_Sub5_Sub12_Sub2_1.anInt4796;
					if (local233 > local226 - this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347) {
						local233 = local226 - this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347;
					}
					if (local233 > local181) {
						local233 = local181;
					}
					this.aClass160_1.method3207(local233, this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.aByteArray52, this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347);
					if (this.aByte23 != 0) {
						for (local277 = 0; local277 < local233; local277++) {
							this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.aByteArray52[this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347 + local277] = (byte) (this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.aByteArray52[this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347 + local277] ^ this.aByte23);
						}
					}
					this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347 += local233;
					this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 += local233;
					if (local226 == this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.anInt4347) {
						this.aClass2_Sub5_Sub12_Sub2_1.method5621();
						this.aClass2_Sub5_Sub12_Sub2_1.aBoolean335 = false;
						this.aClass2_Sub5_Sub12_Sub2_1 = null;
					} else if (this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 == 512) {
						this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 = 0;
					}
				} else {
					local226 = local200 - this.aClass2_Sub13_3.anInt4347;
					if (local181 < local226) {
						local226 = local181;
					}
					this.aClass160_1.method3207(local226, this.aClass2_Sub13_3.aByteArray52, this.aClass2_Sub13_3.anInt4347);
					if (this.aByte23 != 0) {
						for (local233 = 0; local233 < local226; local233++) {
							this.aClass2_Sub13_3.aByteArray52[this.aClass2_Sub13_3.anInt4347 + local233] = (byte) (this.aClass2_Sub13_3.aByteArray52[this.aClass2_Sub13_3.anInt4347 + local233] ^ this.aByte23);
						}
					}
					this.aClass2_Sub13_3.anInt4347 += local226;
					if (local200 <= this.aClass2_Sub13_3.anInt4347) {
						if (this.aClass2_Sub5_Sub12_Sub2_1 == null) {
							this.aClass2_Sub13_3.anInt4347 = 0;
							local233 = this.aClass2_Sub13_3.method3580();
							local277 = this.aClass2_Sub13_3.method3555();
							@Pc(465) int local465 = this.aClass2_Sub13_3.method3580();
							@Pc(470) int local470 = this.aClass2_Sub13_3.method3574();
							@Pc(474) int local474 = local465 & 0x7F;
							@Pc(485) boolean local485 = (local465 & 0x80) != 0;
							@Pc(493) long local493 = (long) ((local233 << 16) + local277);
							@Pc(503) Class2_Sub5_Sub12_Sub2 local503;
							if (local485) {
								for (local503 = (Class2_Sub5_Sub12_Sub2) this.aClass261_5.method5489(); local503 != null && local493 != local503.aLong220; local503 = (Class2_Sub5_Sub12_Sub2) this.aClass261_5.method5490()) {
								}
							} else {
								for (local503 = (Class2_Sub5_Sub12_Sub2) this.aClass261_3.method5489(); local503 != null && local503.aLong220 != local493; local503 = (Class2_Sub5_Sub12_Sub2) this.aClass261_3.method5490()) {
								}
							}
							if (local503 == null) {
								throw new IOException();
							}
							@Pc(564) int local564 = local474 == 0 ? 5 : 9;
							this.aClass2_Sub5_Sub12_Sub2_1 = local503;
							this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7 = new Class2_Sub13(local470 + local564 + this.aClass2_Sub5_Sub12_Sub2_1.aByte55);
							this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.method3602(local474);
							this.aClass2_Sub5_Sub12_Sub2_1.aClass2_Sub13_7.method3569(local470);
							this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 = 8;
							this.aClass2_Sub13_3.anInt4347 = 0;
						} else if (this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub13_3.aByteArray52[0] == -1) {
							this.aClass2_Sub5_Sub12_Sub2_1.anInt4796 = 1;
							this.aClass2_Sub13_3.anInt4347 = 0;
						} else {
							this.aClass2_Sub5_Sub12_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(640) IOException local640) {
			try {
				this.aClass160_1.method3202();
			} catch (@Pc(646) Exception local646) {
			}
			this.anInt2311++;
			this.aClass160_1 = null;
			this.anInt2312 = -2;
			return this.method1907() == 0 && this.method1908() == 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public void method1903() {
		if (this.aClass160_1 != null) {
			this.aClass160_1.method3204();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ml;Z)V")
	public void method1904(@OriginalArg(1) Class160 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass160_1 != null) {
			try {
				this.aClass160_1.method3202();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass160_1 = null;
		}
		this.aClass160_1 = arg0;
		this.method1912();
		this.method1914(arg1);
		this.aClass2_Sub13_3.anInt4347 = 0;
		this.aClass2_Sub5_Sub12_Sub2_1 = null;
		while (true) {
			@Pc(40) Class2_Sub5_Sub12_Sub2 local40 = (Class2_Sub5_Sub12_Sub2) this.aClass261_3.method5485();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub5_Sub12_Sub2) this.aClass261_5.method5485();
					if (local40 == null) {
						if (this.aByte23 != 0) {
							try {
								this.aClass2_Sub13_2.anInt4347 = 0;
								this.aClass2_Sub13_2.method3602(4);
								this.aClass2_Sub13_2.method3602(this.aByte23);
								this.aClass2_Sub13_2.method3568(0);
								this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass160_1.method3202();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt2312 = -2;
								this.anInt2311++;
								this.aClass160_1 = null;
							}
						}
						this.anInt2310 = 0;
						this.aLong79 = Static110.method1702();
						return;
					}
					this.aClass261_4.method5487(local40);
				}
			}
			this.aClass261_2.method5487(local40);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)I")
	public int method1907() {
		return this.aClass261_2.method5484() + this.aClass261_3.method5484();
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	private int method1908() {
		return this.aClass261_4.method5484() + this.aClass261_5.method5484();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIZI)Lclient!op;")
	public Class2_Sub5_Sub12_Sub2 method1910(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg1 << 16));
		@Pc(14) Class2_Sub5_Sub12_Sub2 local14 = new Class2_Sub5_Sub12_Sub2();
		local14.aBoolean336 = arg3;
		local14.aLong220 = local10;
		local14.aByte55 = arg0;
		if (arg3) {
			if (this.method1907() >= 20) {
				throw new RuntimeException();
			}
			this.aClass261_2.method5487(local14);
		} else if (this.method1908() < 20) {
			this.aClass261_4.method5487(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Z")
	public boolean method1911() {
		return this.method1907() >= 20;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V")
	private void method1912() {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_2.anInt4347 = 0;
			this.aClass2_Sub13_2.method3602(6);
			this.aClass2_Sub13_2.method3566(3);
			this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass160_1.method3202();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass160_1 = null;
			this.anInt2312 = -2;
			this.anInt2311++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public void method1913() {
		try {
			this.aClass160_1.method3202();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass160_1 = null;
		this.anInt2312 = -1;
		this.aByte23 = (byte) (Math.random() * 255.0D + (double) 1);
		this.anInt2311++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZB)V")
	public void method1914(@OriginalArg(0) boolean arg0) {
		if (this.aClass160_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_2.anInt4347 = 0;
			this.aClass2_Sub13_2.method3602(arg0 ? 2 : 3);
			this.aClass2_Sub13_2.method3566(0);
			this.aClass160_1.method3210(4, this.aClass2_Sub13_2.aByteArray52);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass160_1.method3202();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2312 = -2;
			this.aClass160_1 = null;
			this.anInt2311++;
		}
	}
}
