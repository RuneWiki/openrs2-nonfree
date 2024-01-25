import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class227 {

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!fd;")
	private Class73 aClass73_5;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	private int anInt6697;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "Lclient!rb;")
	private Class6_Sub2_Sub11_Sub1 aClass6_Sub2_Sub11_Sub1_2;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!nf;")
	private final Class170 aClass170_7 = new Class170();

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!nf;")
	private final Class170 aClass170_8 = new Class170();

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!nf;")
	private final Class170 aClass170_9 = new Class170();

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!nf;")
	private final Class170 aClass170_10 = new Class170();

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!ae;")
	private final Class6_Sub1 aClass6_Sub1_6 = new Class6_Sub1(4);

	@OriginalMember(owner = "client!t", name = "E", descriptor = "B")
	private byte aByte96 = 0;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "I")
	public volatile int anInt6699 = 0;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public volatile int anInt6698 = 0;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Lclient!ae;")
	private final Class6_Sub1 aClass6_Sub1_7 = new Class6_Sub1(8);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public void method5569() {
		if (this.aClass73_5 == null) {
			return;
		}
		try {
			this.aClass6_Sub1_6.anInt7898 = 0;
			this.aClass6_Sub1_6.method6439(7);
			this.aClass6_Sub1_6.method6474(0);
			this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass73_5.method1875();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6699++;
			this.anInt6698 = -2;
			this.aClass73_5 = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)I")
	private int method5570() {
		return this.aClass170_9.method4002() + this.aClass170_10.method4002();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	private void method5572() {
		if (this.aClass73_5 == null) {
			return;
		}
		try {
			this.aClass6_Sub1_6.anInt7898 = 0;
			this.aClass6_Sub1_6.method6439(6);
			this.aClass6_Sub1_6.method6474(3);
			this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass73_5.method1875();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt6698 = -2;
			this.anInt6699++;
			this.aClass73_5 = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
	public int method5573() {
		return this.aClass170_7.method4002() + this.aClass170_8.method4002();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIBBZ)Lclient!rb;")
	public Class6_Sub2_Sub11_Sub1 method5574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(14) Class6_Sub2_Sub11_Sub1 local14 = new Class6_Sub2_Sub11_Sub1();
		local14.aBoolean490 = arg3;
		local14.aLong225 = local10;
		local14.aByte79 = arg2;
		if (arg3) {
			if (this.method5573() >= 20) {
				throw new RuntimeException();
			}
			this.aClass170_7.method4001(local14);
		} else if (this.method5570() < 20) {
			this.aClass170_9.method4001(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public void method5575() {
		if (this.aClass73_5 != null) {
			this.aClass73_5.method1879();
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)Z")
	public boolean method5576() {
		@Pc(18) int local18;
		if (this.aClass73_5 != null) {
			@Pc(11) long local11 = Static449.method6552();
			local18 = (int) (local11 - this.aLong190);
			this.aLong190 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt6697 += local18;
			if (this.anInt6697 > 30000) {
				try {
					this.aClass73_5.method1875();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass73_5 = null;
			}
		}
		if (this.aClass73_5 == null) {
			return this.method5573() == 0 && this.method5570() == 0;
		}
		try {
			this.aClass73_5.method1880();
			for (@Pc(75) Class6_Sub2_Sub11_Sub1 local75 = (Class6_Sub2_Sub11_Sub1) this.aClass170_7.method4006(); local75 != null; local75 = (Class6_Sub2_Sub11_Sub1) this.aClass170_7.method4000()) {
				this.aClass6_Sub1_6.anInt7898 = 0;
				this.aClass6_Sub1_6.method6439(1);
				this.aClass6_Sub1_6.method6474((int) local75.aLong225);
				this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
				this.aClass170_8.method4001(local75);
			}
			for (@Pc(121) Class6_Sub2_Sub11_Sub1 local121 = (Class6_Sub2_Sub11_Sub1) this.aClass170_9.method4006(); local121 != null; local121 = (Class6_Sub2_Sub11_Sub1) this.aClass170_9.method4000()) {
				this.aClass6_Sub1_6.anInt7898 = 0;
				this.aClass6_Sub1_6.method6439(0);
				this.aClass6_Sub1_6.method6474((int) local121.aLong225);
				this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
				this.aClass170_10.method4001(local121);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(176) int local176 = this.aClass73_5.method1872();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt6697 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass6_Sub2_Sub11_Sub1_2 == null) {
					local189 = 8;
				} else if (this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 == 0) {
					local189 = 1;
				}
				@Pc(214) int local214;
				@Pc(238) int local238;
				@Pc(304) int local304;
				if (local189 > 0) {
					local214 = local189 - this.aClass6_Sub1_7.anInt7898;
					if (local214 > local176) {
						local214 = local176;
					}
					this.aClass73_5.method1877(local214, this.aClass6_Sub1_7.aByteArray96, this.aClass6_Sub1_7.anInt7898);
					if (this.aByte96 != 0) {
						for (local238 = 0; local238 < local214; local238++) {
							this.aClass6_Sub1_7.aByteArray96[this.aClass6_Sub1_7.anInt7898 + local238] = (byte) (this.aClass6_Sub1_7.aByteArray96[this.aClass6_Sub1_7.anInt7898 + local238] ^ this.aByte96);
						}
					}
					this.aClass6_Sub1_7.anInt7898 += local214;
					if (local189 <= this.aClass6_Sub1_7.anInt7898) {
						if (this.aClass6_Sub2_Sub11_Sub1_2 == null) {
							this.aClass6_Sub1_7.anInt7898 = 0;
							local238 = this.aClass6_Sub1_7.method6433();
							local304 = this.aClass6_Sub1_7.method6485();
							@Pc(309) int local309 = this.aClass6_Sub1_7.method6433();
							@Pc(314) int local314 = this.aClass6_Sub1_7.method6442();
							@Pc(318) int local318 = local309 & 0x7F;
							@Pc(326) boolean local326 = (local309 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local238 << 16) + local304);
							@Pc(343) Class6_Sub2_Sub11_Sub1 local343;
							if (local326) {
								for (local343 = (Class6_Sub2_Sub11_Sub1) this.aClass170_10.method4006(); local343 != null && local343.aLong225 != local333; local343 = (Class6_Sub2_Sub11_Sub1) this.aClass170_10.method4000()) {
								}
							} else {
								for (local343 = (Class6_Sub2_Sub11_Sub1) this.aClass170_8.method4006(); local343 != null && local333 != local343.aLong225; local343 = (Class6_Sub2_Sub11_Sub1) this.aClass170_8.method4000()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							@Pc(400) int local400 = local318 == 0 ? 5 : 9;
							this.aClass6_Sub2_Sub11_Sub1_2 = local343;
							this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5 = new Class6_Sub1(this.aClass6_Sub2_Sub11_Sub1_2.aByte79 + local314 + local400);
							this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.method6439(local318);
							this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.method6461(local314);
							this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 = 8;
							this.aClass6_Sub1_7.anInt7898 = 0;
						} else if (this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub1_7.aByteArray96[0] == -1) {
							this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 = 1;
							this.aClass6_Sub1_7.anInt7898 = 0;
						} else {
							this.aClass6_Sub2_Sub11_Sub1_2 = null;
						}
					}
				} else {
					local214 = this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.aByteArray96.length - this.aClass6_Sub2_Sub11_Sub1_2.aByte79;
					local238 = 512 - this.aClass6_Sub2_Sub11_Sub1_2.anInt5808;
					if (local214 - this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898 < local238) {
						local238 = local214 - this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898;
					}
					if (local176 < local238) {
						local238 = local176;
					}
					this.aClass73_5.method1877(local238, this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.aByteArray96, this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898);
					if (this.aByte96 != 0) {
						for (local304 = 0; local304 < local238; local304++) {
							this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.aByteArray96[local304 + this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898] ^= this.aByte96;
						}
					}
					this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 += local238;
					this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898 += local238;
					if (this.aClass6_Sub2_Sub11_Sub1_2.aClass6_Sub1_5.anInt7898 == local214) {
						this.aClass6_Sub2_Sub11_Sub1_2.method6373();
						this.aClass6_Sub2_Sub11_Sub1_2.aBoolean491 = false;
						this.aClass6_Sub2_Sub11_Sub1_2 = null;
					} else if (this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 == 512) {
						this.aClass6_Sub2_Sub11_Sub1_2.anInt5808 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(629) IOException local629) {
			try {
				this.aClass73_5.method1875();
			} catch (@Pc(635) Exception local635) {
			}
			this.anInt6699++;
			this.aClass73_5 = null;
			this.anInt6698 = -2;
			return this.method5573() == 0 && this.method5570() == 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public void method5577() {
		if (this.aClass73_5 != null) {
			this.aClass73_5.method1875();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BZLclient!fd;)V")
	public void method5579(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class73 arg1) {
		if (this.aClass73_5 != null) {
			try {
				this.aClass73_5.method1875();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass73_5 = null;
		}
		this.aClass73_5 = arg1;
		this.method5572();
		this.method5584(arg0);
		this.aClass6_Sub2_Sub11_Sub1_2 = null;
		this.aClass6_Sub1_7.anInt7898 = 0;
		while (true) {
			@Pc(40) Class6_Sub2_Sub11_Sub1 local40 = (Class6_Sub2_Sub11_Sub1) this.aClass170_8.method4003();
			if (local40 == null) {
				while (true) {
					local40 = (Class6_Sub2_Sub11_Sub1) this.aClass170_10.method4003();
					if (local40 == null) {
						if (this.aByte96 != 0) {
							try {
								this.aClass6_Sub1_6.anInt7898 = 0;
								this.aClass6_Sub1_6.method6439(4);
								this.aClass6_Sub1_6.method6439(this.aByte96);
								this.aClass6_Sub1_6.method6453(0);
								this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
							} catch (@Pc(98) IOException local98) {
								try {
									this.aClass73_5.method1875();
								} catch (@Pc(104) Exception local104) {
								}
								this.anInt6698 = -2;
								this.anInt6699++;
								this.aClass73_5 = null;
							}
						}
						this.anInt6697 = 0;
						this.aLong190 = Static449.method6552();
						return;
					}
					this.aClass170_9.method4001(local40);
				}
			}
			this.aClass170_7.method4001(local40);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public void method5580() {
		try {
			this.aClass73_5.method1875();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass73_5 = null;
		this.anInt6698 = -1;
		this.anInt6699++;
		this.aByte96 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
	public boolean method5582() {
		return this.method5573() >= 20;
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
	public boolean method5583() {
		return this.method5570() >= 20;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZB)V")
	public void method5584(@OriginalArg(0) boolean arg0) {
		if (this.aClass73_5 == null) {
			return;
		}
		try {
			this.aClass6_Sub1_6.anInt7898 = 0;
			this.aClass6_Sub1_6.method6439(arg0 ? 2 : 3);
			this.aClass6_Sub1_6.method6474(0);
			this.aClass73_5.method1873(4, this.aClass6_Sub1_6.aByteArray96);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass73_5.method1875();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt6699++;
			this.anInt6698 = -2;
			this.aClass73_5 = null;
		}
	}
}
