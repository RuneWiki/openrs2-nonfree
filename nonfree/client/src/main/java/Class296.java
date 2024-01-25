import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class296 {

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "Lclient!qu;")
	private Class295 aClass295_1;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
	private int anInt8295;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "Lclient!kd;")
	private Class5_Sub3_Sub11_Sub1 aClass5_Sub3_Sub11_Sub1_2;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "Lclient!ut;")
	private final Class358 aClass358_8 = new Class358();

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Lclient!ut;")
	private final Class358 aClass358_9 = new Class358();

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "Lclient!ut;")
	private final Class358 aClass358_10 = new Class358();

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "Lclient!ut;")
	private final Class358 aClass358_11 = new Class358();

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "Lclient!mc;")
	private final Class5_Sub41 aClass5_Sub41_6 = new Class5_Sub41(4);

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
	public volatile int anInt8296 = 0;

	@OriginalMember(owner = "client!qv", name = "E", descriptor = "B")
	private byte aByte118 = 0;

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
	public volatile int anInt8297 = 0;

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "Lclient!mc;")
	private final Class5_Sub41 aClass5_Sub41_7 = new Class5_Sub41(8);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z")
	public boolean method7084() {
		@Pc(14) int local14;
		if (this.aClass295_1 != null) {
			@Pc(7) long local7 = Static547.method7619();
			local14 = (int) (local7 - this.aLong233);
			this.aLong233 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt8295 += local14;
			if (this.anInt8295 > 30000) {
				try {
					this.aClass295_1.method7082();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass295_1 = null;
			}
		}
		if (this.aClass295_1 == null) {
			return this.method7088() == 0 && this.method7086() == 0;
		}
		try {
			this.aClass295_1.method7079();
			for (@Pc(83) Class5_Sub3_Sub11_Sub1 local83 = (Class5_Sub3_Sub11_Sub1) this.aClass358_8.method8322(); local83 != null; local83 = (Class5_Sub3_Sub11_Sub1) this.aClass358_8.method8328()) {
				this.aClass5_Sub41_6.anInt9230 = 0;
				this.aClass5_Sub41_6.method7798(1);
				this.aClass5_Sub41_6.method7843((int) local83.aLong297);
				this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
				this.aClass358_9.method8329(local83);
			}
			for (@Pc(129) Class5_Sub3_Sub11_Sub1 local129 = (Class5_Sub3_Sub11_Sub1) this.aClass358_10.method8322(); local129 != null; local129 = (Class5_Sub3_Sub11_Sub1) this.aClass358_10.method8328()) {
				this.aClass5_Sub41_6.anInt9230 = 0;
				this.aClass5_Sub41_6.method7798(0);
				this.aClass5_Sub41_6.method7843((int) local129.aLong297);
				this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
				this.aClass358_11.method8329(local129);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(178) int local178 = this.aClass295_1.method7081();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt8295 = 0;
				@Pc(197) byte local197 = 0;
				if (this.aClass5_Sub3_Sub11_Sub1_2 == null) {
					local197 = 8;
				} else if (this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 == 0) {
					local197 = 1;
				}
				@Pc(223) int local223;
				@Pc(230) int local230;
				@Pc(270) int local270;
				if (local197 <= 0) {
					local223 = this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.aByteArray93.length - this.aClass5_Sub3_Sub11_Sub1_2.aByte87;
					local230 = 512 - this.aClass5_Sub3_Sub11_Sub1_2.anInt5850;
					if (local223 - this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230 < local230) {
						local230 = local223 - this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230;
					}
					if (local230 > local178) {
						local230 = local178;
					}
					this.aClass295_1.method7080(local230, this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.aByteArray93, this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230);
					if (this.aByte118 != 0) {
						for (local270 = 0; local270 < local230; local270++) {
							this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.aByteArray93[local270 + this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230] ^= this.aByte118;
						}
					}
					this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 += local230;
					this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230 += local230;
					if (this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.anInt9230 == local223) {
						this.aClass5_Sub3_Sub11_Sub1_2.method8687();
						this.aClass5_Sub3_Sub11_Sub1_2.aBoolean664 = false;
						this.aClass5_Sub3_Sub11_Sub1_2 = null;
					} else if (this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 == 512) {
						this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 = 0;
					}
				} else {
					local223 = local197 - this.aClass5_Sub41_7.anInt9230;
					if (local178 < local223) {
						local223 = local178;
					}
					this.aClass295_1.method7080(local223, this.aClass5_Sub41_7.aByteArray93, this.aClass5_Sub41_7.anInt9230);
					if (this.aByte118 != 0) {
						for (local230 = 0; local230 < local223; local230++) {
							this.aClass5_Sub41_7.aByteArray93[this.aClass5_Sub41_7.anInt9230 + local230] = (byte) (this.aClass5_Sub41_7.aByteArray93[this.aClass5_Sub41_7.anInt9230 + local230] ^ this.aByte118);
						}
					}
					this.aClass5_Sub41_7.anInt9230 += local223;
					if (local197 <= this.aClass5_Sub41_7.anInt9230) {
						if (this.aClass5_Sub3_Sub11_Sub1_2 == null) {
							this.aClass5_Sub41_7.anInt9230 = 0;
							local230 = this.aClass5_Sub41_7.method7816();
							local270 = this.aClass5_Sub41_7.method7860();
							@Pc(452) int local452 = this.aClass5_Sub41_7.method7816();
							@Pc(457) int local457 = this.aClass5_Sub41_7.method7804();
							@Pc(461) int local461 = local452 & 0x7F;
							@Pc(472) boolean local472 = (local452 & 0x80) != 0;
							@Pc(479) long local479 = (long) (local270 + (local230 << 16));
							@Pc(489) Class5_Sub3_Sub11_Sub1 local489;
							if (local472) {
								for (local489 = (Class5_Sub3_Sub11_Sub1) this.aClass358_11.method8322(); local489 != null && local479 != local489.aLong297; local489 = (Class5_Sub3_Sub11_Sub1) this.aClass358_11.method8328()) {
								}
							} else {
								for (local489 = (Class5_Sub3_Sub11_Sub1) this.aClass358_9.method8322(); local489 != null && local489.aLong297 != local479; local489 = (Class5_Sub3_Sub11_Sub1) this.aClass358_9.method8328()) {
								}
							}
							if (local489 == null) {
								throw new IOException();
							}
							this.aClass5_Sub3_Sub11_Sub1_2 = local489;
							@Pc(548) int local548 = local461 == 0 ? 5 : 9;
							this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2 = new Class5_Sub41(local457 + local548 + this.aClass5_Sub3_Sub11_Sub1_2.aByte87);
							this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.method7798(local461);
							this.aClass5_Sub3_Sub11_Sub1_2.aClass5_Sub41_2.method7803(local457);
							this.aClass5_Sub41_7.anInt9230 = 0;
							this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 = 8;
						} else if (this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub41_7.aByteArray93[0] == -1) {
							this.aClass5_Sub3_Sub11_Sub1_2.anInt5850 = 1;
							this.aClass5_Sub41_7.anInt9230 = 0;
						} else {
							this.aClass5_Sub3_Sub11_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(628) IOException local628) {
			try {
				this.aClass295_1.method7082();
			} catch (@Pc(634) Exception local634) {
			}
			this.anInt8297 = -2;
			this.aClass295_1 = null;
			this.anInt8296++;
			return this.method7088() == 0 && this.method7086() == 0;
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
	public void method7085() {
		if (this.aClass295_1 != null) {
			this.aClass295_1.method7082();
		}
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
	private int method7086() {
		return this.aClass358_10.method8324() + this.aClass358_11.method8324();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
	public void method7087() {
		if (this.aClass295_1 != null) {
			this.aClass295_1.method7076();
		}
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)I")
	public int method7088() {
		return this.aClass358_8.method8324() + this.aClass358_9.method8324();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZILclient!qu;)V")
	public void method7090(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class295 arg1) {
		if (this.aClass295_1 != null) {
			try {
				this.aClass295_1.method7082();
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass295_1 = null;
		}
		this.aClass295_1 = arg1;
		this.method7102();
		this.method7096(arg0);
		this.aClass5_Sub3_Sub11_Sub1_2 = null;
		this.aClass5_Sub41_7.anInt9230 = 0;
		while (true) {
			@Pc(40) Class5_Sub3_Sub11_Sub1 local40 = (Class5_Sub3_Sub11_Sub1) this.aClass358_9.method8326();
			if (local40 == null) {
				while (true) {
					local40 = (Class5_Sub3_Sub11_Sub1) this.aClass358_11.method8326();
					if (local40 == null) {
						if (this.aByte118 != 0) {
							try {
								this.aClass5_Sub41_6.anInt9230 = 0;
								this.aClass5_Sub41_6.method7798(4);
								this.aClass5_Sub41_6.method7798(this.aByte118);
								this.aClass5_Sub41_6.method7848(0);
								this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
							} catch (@Pc(96) IOException local96) {
								try {
									this.aClass295_1.method7082();
								} catch (@Pc(102) Exception local102) {
								}
								this.aClass295_1 = null;
								this.anInt8297 = -2;
								this.anInt8296++;
							}
						}
						this.anInt8295 = 0;
						this.aLong233 = Static547.method7619();
						return;
					}
					this.aClass358_10.method8329(local40);
				}
			}
			this.aClass358_8.method8329(local40);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZIBII)Lclient!kd;")
	public Class5_Sub3_Sub11_Sub1 method7094(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg1);
		@Pc(14) Class5_Sub3_Sub11_Sub1 local14 = new Class5_Sub3_Sub11_Sub1();
		local14.aLong297 = local10;
		local14.aByte87 = arg2;
		local14.aBoolean663 = arg0;
		if (arg0) {
			if (this.method7088() >= 20) {
				throw new RuntimeException();
			}
			this.aClass358_8.method8329(local14);
		} else if (this.method7086() < 20) {
			this.aClass358_10.method8329(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)Z")
	public boolean method7095() {
		return this.method7088() >= 20;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BZ)V")
	public void method7096(@OriginalArg(1) boolean arg0) {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub41_6.anInt9230 = 0;
			this.aClass5_Sub41_6.method7798(arg0 ? 2 : 3);
			this.aClass5_Sub41_6.method7843(0);
			this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass295_1.method7082();
			} catch (@Pc(47) Exception local47) {
			}
			this.aClass295_1 = null;
			this.anInt8297 = -2;
			this.anInt8296++;
		}
	}

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V")
	public void method7097() {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub41_6.anInt9230 = 0;
			this.aClass5_Sub41_6.method7798(7);
			this.aClass5_Sub41_6.method7843(0);
			this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass295_1.method7082();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt8296++;
			this.aClass295_1 = null;
			this.anInt8297 = -2;
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
	public void method7099() {
		try {
			this.aClass295_1.method7082();
		} catch (@Pc(11) Exception local11) {
		}
		this.anInt8297 = -1;
		this.aClass295_1 = null;
		this.anInt8296++;
		this.aByte118 = (byte) (int) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)Z")
	public boolean method7101() {
		return this.method7086() >= 20;
	}

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "(I)V")
	private void method7102() {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub41_6.anInt9230 = 0;
			this.aClass5_Sub41_6.method7798(6);
			this.aClass5_Sub41_6.method7843(3);
			this.aClass295_1.method7078(this.aClass5_Sub41_6.aByteArray93, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass295_1.method7082();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt8296++;
			this.aClass295_1 = null;
			this.anInt8297 = -2;
		}
	}
}
