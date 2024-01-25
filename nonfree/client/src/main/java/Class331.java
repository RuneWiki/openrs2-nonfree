import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class331 {

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Lclient!oga;")
	private Class257 aClass257_4;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	private int anInt9149;

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "Lclient!ic;")
	private Class5_Sub4_Sub12_Sub1 aClass5_Sub4_Sub12_Sub1_2;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Lclient!dr;")
	private final Class80 aClass80_8 = new Class80();

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!dr;")
	private final Class80 aClass80_9 = new Class80();

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "Lclient!dr;")
	private final Class80 aClass80_10 = new Class80();

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "Lclient!dr;")
	private final Class80 aClass80_11 = new Class80();

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Lclient!ee;")
	private final Class5_Sub12 aClass5_Sub12_8 = new Class5_Sub12(4);

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "B")
	private byte aByte122 = 0;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
	public volatile int anInt9150 = 0;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	public volatile int anInt9151 = 0;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "Lclient!ee;")
	private final Class5_Sub12 aClass5_Sub12_9 = new Class5_Sub12(8);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Z")
	public boolean method7791() {
		@Pc(18) int local18;
		if (this.aClass257_4 != null) {
			@Pc(11) long local11 = Static205.method3179();
			local18 = (int) (local11 - this.aLong242);
			this.aLong242 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt9149 += local18;
			if (this.anInt9149 > 30000) {
				try {
					this.aClass257_4.method6187();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass257_4 = null;
			}
		}
		if (this.aClass257_4 == null) {
			return this.method7801() == 0 && this.method7802() == 0;
		}
		try {
			this.aClass257_4.method6188();
			for (@Pc(79) Class5_Sub4_Sub12_Sub1 local79 = (Class5_Sub4_Sub12_Sub1) this.aClass80_8.method1538(); local79 != null; local79 = (Class5_Sub4_Sub12_Sub1) this.aClass80_8.method1536()) {
				this.aClass5_Sub12_8.anInt10154 = 0;
				this.aClass5_Sub12_8.method8647(1);
				this.aClass5_Sub12_8.method8621((int) local79.aLong273);
				this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
				this.aClass80_9.method1537(local79);
			}
			for (@Pc(136) Class5_Sub4_Sub12_Sub1 local136 = (Class5_Sub4_Sub12_Sub1) this.aClass80_10.method1538(); local136 != null; local136 = (Class5_Sub4_Sub12_Sub1) this.aClass80_10.method1536()) {
				this.aClass5_Sub12_8.anInt10154 = 0;
				this.aClass5_Sub12_8.method8647(0);
				this.aClass5_Sub12_8.method8621((int) local136.aLong273);
				this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
				this.aClass80_11.method1537(local136);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(187) int local187 = this.aClass257_4.method6193();
				if (local187 < 0) {
					throw new IOException();
				}
				if (local187 == 0) {
					break;
				}
				this.anInt9149 = 0;
				@Pc(203) byte local203 = 0;
				if (this.aClass5_Sub4_Sub12_Sub1_2 == null) {
					local203 = 8;
				} else if (this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 == 0) {
					local203 = 1;
				}
				@Pc(230) int local230;
				@Pc(251) int local251;
				@Pc(312) int local312;
				if (local203 > 0) {
					local230 = local203 - this.aClass5_Sub12_9.anInt10154;
					if (local187 < local230) {
						local230 = local187;
					}
					this.aClass257_4.method6189(this.aClass5_Sub12_9.aByteArray104, local230, this.aClass5_Sub12_9.anInt10154);
					if (this.aByte122 != 0) {
						for (local251 = 0; local251 < local230; local251++) {
							this.aClass5_Sub12_9.aByteArray104[local251 + this.aClass5_Sub12_9.anInt10154] ^= this.aByte122;
						}
					}
					this.aClass5_Sub12_9.anInt10154 += local230;
					if (local203 <= this.aClass5_Sub12_9.anInt10154) {
						if (this.aClass5_Sub4_Sub12_Sub1_2 == null) {
							this.aClass5_Sub12_9.anInt10154 = 0;
							local251 = this.aClass5_Sub12_9.method8645();
							local312 = this.aClass5_Sub12_9.method8631();
							@Pc(317) int local317 = this.aClass5_Sub12_9.method8645();
							@Pc(322) int local322 = this.aClass5_Sub12_9.method8623();
							@Pc(326) int local326 = local317 & 0x7F;
							@Pc(334) boolean local334 = (local317 & 0x80) != 0;
							@Pc(341) long local341 = (long) (local312 + (local251 << 16));
							@Pc(353) Class5_Sub4_Sub12_Sub1 local353;
							if (local334) {
								for (local353 = (Class5_Sub4_Sub12_Sub1) this.aClass80_11.method1538(); local353 != null && local341 != local353.aLong273; local353 = (Class5_Sub4_Sub12_Sub1) this.aClass80_11.method1536()) {
								}
							} else {
								for (local353 = (Class5_Sub4_Sub12_Sub1) this.aClass80_9.method1538(); local353 != null && local353.aLong273 != local341; local353 = (Class5_Sub4_Sub12_Sub1) this.aClass80_9.method1536()) {
								}
							}
							if (local353 == null) {
								throw new IOException();
							}
							@Pc(413) int local413 = local326 == 0 ? 5 : 9;
							this.aClass5_Sub4_Sub12_Sub1_2 = local353;
							this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3 = new Class5_Sub12(local413 + local322 + this.aClass5_Sub4_Sub12_Sub1_2.aByte76);
							this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.method8647(local326);
							this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.method8622(local322);
							this.aClass5_Sub12_9.anInt10154 = 0;
							this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 = 8;
						} else if (this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub12_9.aByteArray104[0] == -1) {
							this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 = 1;
							this.aClass5_Sub12_9.anInt10154 = 0;
						} else {
							this.aClass5_Sub4_Sub12_Sub1_2 = null;
						}
					}
				} else {
					local230 = this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.aByteArray104.length - this.aClass5_Sub4_Sub12_Sub1_2.aByte76;
					local251 = 512 - this.aClass5_Sub4_Sub12_Sub1_2.anInt3933;
					if (local251 > local230 - this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154) {
						local251 = local230 - this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154;
					}
					if (local187 < local251) {
						local251 = local187;
					}
					this.aClass257_4.method6189(this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.aByteArray104, local251, this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154);
					if (this.aByte122 != 0) {
						for (local312 = 0; local312 < local251; local312++) {
							this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.aByteArray104[local312 + this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154] ^= this.aByte122;
						}
					}
					this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154 += local251;
					this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 += local251;
					if (local230 == this.aClass5_Sub4_Sub12_Sub1_2.aClass5_Sub12_3.anInt10154) {
						this.aClass5_Sub4_Sub12_Sub1_2.method8741();
						this.aClass5_Sub4_Sub12_Sub1_2.aBoolean358 = false;
						this.aClass5_Sub4_Sub12_Sub1_2 = null;
					} else if (this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 == 512) {
						this.aClass5_Sub4_Sub12_Sub1_2.anInt3933 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(630) IOException local630) {
			try {
				this.aClass257_4.method6187();
			} catch (@Pc(636) Exception local636) {
			}
			this.aClass257_4 = null;
			this.anInt9151 = -2;
			this.anInt9150++;
			return this.method7801() == 0 && this.method7802() == 0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
	public void method7792() {
		if (this.aClass257_4 != null) {
			this.aClass257_4.method6187();
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
	public void method7793() {
		if (this.aClass257_4 != null) {
			this.aClass257_4.method6191();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
	public boolean method7794() {
		return this.method7802() >= 20;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public void method7795() {
		if (this.aClass257_4 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_8.anInt10154 = 0;
			this.aClass5_Sub12_8.method8647(7);
			this.aClass5_Sub12_8.method8621(0);
			this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass257_4.method6187();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt9150++;
			this.aClass257_4 = null;
			this.anInt9151 = -2;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
	public void method7796(@OriginalArg(1) boolean arg0) {
		if (this.aClass257_4 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_8.anInt10154 = 0;
			this.aClass5_Sub12_8.method8647(arg0 ? 2 : 3);
			this.aClass5_Sub12_8.method8621(0);
			this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass257_4.method6187();
			} catch (@Pc(50) Exception local50) {
			}
			this.aClass257_4 = null;
			this.anInt9150++;
			this.anInt9151 = -2;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLclient!oga;I)V")
	public void method7797(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class257 arg1) {
		if (this.aClass257_4 != null) {
			try {
				this.aClass257_4.method6187();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass257_4 = null;
		}
		this.aClass257_4 = arg1;
		this.method7799();
		this.method7796(arg0);
		this.aClass5_Sub12_9.anInt10154 = 0;
		this.aClass5_Sub4_Sub12_Sub1_2 = null;
		while (true) {
			@Pc(40) Class5_Sub4_Sub12_Sub1 local40 = (Class5_Sub4_Sub12_Sub1) this.aClass80_9.method1543();
			if (local40 == null) {
				while (true) {
					local40 = (Class5_Sub4_Sub12_Sub1) this.aClass80_11.method1543();
					if (local40 == null) {
						if (this.aByte122 != 0) {
							try {
								this.aClass5_Sub12_8.anInt10154 = 0;
								this.aClass5_Sub12_8.method8647(4);
								this.aClass5_Sub12_8.method8647(this.aByte122);
								this.aClass5_Sub12_8.method8655(0);
								this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass257_4.method6187();
								} catch (@Pc(108) Exception local108) {
								}
								this.aClass257_4 = null;
								this.anInt9151 = -2;
								this.anInt9150++;
							}
						}
						this.anInt9149 = 0;
						this.aLong242 = Static205.method3179();
						return;
					}
					this.aClass80_10.method1537(local40);
				}
			}
			this.aClass80_8.method1537(local40);
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	private void method7799() {
		if (this.aClass257_4 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_8.anInt10154 = 0;
			this.aClass5_Sub12_8.method8647(6);
			this.aClass5_Sub12_8.method8621(3);
			this.aClass257_4.method6185(this.aClass5_Sub12_8.aByteArray104, 4);
		} catch (@Pc(35) IOException local35) {
			try {
				this.aClass257_4.method6187();
			} catch (@Pc(41) Exception local41) {
			}
			this.anInt9150++;
			this.anInt9151 = -2;
			this.aClass257_4 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
	public void method7800() {
		try {
			this.aClass257_4.method6187();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt9151 = -1;
		this.anInt9150++;
		this.aClass257_4 = null;
		this.aByte122 = (byte) (int) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)I")
	public int method7801() {
		return this.aClass80_8.method1540() + this.aClass80_9.method1540();
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)I")
	private int method7802() {
		return this.aClass80_10.method1540() + this.aClass80_11.method1540();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZBIII)Lclient!ic;")
	public Class5_Sub4_Sub12_Sub1 method7803(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg2 << 16) + arg3);
		@Pc(14) Class5_Sub4_Sub12_Sub1 local14 = new Class5_Sub4_Sub12_Sub1();
		local14.aBoolean360 = arg0;
		local14.aByte76 = arg1;
		local14.aLong273 = local10;
		if (arg0) {
			if (this.method7801() >= 20) {
				throw new RuntimeException();
			}
			this.aClass80_8.method1537(local14);
		} else if (this.method7802() < 20) {
			this.aClass80_10.method1537(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)Z")
	public boolean method7804() {
		return this.method7801() >= 20;
	}
}
