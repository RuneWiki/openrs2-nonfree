import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class7 {

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "Lclient!fr;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "Lclient!rj;")
	private Class5_Sub9_Sub3_Sub2 aClass5_Sub9_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!ro;")
	private final Class176 aClass176_1 = new Class176();

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!ro;")
	private final Class176 aClass176_2 = new Class176();

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!ro;")
	private final Class176 aClass176_3 = new Class176();

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "Lclient!ro;")
	private final Class176 aClass176_4 = new Class176();

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Lclient!bk;")
	private final Class5_Sub1 aClass5_Sub1_1 = new Class5_Sub1(4);

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	public volatile int anInt269 = 0;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
	public volatile int anInt270 = 0;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Lclient!bk;")
	private final Class5_Sub1 aClass5_Sub1_2 = new Class5_Sub1(8);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public void method236() {
		if (this.aClass68_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub1_1.anInt2029 = 0;
			this.aClass5_Sub1_1.method1886(7);
			this.aClass5_Sub1_1.method1852(0);
			this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass68_1.method1994();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass68_1 = null;
			this.anInt270 = -2;
			this.anInt269++;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	private void method237() {
		if (this.aClass68_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub1_1.anInt2029 = 0;
			this.aClass5_Sub1_1.method1886(6);
			this.aClass5_Sub1_1.method1852(3);
			this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass68_1.method1994();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass68_1 = null;
			this.anInt269++;
			this.anInt270 = -2;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZ)V")
	public void method238(@OriginalArg(0) boolean arg0) {
		if (this.aClass68_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub1_1.anInt2029 = 0;
			this.aClass5_Sub1_1.method1886(arg0 ? 2 : 3);
			this.aClass5_Sub1_1.method1852(0);
			this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass68_1.method1994();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt269++;
			this.aClass68_1 = null;
			this.anInt270 = -2;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZLclient!fr;)V")
	public void method239(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class68 arg1) {
		if (this.aClass68_1 != null) {
			try {
				this.aClass68_1.method1994();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass68_1 = null;
		}
		this.aClass68_1 = arg1;
		this.method237();
		this.method238(arg0);
		this.aClass5_Sub9_Sub3_Sub2_1 = null;
		this.aClass5_Sub1_2.anInt2029 = 0;
		while (true) {
			@Pc(48) Class5_Sub9_Sub3_Sub2 local48 = (Class5_Sub9_Sub3_Sub2) this.aClass176_2.method4775();
			if (local48 == null) {
				while (true) {
					local48 = (Class5_Sub9_Sub3_Sub2) this.aClass176_4.method4775();
					if (local48 == null) {
						if (this.aByte1 != 0) {
							try {
								this.aClass5_Sub1_1.anInt2029 = 0;
								this.aClass5_Sub1_1.method1886(4);
								this.aClass5_Sub1_1.method1886(this.aByte1);
								this.aClass5_Sub1_1.method1870(0);
								this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
							} catch (@Pc(115) IOException local115) {
								try {
									this.aClass68_1.method1994();
								} catch (@Pc(121) Exception local121) {
								}
								this.aClass68_1 = null;
								this.anInt269++;
								this.anInt270 = -2;
							}
						}
						this.anInt268 = 0;
						this.aLong7 = Static284.method4783();
						return;
					}
					this.aClass176_3.method4772(local48);
				}
			}
			this.aClass176_1.method4772(local48);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
	public void method240() {
		try {
			this.aClass68_1.method1994();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt270 = -1;
		this.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt269++;
		this.aClass68_1 = null;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Z")
	public boolean method242() {
		@Pc(18) int local18;
		if (this.aClass68_1 != null) {
			@Pc(11) long local11 = Static284.method4783();
			local18 = (int) (local11 - this.aLong7);
			this.aLong7 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt268 += local18;
			if (this.anInt268 > 30000) {
				try {
					this.aClass68_1.method1994();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass68_1 = null;
			}
		}
		if (this.aClass68_1 == null) {
			return this.method244() == 0 && this.method249() == 0;
		}
		try {
			this.aClass68_1.method2001();
			for (@Pc(72) Class5_Sub9_Sub3_Sub2 local72 = (Class5_Sub9_Sub3_Sub2) this.aClass176_1.method4768(); local72 != null; local72 = (Class5_Sub9_Sub3_Sub2) this.aClass176_1.method4776()) {
				this.aClass5_Sub1_1.anInt2029 = 0;
				this.aClass5_Sub1_1.method1886(1);
				this.aClass5_Sub1_1.method1852((int) local72.aLong208);
				this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
				this.aClass176_2.method4772(local72);
			}
			for (@Pc(122) Class5_Sub9_Sub3_Sub2 local122 = (Class5_Sub9_Sub3_Sub2) this.aClass176_3.method4768(); local122 != null; local122 = (Class5_Sub9_Sub3_Sub2) this.aClass176_3.method4776()) {
				this.aClass5_Sub1_1.anInt2029 = 0;
				this.aClass5_Sub1_1.method1886(0);
				this.aClass5_Sub1_1.method1852((int) local122.aLong208);
				this.aClass68_1.method2002(4, this.aClass5_Sub1_1.aByteArray18);
				this.aClass176_4.method4772(local122);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(171) int local171 = this.aClass68_1.method1999();
				if (local171 < 0) {
					throw new IOException();
				}
				if (local171 == 0) {
					break;
				}
				this.anInt268 = 0;
				@Pc(184) byte local184 = 0;
				if (this.aClass5_Sub9_Sub3_Sub2_1 == null) {
					local184 = 8;
				} else if (this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 == 0) {
					local184 = 1;
				}
				@Pc(216) int local216;
				@Pc(223) int local223;
				@Pc(267) int local267;
				if (local184 <= 0) {
					local216 = this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.aByteArray18.length - this.aClass5_Sub9_Sub3_Sub2_1.aByte56;
					local223 = 512 - this.aClass5_Sub9_Sub3_Sub2_1.anInt5418;
					if (local216 - this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029 < local223) {
						local223 = local216 - this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029;
					}
					if (local223 > local171) {
						local223 = local171;
					}
					this.aClass68_1.method1993(this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.aByteArray18, local223, this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029);
					if (this.aByte1 != 0) {
						for (local267 = 0; local267 < local223; local267++) {
							this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.aByteArray18[local267 + this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029] ^= this.aByte1;
						}
					}
					this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 += local223;
					this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029 += local223;
					if (local216 == this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.anInt2029) {
						this.aClass5_Sub9_Sub3_Sub2_1.method5494();
						this.aClass5_Sub9_Sub3_Sub2_1.aBoolean408 = false;
						this.aClass5_Sub9_Sub3_Sub2_1 = null;
					} else if (this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 == 512) {
						this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 = 0;
					}
				} else {
					local216 = local184 - this.aClass5_Sub1_2.anInt2029;
					if (local171 < local216) {
						local216 = local171;
					}
					this.aClass68_1.method1993(this.aClass5_Sub1_2.aByteArray18, local216, this.aClass5_Sub1_2.anInt2029);
					if (this.aByte1 != 0) {
						for (local223 = 0; local223 < local216; local223++) {
							this.aClass5_Sub1_2.aByteArray18[this.aClass5_Sub1_2.anInt2029 + local223] ^= this.aByte1;
						}
					}
					this.aClass5_Sub1_2.anInt2029 += local216;
					if (local184 <= this.aClass5_Sub1_2.anInt2029) {
						if (this.aClass5_Sub9_Sub3_Sub2_1 == null) {
							this.aClass5_Sub1_2.anInt2029 = 0;
							local223 = this.aClass5_Sub1_2.method1832();
							local267 = this.aClass5_Sub1_2.method1845();
							@Pc(437) int local437 = this.aClass5_Sub1_2.method1832();
							@Pc(442) int local442 = this.aClass5_Sub1_2.method1826();
							@Pc(446) int local446 = local437 & 0x7F;
							@Pc(457) boolean local457 = (local437 & 0x80) != 0;
							@Pc(464) long local464 = (long) (local267 + (local223 << 16));
							@Pc(476) Class5_Sub9_Sub3_Sub2 local476;
							if (local457) {
								for (local476 = (Class5_Sub9_Sub3_Sub2) this.aClass176_4.method4768(); local476 != null && local464 != local476.aLong208; local476 = (Class5_Sub9_Sub3_Sub2) this.aClass176_4.method4776()) {
								}
							} else {
								for (local476 = (Class5_Sub9_Sub3_Sub2) this.aClass176_2.method4768(); local476 != null && local476.aLong208 != local464; local476 = (Class5_Sub9_Sub3_Sub2) this.aClass176_2.method4776()) {
								}
							}
							if (local476 == null) {
								throw new IOException();
							}
							this.aClass5_Sub9_Sub3_Sub2_1 = local476;
							@Pc(536) int local536 = local446 == 0 ? 5 : 9;
							this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7 = new Class5_Sub1(local536 + local442 + this.aClass5_Sub9_Sub3_Sub2_1.aByte56);
							this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.method1886(local446);
							this.aClass5_Sub9_Sub3_Sub2_1.aClass5_Sub1_7.method1851(local442);
							this.aClass5_Sub1_2.anInt2029 = 0;
							this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 = 8;
						} else if (this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub1_2.aByteArray18[0] == -1) {
							this.aClass5_Sub1_2.anInt2029 = 0;
							this.aClass5_Sub9_Sub3_Sub2_1.anInt5418 = 1;
						} else {
							this.aClass5_Sub9_Sub3_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(618) IOException local618) {
			try {
				this.aClass68_1.method1994();
			} catch (@Pc(624) Exception local624) {
			}
			this.aClass68_1 = null;
			this.anInt269++;
			this.anInt270 = -2;
			return this.method244() == 0 && this.method249() == 0;
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Z")
	public boolean method243() {
		return this.method244() >= 20;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)I")
	public int method244() {
		return this.aClass176_1.method4769() + this.aClass176_2.method4769();
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(Z)V")
	public void method246() {
		if (this.aClass68_1 != null) {
			this.aClass68_1.method1996();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public void method247() {
		if (this.aClass68_1 != null) {
			this.aClass68_1.method1994();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIZZ)Lclient!rj;")
	public Class5_Sub9_Sub3_Sub2 method248(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg2);
		@Pc(19) Class5_Sub9_Sub3_Sub2 local19 = new Class5_Sub9_Sub3_Sub2();
		local19.aLong208 = local15;
		local19.aByte56 = arg1;
		local19.aBoolean410 = arg3;
		if (arg3) {
			if (this.method244() >= 20) {
				throw new RuntimeException();
			}
			this.aClass176_1.method4772(local19);
		} else if (this.method249() < 20) {
			this.aClass176_3.method4772(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
	private int method249() {
		return this.aClass176_3.method4769() + this.aClass176_4.method4769();
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)Z")
	public boolean method250() {
		return this.method249() >= 20;
	}
}
