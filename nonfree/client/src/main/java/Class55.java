import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class55 {

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "Lclient!vi;")
	private Class301 aClass301_3;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
	private int anInt1460;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!cq", name = "F", descriptor = "Lclient!ii;")
	private Class5_Sub2_Sub2_Sub2 aClass5_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!lj;")
	private final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "Lclient!lj;")
	private final Class187 aClass187_2 = new Class187();

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "Lclient!lj;")
	private final Class187 aClass187_3 = new Class187();

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!lj;")
	private final Class187 aClass187_4 = new Class187();

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "Lclient!co;")
	private final Class5_Sub3 aClass5_Sub3_5 = new Class5_Sub3(4);

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
	public volatile int anInt1461 = 0;

	@OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
	public volatile int anInt1462 = 0;

	@OriginalMember(owner = "client!cq", name = "C", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "Lclient!co;")
	private final Class5_Sub3 aClass5_Sub3_6 = new Class5_Sub3(8);

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Z")
	public boolean method1332() {
		return this.method1337() >= 20;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)I")
	public int method1333() {
		return this.aClass187_1.method4806() + this.aClass187_2.method4806();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	public void method1334(@OriginalArg(1) boolean arg0) {
		if (this.aClass301_3 == null) {
			return;
		}
		try {
			this.aClass5_Sub3_5.anInt4960 = 0;
			this.aClass5_Sub3_5.method4192(arg0 ? 2 : 3);
			this.aClass5_Sub3_5.method4197(0);
			this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass301_3.method7101();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass301_3 = null;
			this.anInt1461++;
			this.anInt1462 = -2;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)Z")
	public boolean method1335() {
		return this.method1333() >= 20;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
	public void method1336() {
		if (this.aClass301_3 != null) {
			this.aClass301_3.method7101();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)I")
	private int method1337() {
		return this.aClass187_3.method4806() + this.aClass187_4.method4806();
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V")
	public void method1338() {
		try {
			this.aClass301_3.method7101();
		} catch (@Pc(11) Exception local11) {
		}
		this.anInt1461++;
		this.anInt1462 = -1;
		this.aByte32 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass301_3 = null;
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V")
	private void method1339() {
		if (this.aClass301_3 == null) {
			return;
		}
		try {
			this.aClass5_Sub3_5.anInt4960 = 0;
			this.aClass5_Sub3_5.method4192(6);
			this.aClass5_Sub3_5.method4197(3);
			this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass301_3.method7101();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt1461++;
			this.anInt1462 = -2;
			this.aClass301_3 = null;
		}
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)Z")
	public boolean method1340() {
		@Pc(17) int local17;
		if (this.aClass301_3 != null) {
			@Pc(11) long local11 = Static105.method2132();
			local17 = (int) (local11 - this.aLong46);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong46 = local11;
			this.anInt1460 += local17;
			if (this.anInt1460 > 30000) {
				try {
					this.aClass301_3.method7101();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass301_3 = null;
			}
		}
		if (this.aClass301_3 == null) {
			return this.method1333() == 0 && this.method1337() == 0;
		}
		try {
			this.aClass301_3.method7100();
			for (@Pc(85) Class5_Sub2_Sub2_Sub2 local85 = (Class5_Sub2_Sub2_Sub2) this.aClass187_1.method4805(); local85 != null; local85 = (Class5_Sub2_Sub2_Sub2) this.aClass187_1.method4810()) {
				this.aClass5_Sub3_5.anInt4960 = 0;
				this.aClass5_Sub3_5.method4192(1);
				this.aClass5_Sub3_5.method4197((int) local85.aLong252);
				this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
				this.aClass187_2.method4807(local85);
			}
			for (@Pc(133) Class5_Sub2_Sub2_Sub2 local133 = (Class5_Sub2_Sub2_Sub2) this.aClass187_3.method4805(); local133 != null; local133 = (Class5_Sub2_Sub2_Sub2) this.aClass187_3.method4810()) {
				this.aClass5_Sub3_5.anInt4960 = 0;
				this.aClass5_Sub3_5.method4192(0);
				this.aClass5_Sub3_5.method4197((int) local133.aLong252);
				this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
				this.aClass187_4.method4807(local133);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(182) int local182 = this.aClass301_3.method7103();
				if (local182 < 0) {
					throw new IOException();
				}
				if (local182 == 0) {
					break;
				}
				this.anInt1460 = 0;
				@Pc(201) byte local201 = 0;
				if (this.aClass5_Sub2_Sub2_Sub2_1 == null) {
					local201 = 8;
				} else if (this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 == 0) {
					local201 = 1;
				}
				@Pc(230) int local230;
				@Pc(237) int local237;
				@Pc(283) int local283;
				if (local201 <= 0) {
					local230 = this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.aByteArray66.length - this.aClass5_Sub2_Sub2_Sub2_1.aByte42;
					local237 = 512 - this.aClass5_Sub2_Sub2_Sub2_1.anInt3897;
					if (local237 > local230 - this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960) {
						local237 = local230 - this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960;
					}
					if (local237 > local182) {
						local237 = local182;
					}
					this.aClass301_3.method7104(local237, this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960, this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.aByteArray66);
					if (this.aByte32 != 0) {
						for (local283 = 0; local283 < local237; local283++) {
							this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.aByteArray66[this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960 + local283] = (byte) (this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.aByteArray66[this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960 + local283] ^ this.aByte32);
						}
					}
					this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960 += local237;
					this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 += local237;
					if (this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.anInt4960 == local230) {
						this.aClass5_Sub2_Sub2_Sub2_1.method7323();
						this.aClass5_Sub2_Sub2_Sub2_1.aBoolean234 = false;
						this.aClass5_Sub2_Sub2_Sub2_1 = null;
					} else if (this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 == 512) {
						this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 = 0;
					}
				} else {
					local230 = local201 - this.aClass5_Sub3_6.anInt4960;
					if (local230 > local182) {
						local230 = local182;
					}
					this.aClass301_3.method7104(local230, this.aClass5_Sub3_6.anInt4960, this.aClass5_Sub3_6.aByteArray66);
					if (this.aByte32 != 0) {
						for (local237 = 0; local237 < local230; local237++) {
							this.aClass5_Sub3_6.aByteArray66[this.aClass5_Sub3_6.anInt4960 + local237] ^= this.aByte32;
						}
					}
					this.aClass5_Sub3_6.anInt4960 += local230;
					if (local201 <= this.aClass5_Sub3_6.anInt4960) {
						if (this.aClass5_Sub2_Sub2_Sub2_1 == null) {
							this.aClass5_Sub3_6.anInt4960 = 0;
							local237 = this.aClass5_Sub3_6.method4220();
							local283 = this.aClass5_Sub3_6.method4227();
							@Pc(466) int local466 = this.aClass5_Sub3_6.method4220();
							@Pc(471) int local471 = this.aClass5_Sub3_6.method4230();
							@Pc(475) int local475 = local466 & 0x7F;
							@Pc(483) boolean local483 = (local466 & 0x80) != 0;
							@Pc(490) long local490 = (long) (local283 + (local237 << 16));
							@Pc(500) Class5_Sub2_Sub2_Sub2 local500;
							if (local483) {
								for (local500 = (Class5_Sub2_Sub2_Sub2) this.aClass187_4.method4805(); local500 != null && local500.aLong252 != local490; local500 = (Class5_Sub2_Sub2_Sub2) this.aClass187_4.method4810()) {
								}
							} else {
								for (local500 = (Class5_Sub2_Sub2_Sub2) this.aClass187_2.method4805(); local500 != null && local500.aLong252 != local490; local500 = (Class5_Sub2_Sub2_Sub2) this.aClass187_2.method4810()) {
								}
							}
							if (local500 == null) {
								throw new IOException();
							}
							this.aClass5_Sub2_Sub2_Sub2_1 = local500;
							@Pc(558) int local558 = local475 == 0 ? 5 : 9;
							this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10 = new Class5_Sub3(this.aClass5_Sub2_Sub2_Sub2_1.aByte42 + local471 + local558);
							this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.method4192(local475);
							this.aClass5_Sub2_Sub2_Sub2_1.aClass5_Sub3_10.method4184(local471);
							this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 = 8;
							this.aClass5_Sub3_6.anInt4960 = 0;
						} else if (this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub3_6.aByteArray66[0] == -1) {
							this.aClass5_Sub2_Sub2_Sub2_1.anInt3897 = 1;
							this.aClass5_Sub3_6.anInt4960 = 0;
						} else {
							this.aClass5_Sub2_Sub2_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(632) IOException local632) {
			try {
				this.aClass301_3.method7101();
			} catch (@Pc(638) Exception local638) {
			}
			this.anInt1462 = -2;
			this.aClass301_3 = null;
			this.anInt1461++;
			return this.method1333() == 0 && this.method1337() == 0;
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
	public void method1341() {
		if (this.aClass301_3 != null) {
			this.aClass301_3.method7105();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!vi;ZI)V")
	public void method1342(@OriginalArg(0) Class301 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass301_3 != null) {
			try {
				this.aClass301_3.method7101();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass301_3 = null;
		}
		this.aClass301_3 = arg0;
		this.method1339();
		this.method1334(arg1);
		this.aClass5_Sub3_6.anInt4960 = 0;
		this.aClass5_Sub2_Sub2_Sub2_1 = null;
		while (true) {
			@Pc(40) Class5_Sub2_Sub2_Sub2 local40 = (Class5_Sub2_Sub2_Sub2) this.aClass187_2.method4802();
			if (local40 == null) {
				while (true) {
					local40 = (Class5_Sub2_Sub2_Sub2) this.aClass187_4.method4802();
					if (local40 == null) {
						if (this.aByte32 != 0) {
							try {
								this.aClass5_Sub3_5.anInt4960 = 0;
								this.aClass5_Sub3_5.method4192(4);
								this.aClass5_Sub3_5.method4192(this.aByte32);
								this.aClass5_Sub3_5.method4181(0);
								this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass301_3.method7101();
								} catch (@Pc(107) Exception local107) {
								}
								this.aClass301_3 = null;
								this.anInt1461++;
								this.anInt1462 = -2;
							}
						}
						this.anInt1460 = 0;
						this.aLong46 = Static105.method2132();
						return;
					}
					this.aClass187_3.method4807(local40);
				}
			}
			this.aClass187_1.method4807(local40);
		}
	}

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)V")
	public void method1343() {
		if (this.aClass301_3 == null) {
			return;
		}
		try {
			this.aClass5_Sub3_5.anInt4960 = 0;
			this.aClass5_Sub3_5.method4192(7);
			this.aClass5_Sub3_5.method4197(0);
			this.aClass301_3.method7099(4, this.aClass5_Sub3_5.aByteArray66);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass301_3.method7101();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt1462 = -2;
			this.aClass301_3 = null;
			this.anInt1461++;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBZII)Lclient!ii;")
	public Class5_Sub2_Sub2_Sub2 method1345(@OriginalArg(1) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) long local17 = (long) (arg3 + (arg2 << 16));
		@Pc(21) Class5_Sub2_Sub2_Sub2 local21 = new Class5_Sub2_Sub2_Sub2();
		local21.aByte42 = arg0;
		local21.aLong252 = local17;
		local21.aBoolean233 = arg1;
		if (arg1) {
			if (this.method1333() >= 20) {
				throw new RuntimeException();
			}
			this.aClass187_1.method4807(local21);
		} else if (this.method1337() < 20) {
			this.aClass187_3.method4807(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}
}
