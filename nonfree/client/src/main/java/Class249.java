import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class249 {

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "Lclient!qfa;")
	private Class284 aClass284_2;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "Lclient!laa;")
	private Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lclient!oga;")
	private final Class253 aClass253_5 = new Class253();

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lclient!oga;")
	private final Class253 aClass253_6 = new Class253();

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "Lclient!oga;")
	private final Class253 aClass253_7 = new Class253();

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "Lclient!oga;")
	private final Class253 aClass253_8 = new Class253();

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "Lclient!gk;")
	private final Class2_Sub7 aClass2_Sub7_4 = new Class2_Sub7(4);

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "B")
	private byte aByte83 = 0;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	public volatile int anInt6251 = 0;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public volatile int anInt6250 = 0;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "Lclient!gk;")
	private final Class2_Sub7 aClass2_Sub7_5 = new Class2_Sub7(8);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	public void method5216() {
		if (this.aClass284_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub7_4.anInt5186 = 0;
			this.aClass2_Sub7_4.method4459(7);
			this.aClass2_Sub7_4.method4462(0);
			this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass284_2.method5710();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt6250 = -2;
			this.aClass284_2 = null;
			this.anInt6251++;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	public boolean method5217() {
		return this.method5224() >= 20;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)I")
	private int method5218() {
		return this.aClass253_7.method5322() + this.aClass253_8.method5322();
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Z)V")
	public void method5219() {
		try {
			this.aClass284_2.method5710();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass284_2 = null;
		this.aByte83 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt6251++;
		this.anInt6250 = -1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLclient!qfa;)V")
	public void method5220(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class284 arg1) {
		if (this.aClass284_2 != null) {
			try {
				this.aClass284_2.method5710();
			} catch (@Pc(20) Exception local20) {
			}
			this.aClass284_2 = null;
		}
		this.aClass284_2 = arg1;
		this.method5225();
		this.method5227(arg0);
		this.aClass2_Sub7_5.anInt5186 = 0;
		this.aClass2_Sub2_Sub2_Sub2_2 = null;
		while (true) {
			@Pc(46) Class2_Sub2_Sub2_Sub2 local46 = (Class2_Sub2_Sub2_Sub2) this.aClass253_6.method5327();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub2_Sub2_Sub2) this.aClass253_8.method5327();
					if (local46 == null) {
						if (this.aByte83 != 0) {
							try {
								this.aClass2_Sub7_4.anInt5186 = 0;
								this.aClass2_Sub7_4.method4459(4);
								this.aClass2_Sub7_4.method4459(this.aByte83);
								this.aClass2_Sub7_4.method4511(0);
								this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass284_2.method5710();
								} catch (@Pc(110) Exception local110) {
								}
								this.anInt6250 = -2;
								this.aClass284_2 = null;
								this.anInt6251++;
							}
						}
						this.anInt6249 = 0;
						this.aLong169 = Static362.method5133();
						return;
					}
					this.aClass253_7.method5329(local46);
				}
			}
			this.aClass253_5.method5329(local46);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	public void method5221() {
		if (this.aClass284_2 != null) {
			this.aClass284_2.method5710();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Z")
	public boolean method5222() {
		@Pc(14) int local14;
		if (this.aClass284_2 != null) {
			@Pc(7) long local7 = Static362.method5133();
			local14 = (int) (local7 - this.aLong169);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong169 = local7;
			this.anInt6249 += local14;
			if (this.anInt6249 > 30000) {
				try {
					this.aClass284_2.method5710();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass284_2 = null;
			}
		}
		if (this.aClass284_2 == null) {
			return this.method5224() == 0 && this.method5218() == 0;
		}
		try {
			this.aClass284_2.method5713();
			for (@Pc(77) Class2_Sub2_Sub2_Sub2 local77 = (Class2_Sub2_Sub2_Sub2) this.aClass253_5.method5321(); local77 != null; local77 = (Class2_Sub2_Sub2_Sub2) this.aClass253_5.method5323()) {
				this.aClass2_Sub7_4.anInt5186 = 0;
				this.aClass2_Sub7_4.method4459(1);
				this.aClass2_Sub7_4.method4462((int) local77.aLong269);
				this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
				this.aClass253_6.method5329(local77);
			}
			for (@Pc(123) Class2_Sub2_Sub2_Sub2 local123 = (Class2_Sub2_Sub2_Sub2) this.aClass253_7.method5321(); local123 != null; local123 = (Class2_Sub2_Sub2_Sub2) this.aClass253_7.method5323()) {
				this.aClass2_Sub7_4.anInt5186 = 0;
				this.aClass2_Sub7_4.method4459(0);
				this.aClass2_Sub7_4.method4462((int) local123.aLong269);
				this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
				this.aClass253_8.method5329(local123);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(178) int local178 = this.aClass284_2.method5711();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt6249 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass2_Sub2_Sub2_Sub2_2 == null) {
					local194 = 8;
				} else if (this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 == 0) {
					local194 = 1;
				}
				@Pc(218) int local218;
				@Pc(246) int local246;
				@Pc(311) int local311;
				if (local194 > 0) {
					local218 = local194 - this.aClass2_Sub7_5.anInt5186;
					if (local218 > local178) {
						local218 = local178;
					}
					this.aClass284_2.method5716(this.aClass2_Sub7_5.aByteArray52, this.aClass2_Sub7_5.anInt5186, local218);
					if (this.aByte83 != 0) {
						for (local246 = 0; local246 < local218; local246++) {
							this.aClass2_Sub7_5.aByteArray52[local246 + this.aClass2_Sub7_5.anInt5186] ^= this.aByte83;
						}
					}
					this.aClass2_Sub7_5.anInt5186 += local218;
					if (this.aClass2_Sub7_5.anInt5186 >= local194) {
						if (this.aClass2_Sub2_Sub2_Sub2_2 == null) {
							this.aClass2_Sub7_5.anInt5186 = 0;
							local246 = this.aClass2_Sub7_5.method4464();
							local311 = this.aClass2_Sub7_5.method4518();
							@Pc(316) int local316 = this.aClass2_Sub7_5.method4464();
							@Pc(321) int local321 = this.aClass2_Sub7_5.method4509();
							@Pc(325) int local325 = local316 & 0x7F;
							@Pc(333) boolean local333 = (local316 & 0x80) != 0;
							@Pc(341) long local341 = (long) ((local246 << 16) + local311);
							@Pc(351) Class2_Sub2_Sub2_Sub2 local351;
							if (local333) {
								for (local351 = (Class2_Sub2_Sub2_Sub2) this.aClass253_8.method5321(); local351 != null && local341 != local351.aLong269; local351 = (Class2_Sub2_Sub2_Sub2) this.aClass253_8.method5323()) {
								}
							} else {
								for (local351 = (Class2_Sub2_Sub2_Sub2) this.aClass253_6.method5321(); local351 != null && local351.aLong269 != local341; local351 = (Class2_Sub2_Sub2_Sub2) this.aClass253_6.method5323()) {
								}
							}
							if (local351 == null) {
								throw new IOException();
							}
							@Pc(412) int local412 = local325 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub2_Sub2_2 = local351;
							this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2 = new Class2_Sub7(this.aClass2_Sub2_Sub2_Sub2_2.aByte47 + local321 + local412);
							this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.method4459(local325);
							this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.method4495(local321);
							this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 = 8;
							this.aClass2_Sub7_5.anInt5186 = 0;
						} else if (this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub7_5.aByteArray52[0] == -1) {
							this.aClass2_Sub7_5.anInt5186 = 0;
							this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 = 1;
						} else {
							this.aClass2_Sub2_Sub2_Sub2_2 = null;
						}
					}
				} else {
					local218 = this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.aByteArray52.length - this.aClass2_Sub2_Sub2_Sub2_2.aByte47;
					local246 = 512 - this.aClass2_Sub2_Sub2_Sub2_2.anInt4968;
					if (local246 > local218 - this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186) {
						local246 = local218 - this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186;
					}
					if (local178 < local246) {
						local246 = local178;
					}
					this.aClass284_2.method5716(this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.aByteArray52, this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186, local246);
					if (this.aByte83 != 0) {
						for (local311 = 0; local311 < local246; local311++) {
							this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.aByteArray52[local311 + this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186] ^= this.aByte83;
						}
					}
					this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 += local246;
					this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186 += local246;
					if (local218 == this.aClass2_Sub2_Sub2_Sub2_2.aClass2_Sub7_2.anInt5186) {
						this.aClass2_Sub2_Sub2_Sub2_2.method7659();
						this.aClass2_Sub2_Sub2_Sub2_2.aBoolean390 = false;
						this.aClass2_Sub2_Sub2_Sub2_2 = null;
					} else if (this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 == 512) {
						this.aClass2_Sub2_Sub2_Sub2_2.anInt4968 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(635) IOException local635) {
			try {
				this.aClass284_2.method5710();
			} catch (@Pc(641) Exception local641) {
			}
			this.anInt6250 = -2;
			this.anInt6251++;
			this.aClass284_2 = null;
			return this.method5224() == 0 && this.method5218() == 0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)Z")
	public boolean method5223() {
		return this.method5218() >= 20;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I")
	public int method5224() {
		return this.aClass253_5.method5322() + this.aClass253_6.method5322();
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
	private void method5225() {
		if (this.aClass284_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub7_4.anInt5186 = 0;
			this.aClass2_Sub7_4.method4459(6);
			this.aClass2_Sub7_4.method4462(3);
			this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass284_2.method5710();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6250 = -2;
			this.anInt6251++;
			this.aClass284_2 = null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V")
	public void method5227(@OriginalArg(1) boolean arg0) {
		if (this.aClass284_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub7_4.anInt5186 = 0;
			this.aClass2_Sub7_4.method4459(arg0 ? 2 : 3);
			this.aClass2_Sub7_4.method4462(0);
			this.aClass284_2.method5709(this.aClass2_Sub7_4.aByteArray52, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass284_2.method5710();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt6250 = -2;
			this.anInt6251++;
			this.aClass284_2 = null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V")
	public void method5229() {
		if (this.aClass284_2 != null) {
			this.aClass284_2.method5707();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZZIB)Lclient!laa;")
	public Class2_Sub2_Sub2_Sub2 method5230(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) ((arg2 << 16) + arg0);
		@Pc(15) Class2_Sub2_Sub2_Sub2 local15 = new Class2_Sub2_Sub2_Sub2();
		local15.aByte47 = arg3;
		local15.aBoolean391 = arg1;
		local15.aLong269 = local11;
		if (arg1) {
			if (this.method5224() >= 20) {
				throw new RuntimeException();
			}
			this.aClass253_5.method5329(local15);
		} else if (this.method5218() < 20) {
			this.aClass253_7.method5329(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}
}
